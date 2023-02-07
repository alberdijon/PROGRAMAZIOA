package herentziamemberabstraktobarik;

public class WaterMonster extends Monster{
    public WaterMonster(String name) {
        super(name);
     }
     /** Subclass provides actual implementation for attack() */
     @Override
     public String attack() {
        return "Attack with water!";
     }
}
