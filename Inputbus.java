package Bus_reservation_System;
import java.util.*;
public class Inputbus {
	String cusname;
	int cbusno;
	int avcap;
	double rannum;
	Scanner sc=new Scanner(System.in);
	MainPage ob=new MainPage();
	public void details(ArrayList<Database>db,ArrayList<Inputbus>ibus)
	{
		try {
			System.out.print("Enter Passengers Name : ");
			cusname=sc.nextLine();
			if(!cusname.matches("[a-zA-Z]+")){
                throw new Exception("Error: Enter valid Input for name.");
		}}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println();
			details(db,ibus);
		}
		 try {
            System.out.print("Enter the Bus.no you need : ");
            cbusno = sc.nextInt();
            if (cbusno < 1 || cbusno > db.size()) {
                throw new Exception();
            }
            for (Database bus : db) {
                if (bus.getBusno() == cbusno) {
                    if (bus.getCap() > 0) {
                        bus.reduceCapacity();
                    } 
                    else {
            			System.out.println("------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("                       Sorry, the seats are full give any other bus.");
            			System.out.println("------------------------------------------------------------------------------------------------------------------------------");
                        MainPage.start(db,ibus);
                        }
                }
        }
		}catch (Exception e) {
            System.out.println("Error: Enter a valid Bus number.");
            sc.nextLine();
            System.out.println();
            details(db,ibus);  
        }
		rannum=Math.random();
	}
}
