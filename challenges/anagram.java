/**
        1. if string length is odd then return -1
        2. create a substring s1 and s2 splitting in middle
        2. first create array of character count for both string
        3. now find the difference of each character in both array
        4. keep adding all the difference and that is the count of no of deletion of character

    */

    // Complete the anagram function below.
    static int anagram(String s) {

        if (s.length() %2 ==1) return -1;
        int arr1[] = characterArrayOfString(s.substring(0,s.length()/2));
        int arr2[] = characterArrayOfString(s.substring(s.length()/2, s.length()));
        int count = 0;
        for(int i=97; i<123; i++){
            count += Math.abs(arr1[i]-arr2[i]);
        }
        return count/2;

    }

    static int[] characterArrayOfString(String str){
        int arr[] = new int[125];
        char ch;
        for(int i=0; i<str.length(); i++){
            ch = str.charAt(i);
            arr[ch]++;
        } 
        return arr;
    }