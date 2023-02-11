
package Class.PC;

import Class.peripherals.Hedset;
import Class.peripherals.Keyboard;
import Class.peripherals.Mouse;
import Class.peripherals.Monitor;
import Class.cases.Case;

public class PC {
     
    private Case casePC;
    private Hedset hedset;
    private Keyboard keyboard;
    private Mouse mouse;
    private Monitor monitor;
    
    public PC(){
        casePC = new Case();
        hedset = new Hedset();
        keyboard = new Keyboard();
        mouse = new Mouse();
        monitor = new Monitor();
    }
    
    //Setters and Getters methods.
    public Case getCasePC() {
        return casePC;
    }

    public void setCasePC(Case casePC) {
        this.casePC = casePC;
    }

    public Hedset getHedset() {
        return hedset;
    }

    public void setHedset(Hedset hedset) {
        this.hedset = hedset;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
    /**/
    
    
}
