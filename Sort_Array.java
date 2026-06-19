public class Sort_Array{
	public static void main(String[] args){
		int [] num ={12,14,50,55,20};
		int temp;
		
		for(int i=0; i<num.length-1; i++){
			for(int j=0; j<num.length-1-i;  j++){
				if(num[j] > num[j+1]){
					temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;
				}
			}
		
		}
		
		for(int i=0; i<=num.length-1; i++){
			System.out.println(num[i]+" ");
		}
	}
}