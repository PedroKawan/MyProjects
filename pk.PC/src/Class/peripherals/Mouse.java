
package Class.peripherals;

public class Mouse implements Interfaces.RGB{
    
    //Atributes.
    private String brand, color;
    private Dpi dpi = new Dpi();
    private int ammount, button, current = 0;
    
    private boolean RGB, RGBe, connected;
    /**/
    
    public Mouse() {
        this.setBrand("Undefined");
        this.setColor("Undefined");   
    }
    
    
    public void defineMouse(String brand, String color, boolean rgb, int button){
        this.setBrand(brand);
        this.setRGB(rgb);
        this.setColor(color);
        this.setButton(button);
    }
    
    public void upDpi(){
       if (this.isConnected()) {
            if(current < 3){
                this.current += 1;
            }
        } 
    }
    
    public void downDpi(){
        if (this.isConnected()) {
            if(current > 1){
                this.current -= 1;
            }
        }
    }
    
    public void connect(){     
        this.setConnected(true);
        this.setCurrent(1);
    }
   
    public void disconnect(){
        this.setConnected(false);
        this.setCurrent(0);
    }
    
    //Dpi.
    public void defineMouseDpi(int a){
        this.getDpi().dpi1(a);
    }
    
    public void defineMouseDpi(int a,int b){
        this.getDpi().dpi2(a, b);
        
    }
    
    public void defineMouseDpi(int x, int y, int z){
        this.getDpi().dpi3(x, y, z);
    }

    /**/
    
    
    //toString method.
    public String toString(){
        String s;
                
        s = "\n- MOUSE -"
            + "\nBrand: " + this.getBrand()
            + "\nColor: " + this.getColor()                        
            + "\nRGB: " + this.isRGB();
            if(this.isRGB()){
                s += "\nRGB[e/d]: " + this.isRGBe();
            }
        
            s += "\nA.Button: " + this.getButton()
            + "\nA.DPI: " + this.getDpi().getAmount()
            + "\nC.DPI: " + this.getDpi().getDp()[current]
            + "\nConnected: " + this.isConnected();
        return s + "\n---------------";
    }
    /**/
    
    
    //Setters and Getters methods.
    public void setCurrent(int c){
        this.current = c;
    }
    
    public int getCurrent(){
        return this.current;
    }
    
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

    public Dpi getDpi() {
        return dpi;
    }

    public void setDpi(Dpi dpi) {
        this.dpi = dpi;
    }

    public int getButton() {
        return button;
    }

    public void setButton(int button) {
        this.button = button;
    }

    public boolean isRGB() {
        return RGB;
    }

    public void setRGB(boolean RGB) {
        this.RGB = RGB;
    }

    public boolean isRGBe() {
        return RGBe;
    }

    public void setRGBe(boolean RGBe) {
        this.RGBe = RGBe;
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
        this.setRGBe(true);
    }
    
    @Override
    public void disableRGB(){
        this.setRGBe(false);
    }
    /**/
}
