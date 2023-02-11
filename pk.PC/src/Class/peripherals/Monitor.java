
package Class.peripherals;

public class Monitor implements Interfaces.Monitor{
    
    //Atributes
    private String brand, typeScreen, color;
    private String[] typeColor = new String[6];
    private int hz, button, brightness;
    private int current = 1;
    private boolean openedMenu, on, connected;   
    /**/
    
    public Monitor(){
        this.setBrand("Undefined");
        this.setColor("Undefined");
        this.setTypeColor(1,"Undefined");
        this.setTypeScreen("Undefined");
    }
    
    public void defineMonitor(String brand, String color, String screen, int hz,  int button){
        this.setBrand(brand);
        this.setColor(color);
        this.setTypeScreen(screen);
        this.setHz(hz);
        this.setButton(button);
        
        this.setTypeColor(1,"Standard");
        this.setTypeColor(2,"Gamer");
        this.setTypeColor(3,"Contrast");
        this.setTypeColor(4,"Black/White");
        this.setTypeColor(5,"Reading");
    }
    
    
    public void connect(){     
        this.setConnected(true);
    }
   
    public void disconnect(){
        this.setConnected(false);
    }
    
    
    
    
    //Interface methods.
    @Override
    public void on(){
        this.setOn(true);
    }
    
    @Override
    public void off(){
        this.setOn(false);
    }
    
    @Override
    public void menu(){
        if (this.isConnected() & this.isOn()){
            if (this.isOpenedMenu()){
                this.setOpenedMenu(false);
            } else {
                this.setOpenedMenu(true);
                System.out.println(this.stringMenu());
            }
        }        
    }
    
    @Override
    public void upBrightness(){
        if (this.isConnected() & this.isOn()){
           if (this.getBrightness() < 100){
               this.setBrightness(this.getBrightness() + 10);
            } 
        }
    }
    
    @Override
    public void downBrightness(){
        if (this.isConnected() & this.isOn()){
            if (this.getBrightness() > 0){
                this.setBrightness(this.getBrightness() - 10);
            }
        }
    }
    
    @Override
    public void switchColor(){
       this.setCurrent(this.getCurrent() + 1);
       if (this.isConnected() & this.isOn()){
            if (this.getCurrent() == 6){
                this.setCurrent(1);
            }
        }
    }
    /**/
    
    
    
    
    //Setters and Getters methods.
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getTypeScreen() {
        return typeScreen;
    }

    public void setTypeScreen(String typeScreen) {
        this.typeScreen = typeScreen;
    }

    public String[] getTypeColor() {
        return typeColor;
    }

    public void setTypeColor(int v, String typeColor) {
        this.typeColor[v] = typeColor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }
    
    
    
    public int getHz() {
        return hz;
    }

    public void setHz(int hz) {
        this.hz = hz;
    }

    public int getButton() {
        return button;
    }

    public void setButton(int button) {
        this.button = button;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    public boolean isOpenedMenu() {
        return openedMenu;
    }

    public void setOpenedMenu(boolean openedMenu) {
        this.openedMenu = openedMenu;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public boolean isConnected() {
        return connected;
    }

    public void setConnected(boolean connected) {
        this.connected = connected;
    }
    /**/
    
    //String Return.
    public String toString(){
        String s;
                
        s = "\n- Monitor -"
            + "\nBrand: " + this.getBrand()
            + "\nScreeen: " + this.getTypeScreen()
            + "\nColor: " + this.getColor()
            + "\nHZ: " + this.getHz() + "hz"
            + "\nMenu: " + this.isOpenedMenu()
            + "\nA.Button: " + this.getButton()
            + "\nConnected: " + this.isConnected()
            + "\nOn: " + this.isOn();

        return s + "\n---------------";
    }
        
    public String stringMenu(){
        String s = "\n|= = = = = MENU = = = = =";
        
        s += "\n|monitor: ON"
            + "\n|Status: Connected to PC"
            + "\n|TypeColor: " + this.getTypeColor()[current]
            + "\n|Brightness: " + this.getBrightness() + "%"
            + "\n|= = = = = = = = = = = = ";
        return s;
    }
        
        
        /**/
        
    }