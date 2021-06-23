package oop_customer;
import java.io.*;
import java.util.*;

public class Room implements Serializable
{
	String name;
	String id_type;
	String phoneno;
	int charge; 
	ArrayList<Extra> ex;
	Room()
	{
		this.name = "";
		this.id_type = "";
		this.phoneno = "";
		this.charge = 0;
	}
}
class SingleRoom extends Room implements Serializable
{
	SingleRoom(String x, String y, String z)
	{
		super();
		name = x;
		id_type = y;
		phoneno = z;
		charge = 1000;
		ex = new ArrayList<>();
	}
}

class LuxuryRoom extends Room implements Serializable
{
	LuxuryRoom(String x, String y, String z)
	{
		super();
		name = x;
		id_type = y;
		phoneno = z;
		charge = 2000;
		ex = new ArrayList<>();
	}
}

class DeluxeRoom extends Room implements Serializable 
{
	DeluxeRoom(String x, String y, String z)
	{
		super();
		name = x;
		id_type = y;
		phoneno = z;
		charge = 3000;
		ex = new ArrayList<>();
	}
}

class room_types implements Serializable
{
	SingleRoom sinroom[] = new SingleRoom[10];
	LuxuryRoom luxroom[] = new LuxuryRoom[10];
	DeluxeRoom delroom[] = new DeluxeRoom[10];
}
