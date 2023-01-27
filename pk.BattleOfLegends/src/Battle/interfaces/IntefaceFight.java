
package Battle.interfaces;

import Battle.classes.Fighter;

public interface IntefaceFight {
    
    //Metodos abstratos, desenvolvidos na classe Fight()
    public abstract void arrangeFight(Fighter a,Fighter b,int r);
    public abstract void startFight();
    public abstract void cancelFight();
    
}
