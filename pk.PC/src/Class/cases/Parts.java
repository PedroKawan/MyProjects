
package Class.cases;

public class Parts implements Interfaces.ConnectPart{
    //Atributes.
    private String brand, type, part;
    private boolean connected, define;
    /**/
    
    public Parts(){
        this.setType("Undefined");
        this.setBrand("Undefined");
        this.setPart("Undefined");
        this.setDefine(false);
    }
    
    public void definePart(String part, String brand, String type){
        if (!(this.isDefine())){
            this.setPart(part);
            this.setBrand(brand);
            this.setType(type);
            this.setDefine(true);
        }
    }
    

    //Getters and Setters methods.
    public String getBrand() {
        return brand;
    }

    private void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    private void setType(String type) {
        this.type = type;
    }

    public boolean isConnected() {
        return connected;
    }

    private void setConnected(boolean connected) {
        this.connected = connected;
    }
    
    public boolean isDefine() {
        return define;
    }
    
    public void setDefine(boolean define) {
        this.define = define;
    }
    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    } 
    

    /**/

   

    

    
    @Override
    public void info(){
        System.out.println(this.stringInfo());
    }
    
    @Override
    public void switchPart(String brand,String type){
        if(this.isDefine()) {
            this.setBrand(brand);
            this.setType(type);
        }
    }
    
    @Override
    public void connect(){
        if(this.isDefine()) {
            this.setConnected(true);
        }
    }
    
    @Override
    public void disconnect(){
        if(this.isDefine()) {
            this.setConnected(false);
        }
    }
    
    
    public String stringInfo(){
        String s;
        
            s = "\n- " + this.getPart().toUpperCase() + " -";
            
                if (this.isDefine()) {
                    s += "\nBrand: " + this.getBrand()
                        + "\nType: " + this.getType();
                } else {
                    s += "\nPart undefined";
                }
                s += "\nConnected: " + this.isConnected();
                             
        return s;
    }
}
