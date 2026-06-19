
public class Recursion_Basic1{
    static int sum(int N){
		//recursion code 
        //base case
		//badi problem ko choti problem me krke solve krna
        if(N == 1){
            return 1;
        }
        return sum(N - 1) + N;
    }
   
   
    public static void main(String[] args) {
        int result = sum(5);
        System.out.println(result);
    }
}