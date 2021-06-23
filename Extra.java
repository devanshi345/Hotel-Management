package oop_customer;
import java.io.*;
import java.util.*;

public class Extra implements Serializable 
{
    int quantity,itemno,price;

	Extra(int itemno ,int quantity)
	{
		this.itemno = itemno;
		this.quantity = quantity;
		switch(itemno)
		{
			case 1:
			{
				price = quantity*1000;
				break;
			}
			case 2:
			{
				price = quantity*1500;
				break;
			}
			case 3:
			{
				price = quantity*1800;
				break;
			}
			case 4:
			{
				price = quantity*30;
				break;
			}
			case 5:
			{
				price = quantity*90;
				break;
			}
			case 6:
			{
				price = quantity*40;
				break;
			}
			case 7:
			{
				price = quantity*50;
				break;
			}
			case 8:
			{
				price = quantity*100;
				break;
			}
		}
	}
}
