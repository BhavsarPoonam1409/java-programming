public class Exceptions_try_catch{
	public static void main(String[] args){
		//error handling
		//try is error code and  catch is print any block of code in catch method
		try{
			int[] myNumbers = {1,2,3};
			System.out.println(myNumbers[10]);
		}
		catch(Exception e){
			System.out.println("something went wrong");
		}
	}
}