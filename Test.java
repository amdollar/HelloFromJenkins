import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class Test {

	public static void main(String[] args) {
		int salary = 1300000;
		Locale locale = new Locale("pa", "IN");
		NumberFormat format = NumberFormat.getCurrencyInstance(locale);
		DateFormat dateFormat = DateFormat.getDateInstance(0, locale);
		System.out.println(format.format(salary));
		for (int i = 0; i <= 10; i++)
			System.out.println(dateFormat.format(new Date()));

	}

}
