
package Read.classes;

public class Reading implements Read.interfaces.Publication{
    private Person person;
    private Book book;
    
    public Reading(Person _person, Book _book){
        this.setPerson(_person);
        this.setBook(_book);
    }

    
    @Override
    public void details(){
        System.out.println("");
        System.out.println(" - Details of Book - ");
        System.out.println("Title: " + this.getBook().getTitle());
        System.out.println("Author: " + this.getBook().getAuthor());
        System.out.println("Amount of Pages: " + this.getBook().getAmountPages());
        System.out.println("Current Page: " + this.getBook().getCurrentPage());
        System.out.println("Opened[t/f]: " + this.getBook().isOpened());
        System.out.println("");
        System.out.println(" - Details of Reader - ");
        System.out.println("Name: " + this.person.getName());
        System.out.println("Age: " + this.person.getAge());
        System.out.println("Gender: " + this.person.getGender());
        System.out.println("");
    }
    
    @Override
    public void open(){
        
        if (!(this.getBook().isOpened())){
            this.getBook().setOpened(true);
        } else {
            System.out.println("The book is opened!");
        }
        
    }
    
    @Override
    public void close(){
        
        if (this.getBook().isOpened()) {
            this.getBook().setOpened(false);
        } else {
            System.out.println("The book is closed!");
        }
        
    }
    
    @Override
    public void browse(int p){
        if (this.getBook().isOpened()) {
            
            if (p > this.getBook().getAmountPages()) {
                System.out.println("Impossible browser, the book does not have this amount pages!");
            } else {
                this.getBook().setCurrentPage(p);
            }
            
            
        } else {
            System.out.println("Impossible, the book is closed!");
        }
    }
    
    @Override
    public void nextPage(){
        if (this.getBook().isOpened()){
            
            if (this.getBook().getCurrentPage() != this.getBook().getAmountPages()) {
                this.getBook().setCurrentPage(this.getBook().getCurrentPage() + 1);

            } else {
                System.out.println("There are no more pages, end of book!");
            }
            
        } else {
            System.out.println("Impossible, the book is closed!");
        }
    }
    
    @Override
    public void backPage(){
        
        if (this.getBook().isOpened()) {
            
            if (this.getBook().getCurrentPage() > 0) {
                this.getBook().setCurrentPage(this.getBook().getCurrentPage() - 1);
                
            } else {
                System.out.println("This is the beginning of the book!");
            } 
            
        } else {
            System.out.println("Impossible, the book is closed!");
        }
    
    }
        
    private Person getPerson(){
     return this.person;   
    }

    private void setPerson(Person person) {
        this.person = person;
    }

    private Book getBook() {
        return this.book;
    }

    private void setBook(Book book) {
        this.book = book;
    }

}
