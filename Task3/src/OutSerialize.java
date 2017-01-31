import com.epam.catalog.bean.Category;
import com.epam.catalog.bean.News;

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
 
	public static void main(String args[]) throws IOException {
		 List<News> news=new ArrayList<>();
		News rc1 = new News(1, Category.BOOK, "New book", "Today sale the next book of hary Potter is conducted");
		News rc2 = new News(2, Category.DISK, "New disk", "Today sale the next series of Sherlock is cogfhjghj");
		News rc3=new News(3,Category.DISK,"New Disk,","tfVVCGHHGvvbvcXvdvdsfsdfsfsdfsdfsd"); 
		news.add(rc1);
		news.add(rc2);
		news.add(rc3);
		
		// создание цепи потоков с потоком
		// вывода объекта в конце
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("objects.dat"));
		Date now = new Date(System.currentTimeMillis());
		
		// java.util.* был импортирован для
		// использования класса Date
		for(News oneNews:news){
			out.writeObject(oneNews);
		}
	//	out.writeObject(now);
	//	out.writeObject(rc1);
	//	out.writeObject(rc2);
	//	out.writeObject(rc3);
		out.flush();
		out.close();
		System.out.println("I have written:");
		System.out.println("A Date object: " + now);
		System.out.println("Two com.epam.catalog.bean.News objects");
		System.out.println(rc1);
		System.out.println(rc2);
		System.out.println(rc3);
	}

}
