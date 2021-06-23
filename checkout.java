package oop_customer;
import java.io.*;
import java.util.*;

class checkout extends Hotel
{
	checkout()
	{
		super();
	}
	void deallocate()
	{
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter room no. which is checking out : ");
		int roomno = sc.nextInt();
		int ch;
		if(roomno>=1 && roomno<=10)
			ch=1;
		else if(roomno>10 && roomno<=20)
			ch=2;
		else if(roomno<=30 && roomno>20)
			ch=3;
		else
		{
			System.out.println("Room doesn't exist.\n");
			return;
		}
		roomno--;
		switch (ch) 
		{
			case 1:
			{
				if(obj.sinroom[roomno]==null)
				{
					System.out.println("Room already empty.\n");
					return ;
				}
				System.out.println("Room's customer : "+ obj.sinroom[roomno].name);
				System.out.println("Wanna checkout ? (y/n) : ");
				char c = sc.next().charAt(0);
				if(c=='y' || c=='Y')
				{
					bill(roomno,ch);
					obj.sinroom[roomno]=null;
					System.out.println("Room deallocated.\n");
				}
				break;
			}
			case 2:
			{
				roomno-=10;
				if(obj.delroom[roomno]==null)
				{
					System.out.println("Room already empty.\n");
					return ;
				}
				System.out.println("Room's customer : "+ obj.delroom[roomno].name);
				System.out.println("Wanna checkout ? (y/n) : ");
				char c = sc.next().charAt(0);
				if(c=='y' || c=='Y')
				{
					bill(roomno,ch);
					obj.delroom[roomno]=null;
					System.out.println("Room deallocated.\n");
				}
				break;
			}	
			case 3:
			{
				roomno-=20;
				if(obj.luxroom[roomno]==null)
				{
					System.out.println("Room already empty.\n");
					return ;
				}
				System.out.println("Room's customer : "+ obj.luxroom[roomno].name);
				System.out.println("Wanna checkout ? (y/n) : ");
				char c = sc.next().charAt(0);
				if(c=='y' || c=='Y')
				{
					bill(roomno,ch);
					obj.luxroom[roomno]=null;
					System.out.println("Room deallocated.\n");
				}
				break;
			}
		}
	}

	void bill(int roomno,int ch)
	{
		int cost = 0;
		String extra_list[] ={"Extra bed","Airport drop","Heritage walk","Order Thaali","Order Pasta","Order Tea","Order Coffee","Order Breakfast"};
		System.out.println("\n-------\nBill\n-------");
		switch(ch)
		{
			case 1:
			{
                cost+=obj.sinroom[roomno].charge;
                System.out.println("\nRoom Charge - "+obj.sinroom[roomno].charge);
                if(!obj.sinroom[roomno].ex.isEmpty())
                {
                    System.out.println("\n*************************");
                    System.out.println("Extra Services Charges:- ");
                    System.out.println("*************************");
                    System.out.println("Item          Quantity          Price");
                    System.out.println("--------------------------------------");
                    for(Extra i : obj.sinroom[roomno].ex)
                    {
                        cost+=i.price;
                        String format = "%-20s%-12s%-10s%n";
                        System.out.printf(format,extra_list[i.itemno-1],i.quantity,i.price);
                    }
                }
                break;
			}
			case 2:
			{
				cost+=obj.delroom[roomno].charge;
                System.out.println("\nRoom Charge - "+obj.delroom[roomno].charge);
                if(!obj.delroom[roomno].ex.isEmpty())
                {
                    System.out.println("\n*************************");
                    System.out.println("Extra Services Charges:- ");
                    System.out.println("*************************");
                    System.out.println("Item          Quantity          Price");
                    System.out.println("--------------------------------------");
                    for(Extra i : obj.delroom[roomno].ex)
                    {
                        cost+=i.price;
                        String format = "%-20s%-12s%-10s%n";
                        System.out.printf(format,extra_list[i.itemno-1],i.quantity,i.price);
                    }
                }
                break;
			}
			case 3:
			{
				cost+=obj.luxroom[roomno].charge;
                System.out.println("\nRoom Charge - "+obj.luxroom[roomno].charge);
                if(!obj.luxroom[roomno].ex.isEmpty())
                {
                    System.out.println("\n*************************");
                    System.out.println("Extra Services Charges:- ");
                    System.out.println("*************************");
                    System.out.println("Item          Quantity          Price");
                    System.out.println("--------------------------------------");
                    for(Extra i : obj.luxroom[roomno].ex)
                    {
                        cost+=i.price;
                        String format = "%-20s%-12s%-10s%n";
                        System.out.printf(format,extra_list[i.itemno-1],i.quantity,i.price);
                    }
                }
                break;
			}
		}
		System.out.println("\nTotal Amount- "+cost);
	}
}
