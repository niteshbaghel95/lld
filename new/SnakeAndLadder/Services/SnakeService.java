package Services;


import java.util.Map;

import database.SnakeMap;
import models.Snake;

public class SnakeService {
    private static SnakeService snakeService = null;

    public static SnakeService getInstance()
    {
        if(snakeService == null)
        {
            snakeService = new SnakeService();
        }
        return snakeService;
    }

    SnakeMap snakeMap = SnakeMap.getInstance();

    public Snake addSnake(int start, int end)
    {
        return snakeMap.addSnake(start, end);
    }
    public Map<Integer, Snake> getSnakes()
    {
        return snakeMap.getSnaks();
    }

}
