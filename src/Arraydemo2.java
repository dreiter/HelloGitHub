
public class Arraydemo2 {

	public static void main(String[] args) {
		
		
		String array[]= {"J�nner","Februar", "M�rz", "April", "Mai" , "Juni", "Juli", "August" , "September", "Oktober" , "November" , "Dezember"};
		
		for (int i = 0; i < array.length; i++){
			System.out.println(array[i] + "[" + (i+1)+ "]");
		}
	}
}
