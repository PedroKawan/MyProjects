
package Class.cases;

public class Case implements Interfaces.Case{
    private String brand, type, color;
    private Parts processor, motherboard, videoboard, font, storage;
    private int fans, button;
    private boolean connected, compatible;
    
    
    public Case(){
        this.setBrand("Undefined");
        this.setColor("Undefined");
        this.setType("Undefined");
        this.processor = new Parts();
        this.motherboard = new Parts();
        this.videoboard = new Parts();
        this.font = new Parts();
        this.storage = new Parts();
    }
    
    
    
    public void connect(){
        this.setConnected(true);
    }
   
    public void disconnect(){
        this.setConnected(false);
    }
    
    public void defineCase(String brand, String type, String color){   
            this.setBrand(brand);
            this.setColor(color);
            this.setType(type);
        }
    
    
    //Buy method.
    public void buyProcessor(String brand, String type){ 
        this.getProcessor().definePart("Processor", brand, type);
        this.verification();
    }
    public void buyMotherboard(String brand, String type){  
        this.getMotherboard().definePart("MotherBoard", brand, type);
        this.verification();
    }
    public void buyVideoboard(String brand, String type){
        this.getVideoboard().definePart("VideoBoard", brand, type);
    }
    public void buyFont( String brand, String type){
        this.getFont().definePart("Font", brand, type);
    }
    public void buyStorage(String brand, String type){
        this.getStorage().definePart("Storage", brand, type);
    }
    /**/
    
    
    

    //Setters and Getters methods.
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public Parts getProcessor() {
        return processor;
    }

    public void setProcessor(Parts processor) {
        this.processor = processor;
    }

    public Parts getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Parts motherboard) {
        this.motherboard = motherboard;
    }

    public Parts getVideoboard() {
        return videoboard;
    }

    public void setVideoboard(Parts videoboard) {
        this.videoboard = videoboard;
    }

    public Parts getFont() {
        return font;
    }

    public void setFont(Parts font) {
        this.font = font;
    }

    public Parts getStorage() {
        return storage;
    }

    public void setStorage(Parts storage) {
        this.storage = storage;
    }

    public int getFans() {
        return fans;
    }

    public void setFans(int fans) {
        this.fans = fans;
    }

    public int getButton() {
        return button;
    }

    public void setButton(int button) {
        this.button = button;
    }

    public boolean isConnected() {
        return connected;
    }

    public void setConnected(boolean connected) {
        this.connected = connected;
    }
    
    public boolean isCompatible() {
        return compatible;
    }

    public void setCompatible(boolean compatible) {
        this.compatible = compatible;
    }
    /**/

    
    
    @Override
    public void on(){
        if (this.getProcessor().isDefine() & this.getMotherboard().isDefine() & this.getVideoboard().isDefine() & this.getFont().isDefine() & this.getStorage().isDefine() & this.isCompatible()){
            this.setConnected(true);
            System.out.println("\nPC ON");
        } else {
            System.out.println("\n[!]Some part was not defined");
        }
    }
    @Override
    public void off(){
        if (this.isConnected()){
            this.setConnected(false);
            System.out.println("\nPC OFF");
        }
    }
    @Override
    public void reset(){
        if(this.isConnected()){
            System.out.println("\nResetting...");
            this.setConnected(false);
            System.out.println("Pc OFF");
            this.setConnected(true);
            System.out.println("Pc ON");
            System.out.println("Reset successful!!");
        }
    }
    @Override
    public void cleanCase(){
        this.getProcessor().switchPart("Undefined", "Undefined");
        this.getMotherboard().switchPart("Undefined", "Undefined");
        this.getVideoboard().switchPart("Undefined", "Undefined");
        this.getFont().switchPart("Undefined", "Undefined");
        this.getStorage().switchPart("Undefined", "Undefined");
    }
    
    @Override
    public void info(){
        System.out.println(this.stringInfo());
    }
    
    
    
    //toString method.
    public String toString(){
        String s;
        s = "\n- CASE -"
            + "\nPC Connected: " + this.isConnected()
            + "\nProcessor: " + this.getProcessor().isDefine()
            + "\nMotherBoard: " + this.getMotherboard().isDefine()
            + "\nVideoBoard: " + this.getVideoboard().isDefine()
            + "\nFont: " + this.getFont().isDefine()
            + "\nStorage: " + this.getStorage().isDefine();
        return s;
    }
    /**/
    
    public String stringInfo(){
        String s;
            
            s = "\n- CASE INFO -"
                + "\nBrand: " + this.getBrand()
                + "\nType: " + this.getType()
                + "\nColor: " + this.getColor()
                + "\n-"
                + "\nProcessor: " + this.getProcessor().getBrand() + " - " + this.getProcessor().getType()
                + "\nMotherBoard: " + this.getMotherboard().getBrand() + " - " + this.getMotherboard().getType()
                + "\nVideoBoard: " + this.getVideoboard().getBrand() + " - " + this.getVideoboard().getType()
                + "\nFont: " + this.getFont().getBrand() + " - " + this.getFont().getType()
                + "\nStorage: " + this.getStorage().getBrand() + " - " + this.getStorage().getType();
            
            if (this.getProcessor().isDefine() & this.getMotherboard().isDefine()){
                if ( !(this.isCompatible()) ){
                    s += "\n[!]PS: PROCESSOR AND MOTHERBOARD ARE INCOMPATIBLES.";
                    this.setCompatible(false);
                }
            }
        return s;
    }
    
    public void verification(){
        if ( !( this.getMotherboard().getType().equalsIgnoreCase( this.getProcessor().getBrand() ) ) ){           
            this.setCompatible(false);
                
        } else {
            this.setCompatible(true);
        }
    }
    
    
}