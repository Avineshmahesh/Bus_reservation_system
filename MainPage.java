package Bus_reservation_System;
import java.util.*;
public class MainPage {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<Inputbus>ibus=new ArrayList<>();
		ArrayList<Database>db=new ArrayList<>();
		db.add(new Database(1,true,1));
		db.add(new Database(2,false,5));
		db.add(new Database(3,true,7));
		start(db,ibus);
		System.out.println("Thank you for your booking.");
	}
	
	public static void start(ArrayList<Database>db,ArrayList<Inputbus>ibus)
	{
		int choice = 0;
	do{
		try {
			System.out.println("------------------------------------------------------------------------------------------------------------------------------");
			System.out.println("                             Press 1 to book bus");
			System.out.println("                             Press 2 to view the booking details");
			System.out.println("                             Press 3 to exit");
			System.out.println("------------------------------------------------------------------------------------------------------------------------------");
			System.out.print("Enter --->");
		    choice=sc.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("Wrong input!!! Please Enter Valid input.");
			sc.next();
            continue;
         }
		
	    if(choice==1)
	    {   
			System.out.println("------------------------------------------------------------------------------------------------------------------------------");
			System.out.println("Bus Details :");
	    	Database.display(db);
			System.out.println("------------------------------------------------------------------------------------------------------------------------------");
	    	Inputbus n=new Inputbus();
	    	n.details(db,ibus);
	        ibus.add(n);
			System.out.println("------------------------------------------------------------------------------------------------------------------------------");
	        System.out.println("                "+ibus.get(ibus.size()-1).cusname+" Your Ticket is booked successfully.");
	        System.out.println("                Booking id for viewing the ticket: "+ibus.get(ibus.size()-1).rannum);
			System.out.println("------------------------------------------------------------------------------------------------------------------------------");

	    }
	    
	    if(choice==2)
	    {  
	    	ddbase.Information(ibus);
	    }
	    
	    else if(choice!=1&&choice!=2&&choice!=3)
	    {
	    	System.out.println("Enter the correct choice");
	    }
	}while(choice!=3);
	}
}
