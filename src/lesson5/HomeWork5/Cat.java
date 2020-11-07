package lesson5.HomeWork5;

public class Cat extends Animals {
    public Cat(String getType, float getRun, float getSail, float getJamp){
        super(getType, getRun, getSail, getJamp);
    }
    @Override
    String canSail(float n){
        return "can not swim";
    }
}
