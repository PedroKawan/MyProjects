
package bankaccount;

import javax.swing.JOptionPane;

public class Account extends Menu{
    
    protected int numberAccount;
    protected String type;
    protected String person;
    protected double money;
    protected boolean opened;

    
    public Account(String t, String p,int n){
        this.setMoney(0);
        this.setOpened(false);
        
        this.setType(t);
        this.setPerson(p);
        this.setNumberAccount(n);
     
    }
    
    
    
    
    //Setters and Getters methods.
    public void setNumberAccount(int n){
        numberAccount = n;
    }
    public int getNumberAccount(){
        return numberAccount;
    }
    
    public void setType(String t){
        type = t;
        if (t.equals("Poupança")){
            this.setMoney(150);        
        } else if(t.equals("Corrente")){
            this.setMoney(50);
        }
    }
    public String getType(){
        return type;
    }
    
    public void setPerson(String p){
        person = p;
    }
    public String getPerson(){
        return person;
    }
    
    public void setMoney(double m){
        money = m;
    }
    public double getMoney(){
        return money;
    }
    
    public void setOpened(boolean p){
        this.opened = p;
    }
    
    public boolean getOpened(){
        return this.opened;
    }
    
    
    
    
    //Others methods.
    public String status(){
        String stt;
        
        stt = "NumberAccount: " + this.getNumberAccount()
                + "\nType: " + this.getType()
                + "\nPerson: " + this.getPerson()
                + "\nMoney: " + String.format("%.2f",this.getMoney()) + "R$"
                + "\nOpened: " + Boolean.toString(this.getOpened());; 
        
        return stt;
        
    }
    
    public void openedAccount(){
        this.setOpened(true);
         JOptionPane.showMessageDialog(null, "Account Opened!");
    }
    
    public void closedAccount(){
        if (this.getMoney() < 0){
            JOptionPane.showMessageDialog(null,"you are Owing.","ERROR",JOptionPane.WARNING_MESSAGE);
            
        } else if (this.getMoney() > 0){
            JOptionPane.showMessageDialog(null, "You have "+ String.format("%.2f",this.getMoney()) + "R$ in the account.","ERROR",JOptionPane.WARNING_MESSAGE);
        } else if (this.getMoney() == 0) {
        this.setOpened(false);
         JOptionPane.showMessageDialog(null, "Account Closed!");   
        }
    }
    
    public void deposit(double value){
        if (this.getOpened() == true) {
            
        setMoney(getMoney() + value);
        JOptionPane.showMessageDialog(null, String.format("%.2f",value) + "R$ were deposited in your account.");
        } else {
            JOptionPane.showMessageDialog(null,"Open Account to deposit.","ERROR",JOptionPane.WARNING_MESSAGE);
        }
    }
    public void whitDraw(double value){
        if (this.getOpened() == true){
            
            if (value <= this.getMoney()){
                JOptionPane.showMessageDialog(null, String.format("%.2f",value) + "R$ was withdrawn from you account.");
                setMoney(getMoney() - value);
                 
            } else {
                JOptionPane.showMessageDialog(null,"You don't have that money in the account.","ERROR",JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null,"Open account to whitDraw.","ERROR",JOptionPane.WARNING_MESSAGE);
        }
    }
 
    
    public void monthlyPayment(){
        double v = 0;
            if(this.getType().equals("Poupança")){
                v = 20;
            } else {
                v = 12;
            }
            
            if (this.getOpened() == true){
                if (this.getMoney() > v) {
                    setMoney(getMoney() - v);
                    JOptionPane.showMessageDialog(null, "Successful payment. \n"
                            + String.format("%.2f",v) + "R$ was whitdrawn from you account."); 
                } else {
                    JOptionPane.showMessageDialog(null,"insufficient value!","ERROR",JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null,"Open account for pay monthly fee!","ERROR",JOptionPane.WARNING_MESSAGE);
            }

    }
        
}
