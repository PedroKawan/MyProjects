package Class.peripherals;


public class Hedset implements Interfaces.RGB{
    
    //Attributes.
    private String color, brand;
    private int button, volume;
    private boolean RGB, RGBe, microphone, connected;
    /**/
    
    
    public Hedset(){
        this.setBrand("Undefined");
        this.setColor("Undefined");
        this.setVolume(50);
        this.setConnected(false);
    }
    
    
    public void defineHedset(String brand, String color,boolean rgb, int button, boolean microphone){
        this.setBrand(brand);
        this.setRGB(rgb);
        this.setColor(color);
        this.setButton(button);
        this.setMicrophone(microphone);
    }
    
    
    //methods.
    public void connect(){
        this.setConnected(true);
    }
    
    public void disconnect(){
        this.setConnected(false);
    }
    
    public void upVolume(){
        if (this.isConnected() & this.getVolume() < 100) {
            this.setVolume(this.getVolume() + 10);
        } 
    }
    
    public void downVolume(){
        if (this.isConnected() & this.getVolume() > 0){
            this.setVolume(this.getVolume() - 10);
        }
    }
    
    public String toString(){
        String s;
                
        s = "\n- HEDSET -"
            + "\nBrand: " + this.getBrand()
            + "\nColor: " + this.getColor()
            + "\nRGB: " + this.isRGB();
        
            if(this.isRGB()){
                s += "\nRGB[e/d]: " + this.isRGBe();
            }
        
            s += "\nConnected: " + this.isConnected()
            + "\nMicrophone: " + this.isMicrophone()
            + "\nVolume: " + this.getVolume()
            + "\nV: ";
        for (int i = 0; i < this.getVolume(); i += 10){
            s += "+";
        }
        return s + "\n---------------";
    }
    
    //Setters and Getters methods.
    private void setRGB(boolean r){
        this.RGB = r;
    }
    
    private boolean isRGB(){
        return this.RGB;
    }
    
    public boolean isRGBe() {
        return RGBe;
    }
    
    public void setRGBe(boolean RGBe) {
        this.RGBe = RGBe;
    }
    
    private String getColor() {
        return color;
    }
    
    private void setColor(String color) {
        this.color = color;
    }
    
    private String getBrand() {
        return brand;
    }
    
    private void setBrand(String brand) {
        this.brand = brand;
    }

    private int getButton() {
        return button;
    }

    private void setButton(int button) {
        this.button = button;
    }
    
    private void setVolume(int volume){
        this.volume = volume;
    }
    
    private int getVolume(){
        return this.volume;
    }
    
    private boolean isMicrophone() {
        return microphone;
    }

    private void setMicrophone(final boolean microphone) {
        this.microphone = microphone;
    }

    private boolean isConnected() {
        return connected;
    }

    private void setConnected(boolean connected) {
        this.connected = connected;
    }
    /**/
      
    
    //Interface methods.
    @Override
    public void enableRGB(){
        if (this.isConnected()) {
            this.setRGBe(true);
        }
    }
    
    @Override
    public void disableRGB(){
        if (this.isConnected()) {
            this.setRGBe(false);
        }
    }
    /**/
    
}
