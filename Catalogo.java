import java.util.*;
/**
 * Write a description of class Catalogo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Catalogo
{
    public ArrayList<Book> catalogo;

    /**
     * Constructor for objects of class Catalogo
     */
    public Catalogo()
    {
        catalogo = new ArrayList<Book>();
        
    }
    public void addBook(Book libro){
        catalogo.add(libro);
    }
    public void removeBook(Book libro){
        for(int i=0;i < catalogo.size();i++){
            if(catalogo.get(i).equals(libro)){
                catalogo.remove(i);
            }
        }
    }
    public void printBooks(){
        System.out.println("----------------");
        System.out.println("Libros:");
        for(int i=0;i < catalogo.size();i++){
            Book libro = catalogo.get(i);
            System.out.println("["+(i+1)+"] Title: "+libro.getTitle()+" | Author: "+libro.getAuthor());
        }
        System.out.println("----------------");
    }
}
