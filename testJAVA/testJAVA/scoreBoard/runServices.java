package testJAVA.scoreBoard;

public class runServices
{
    private static runServices run = null;
    private runServices()
    {

    }

    public static runServices getInstance()
    {
        if(run == null)
        {
            run = new runServices();
        }
        return run;
    }

    UserDeo userDeo = UserDeo.getInstance();

    public run addRun( int score, String batterId, String bolwerId, String contrubutor, runType runType)
    {
      
        if(batterId.length() == 0 || bolwerId.length()==0)
        {
            System.out.println("Not a valid player");
            return null;
        }
        return userDeo.addRun(score,batterId,bolwerId,contrubutor,runType);
    }

    public int getSumScore()
    {
        return userDeo.sumScore;
    }

    public int getWickets()
    {
        return userDeo.wicket;
    }

}