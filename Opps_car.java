public class Opps_car{
	String Name = "";
	String Brand ="";
	String Fuel ="";

	public static void main(String[] args){
		Opps_car Lamborghini = new Opps_car();
		Opps_car BMW = new Opps_car();
		
		Lamborghini.Name = "Lamborghini";
		Lamborghini.Brand = "abc";
		Lamborghini.Fuel = "Petrol";
		
		BMW.Name = "BMW";
		BMW.Brand = "abc";
		BMW.Fuel = "Petrol";
		
		System.out.println(Lamborghini.Name);
		System.out.println(Lamborghini.Brand);
		System.out.println(Lamborghini.Fuel);
		
		System.out.println();
		
		System.out.println(BMW.Name);
		System.out.println(BMW.Brand);
		System.out.println(BMW.Fuel);
		
	}
}