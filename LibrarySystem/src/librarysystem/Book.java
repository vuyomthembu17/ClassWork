/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarysystem;

/**
 *
 * @author VuyoMthembu
 */
public class Book 
{
    //Declaring Variables
    String title;
    String author;
    String isbn;
    int quantity;
    
    //Construtor
    public Book(String title, String author, String isbn, int quantity) 
    {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.quantity = quantity;
    }
    
    //Getter Method
    public String getTitle() 
    {
        return title;
    }
    public String getAuthor() 
    {
        return author;
    }
    public String getIsbn() 
    {
        return isbn;
    }
    public int getQuantity() 
    {
        return quantity;
    }
    
    //Setter Method
    public void setTitle(String title) 
    {
        this.title = title;
    }
    public void setAuthor(String author) 
    {
        this.author = author;
    }
    public void setIsbn(String isbn) 
    {
        this.isbn = isbn;
    }
    public void setQuantity(int quantity) 
    {
        this.quantity = quantity;
    }
    
    
}



