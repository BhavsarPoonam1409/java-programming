public class Qus_1 {

    static int fact(int n){
        if(n==1){
            return 1;
        }
        return fact(n-1)*n;
    }

        public static void main(String[]args){
        int result = fact(4);
        System.out.println("Factorial no is: "+result);

    }
}
