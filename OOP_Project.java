package oop_customer;
import java.io.*;
import java.util.*;

public class OOP_Project {
    public static void main(String[] args)
	{
        try
        {
            File f = new File("C:\\Users\\devanshi\\Desktop\\input.txt");
            if(f.exists())
            {
                FileInputStream fin=new FileInputStream(f);
                ObjectInputStream ois=new ObjectInputStream(fin);
                Hotel.obj=(room_types)ois.readObject();
            }
            Scanner sc = new Scanner(System.in);
            boolean chk = false;
            while(true)
            {
                System.out.println("-----     Customer section     -----");
                System.out.println("1. Display available rooms");
                System.out.println("2. Display features of rooms");
                System.out.println("3. Book a room");
                System.out.println("4. Extra services or order food.");
                System.out.println("5. Checkout and Bill.");
                System.out.println("6. Exit");
                System.out.println("Enter choice(1-6): ");
                int choice = sc.nextInt(); 
                switch(choice)
                {
                    case 1:
                    {
                        System.out.println("\nChoose room type :\n1.Single Room \n2.Deluxe Room \n3.Luxury Room\nEnter your choice: ");
                        int ch;
                        ch = sc.nextInt();
                        room_details h = new room_details(ch);
                        h.display_available();
                        break;
                    }
                    case 2:
                    {
                        System.out.println("\nChoose room type :\n1.Single Room \n2.Deluxe Room \n3.Luxury Room\nEnter your choice: ");
                        int ch;
                        ch = sc.nextInt();
                        room_details h = new room_details(ch);
                        h.room_features();
                        break;
                    }
                    case 3: 
                    {
                        System.out.println("\nChoose room type :\n1.Single Room \n2.Deluxe Room \n3.Luxury Room\nEnter your choice: ");
                        int ch;
                        ch = sc.nextInt();
                        book_room h = new book_room(ch);
                        h.findroom();
                        break;
                    }
                    case 4:
                    {
                        Hotel h = new Hotel();
                        h.order_extra();
                        break; 
                    }
                    case 5:
                    {
                        checkout h = new checkout();
                        h.deallocate();
                        break;
                    }
                    case 6:
                    {
                        chk=true;
                        break;
                    }
                    default:
                    {
                        System.out.println("Invalid choice entered.\n");
                    }
                }
                if(chk==true)
                {
                    break;
                }
            }
        }
        catch(Exception e)
        {
            System.out.println("Invalid input.\n");
        }
        finally
        {
            try{
                FileOutputStream fout=new FileOutputStream("C:\\Users\\devanshi\\Desktop\\input.txt");
                ObjectOutputStream oos=new ObjectOutputStream(fout);
                oos.writeObject(Hotel.obj);
            }
            catch(IOException e)
            {
                System.out.println("Error in writing "+e);
            }
        }
    }
}
