package ticketBooking;

public class SingleTicketBooking {
	private int ticketNo;
	private String customerName;
	private String ticketPrice;
	private String ticketType;
	private String ticketTime;
	public String getTicketType() {
		return ticketType;
	}
	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}
	public int getTicketNo() {
		return ticketNo;
	}
	public void setTicketNo(int ticketNo) {
		this.ticketNo = ticketNo;
	}
	@Override
	public String toString() {
		return "SingleTicketBooking :- ticketNo=" + ticketNo  + ",\n customerName=" + customerName + ", ticketPrice="
				+ ticketPrice + ", ticketType=" + ticketType + ", movieTime= " + ticketTime ;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(String ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	public String getTicketTime() {
		return ticketTime;
	}
	public void setTicketTime(String ticketTime) {
		this.ticketTime = ticketTime;
	}
	

}
