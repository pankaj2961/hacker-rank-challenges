 /**
        1. make two pointer i and j with indexes 0 and str.length()-1
        2. check if char at i == char at j if yes increment i and decrement j
        3. if not then check for str in range [i+1, j] if it is palindrome then return i else return j because in the end string will become palindrome by removing one character ie either remove ith char or remove jth char

    */

    // Complete the palindromeIndex function below.
    static int palindromeIndex(String s) {

        for ( int i=0, j= s.length()-1 ; i<j ; i++, j--){

            if(s.charAt(i) != s.charAt(j)){

                if(checkPalindrome(s, i+1, j)) return i;
                else return j;
            }

        }
        return -1;


    }

    static boolean checkPalindrome(String str, int i, int j){

        while (i<j){
            if(str.charAt(i) == str.charAt(j)){
                i++;
                j--;
            } 
            else return false;
        }
        return true;

    }