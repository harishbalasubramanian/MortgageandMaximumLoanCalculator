public class mort2 {
	public double morter(double p, double n, double r){
		r/=1200;
		n*=12;
		double m = Math.round(p*100*((r*Math.pow(1+r, n))/(Math.pow(1+r,n)-1)))/100.0;
		return m;
	}
	public double loaner(double m, double n, double r){
		r/=1200;
		n*=12;
		double p =  Math.round(m*100*((Math.pow(1+r,n)-1)/(r*Math.pow(1+r, n))))/100.0;
		return p;
	}
}