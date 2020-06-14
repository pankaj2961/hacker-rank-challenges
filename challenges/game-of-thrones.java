/**
        1. create array to store character count
        2. for string to have palindrome anagaram 2 conditions are there
        2a. if all character count is even 
        2b. 0 or 1 character can have odd count

    */

    // Complete the gameOfThrones function below.
    static String gameOfThrones(String s) {
        int[] arr  = new int[125];
        char ch ;
        long oddCharCount = 0;
        for(int i=0; i<s.length(); i++){
            ch = s.charAt(i);
            arr[ch]++;

        }   
        for(int i=97; i<124; i++){
            if(arr[i] % 2 ==1) oddCharCount++;
        } 

        if(oddCharCount == 0  || oddCharCount == 1) return "YES";
        return "NO";


    }