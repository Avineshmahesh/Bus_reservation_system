package Bus_reservation_System;

import java.util.ArrayList;
import java.util.*;

public class ddbase {
	static double id;
	static int count=1;
	static Scanner sc=new Scanner(System.in);
	public static void Information(ArrayList<Inputbus> ibus){
		System.out.print("Enter the booking id for details :");
		id=sc.nextDouble();
		for(int i=0;i<ibus.size();i++)
		{
			if(ibus.get(i).rannum==id)
			{
				count=0;
				System.out.println("------------------------------------------------------------------------------------------------------------------------------");
				System.out.println("                                    Passenger's Name : "+ibus.get(i).cusname);
				System.out.println("                                    Bus.no : "+ibus.get(i).cbusno);
				System.out.println("------------------------------------------------------------------------------------------------------------------------------");
				return;
			}
		}
		System.out.println("Wrong!! Please Check your Booking id.");
		}
	}
