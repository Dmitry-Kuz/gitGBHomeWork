package lesson5.HomeWork5;

public abstract   class Animals {
    private String type;
    private float run;
    private float sail;
    private float jump;

    public Animals(String type, float run, float sail, float jump){
        this.type = type;
        this.run = run;
        this.sail = sail;
        this.jump = jump;
    }

    boolean canRun(float n){
        if(n <= run) {
            return true;
        }else return false;
    }

    String canSail(float n){
        if(n <= sail) {
            return "true";
        }else return "false";
    }

    boolean canJump(float n){
        if(n <= jump) {
            return true;
        }else return false;
    }

    String getType(){
        return type;
    }

    float getJump() {
        return jump;
    }

    float getRun(){
        return this.run;
    }

    float getSail(){
        return sail;
    }

}
