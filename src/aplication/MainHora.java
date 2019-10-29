package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainHora {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Date x1 = new Date();
		
		SimpleDateFormat hora1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat hora2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Date y1 = hora1.parse("21/10/2019");
		Date y2 = hora2.parse("21/10/2019 15:42:07");
		
		System.out.println("x1: " + hora2.format(x1));

		System.out.println("y1: " +hora2.format(y1));
		System.out.println("y2: " + hora2.format(y2));
	}

}
