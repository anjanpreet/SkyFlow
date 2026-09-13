import java.util.*;

public class FlightService {

    List<Flight> flights;
    Set<Flight> flightSet;

    public FlightService(){
        flights=new ArrayList<>();
        flightSet=new HashSet<>();
    }

    public void addFlight(String flightNumber,String origin,String destination,int capacity,float price){
        Flight flight=new Flight(flightNumber,origin,destination,capacity,price);
        if (flightSet.add(flight)) {
            flights.add(flight);
        }else{
            System.out.println("Flight number already exists!");
        }
    }

    public void viewFlight(){
        for(int i=0;i<flights.size();i++){
            System.out.println(flights.get(i));//java automatically calls toString here
        }
    }

    public void searchFlight(String originToSearch,String destinationToSearch){
        int count=0;
        for(int i=0;i<flights.size();i++){
            if(flights.get(i).getOrigin().toLowerCase().contains(originToSearch.toLowerCase()) && flights.get(i).getDestination().toLowerCase().contains(destinationToSearch.toLowerCase())){
                System.out.println(flights.get(i).getFlightNumber()+"|"+flights.get(i).getOrigin()+"->"+flights.get(i).getDestination()+"|Rs."+flights.get(i).getPrice()+"|"+flights.get(i).getCapacity());
                count++;
            }
        }
        System.out.println(count+" flights found");
    }

    public boolean deleteFlight(String flightNumber){
        for(Flight flight: flights){
            if(flight.getFlightNumber().equalsIgnoreCase(flightNumber)){
                flights.remove(flight);
                flightSet.remove(flight);
                return true;
            }
        }
        return false;

    }

    public List<Flight> sortFlightsByPrice(){
        flights.sort(Comparator.comparingDouble(Flight::getPrice));
        return flights;
    }

    public List<Flight> sortFlightsByCapacity(){
        flights.sort(Comparator.comparingDouble(Flight::getCapacity));
        return flights;
    }


}

