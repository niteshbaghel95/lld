import java.util.List;
import java.util.Scanner;


import Services.DiceValue;
import Services.LadderService;
import Services.PlayerService;
import Services.SnakeService;
import models.player;

public class Driver {
    public static void main(String[] args) {
        SnakeService snakeService = SnakeService.getInstance();
        PlayerService playerService = PlayerService.getInstance();
        LadderService ladderService = LadderService.getInstance();
        //DiceValue diceValue = DiceValue.getInstance();
        try (Scanner sc = new Scanner(System.in)) {
            int numOfSnake = sc.nextInt();
            for(int i=0;i<numOfSnake;i++)
            {
                int start = sc.nextInt();
                int end = sc.nextInt();
                snakeService.addSnake(start, end);
                System.out.println( start + " snake "+ end);
            }
            
            int numOfLadder = sc.nextInt();
            for(int j=0;j<numOfLadder;j++)
            {
                int start = sc.nextInt();
                int end = sc.nextInt();
                ladderService.addLadder(start, end);
                System.out.println(start + " ladder" + end);
            }

            int numOfPlayer = sc.nextInt();
            for(int z = 0; z<numOfPlayer;z++)
            {
                String name = sc.next();
                playerService.addPlayer(name);
                System.out.println("name");
            }
        }
        boolean flag = false;
        while(true)
        {
            List<player> currPlay = playerService.getPlayers();
            
            for(int i=0;i<currPlay.size();i++)
            {
                player ply = currPlay.get(i);
                int value = DiceValue.getDiceValue();
                System.out.println("Vlaue:  "+ value);
                int oldPos = ply.getPosition();
                int newValue  = ply.getPosition() + value;
                if(newValue >100)
                {
                    newValue = 0;
                    continue;
                }
                else if((ply.getPosition()+value) == 100)
                {
                    flag = true;
                    System.out.println("Player: "+ply.getPlayerName()+" win");
                    break;
                }
                else if(snakeService.getSnakes().containsKey(newValue))
                {
                    
                    ply.setPosition(snakeService.getSnakes().get(newValue).getEnd());
                }
                else if(ladderService.getLadders().containsKey(newValue))
                {
                    ply.setPosition(ladderService.getLadders().get(newValue).getEnd());
                }
                else
                {
                    ply.setPosition(newValue);
                }
                currPlay.set(i, ply);
                System.out.println("Player name:" + ply.getPlayerName() + "moved" + newValue+
                 " oldPosition: "+ oldPos+" newPosition: "+ply.getPosition());
            }
            if(flag == true)
            {
                break;
            }
        }

    }
}
