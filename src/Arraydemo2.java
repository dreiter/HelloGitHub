
public class Arraydemo2 {

	public static void main(String[] args) {
		
		
		String [] array= new String[] {"Jänner","Februar", "März", "April", "Mai" , "Juni", "Juli", "August" , "September", "Oktober" , "November" , "Dezember"};
		String array2[] = {"test"};
		for (int i = 0; i < array.length; i++){
			System.out.println(array[i] + "[" + (i+1)+ "]");
		}
		System.out.println(array2);
	}
}
