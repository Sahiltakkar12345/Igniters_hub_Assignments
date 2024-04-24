package Event;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
    	 Planner planner = new Planner();
         // Create users
     //    User user1 = new User("user1", "password1");
     //    User user2 = new User("user2", "password2");

         // Add users to the planner
     //    planner.addUser(user1);
     //    planner.addUser(user2);
    	 int choice;
    	Scanner s=new Scanner(System.in);
    	System.out.println("welcome to the event planner program");
    	do {
    	System.out.println("1 Add Event");
    	System.out.println("2 find Event");
    	System.out.println("3 cancel Event");
  //  	System.out.println("4 display all Event for that user");
    	System.out.println("4 Exit");
    	System.out.println("Enter ur choice");
    	choice=s.nextInt();

    	switch(choice)
    	{
    		case 1:
    			System.out.println("Your choice is 1 \n Add Event");
    			System.out.println("Is this a appoiuntment or recurrent event");
    			System.out.println("Enter A or R");
    			String event=s.next();
    			if (event.equals("A"))
    			{
    				System.out.println("enter title");
    				String title=s.next();
    				System.out.println("enter description");
    				String description=s.next();
    				System.out.println("enter location");
    				String location=s.next();
    				System.out.println("enter date");
    				String date=s.next();
   Events appointment1 = new Appointment(title,description,location,date);	
   planner.addEvent(appointment1);		
    			}
    			else if (event.equals("R"))
    			{
    				System.out.println("enter title");
    				String title=s.next();
    				System.out.println("enter description");
    				String description=s.next();
    				System.out.println("enter frequency");
    				String frequency=s.next();
  Events recurrentEvent = new RecurrentEvent(title,description,frequency);
  planner.addEvent(recurrentEvent);
    			}
    			else
    			{
    				System.out.println("wrong event occur");
    			}
    			break;
    		case 2:
    			System.out.println("enter title to find event");
    			String title=s.next();
    			Events foundEvent = planner.findEventByTitle(title);
    	        if (foundEvent != null) {
    	            System.out.println("Found event: " + foundEvent.getTitle());
    	            foundEvent.displayDetails();
    	        } else {
    	            System.out.println("Event not found.");
    	        }
    			break;
    		case 3:
    			System.out.println("Enter title which event you want to cancel");		
    		    String eventTitleToCancel = s.next();
    	        Events eventToCancel = planner.findEventByTitle(eventTitleToCancel);
    	        if (eventToCancel != null) {
    	            planner.removeEvent(eventToCancel);
    	            System.out.println("Event '" + eventTitleToCancel + "' has been canceled.");
    	        } else {
    	            System.out.println("Event '" + eventTitleToCancel + "' not found.");
    	        }    			
    			break;
 //   		case 4:
 //   			System.out.println("display all event for that user");
 //   			break;
    		case 4:
    			System.out.println("Exiting program.");
    			break;
    		default:
    			System.out.println("wrong choice");
    	}
    	}while(choice!=5);
         
    }
}
