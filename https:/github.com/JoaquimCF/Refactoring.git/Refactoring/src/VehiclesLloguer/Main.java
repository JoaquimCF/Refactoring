package VehiclesLloguer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
	
	public static void  main(String[] args) throws ParseException {
		
		//Vehicle vehicleBasic = new Vehicle("Tata", "Vista", Vehicle.BASIC);
		SimpleDateFormat dateFormat = new SimpleDateFormat("d/M/yyyy");
			
		Vehicle vehicle1 = new Vehicle("Tata", "Vista", Vehicle.BASIC);
		Date date = dateFormat.parse("2/8/2013");
		Lloguer lloguer1 = new Lloguer(date, 2, vehicle1);
		
		Vehicle vehicle2 = new Vehicle("Citroen", "Saxo", Vehicle.GENERAL);
		date = dateFormat.parse("12/6/2015");
		Lloguer lloguer2 = new Lloguer(date, 4, vehicle2);
			
		Vehicle vehicle3 = new Vehicle("Tesla", "Roadster", Vehicle.LUXE);
		date = dateFormat.parse("22/3/2018");
		Lloguer lloguer3 = new Lloguer(date, 5, vehicle3);
			
		Client micliente = new Client("258147369F","Joaquim","159753264");
			micliente.afegeix(lloguer1);
			micliente.afegeix(lloguer2);
			micliente.afegeix(lloguer3);
			
		
		//System.out.print(micliente.informe());
		System.out.print(GestorLloguerLite(micliente));
	}
		
	public static String GestorLloguerLite (Client client) {
		return client.informe();
	}
	
	
		
	
		
	}

