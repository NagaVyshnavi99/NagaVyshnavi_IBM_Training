package javaprgm;
import java.io.IOException;
import java.sql.SQLException;

public class Checkedexception {
	
public static void main(String args[])
{
	try
	{
		throw new ArrayIndexOutOfBoundsException();
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println(e/*.getMessage()*/);
	}
}
}
