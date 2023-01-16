package database;

import java.util.HashMap;
import java.util.Map;

import models.Snake;

public class SnakeMap {

    private static Map<Integer,Snake> snaks;
    private static SnakeMap instance = null;

    public Map<Integer,Snake> getSnaks() {
        return snaks;
    }

    public void setSnaks(Map<Integer,Snake> snaks) {
        SnakeMap.snaks = snaks;
    }
    
    public static SnakeMap getInstance()
    {
        if(instance == null)
        {
            instance = new SnakeMap();
        }
        return instance;
    }

    private SnakeMap()
    {
        snaks = new HashMap<>();
    }

    public Snake addSnake(int start, int end)
    {
        if(start <= 0 || end <= 0 )
        {
            System.out.println("start/end can not be zero or less than zero");
            return null;
        }
        Snake snake = new Snake(start, end);
        snaks.put(start, snake);
        return snake;
    }
    
}
