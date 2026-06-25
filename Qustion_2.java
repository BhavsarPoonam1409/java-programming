public class Qus_2 {
    public static void main(String[] args) {

        int [] arr = {2,4,3,7,9,10,17,14,11};

        int total_even = 0;
        int total_odd = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 == 0){
                total_even++;
                
            }
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 != 0){
            total_odd++;
            
        }
        }

        
        System.out.println("Total even no: "+total_even);
         System.out.println("Total odd no: "+total_odd);
	}
}