package Unit9Lab2;

import java.util.Random;

public class Chick extends Animal {

    private String mySound1;
    private String mySound2;

    public Chick(String type, String sound1, String sound2) {
        super.myType = type;
        mySound1 = sound1;
        mySound2 = sound2;
    }

    public String getSound() {
        String[] tempArr = { mySound1, mySound2 };
        Random rand = new Random();
        return tempArr[rand.nextInt(2)];
    }

}
