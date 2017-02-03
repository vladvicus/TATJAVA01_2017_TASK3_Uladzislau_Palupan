package com.epam.catalog.dao.impl;

import com.epam.catalog.bean.Book;
import com.epam.catalog.dao.BookDao;
import com.epam.catalog.dao.exception.DaoException;

import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;




public class BookDaoImpl implements BookDao {
  //  private List<Book> books = new ArrayList<>();
    private Set<Book> books=new HashSet<>();
    String datafile = Paths.get("Task3/data/units.txt").toAbsolutePath().toString();
/*
    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }*/

    @Override
    public void addBook(String book) throws DaoException {
        System.out.println("Write to file  "+book);
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

  


    private Set<Book> readFile(String fname) throws IOException {


        FileInputStream fis = new FileInputStream(fname);
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));
        String line;
        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            for (int i = 0; i < data.length; i++) {
                data[i] = data[i].trim();


            }
            if (data[0].startsWith("b")) {
               // System.out.println("Your prefix " + data[0]);
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

	@Override
	public List<Book> findBooksLessThenPrice(Double price) throws DaoException {
		  System.out.println("Price-->" +price);
	        List<Book> booksFoundByPrice = new ArrayList<>();
	        System.out.println("method findBooks in BookDaoImpl ");
	        try {
	            readFile(datafile);

	        } catch (IOException e) {
	            e.printStackTrace();
	           //  throw new DaoException("error in findBooksLessThenPrice method");
	        }
	        for (Book oneBook : books) {
	            if (oneBook.getPrice()<(price)) {
	                booksFoundByPrice.add(oneBook);
	            } else {
	                System.out.println(oneBook.getPrice()+ " >  " + price);
	            }
	        }
	        System.out.println("The list of books with author:" + price);
	      //  showCollection(booksFoundByPrice);

	        return booksFoundByPrice;
		
	}

	private void showCollection(List<Book> books) {
		for(Book oneBook:books){
			System.out.println(oneBook);
		}
		
	}
	
}
