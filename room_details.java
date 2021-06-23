package oop_customer;
import java.io.*;
import java.util.*;

/**
 *
 * @author devanshi
 */
public class room_details extends Hotel
{
    int total=0,ch;
	room_details(int ch)
	{
		super(); 
		this.ch = ch;
	}
    room_details()
    {
        super();
    }
	public void display_available()
	{
		switch(ch)
		{
			case 1:
			{
				for(int i=0;i<obj.sinroom.length;i++)
				{
					if(obj.sinroom[i]==null)
					{
						total++;
					}
				}
				System.out.println("Number of single rooms available : " + total + ".\n");
				break;
			}
			case 2:
			{
				for(int i=0;i<obj.delroom.length;i++)
				{
					if(obj.delroom[i]==null)
					{
						total++;
					}
				}
				System.out.println("Number of deluxe rooms available : " + total + ".\n");
				break;
			}
			case 3:
			{
				for(int i=0;i<obj.luxroom.length;i++)
				{
					if(obj.luxroom[i]==null)
					{
						total++;
					}
				}
				System.out.println("Number of luxury rooms available : " + total + ".\n");
				break;
			}
			default :
			{
				System.out.println("Invalid choice selected.\n");
			}
		}
	}
	public void room_features()
	{
		switch(ch)
		{
			case 1:
			{
				System.out.println("Bed : Single bed \nTV : Yes \nAC : No \nPersonal Refrigerator : No \n");
				break;
			}
			case 2:
			{
				System.out.println("Bed : Double Bed \nTV : Yes \nAC : Yes \nPersonal Refrigerator : No \n");
				break;
			}
			case 3:
			{
				System.out.println("Bed : King-Sized Bed \nTV : Yes\nAC : Yes \nPersonal Refrigerator : Yes \n");
				break;
			}
			default :
			{
				System.out.println("Invalid choice selected.\n");
			}
		}
	}
}
