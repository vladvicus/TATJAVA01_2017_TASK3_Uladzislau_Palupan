package com.epam.catalog.dao.impl;

import com.epam.catalog.bean.Book;
import com.epam.catalog.dao.BookDao;
import com.epam.catalog.dao.exception.DaoException;

import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by Uladzislau_Palupan on 1/30/2017.
 */
public class BookDaoImpl implements BookDao {
    private List<Book> books = new ArrayList<>();
    String datafile = Paths.get("Task3/data/units.txt").toAbsolutePath().toString();

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public void addBook(String book) throws DaoException {
        System.out.println("Write to file"+book);
        writeToFile(book);

    }

    private void writeToFile(String book) {


        FileWriter wr = null;
        try {
            wr = new FileWriter(datafile,true);
            wr.append("\n"+book);
            wr.flush();
            wr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }




    }

    @Override
    public Book findOneBook(Book name) throws DaoException {

        return null;
    }

    @Override
    public List<Book> findBooksByPrice(Book price) throws DaoException {
        return null;
    }

    @Override
    public List<Book> findBooksByAuthor(String author) throws DaoException {
        System.out.println("AUTHOR-->" + author);
        List<Book> booksFoundByAuthorName = new ArrayList<>();
        System.out.println("method findBooks in BookDaoImpl ");
        try {
            readFile(datafile);

        } catch (IOException e) {
            e.printStackTrace();
            // throw new DaoException(e);
        }
        for (Book oneBook : books) {
            if (oneBook.getAuthor().equalsIgnoreCase(author) || (oneBook.getAuthor().contains(author))) {
                booksFoundByAuthorName.add(oneBook);
            } else {
                System.out.println(oneBook.getAuthor() + "  not coincide with  " + author);
            }
        }
        System.out.println("The list of books with author:" + author);
        //showCollection(booksFoundByAuthorName);

        return booksFoundByAuthorName;
    }

    private void showCollection(List<Book> bookList) {
        for (Book oneBook : bookList) {
            System.out.println(oneBook);
        }
    }


    private List<Book> readFile(String fname) throws IOException {


        FileInputStream fis = new FileInputStream(fname);
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));
        String line;
        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            for (int i = 0; i < data.length; i++) {
                data[i] = data[i].trim();


            }
            if (data[0].startsWith("b")) {
                System.out.println("Your prefix " + data[0]);
                String name = data[1];
                String author = data[2];
                Integer page = Integer.parseInt(data[3]);
                Double price = Double.parseDouble(data[4]);
                books.add(new Book(name, author, page, price));

            } else continue;


        }
        br.close();

        System.out.println("Books are suscessfully loaded from file!");
        return books;
    }
}
