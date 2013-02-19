import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Review of Java primitive datatypes and some common types
 *
 * 2013-02-18 - tri
 */
public class A1_DataType {

    public static void main(String[] args) {

        //--------------------------------------------
        // Java's Primitive Data Types
        // http://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
        //--------------------------------------------

        boolean isMatchGagne = true;
        System.out.printf("boolean isMatchGagne = %s\n", isMatchGagne);

        boolean isMatchPerdu = false;
        System.out.printf("boolean isMatchPerdu = %s\n", isMatchPerdu);

        char exempleChar1 = 'D'; //NOTE single quote '
        char exempleChar2 = 'T';
        System.out.println();
        System.out.printf("char exempleChar1 = %s\n", exempleChar1);
        System.out.printf("char exempleChar2 = %s\n", exempleChar2);

        byte exempleByte = 34;
        System.out.println();
        System.out.printf("byte exempleByte = %d\n", exempleByte);
        System.out.printf("Byte.MIN_VALUE   = %d\n", Byte.MIN_VALUE);
        System.out.printf("Byte.MAX_VALUE   = %d\n", Byte.MAX_VALUE);

        short exempleShort = 4789;
        System.out.println();
        System.out.printf("short exempleShort = %d\n", exempleShort);
        System.out.printf("Short.MIN_VALUE    = %d\n", Short.MIN_VALUE);
        System.out.printf("Short.MAX_VALUE    = %d\n", Short.MAX_VALUE);

        int exempleInt = 6547812;
        System.out.println();
        System.out.printf("int exempleInt    = %d\n", exempleInt);
        System.out.printf("Integer.MIN_VALUE = %d\n", Integer.MIN_VALUE);
        System.out.printf("Integer.MAX_VALUE = %d\n", Integer.MAX_VALUE);

        long exempleLong = 8127452369988L; //NOTE: suffix L for Long
        System.out.println();
        System.out.printf("long exempleLong = %d\n", exempleLong);
        System.out.printf("Long.MIN_VALUE   = %d\n", Long.MIN_VALUE);
        System.out.printf("Long.MAX_VALUE   = %d\n", Long.MAX_VALUE);

        float exempleFloat = 567890.1234F; //NOTE: suffix F
        System.out.println();
        System.out.printf("float exempleFloat = %f\n", exempleFloat);
        System.out.printf("Float.MIN_VALUE    = %f (+/- 1.40129 E-45)\n", Float.MIN_VALUE);
        System.out.printf("Float.MAX_VALUE    = %f (+/- 3.40282 E38)\n", Float.MAX_VALUE);

        double exempleDouble = 567890.1234D; //NOTE: suffix D
        System.out.println();
        System.out.printf("double exempleDouble = %f\n", exempleDouble);
        System.out.printf("Double.MIN_VALUE     = %f (+/- 4.94065 E-324)\n", Double.MIN_VALUE);
        System.out.printf("Double.MAX_VALUE     = %f (+/- 1.79769 E308)\n", Double.MAX_VALUE);


        //--------------------------------------------
        // Common Data Types
        //--------------------------------------------
        String exempleString = "Électricité : la facture pourrait bondir de 30% d'ici à 2017";
        System.out.println();
        System.out.printf("String exempleString          = %s\n", exempleString);
        System.out.printf("exempleString.length()        = %d\n", exempleString.length());
        System.out.printf("exempleString.substring(3,11) = %s\n", exempleString.substring(3, 11));
        System.out.printf("exempleString.toUpperCase()   = %s\n", exempleString.toUpperCase());

        // Date: Customizing Formats
        // http://docs.oracle.com/javase/tutorial/i18n/format/simpleDateFormat.html
        Date exempleDate = new Date();
        SimpleDateFormat myDateFormat1 = new SimpleDateFormat("yyyy-MM-dd - HH:mm:ss");
        SimpleDateFormat myDateFormat2 = new SimpleDateFormat("E d MMM yyyy");
        SimpleDateFormat myDateFormat3 = new SimpleDateFormat("EEEE d MMMM yyyy");
        SimpleDateFormat myDateFormat4 = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat myDateFormat5 = new SimpleDateFormat("HH:mm:ss.SSS");

        System.out.println();
        System.out.printf("Date (%s)\t= %s\n", myDateFormat1.toPattern(), myDateFormat1.format(exempleDate));
        System.out.printf("Date (%s)\t\t= %s\n", myDateFormat2.toPattern(), myDateFormat2.format(exempleDate));
        System.out.printf("Date (%s)\t= %s\n", myDateFormat3.toPattern(), myDateFormat3.format(exempleDate));
        System.out.printf("Date (%s)\t\t= %s\n", myDateFormat4.toPattern(), myDateFormat4.format(exempleDate));
        System.out.printf("Date (%s)\t\t= %s\n", myDateFormat5.toPattern(), myDateFormat5.format(exempleDate));


    }

}
