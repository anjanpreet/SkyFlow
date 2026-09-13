import java.util.ArrayList;
import java.util.Scanner;

public class SkyFlowApplication {
    public static void main(String[] args) {
        System.out.println("=================================");
        System.out.println("      SKYFLOW AIRLINES");
        System.out.println("=================================");
        System.out.println("1.)Add flight");
        System.out.println("2.)View flight");
        System.out.println("3.)Search flight");
        System.out.println("4.)Exit");
        System.out.println("5.)Delete flight");
        System.out.println("6.) Sort flights by price");
        System.out.println("7.) Sort flights by capacity");
        Scanner scanner=new Scanner(System.in);
        FlightService flightService=new FlightService();
        System.out.println();
        boolean takeInput=true;
        while(takeInput){
            System.out.print("Enter input:");
            int option=scanner.nextInt();
            switch(option) {
                case 1:
                    System.out.print("Enter flight number:");
                    String flightNumber = scanner.next();
                    scanner.nextLine();

                    System.out.print("Enter origin:");
                    String origin = scanner.nextLine();

                    System.out.print("Enter destination:");
                    String destination = scanner.nextLine();

                    System.out.print("Enter capacity:");
                    int capacity = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter price:");
                    float price = scanner.nextFloat();
                    scanner.nextLine();
                    flightService.addFlight(flightNumber,origin,destination,capacity,price);
                    break;
                case 2:
                    flightService.viewFlight();
                    break;
                case 3:
                    scanner.nextLine();
                    System.out.print("Enter origin:");
                    String originToSearch=scanner.nextLine();
                    System.out.print("Enter destination:");
                    String destinationToSearch=scanner.nextLine();
                    System.out.println();
                    flightService.searchFlight(originToSearch,destinationToSearch);
                    break;

                case 4:
                    System.out.println("Service end");
                    takeInput=false;
                    break;
                case 5:
                    System.out.print("Enter flight number to delete:");
                    String flightNumberToDelete=scanner.next();
                    System.out.println();
                    if(flightService.deleteFlight(flightNumberToDelete)) {
                        System.out.print("Flight number: " + flightNumberToDelete + "deleted");
                    }else{
                        System.out.print("Flight number: " + flightNumberToDelete + "not found");
                    }
                    break;
                case 6:
                    flightService.sortFlightsByPrice();
                    flightService.viewFlight();
                    break;
                case 7:
                    flightService.sortFlightsByCapacity();
                    flightService.viewFlight();
                    break;
                default:
                    System.out.println("Wrong option input");
                    takeInput=false;
                    break;
            }


        }
    }

    }
