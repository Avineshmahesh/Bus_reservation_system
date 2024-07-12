package Bus_reservation_System;
import java.util.*;

public class Database {
    private int busno;
    private boolean ac;
    private int cap;

    public Database(int busno, boolean ac, int cap) {
        this.busno = busno;
        this.ac = ac;
        this.cap = cap;
    }

    public int getBusno() {
        return busno;
    }

    public boolean getAc() {
        return ac;
    }

    public int getCap() {
        return cap;
    }
    
    public void reduceCapacity(){
    	if(cap>0)
    	{
    	cap--;
    	}
    }
    public static void display(ArrayList<Database> buses) {
        for (Database bus : buses) {
            System.out.println("                             Bus.no: " + bus.getBusno() + " AC: " + bus.getAc() + " Capacity: " + bus.getCap());
        }
    }
}
