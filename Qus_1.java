public class Qus_1 {
    
    static int sum(int n){
        if(n==1){
            return 1;
        }
        return sum(n-1)+n;
    }
    public static void main(String[]args){
        int result = sum(5);
        System.out.println("sum from 1 to 5 is: "+result);

    }
}
