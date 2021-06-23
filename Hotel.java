package oop_customer;
import java.util.*;

public class Hotel 
{
    Scanner sc = new Scanner(System.in);
	static room_types obj = new room_types();
    
    void order_extra()
	{
        try
        {
            System.out.println("For which room no. extra service is required? : ");
            int roomno = sc.nextInt();
            int ch;
            if(roomno>=1 && roomno<=10)
            {
                ch=1;
                roomno--;
            }
            else if(roomno>10 && roomno<=20)
            {
                ch=2;
                roomno-=11;
            }
            else if(roomno<=30)
            {
                ch=3;
                roomno-=21;
            }
            else
            {
                System.out.println("Room doesn't exist.\n");
                return;
            }
            System.out.println("---------------------------\nExtra services available\n---------------------------\n");
            System.out.println("1. Extra bed           1000 Rs.");
            System.out.println("2. Airport drop        1500 Rs.");
            System.out.println("3. Heritage walk       1800 Rs.");
            System.out.println("4. Order Thaali        300 Rs.");
            System.out.println("5. Order Pasta         90 Rs.");
            System.out.println("6. Order Tea           40 Rs.");
            System.out.println("7. Order Coffee        50 Rs.");
            System.out.println("8. Order Breakfast     100 Rs.\n");
            System.out.println("Enter your choice(1-8): ");
            int select = sc.nextInt();
            if(!(select>=1 && select<=8))
            {
                System.out.println("Invalid choice selected.\n");
                return;
            }
            System.out.println("Enter quantity: ");
            int q = sc.nextInt();
            switch(ch)
            {
                case 1:
                {
                    obj.sinroom[roomno].ex.add(new Extra(select,q));
                    break;
                }
                case 2:
                {

                    obj.delroom[roomno].ex.add(new Extra(select,q));
                    break;
                }
                case 3:
                {
                    obj.luxroom[roomno].ex.add(new Extra(select,q));
                    break;
                }
            }
        }
        catch(NullPointerException e)
        {
            System.out.println("Room not yet booked.\n");
        }
        catch(Exception e)
        {
            System.out.println("Invalid input");
        }
	}
}
