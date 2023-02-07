package com.example.mylibrary;

import java.util.ArrayList;

public class Utils {

    private static Utils instance;

    private static ArrayList<Book> allBooks;
    private static ArrayList<Book> alreadyReadBooks;
    private static ArrayList<Book> wantToReadBooks;
    private static ArrayList<Book> currentlyReadingBooks;
    private static ArrayList<Book> favouriteBooks;

    private Utils() {
        if (null == allBooks) {
            allBooks = new ArrayList<>();
            initData();
        }

        if (null == alreadyReadBooks) {
            alreadyReadBooks = new ArrayList<>();
        }

        if (null == wantToReadBooks) {
            wantToReadBooks = new ArrayList<>();
        }

        if (null == currentlyReadingBooks) {
            currentlyReadingBooks = new ArrayList<>();
        }

        if (null == favouriteBooks) {
            favouriteBooks = new ArrayList<>();
        }
    }

    private void initData() {
        //TODO: add initial data
        allBooks.add(new Book(1, "Book of Five Rings", "Miyamoto Musashi", 288, "https://kbimages1-a.akamaihd.net/58eefb8d-dccd-4421-b359-d9384dac86b6/1200/1200/False/the-book-of-five-rings-49.jpg",
                "A life dedicated to focus", "Long Description"));

        allBooks.add(new Book(2, "Can't Hurt Me", "David Goggins", 366, "https://m.media-amazon.com/images/I/81gTRv2HXrL.jpg",
                "Man molds himself into one of the hardest motherfuckers on the planet", "Long Description"));

    }


    public static Utils getInstance() {
        if (null != instance) {
            return instance;
        } else {
            instance = new Utils();
            return instance;
        }
    }

    public static ArrayList<Book> getAllBooks() {
        return allBooks;
    }

    public static ArrayList<Book> getAlreadyReadBooks() {
        return alreadyReadBooks;
    }

    public static ArrayList<Book> getWantToReadBooks() {
        return wantToReadBooks;
    }

    public static ArrayList<Book> getCurrentlyReadingBooks() {
        return currentlyReadingBooks;
    }

    public static ArrayList<Book> getFavouriteBooks() {
        return favouriteBooks;
    }

    public Book getBookById(int id) {
        for (Book b: allBooks) {
            if (b.getId() == id) {
                return b;
            }
        }

        return null;
    }

    public boolean addToAlreadyRead(Book book) {
        return alreadyReadBooks.add(book);
    }

    public boolean addToWantToRead(Book book) {
        return wantToReadBooks.add(book);
    }

    public boolean addToCurrentlyReading(Book book) {
        return currentlyReadingBooks.add(book);
    }

    public boolean addToFavorites(Book book) {
        return favouriteBooks.add(book);
    }

    public boolean removeFromAlreadyRead(Book book) {
        return alreadyReadBooks.remove(book);
    }

    public boolean removeFromWantToRead(Book book) {
        return wantToReadBooks.remove(book);
    }

    public boolean removeFromCurrentlyReading(Book book) {
        return currentlyReadingBooks.remove(book);
    }

    public boolean removeFromFavorites(Book book) {
        return favouriteBooks.remove(book);
    }

}
