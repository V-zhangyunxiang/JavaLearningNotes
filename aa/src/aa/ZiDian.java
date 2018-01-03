package aa;

public class ZiDian {
	 static long[] timesSum = new long[19]; // ( > 0 且 < 10 ^ a ) 的数中，以某数字开头的数字的数量  
	    static long[] count = new long[10]; // 指定数字以下（包括该指定数字）的所有大于0的数字中，以a开头的数字的数量  
	  
	    public static void main(String[] args) {  
	        for (int n = 1; n <= 18; n++) {  
	            timesSum[n] = ((long) (Math.pow(10, n) - 1) / 9);  
	        }  
	  
	        long value = 489761654765465L;  
	        long index = 434206099209910L;  
	        String str = String.valueOf(value);  
	        int longness = str.length();  
	        int first = Integer.valueOf(str.charAt(0)) - 48;  
	        int digitm1 = longness - 1;  
	        long multiple = (long) Math.pow(10, digitm1);  
	  
	        if (first > 0) { // 400  
	            long startsWithFirst = value % multiple + 1;  
	            count[first] += startsWithFirst;  
	  
	            for (int n = 1; n <= 9; n++) { // 100  
	                count[n] += timesSum[digitm1];  
	            }  
	  
	            for (int j = 1; j < first; j++) { // 100~399  
	                count[j] += multiple;  
	            }  
	        }  
	  
	        long sum = 0;  
	  
	        for (int i = 1; i <= 9; i++) {  
	            System.out.println(i + " : " + count[i]);  
	  
	            sum += count[i];  
	        }  
	  
	        System.out.println("sum = " + sum);  
	  
	        sum = 0;  
	        int startNumber = 0;  
	        long secIndex = 0;  
	  
	        for (int i = 1; i <= 9; i++) {  
	            sum += count[i];  
	  
	            if (sum >= index) {  
	                System.out.println("sum = " + sum + ", index = " + index + " is between " + (i - 1) + " and " + i);  
	                secIndex = index - (sum - count[i]);  
	                startNumber = i;  
	                break;  
	            }  
	        }  
	  
	        System.out.println("startNumber = " + startNumber + "  secIndex = " + secIndex);  
	  
	        long thrIndex = 0;  
	        int digit = 1;  
	  
	        for (; digit <= digitm1 + 1; digit++) {  
	            if (timesSum[digit] >= secIndex) {  
	                thrIndex = secIndex - timesSum[digit - 1];  
	                break;  
	            }  
	        }  
	  
	        System.out.println("digit = " + digit + "  thrIndex = " + thrIndex);  
	        System.out.println("Number = " + (startNumber * (long) Math.pow(10, digit - 1) + (thrIndex - 1)));  
	    }  
}
