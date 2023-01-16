package testJAVA;

public class IDgenratore {
    private static int id=0;
    public static int getId()
    {
        id++;
        return id;
    }
}
