import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class Demo1 {
public static void main(String[] args) {
	DateFormat df=DateFormat.getDateInstance(DateFormat.FULL,new Locale("hi","IN"));
	Date d=new Date();
	System.out.println(df.format(d));
	
	//NumberFormat nf=NumberFormat.getCurrencyInstance(Locale.GERMANY);
	NumberFormat nf=NumberFormat.getCurrencyInstance(new Locale("hi", "IN"));
	System.out.println(nf.format(120030));
}
}
