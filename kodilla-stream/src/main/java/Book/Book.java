package Book;

import java.util.Objects;
import java.util.Random;

public class Book {
    private String author = Book.randomAuthor();
    private String title = Book.randomTitle();


    public static String randomTitle(){
        String[] tablicaTytulow = {"Wladca Pierscieni","Hobbit","Harry Potter","Potop"};
        Random r=new Random();
        int randomNumber=r.nextInt(tablicaTytulow.length);
        return
                tablicaTytulow[randomNumber];
    }


    public static String randomAuthor(){
        String[] tablicaAutorow = {"Tolkien","Sienkiewicz","Rowling","Tolkien"};
        Random r=new Random();
        int randomNumber=r.nextInt(tablicaAutorow.length);
        return
                tablicaAutorow[randomNumber];
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return author.equals(book.author) &&
                title.equals(book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, title);
    }

    @Override
    public String toString(){
        return "autorem ksiazki pod tytulem - " + title + " jest - " + author;
    }
}
