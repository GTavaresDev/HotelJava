package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Reservation;
	
public class Program {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner dados = new Scanner(System.in);
		//Metodo de conversão de datas 
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Room number: ");
		int roomNumber = dados.nextInt();
		System.out.print("Check-in date: (dd/mm/yyyy):");
		Date checkin = sdf.parse(dados.next());
		System.out.print("Check-out date: (dd/mm/yyyy):");
		Date checkout = sdf.parse(dados.next());
		
		//Testar se a data de checkout é posterior ao checkin
		if(!checkout.after(checkin)) {
			System.out.println("Error in reservation: Check-out date must be after check-in date");
		} else {
			Reservation reservation = new Reservation(roomNumber, checkin, checkout);
			System.out.println(reservation);
		
		dados.close();
	}
}
