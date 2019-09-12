package Book;
import java.util.LinkedList;
import java.util.List;

public class Biblioteka {
    private List<Book> theList = new LinkedList<>();


    public List<Book>getList(){

        // stworzenie listy i pomiar czasu potrzebnego do tej operacji.
        long begin1 = System.currentTimeMillis();
        for(int i = 0; i<300000; i++){
            theList.add(new Book());
        }
        long end1 = System.currentTimeMillis();
        System.out.println("Creating LinkedList with 300000 elements type Book has taken: " + (end1 - begin1) + " milisekund");

        // wyszukanie i usuniecie pierwszego elementu listy oraz pomiar czasu potrzebnego do tej operacji.
        long begin2 = System.nanoTime();
        theList.remove(0);
        long end2 = System.nanoTime();
        System.out.println("Removing first element from list has taken " + (end2 - begin2) + " nanosekund");

        // wstawienie elementu na poczatku oraz na koncu listy oraz pomiar czasu potrzebnego na te dwie operacje.
        long begin3 = System.nanoTime();
        theList.add(0, new Book());
        long end3 = System.nanoTime();
        System.out.println("Adding element to begining of list has taken " + (end3 - begin3) + " nanosekund");

        long begin4 = System.nanoTime();
        theList.add((theList.size()-1), new Book());
        long end4 = System.nanoTime();
        System.out.println("Adding element to the end of list has taken " + (end4 - begin4) + " nanosekund");

        return new LinkedList<Book>(theList);
    }
}
