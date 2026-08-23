import java.util.ArrayList;
import java.util.Scanner;

public class FlightService {

    public static void main(String[] args) {
      System.out.println("=================================");
      System.out.println("      SKYFLOW AIRLINES");
      System.out.println("=================================");
      System.out.println("1.)Add flight");
      System.out.println("2.)View flight");
      System.out.println("3.)Search flight");
      System.out.println("4.)Exit");
      Scanner scanner=new Scanner(System.in);
      ArrayList<Flight> flights=new ArrayList<>();
      System.out.println();
      boolean takeInput=true;
      while(takeInput){
          System.out.print("Enter input:");
          int option=scanner.nextInt();
          switch(option) {
              case 1:
                  Flight flight=new Flight();
                  System.out.print("Enter flight number:");
                  String flightNumber = scanner.next();
                  scanner.nextLine();
                  flight.setFlightNumber(flightNumber);

                  System.out.print("Enter origin:");
                  String origin = scanner.nextLine();
                  flight.setOrigin(origin);

                  System.out.print("Enter destination:");
                  String destination = scanner.nextLine();
                  flight.setDestination(destination);

                  System.out.print("Enter capacity:");
                  int capacity = scanner.nextInt();
                  scanner.nextLine();
                  flight.setCapacity(capacity);

                  System.out.print("Enter price:");
                  int price = scanner.nextInt();
                  scanner.nextLine();
                  flight.setPrice(price);
                  flights.add(flight);
                  break;
              case 2:
                  for(int i=0;i<flights.size();i++){
                      System.out.println(flights.get(i).flightNumber+"|"+flights.get(i).origin+"->"+flights.get(i).destination+"|Rs."+flights.get(i).price+"|"+flights.get(i).capacity);
                  }
                  break;
              case 3:
                  System.out.print("Enter origin:");
                  String originToSearch=scanner.next();
                  scanner.nextLine();
                  System.out.print("Enter destination:");
                  String destinationToSearch=scanner.next();
                  System.out.println();
                  int count=0;
                  for(int i=0;i<flights.size();i++){
                      if(flights.get(i).origin.equals(originToSearch) && flights.get(i).destination.equals(destinationToSearch)){
                          System.out.println(flights.get(i).flightNumber+"|"+flights.get(i).origin+"->"+flights.get(i).destination+"|Rs."+flights.get(i).price+"|"+flights.get(i).capacity);
                          count++;
                      }
                  }
                  System.out.println(count+" flights found");
                  break;

              case 4:
                  System.out.println("Service end");
                  takeInput=false;
                  break;
              default:
                  System.out.println("Wrong option input");
                  takeInput=false;
                  break;
          }


      }
      }

      }

