public class Flight {

   private String flightNumber;
   private String origin;
   private String destination;
   private int capacity;
   private float price;

   public String getFlightNumber() {
        return flightNumber;
    }

   public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

   public String getOrigin() {
        return origin;
    }

   public void setOrigin(String origin) {
        this.origin = origin;
    }

   public String getDestination() {
        return destination;
    }

   public void setDestination(String destination) {
        this.destination = destination;
    }

   public int getCapacity() {
        return capacity;
    }

   public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

   public float getPrice() {
        return price;
    }

   public void setPrice(float price) {
        this.price = price;
    }
}
