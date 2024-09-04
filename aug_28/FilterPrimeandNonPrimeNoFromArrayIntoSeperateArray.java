package aug_28;

public class FilterPrimeandNonPrimeNoFromArrayIntoSeperateArray {
    public static void main(String[] args) {
        int[] nums = {21,19,37,12,81,83};
        int[] prime = new int[nums.length];
        int[] nonPrime = new int[nums.length];
        int p=0,np=0;

        for(int i=0;i<nums.length;i++){
            boolean isPrime = true;
            for(int j=2;j<=nums[i]/2;j++){
                if(nums[i]%j==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                prime[p]=nums[i];
                p++;
            }else{
                nonPrime[np]=nums[i];
                np++;
            }
        }
        System.out.println("Original : ");
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        System.out.println("Prime : ");
        for(int i=0;i<prime.length;i++){
            System.out.print(prime[i]+" ");
        }
        System.out.println();
        System.out.println("Non Prime : ");
        for(int i=0;i<nonPrime.length;i++){
            System.out.print(nonPrime[i]+" ");
        }

    }
}
