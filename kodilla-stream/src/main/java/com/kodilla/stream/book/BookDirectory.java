package com.kodilla.stream.book;
import java.util.ArrayList;
import java.util.List;

public final class BookDirectory {
    private final List<Book> theBookList = new ArrayList<>();

    public BookDirectory() {
        theBookList.add(new Book("Dylan Murphy", "Wolf" , 2015, "0000"));
        theBookList.add(new Book("Phoebe Pearson", "Slaves of dream" , 2012,"0001"));
        theBookList.add(new Book("Morgan Walsh", "Obliteration of " , 1998, "0002"));
        theBookList.add(new Book("Aimee Murphy", "Rejecting the ni " , 2015, "0003"));
        theBookList.add(new Book("Ryan Talley", "Gangsters and kin " , 2009, "0004"));
        theBookList.add(new Book("Madelynn Carson", "Unity without " , 2012, "0005"));
        theBookList.add(new Book("Giancarlo Guerrero", "Enemies of " , 2004, "0006"));
    }
    public List<Book> getList() {
        return new ArrayList<>(theBookList);
    }
}
