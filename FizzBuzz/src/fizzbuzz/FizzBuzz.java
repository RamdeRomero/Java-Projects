package fizzbuzz;


public class FizzBuzz {

    public static void main(String[] args) {
        // TODO code application logic here
        int[] nums = new int[100];
        
        for (int x=0; x<nums.length;x++){
            nums[x]=x+1;
            
            if ((nums[x]%3 ==0)&&(nums[x]%5==0)){
                System.out.println("FizzBuzz");
            }
            else if(nums[x]%3 == 0){
                System.out.println("Fizz");
            }
            else if(nums[x]%5 == 0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(nums[x]);
            }
        }
        
    }
    
}
