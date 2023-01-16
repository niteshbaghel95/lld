package testJAVA.scoreBoard;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class UserDeo {

    private static UserDeo userDeo = null;
    Stack<run> scoreStack = new Stack<>();
    List<player> playerList = new ArrayList<>();
    int wicket = 0;
    int sumScore = 0;
    private UserDeo()
    {

    }
    public static UserDeo getInstance() {
        if(userDeo==null)
        {
            userDeo = new UserDeo();
            
        }
        return userDeo;
    }

    public run addRun(int score, String batterId, String bolwerId, String contrubutor, runType runType) {
        
        run  run = new run();
        run.setScore(score);
        run.setBatterId(batterId);
        run.setBolwerId(bolwerId);
        if(runType == testJAVA.scoreBoard.runType.out)
        {
        run.setContrubutor(contrubutor);
        wicket++;
        }
        else
        {
            sumScore += score;
        }
        run.setRunType(runType);
        scoreStack.push(run);
        return run;
    }

    public Boolean removeRun()
    {
        
        if(scoreStack.empty())
        {
            System.out.println("NOt possible");
            return false;
        }
        run run = scoreStack.pop();

        if(run.getRunType() == runType.out)
        {
            wicket--;
        }
        else
        {
            sumScore = sumScore - run.getScore();
        }
        return true;
    }
    public player addPlayer(int id, String name, String type, String team) {
        player player = new player();
        player.setPlayerId(id);
        player.setName(name);
        player.setType(type);
        player.setTeam(team);
        playerList.add(player);
        return player;
    }
}
