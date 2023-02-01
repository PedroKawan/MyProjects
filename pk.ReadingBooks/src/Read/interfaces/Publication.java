
package Read.interfaces;

public interface Publication {
    
    public abstract void open();
    public abstract void close();
    public abstract void browse(int p);
    public abstract void nextPage();
    public abstract void backPage();
    public abstract void details();
    
}
