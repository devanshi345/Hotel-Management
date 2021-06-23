package oop_customer;
import java.io.*;
import java.util.*;

public class customer_details extends Hotel
{
	int ch,roomno;
	String name,id_type,phoneno;
	customer_details(int ch, int roomno)
	{
		super();
		this.ch = ch;
		this.roomno = roomno;
	}
	public void setdetails()
	{
	    System.out.println("\nEnter customer name: ");
	    name = sc.nextLine();
	    System.out.println("\nEnter type of id used for registration: ");
	    id_type = sc.nextLine();
	    System.out.println("\nEnter contact number: ");
	    phoneno = sc.nextLine();
	    switch(ch)
		{
			case 1:
			{
				obj.sinroom[roomno]=new SingleRoom(name,id_type,phoneno);
				break;
			}
			case 2:
			{
				obj.delroom[roomno]=new DeluxeRoom(name,id_type,phoneno);
				break;
			}
			case 3:
			{
				obj.luxroom[roomno]=new LuxuryRoom(name,id_type,phoneno);
				break;
			}
			default :
			{
				System.out.println("Incorrect option selected. \n");
			}
		}
	}
}
