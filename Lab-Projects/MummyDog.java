package com.mycompany.arraylist;
/**
 *
 * @author supan
 */
import java.util.ArrayList;
import java.util.List;

class BabyDog {
    private String name;

    public BabyDog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class MummyDog {
    private String name;
    private List<BabyDog> babyDogs;
    
    public MummyDog(String name){
        this.name = name;
        this.babyDogs = new ArrayList<>();
    }
    
    public void addBabyDog(BabyDog babyDog){
        babyDogs.add(babyDog);
        System.out.println("Mummy Dog Name: " + name + ", Baby Dog Added: " + babyDog.getName());
    }
    
    public static void main(String[] args) {
        MummyDog mummyDog = new MummyDog("Luna");
        mummyDog.addBabyDog(new BabyDog("Puppy 1"));
        mummyDog.addBabyDog(new BabyDog("Puppy 2"));
    }
}
