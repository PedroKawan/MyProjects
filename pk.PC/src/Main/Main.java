
package Main;

import Class.peripherals.Hedset;
import Class.peripherals.Keyboard;
import Class.peripherals.Mouse;
import Class.peripherals.Monitor;
import Class.cases.Case;
import Class.PC.PC;

public class Main {
    
    public static void main(String[] args){
        /*
        Hedset h = new Hedset();
        h.defineHedset("RedDragon", "Black",true, 1, true);
        h.connect();
        System.out.println(h.toString());
          
        Keyboard k = new Keyboard();
        k.defineKeyboard("RedDragon", "White", "Mecanic", "USA", true, 0);
        System.out.println(k.toString());
        
        Mouse m = new Mouse();
        m.defineMouse("Razer", "Black", true, 6);
        m.defineMouseDpi(800, 1200,1500);
        m.connect();
        System.out.println(m.toString());
        
        Monitor mn = new Monitor();
        mn.defineMonitor("Asus", "Black", "RGB", 140, 6);
        mn.connect();
        mn.on();
        mn.switchColor();
        mn.switchColor();
        mn.upBrightness();
        System.out.println(mn.toString());
        
        
        Case c = new Case();
        c.defineCase("Gamer", "G", "Black");
        c.buyProcessor("Intel", "i5 9400f");
        c.buyStorage("Sandisk", "SSD");
        c.buyMotherboard("Asus","Intel");
        c.buyVideoboard("Nvidia", "GTX 1660");
        c.buyFont("Giga","80plus");
        c.info();
        c.on();
        c.reset();
        c.off();
        System.out.println(c.toString());
        */
        
        PC pc = new PC();
        pc.getKeyboard().defineKeyboard("Razer", "Green", "Mecanic", "USA", true, 80);
        pc.getMonitor().defineMonitor("Asus", "Black", "RGB", 140, 5);
        pc.getMonitor().connect();
        pc.getMonitor().on();
        pc.getMonitor().menu();
    }
}
