package smallStuff;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;

public class DateFormatters {
    public static void main(String[] args) {
        Timestamp t=new Timestamp(System.currentTimeMillis());
        System.out.println("before= "+t);
//        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
//        myFormatObj.
        SimpleDateFormat format12=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        format12.format(t);
        System.out.println(format12.format(t));
    }
}
