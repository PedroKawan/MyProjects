/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Read.classes;


public class Book{
    
    private String title;
    private String author;
    private int amountPages;
    private int currentPage;
    private boolean opened;

    public Book(String _title, String _author, int _amountPages){
        this.setTitle(_title);
        this.setAuthor(_author);
        this.setAmountPages(_amountPages);
        this.setOpened(false);
        this.setCurrentPage(0);
    }    
    
    
    protected String getTitle() {
        return title;
    }

    protected void setTitle(String title) {
        this.title = title;
    }

    protected String getAuthor() {
        return author;
    }

    protected void setAuthor(String author) {
        this.author = author;
    }

    protected int getAmountPages() {
        return amountPages;
    }

    protected void setAmountPages(int amountPages) {
        this.amountPages = amountPages;
    }

    protected int getCurrentPage() {
        return currentPage;
    }

    protected void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    protected boolean isOpened() {
        return opened;
    }

    protected void setOpened(boolean opened) {
        this.opened = opened;
    }

}

