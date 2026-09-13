import java.util.ArrayList;
import java.util.Objects;

public class Flight {



    private String flightNumber;
   private String origin;
   private String destination;
   private int capacity;
   private float price;

    @Override
    public String toString() {
        return String.format("%s | %s -> %s | Rs.%.1f | %d seats",
                this.flightNumber,
                this.origin,
                this.destination,
                this.price,
                this.capacity
        );
    }

    public Flight(){

    }

    public Flight(String flightNumber, String origin, String destination, int capacity, float price) {
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.capacity = capacity;
        this.price = price;
    }

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
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        // 🔑 This tells HashSet to only compare the flight numbers!
        return Objects.equals(flightNumber, flight.flightNumber);
    }

    @Override
    public int hashCode() {
        // 🔑 This ensures flights with the same flight number go to the same bucket!
        return Objects.hash(flightNumber);
    }
}
