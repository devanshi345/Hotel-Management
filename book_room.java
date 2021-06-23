package oop_customer;
import java.io.*;
import java.util.*;

public class book_room extends Hotel
{
	int ch,roomno=-1;
	customer_details cust;
	book_room(int i)
	{
		super();
		this.ch = i;
	}
    void findroom()
    {
        switch(ch)
        {
            case 1: 
            {
                for(int j=0;j<obj.sinroom.length;j++)
                {
                    if(obj.sinroom[j]==null)
    	            {
                        roomno=j;
                        break;
                    }
                }
                if(roomno==-1)
                {
                    System.out.println("No room available.\n");
                }
                else
                {
                    cust = new customer_details(ch, roomno);
                    cust.setdetails();
                    System.out.println("Room Booked     -----     Room no = "+(roomno+1)+"\n");
                }
                break;
            }
            case 2: 
            {
                for(int j=0;j<obj.delroom.length;j++)
                {
                    if(obj.delroom[j]==null)
                    {
                        roomno=j;
                        break;
                    }
                }
                if(roomno==-1)
                {
                    System.out.println("No room available.\n");
                }
                else
                {
                    cust = new customer_details(ch, roomno);
                    cust.setdetails();
                    System.out.println("Room Booked     -----     Room no = "+(roomno+11)+"\n");
                }
                break;
            }
            case 3: 
            {
                for(int j=0;j<obj.luxroom.length;j++)
                {
                    if(obj.luxroom[j]==null)
                    {
                        roomno=j;
                        break;
                    }
                }
	            if(roomno==-1)
	            {
	                System.out.println("No room available.\n");
	            }
	            else
	            {
	                cust = new customer_details(ch, roomno);
	                cust.setdetails();
	                System.out.println("Room Booked     -----     Room no = "+(roomno+21)+"\n");
	            }
	            break;
            }
            default :
            {
                System.out.println("Incorrect choice selected.\n");
            }
        }
    }     
}
