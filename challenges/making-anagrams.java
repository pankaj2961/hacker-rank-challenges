/**
        1. first create array of character count for both string
        2. now find the difference of each character in both array
        3. keep adding all the difference and that is the count of no of deletion of character

    */

    // Complete the makingAnagrams function below.
    static int makingAnagrams(String s1, String s2) {

        int arr1[] = characterArrayOfString(s1);
        int arr2[] = characterArrayOfString(s2);
        int count = 0;
        for(int i=97; i<123; i++){
            count += Math.abs(arr1[i]-arr2[i]);
        }
        return count;

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