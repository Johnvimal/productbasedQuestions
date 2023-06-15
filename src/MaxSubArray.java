import java.util.List;

public class MaxSubArray {
		// DO NOT MODFIY THE LIST. 
		public int maxSubArray(final List<Integer> A) {
		    
		    int sum = Integer.MIN_VALUE;
		    int last = 0;
		    
		    for (int num : A) {
		        
		        last += num;
		        sum = Math.max(sum, last);
	            if (last < 0)
		            last = 0;
		    }
		    
		    return sum;
		    
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub

		}
	}