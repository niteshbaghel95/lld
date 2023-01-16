package Database;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import modules.Center;
import modules.Slots;
import modules.WorkoutType;

public class CenterSlot {
    
    private static CenterSlot instance = null;
    private static Map<Center,List<Slots>> centerSlotMap;

    public static CenterSlot getInstance()
    {
        if(instance == null)
        {
            instance = new CenterSlot();
        }
        return instance;
    }

    public Map<Center, List<Slots>> getCenterSlotMap() {
        return centerSlotMap;
    }

    public void setCenterSlotMap(Map<Center, List<Slots>> centerSlotMap) {
        CenterSlot.centerSlotMap = centerSlotMap;
    }

    private CenterSlot()
    {
        centerSlotMap = new HashMap<>();
        List<Slots> slots = new ArrayList<>();
        slots.add(new Slots(IdGenrator.getId(), 6, WorkoutType.Cardio, false, 3));
        slots.add(new Slots(IdGenrator.getId(), 7, WorkoutType.Cardio, false, 3));
        slots.add(new Slots(IdGenrator.getId(), 8, WorkoutType.Cardio, false, 3));
        slots.add(new Slots(IdGenrator.getId(), 6, WorkoutType.Weights, false,3));
        slots.add(new Slots(IdGenrator.getId(), 7, WorkoutType.Weights, false, 3));
        slots.add(new Slots(IdGenrator.getId(), 8, WorkoutType.Weights, false, 3));
        slots.add(new Slots(IdGenrator.getId(), 18, WorkoutType.Cardio, false, 3));
        slots.add(new Slots(IdGenrator.getId(), 19, WorkoutType.Cardio, false, 3));
        slots.add(new Slots(IdGenrator.getId(), 20, WorkoutType.Cardio, false, 3));
        slots.add(new Slots(IdGenrator.getId(), 18, WorkoutType.Weights, false, 3));
        slots.add(new Slots(IdGenrator.getId(), 19, WorkoutType.Weights, false, 3));
        slots.add(new Slots(IdGenrator.getId(), 20, WorkoutType.Weights, false, 3));
        centerSlotMap.put(new Center(IdGenrator.getId(),"Kormanagala"), slots);
        centerSlotMap.put(new Center(IdGenrator.getId(), "Bellandur"), slots);
    }

    
}
