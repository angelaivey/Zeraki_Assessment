public class QuestionOne {

	 static int missingNumber(int k[], int n) {
		 //function
		 int sum = 1;
	        for (int i = 2; i <= (n + 1); i++)
	        {
	            sum += i;				//traverse the array
	            sum -= k[i - 2];		//update the sum
	        }
	        return sum;
	    }
	 
	    //output
	    public static void main(String[] args)
	    {
	        int[] arr = { 3, 5, 4, 1 };
	        System.out.println(missingNumber(arr, arr.length));
	    }
		
	}

