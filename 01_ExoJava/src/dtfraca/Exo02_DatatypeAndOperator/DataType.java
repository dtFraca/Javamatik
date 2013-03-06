package dtfraca.Exo02_DatatypeAndOperator;

import com.sun.org.apache.bcel.internal.classfile.SourceFile;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Class Description: ?
 * <p/>
 * 2013-02-27 - david
 */
public class DataType {
	public static void main(String[] args) {

		boolean leshommesont5doigts = true;
		System.out.printf("Les hommes ont 5 doigts = %s\n", leshommesont5doigts);
		boolean leshommesont6doigts = false;
		System.out.printf("Les hommes ont 6 doigts = %s\n", leshommesont6doigts);

		char exemple = 'D';
		char exemple2 = 'T';
		System.out.println("________________________________________________________________________________________________________________________________________");
		byte exempleByte = 12;
		System.out.printf("Exemple byte = %d", exempleByte);
		System.out.printf("Max byte = %d\n", Byte.MAX_VALUE);
		System.out.printf("Min byte = %d\n", Byte.MIN_VALUE);
		System.out.println("________________________________________________________________________________________________________________________________________");
		short exempleShort = 20000;
		System.out.printf("Exemple short = %d\n", exempleShort);
		System.out.printf("Max short = %d\n", Short.MAX_VALUE);
		System.out.printf("Min short = %d\n", Short.MIN_VALUE);
		System.out.println("________________________________________________________________________________________________________________________________________");
		int exempleInt = 600000000;
		System.out.printf("Exemple int = %d\n", exempleInt);
		System.out.printf("Max int = %d\n", Integer.MAX_VALUE);
		System.out.printf("Min int = %d\n", Integer.MIN_VALUE);
		System.out.println("________________________________________________________________________________________________________________________________________");
		long exempleLong = 1000000000;
		System.out.printf("Exemple long = %d\n", exempleLong);
		System.out.printf("Max long = %d\n", Long.MAX_VALUE);
		System.out.printf("Min long = %d\n", Long.MIN_VALUE);
		System.out.println("________________________________________________________________________________________________________________________________________");
		float exempleFloat = 1000000000;
		System.out.printf("Exemple float = %f\n", exempleFloat);
		System.out.printf("Max float = %f\n", Float.MAX_VALUE);
		System.out.printf("Min float = %f\n", Float.MIN_VALUE);
		System.out.println("________________________________________________________________________________________________________________________________________");
		double exempleDouble = 11000.1205645412;
		System.out.printf("Exemple double = %f\n", exempleDouble);
		System.out.printf("Max double = %f", Double.MAX_VALUE);
		System.out.printf("Min double = %f", Double.MIN_VALUE);
		System.out.println("________________________________________________________________________________________________________________________________________");
		String exempleString = "Ceci est une phrase à un million de dollars";
		System.out.printf("Exemple String = %s\n", exempleString);
		System.out.printf("Exemple Length = %s\n", exempleString.length());
		System.out.printf("Exemple Substring = %s\n", exempleString.substring(5, 12));
		System.out.printf("Exemple toUpperCase = %s\n", exempleString.toUpperCase());
		System.out.println("________________________________________________________________________________________________________________________________________");

		Date exempleDate = new Date();
		SimpleDateFormat myDatef1 = new SimpleDateFormat("yyy-MM-dd - HH:mm:ss");
		SimpleDateFormat myDatef2 = new SimpleDateFormat("E d MMM yyyy");
		SimpleDateFormat myDatef3 = new SimpleDateFormat("EEEE d MMMM yyyy");
		SimpleDateFormat myDatef4 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat myDatef5 = new SimpleDateFormat("HH:mm:ss.SSS");

		System.out.printf("Date (%s)\t= %s\n", myDatef1.toPattern(), myDatef1.format(exempleDate));
		System.out.printf("Date (%s)\t\t= %s\n", myDatef2.toPattern(), myDatef2.format(exempleDate));
		System.out.printf("Date (%s)\t= %s\n", myDatef3.toPattern(), myDatef3.format(exempleDate));
		System.out.printf("Date (%s)\t\t= %s\n", myDatef4.toPattern(), myDatef4.format(exempleDate));
		System.out.printf("Date (%s)\t\t= %s\n", myDatef5.toPattern(), myDatef5.format(exempleDate));


	}
}
