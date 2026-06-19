public class Arrsecondmaxno{
	public static void main(String[] args){
		int [] nums = {2,4,4,5,9,10};
		int temp=nums[0];
		int max=nums[0];
		for(int i=0; i<nums.length; i++){
			if(nums[i]>temp){
				temp=nums[i];
			}
		}
		System.out.println(temp);
		for(int i=0; i<nums.length; i++){
			if(nums[i]==temp){
				
			}
			else{
				if(nums[i]>max){
					max=nums[i];
				}
			}
		}
		System.out.println(max);
	
	}
}
