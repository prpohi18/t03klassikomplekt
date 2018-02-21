package homework.pkg3;

public class Tickets {
    protected int price;
    protected Enum type;
    protected int ticketID;
    protected String rideID;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Enum getType() {
        return type;
    }

    public void setType(Enum type) {
        this.type = type;
    }

    public int getTicketID() {
        return ticketID;
    }

    public void setTicketID(int ticketID) {
        this.ticketID = ticketID;
    }
    
    public String getRideID() {
        return rideID;
    }

    public void setRideID(String rideID) {
        this.rideID = rideID;
    }
    public Tickets(int price, Enum type, int ticketID, String rideID) {
        this.price = price;
        this.type = type;
        this.ticketID = ticketID;
        this.rideID = rideID;
    }

    @Override
    public String toString() {
        return "Tickets{" + "price=" + price + ", type=" + type + ", ticketID=" + ticketID + ", rideID=" + rideID + '}';
    }
    
    
}
