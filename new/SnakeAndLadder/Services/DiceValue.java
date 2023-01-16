package Services;

import java.util.Random;

public class DiceValue {

    public static  int getDiceValue()
    {
        Random random = new Random();
        return random.nextInt(7);
    }

}
