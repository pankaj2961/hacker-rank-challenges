 /**
        1. Took a refence from this solution 
        https://www.geeksforgeeks.org/count-special-palindromes-in-a-string/

    **/

    // Complete the substrCount function below.
    static long substrCount(int n, String s) {
        // case 1 for continuous character
        int[] arr = new int[n];
        long result = 0;
        int i=0;
        while( i<n){
            int charCount = 1;
            int j= i+1;
            while(j < n && s.charAt(i) == s.charAt(j)){
                charCount++;
                j++;
            }

            arr[i] = charCount;
            result += (charCount * (charCount+1))/2;
            i=j;
        }

        // case 2 only 1 character can be different and should be in middle of substring
        i=1;
        while( i<n-1 ){
            if (s.charAt(i) == s.charAt(i - 1)) arr[i] = arr[i - 1];

            if(i<n-1 &&  s.charAt(i) != s.charAt(i-1) && s.charAt(i+1) == s.charAt(i-1)){

            result += Math.min(arr[i-1], arr[i+1]);

            }
            i++;

        }
        return result;

    }
