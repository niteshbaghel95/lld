package testJAVA.scoreBoard;

public class IDGenrator {
    private static int id=0;
    public static int getID()
    {
        id++;
        return id;
    }  
}
