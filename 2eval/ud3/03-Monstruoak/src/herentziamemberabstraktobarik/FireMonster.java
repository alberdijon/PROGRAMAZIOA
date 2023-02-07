package herentziamemberabstraktobarik;

public class FireMonster extends Monster{
    public FireMonster(String name) {
        super(name);
     }
     /** Subclass provides actual implementation for attack() */
     @Override
     public String attack() {
        return "Attack with fire!"; 
     }
}
