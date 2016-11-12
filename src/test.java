
public class test {

	public static void main(String[] args) {
		
		int zahl = 16;
		
		for(int teiler = 2;teiler<zahl; teiler++)
		{
			if (zahl%teiler == 0)
			{
				System.out.println("teiler von "+ zahl + " = " +teiler);
			}
			
			continue;
			
		}

	}

}
