package testJAVA.scoreBoard;

public class playerService {
    private static playerService play= null;
    private playerService()
    {

    }
    public static playerService getInstance()
    {
        if(play == null)
        {
            play =  new playerService();
        }
        return play;
    }

    UserDeo userDeo = UserDeo.getInstance();

    public player addPlayer(String name, String type, String team)
    {
        if(name.length()==0)
        {
            System.out.println("Not a valid player");
            return null;
        }
        if(type.length()==0)
        {
            System.out.println("type not defined");
            return null;
        }
        if(team.length()==0)
        {
            System.out.println("team is not mensioned");
            return null;
        }
        return userDeo.addPlayer(IDGenrator.getID(),name,type,team);
    }
}
