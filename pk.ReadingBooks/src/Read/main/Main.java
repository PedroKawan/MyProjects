
package Read.main;

import Read.classes.Person;
import Read.classes.Book;
import Read.classes.Reading;

public class Main {
    
    static Person p[] = new Person[2];
    static Book b[] = new Book[3];
    static Reading r[] = new Reading[2];
    
    public static void main(String[] args) {
        p[0] = new Person("Pedro",18,'M');
        b[0] = new Book("Quaisquer titulo ai", "Quaisquer autor",500);
        r[0] = new Reading(p[0],b[0]);
        
        
        r[0].open();
        r[0].browse(100);
        r[0].backPage();
        r[0].details();
        
        
    }
    
}
