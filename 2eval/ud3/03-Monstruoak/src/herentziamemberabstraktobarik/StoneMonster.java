package herentziamemberabstraktobarik;

public class StoneMonster extends Monster {
    public StoneMonster(String name) {
        super(name);
     }
     /** Subclass provides actual implementation for attack() */
     @Override
     public String attack() {
        return "Attack with stones!";
     }
}
