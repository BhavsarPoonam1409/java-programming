public class Qus_2 {
    
    public static void main(String[] args){
        int [] nums = {14,12,90,50,70,100,55};
		int temp=nums[0];
		int max=nums[0];
		for(int i=0; i<nums.length; i++){
			if(nums[i]>temp){
				temp=nums[i];
                
			}
		}
		
		for(int i=0; i<nums.length; i++){
			if(nums[i]==temp){
				
			}
			
			else{
				if(nums[i]>max){
					max=nums[i];
					
				}
				
			}
		}
		System.out.println("Second Largest no is: "+max);
}
}
