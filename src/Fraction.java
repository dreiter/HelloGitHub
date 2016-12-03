
public class Fraction {

		private int nenner;
		private int zähler;
		
		public Fraction (int zähler, int nenner)
		{
			this.zähler = zähler;
			this.nenner = nenner;
		}
		public int getZähler()
		{
			return zähler;
		}
		public int getNenner()
		{
			return nenner;
		}
		public void print()
		{
			System.out.println(zähler + "/" + nenner);
		}
		
		public double toDecimal()
		{
			return this.zähler*1.0 / this.nenner ;
		}
		
		public Fraction multiplicate(Fraction b1)
		{
			int zähler = this.zähler*b1.getZähler();
			int nenner = this.nenner*b1.getNenner();
			
			return new Fraction(zähler, nenner);
		}

}
