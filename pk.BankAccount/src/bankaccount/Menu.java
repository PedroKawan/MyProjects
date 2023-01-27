
package bankaccount;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Menu {
        
        int number;
        String password = "123456";
        int amountAccount = 1;
        
        int list[] = new int[11];
        String tablePerson[] = new String[11];
        String table[] = new String [11];
        
        
        String screenPerson = "";
        String Screen = "";
        
        String sOption;
        int option;
    

        
        double r;
        int na;
        String type;
        String person = "s";
       
    public void menu(){
        Account a[] = new Account[11];
        
        do{
            for (int i = 0; i <= 1000; i++){
 
            sOption = JOptionPane.showInputDialog(null,"1. Create Account \n"
            + "2. Accese Account \n"
            + "3. Manager[Vip] \n"        
            + "4. Exit","MENU",3);
            
            if (sOption.equals("1") || sOption.equals("2") || sOption.equals("3") || sOption.equals("4")){
                break;
            }
            JOptionPane.showMessageDialog(null, "Select one of the options!","ERROR",1);
            }
            
            
            option = Integer.parseInt(sOption);
            switch (option) {               
                case 1:
                    
                    
                    
                    do {
                        
                        for (int i = 0; i <= 1000; i++){
                        sOption = JOptionPane.showInputDialog("1. Poupança \n"
                            + "2. Corrente");
                        
                        if (sOption.equals("1") || sOption.equals("2")){ 
                            break;
                        }
                        
                        JOptionPane.showMessageDialog(null, "Select one of the options!","ERROR",1);
                        
                        }
                        
                        
                        option = Integer.parseInt(sOption);
                        switch(option){
                        
                            case 1:
                                type = "Poupança";
                                break;
                            case 2:
                                type = "Corrente";
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Select one of the options!","ERROR",1);
                                break;
 }
                    } while(option != 1 && option != 2);
                    
                    r = Math.random() * 100;
                    na = (int) r * ( 1000000 - 1);
                    
                    person = JOptionPane.showInputDialog("Write your full name:");
                    JOptionPane.showMessageDialog(null, "Account created!"
                            + "\nSave your number account:" + na);
                    
                    
                    
                    System.out.println(person + ":  " + na);
                    
                        a[amountAccount] = new Account(type, person, na);
                       
                    
                        table[amountAccount] = a[amountAccount].status();
                        tablePerson[amountAccount] = amountAccount + ". " + person;
   
                        list[amountAccount] = na;
                  
                    amountAccount += 1;
                    break;
                    
                
                    
                    
                    
                    
                case 2:
                    sOption = "";
                    option = 0;
                    if (amountAccount == 1){
                        JOptionPane.showMessageDialog(null, "No account created!");
                        break;
                    } 
                    
                    number = Integer.parseInt(JOptionPane.showInputDialog("Enter the Account number:"));
                    for (int i = 1; i < 11; i++){
                        if (number == list[i]){
                            JOptionPane.showMessageDialog(null, "Successful search.");                            
                            do {
                            sOption = JOptionPane.showInputDialog(null, "1. Deposit \n"
                                    + "2. WhitDraw \n"
                                    + "3. Monthly payment \n"
                                    + "4. Closed Account \n"
                                    + "5. Opened Account \n"
                                    + "6. Status \n"
                                    + "7. Return","ACCOUNT", 1);
                            option = Integer.parseInt(sOption);
                            switch (option){
                                case 1:
                                        a[i].deposit(Integer.parseInt(JOptionPane.showInputDialog(null,"Set Value:")));
                                        table[i] = a[i].status();
                                                       
                                     break;
                                case 2:
                        
                                        a[i].whitDraw(Integer.parseInt(JOptionPane.showInputDialog(null,"Set Value:")));
                                        table[i] = a[i].status();
                                    
                                     
                                    break;
                                case 3:
                                    
                                       a[i].monthlyPayment();
                                       table[i] = a[i].status(); 
                                   
                                     
                                    break;
                                case 4:
                                    
                                        a[i].closedAccount();
                                        table[i] = a[i].status();
                                   
                                    break;
                                case 5:
                                   
                                        a[i].openedAccount();
                                        table[i] = a[i].status();
                                   
                                    break;
                                case 6:
                                    
                                        JOptionPane.showMessageDialog(null, a[i].status());
                                    
                                    break;
                                case 7:
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null, "Select one of the options!","ERROR",1);
                                    break;
                                } 
                            } while(option != 7); 
                            
                        }                
                    }
                    
                    break;
                case 3:                  
                    password = JOptionPane.showInputDialog("Type the Password:");
                    if  (!password.equals("123456")){
                        JOptionPane.showMessageDialog(null,"Incorrect Password!","ERROR",JOptionPane.WARNING_MESSAGE);
                        break;
                    }
                    
                    Screen = "";
                    screenPerson = "";
                    for (int i = 0; i < amountAccount; i++){
                        Screen += table[i] + "\n";
                    }  
                    
                    for (int i = 1; i < amountAccount; i ++) {
                        screenPerson += tablePerson[i] + "\n";
                    }
                    
                    
                    option = Integer.parseInt(JOptionPane.showInputDialog(null,screenPerson,"ACCOUNT",JOptionPane.INFORMATION_MESSAGE));
                    
                    switch (option){
                         
                        case 1:
                            JOptionPane.showMessageDialog(null,table[1]);
                            break;
                        case 2:
                            JOptionPane.showMessageDialog(null,table[2]);
                            break;
                        case 3:
                            JOptionPane.showMessageDialog(null,table[3]);
                            break;
                        case 4:
                            JOptionPane.showMessageDialog(null,table[4]);
                            break;
                        case 5:
                            JOptionPane.showMessageDialog(null,table[5]);
                            break;
                        case 6:
                            JOptionPane.showMessageDialog(null,table[6]);
                            break;
                        case 7:
                            JOptionPane.showMessageDialog(null,table[7]);
                            break;
                        case 8:
                            JOptionPane.showMessageDialog(null,table[8]);
                            break;
                        case 9:
                            JOptionPane.showMessageDialog(null,table[9]);
                            break;
                        case 10:
                            JOptionPane.showMessageDialog(null,table[10]);
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Select one of the options!","ERROR",1);
                            break;
                    }
        
                case 4:
                    break;
                default:
                    
                    JOptionPane.showMessageDialog(null, "Select one of the options!","ERROR",1);

                
            }
            
        } while ( (option != 4));        
        
    }
    
}
