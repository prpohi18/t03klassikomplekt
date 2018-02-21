package homework.pkg3;
public class Rides {
    protected String rideID;
    protected Enum type;
    protected String from;
    protected String to;
    protected String date;

    public String getRideID() {
        return rideID;
    }
    
    public Enum getType(){
        return type;
    }

    public void setRideID(String rideID) {
        this.rideID = rideID;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Rides(String rideID, Enum type, String from, String to, String date) {
        this.rideID = rideID;
        this.type = type;
        this.from = from;
        this.to = to;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Rides{" + "rideID=" + rideID + ", type=" + type + ", from=" + from + ", to=" + to + ", date=" + date + '}';
    }
    
    public String doesTicketMatch(Tickets ticket){
        if(ticket.getRideID().equals(this.rideID) && ticket.getType() == this.type){
            return "Pilet on õige";
        }
        return "Pilet ei sobi!";
    }
    
}
