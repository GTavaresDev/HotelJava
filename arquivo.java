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

        try{
            System.out.print("Room number: ");
            int roomNumber = dados.nextInt();
            System.out.print("Check-in date: (dd/mm/yyyy):");
            Date checkin = sdf.parse(dados.next());
            System.out.print("Check-out date: (dd/mm/yyyy):");
            Date checkout = sdf.parse(dados.next());

            Reservation reservation = new Reservation(roomNuber, checkin, checkout);
            System.out.println(reservation);

            System.out.println();
            System.out.println("Enter data to update the reervation: ");
            System.out.println("Check-in date (dd/MM/yyyy): ");
            checkin = sdf.parse(dados.next());
            System.out.println("Check-out date (dd/MM/yyyy): ");
            checkout = sdf.parse(dados.next());

            reservation.updateDates(checkin,checkout);
            System.out.println(reervation);
     
        } catch (ParseException e ){
            System.out.println("Invalid date format");

        } catch (DomainExeception e ){
            System.out.println("Error in reservation: " + e.getMessage());

        } catch (RuntimeExeception e){
            System.out.println("Unexpected Error");
        }
		
		
		
		dados.close();
	}
}