package Services;

import java.util.List;
import java.util.Map;

import Database.CenterSlot;
import javafx.util.Pair;
import modules.Center;
import modules.Slots;

public class CenterSlotService {

private static CenterSlotService instance = null;

public static CenterSlotService getInstance()
{
    if(instance == null)
    {
        instance = new CenterSlotService();
    }
    return instance;
}
    private CenterSlotService()
    {

    }

    CenterSlot centrSlot = CenterSlot.getInstance();
    public int getSlots()
    {
        int numOfSlots = 0;
        for(Map.Entry<Center, List<Slots>> entry : centrSlot.getCenterSlotMap().entrySet())
        {
            Center center = entry.getKey();
            List<Slots> list = entry.getValue();
            for(int i=0;i<list.size();i++)
            {
                Slots slot = list.get(i);
                if(!slot.isOccupied())
                {
                    numOfSlots++;
                System.out.println("Center id: "+center.getCenterId()+" Center name: "+center.getCenterName()+ 
                " Slot Id: "+ slot.getSlotId() + " Slot Timing: "+slot.getStartTime() + " Slot Capacity: " + slot.getCapacity() + 
                "Workout Type: " +slot.getType());
                }
            }
        }
        if(numOfSlots==0)
        return -1;
        return 0;
    }

    public Pair<Center,Slots> checkAndBook(int centerId, int slotId)
    {
        for(Map.Entry<Center, List<Slots>> entry : centrSlot.getCenterSlotMap().entrySet())
        {
            Center center = entry.getKey();
            if(center.getCenterId() == centerId)
            {
            List<Slots> list = entry.getValue();
            for(int i=0;i<list.size();i++)
            {
                Slots slot = list.get(i);

                if(slot.getSlotId() == slotId && !slot.isOccupied())
                {
                    
                System.out.println("Center id: "+center.getCenterId()+" Center name: "+center.getCenterName()+ 
                " Slot Id: "+ slot.getSlotId() + " Slot Timing: "+slot.getStartTime() + " Slot Capacity: " + slot.getCapacity() + 
                "Workout Type: " +slot.getType());
                
                slot.setCapacity(slot.getCapacity()-1);
                if(slot.getCapacity() == 0)
                {
                    slot.setOccupied(true);
                }
                Pair<Center,Slots> toreturn = new Pair<>(center,slot);
                return toreturn;
                }
            }
            }
        }
        return null;
    }
}
