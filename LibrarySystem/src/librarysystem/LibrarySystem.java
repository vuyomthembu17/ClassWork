/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package librarysystem;

/**
 *
 * @author VuyoMthembu
 */
public class LibrarySystem 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       Library library = new Library();

        // Adding some books
        library.addBook(new Book("Romeo and Juliet", "William Shakespeare's", "123456789", 3));
        library.addBook(new Book("Programming 731 ", "Jemina Matiya", "246810122", 1));
        library.addBook(new Book("Human Computer Interaction 700", "Jealous Kwamaya", "020304050", 2));
        library.addBook(new Book("Programming 741", "Jemina Matiya", "020304050", 2));


        // Displaying all available books
        library.displayAvailableBooks();
    }
    
}
