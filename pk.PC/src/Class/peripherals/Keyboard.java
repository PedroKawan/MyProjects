package Class.peripherals;

public class Keyboard implements Interfaces.RGB {
    
    //Atributes.
    private String brand, color, type, nacionality;
    private int button;
    private boolean RGB, connected;
    /**/
    
    public Keyboard(){
        this.setBrand("Undefined");
        this.setColor("Undefined");
        this.setType("Undefined");
        this.setNacionality("Undefined");
    }
    
    
    public void defineKeyboard(String brand, String color, String type, String nacionality, boolean rgb, int button){
        this.setBrand(brand);
        this.setType(type);
        this.setNacionality(nacionality);
        this.setRGB(rgb);
        this.setColor(color);
        this.setButton(button);
    }
    
    public void connect(){     
        this.setConnected(true);
    }
   
    public void disconnect(){
        this.setConnected(false);
    }
    
    //toString method.
    public String toString(){
        String s;
                
        s = "\n- KEYBOARD -"
            + "\nBrand: " + this.getBrand()
            + "\nColor: " + this.getColor()
            + "\nType: " + this.getType()
            + "\nNacionality: " + this.getNacionality()
            + "\nRGB: " + this.isRGB()
            + "\nConnected: " + this.isConnected();
        return s + "\n---------------";
    }
    /**/
    
    //Setters and Getters methods.
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNacionality() {
        return nacionality;
    }

    public void setNacionality(String nacionality) {
        this.nacionality = nacionality;
    }

    public int getButton() {
        return button;
    }

    public void setButton(int buttons) {
        this.button = buttons;
    }
    
    public void setRGB(boolean rgb){
        this.RGB = rgb;
    }
    
    public boolean isRGB(){
        return this.RGB;
    }
        
    public boolean isConnected() {
        return connected;
    }

    public void setConnected(boolean connected) {
        this.connected = connected;
    }
    /**/
    
    //Interface methods.
    @Override
    public void enableRGB(){
        if (this.isConnected()) {
            this.setRGB(true);
        }
        
    }
    
    @Override
    public void disableRGB(){
        if (this.isConnected()) {
            this.setRGB(false);
        } 
        
    }
    /**/
    
}
