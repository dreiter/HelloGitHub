
public class Fraction {

		private int nenner;
		private int z�hler;
		
		public Fraction (int z�hler, int nenner)
		{
			this.z�hler = z�hler;
			this.nenner = nenner;
		}
		public int getZ�hler()
		{
			return z�hler;
		}
		public int getNenner()
		{
			return nenner;
		}
		public void print()
		{
			System.out.println(z�hler + "/" + nenner);
		}
		
		public double toDecimal()
		{
			return this.z�hler*1.0 / this.nenner ;
		}
		
		public Fraction multiplicate(Fraction b1)
		{
			int z�hler = this.z�hler*b1.getZ�hler();
			int nenner = this.nenner*b1.getNenner();
			
			return new Fraction(z�hler, nenner);
		}

}
