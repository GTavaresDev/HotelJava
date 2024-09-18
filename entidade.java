// A propria função na clase ta fazendo os testes 
public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
		if (!checkOut.after(checkIn)) {
			throw new DomainException("Check-out date must be after check-in date");
		}
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}



public void updateDates(Date checkin, Date checkout){
    Date now = new Date; //Instanciando uma data de agora para comparação 
    if(checkin.before(now) || checkout.before(now )){
        // Se cair nese if vai tratar isso aqui como uma exeção 
        throw new DomainException("Reservation dates for update must be future dates"); 
    }
    if(checkout.after(checkin)){
        throw new DomainException("Check-out date must be after check-in date");
    }

    this.checkIn = checkIn;
	this.checkOut = checkOut;

}