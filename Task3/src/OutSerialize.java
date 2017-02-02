import com.epam.catalog.bean.Book;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Uladzislau_Palupan on 1/30/2017.
 */
public class OutSerialize {
 
	public static void outsaerialise(String args[]) throws IOException {
		 List<Book> books=new ArrayList<>();
		Book rc1 = new Book("New book", "Today sale the next book",200,13.4);
		Book rc2 = new Book( "New film", "Today sale the next serie",300,17.6);

		books.add(rc1);
		books.add(rc2);

		// создание цепи потоков с потоком
		// вывода объекта в конце
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("objects.dat"));
		Date now = new Date(System.currentTimeMillis());
		
		// java.util.* был импортирован для
		// использования класса Date
		for(Book oneBook:books){
			out.writeObject(oneBook);
		}

		out.flush();
		out.close();
		System.out.println("I have written:");
		System.out.println("A Date object: " + now);
		System.out.println("Two com.epam.catalog.bean.Book objects");
		System.out.println(rc1);
		System.out.println(rc2);

	}

}
