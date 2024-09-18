package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
	private Integer roomNumber;
	private Date checkin;
	private Date checkout;
	
	//Esse metodo esta static por que todas as datas devem ser iniciadas nesse padrão 
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Reservation(Integer roomNumber, Date checkin, Date checkout) {
		this.roomNumber = roomNumber;
		this.checkin = checkin;
		this.checkout = checkout;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}
		
	//Vou tirar o set desses metodos pois apenas minha função pode fazer alterações nessas datas	
	public Date getCheckin() {
		return checkin;
	}

	public Date getCheckout() {
		return checkout;
	}
	
	
	public long duration() {
		//Primeiro calculo a diferença em milisegundos 
		long dif  = checkout.getTime() - checkin.getTime();
		//Tipo enumerado que vai converter para dias o valor do dif que esta em  mile segundos 
		return TimeUnit.DAYS.convert(dif, TimeUnit.MILLISECONDS);	
	}
	
	public void updateDates(Date checkin, Date checkout) {
		this.checkin = checkin;
		this.checkout = checkout;
		
	}
	
	@Override 
	public String toString() {
		return "Reservation :"
				+"Room: " 
				+ roomNumber 
				+ ","
				+ "check-in: "
				+ sdf.format(checkin)
				+ ",  "
				+"check-out: "
				+ sdf.format(checkin)
				+ "  "
				+ duration()
				+ " nights";
	
	}

	
	
}
