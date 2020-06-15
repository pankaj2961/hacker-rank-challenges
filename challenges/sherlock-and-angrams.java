/**
        1. state current length of substring we r looking for
        2. calculate hash map for current length
        3. traverse for each substring with respective length hash map  to find no of anagram for that substrinf
    */

    // Complete the sherlockAndAnagrams function below.
    static int sherlockAndAnagrams(String s) {
        int val = 0;
        for (int i=1; i<s.length(); i++){
            for (int j=0; j+i < s.length() ; j++){

                val += returnCountOfAnag(s,i,j);
                // System.out.println("val for i, start, "+i+","+j+" "+val);
            }
        }

        // boolean val = checkAnagram("abba",2,0,2);
        // System.out.println("total, "+val);
        return val;

    }

    static int returnCountOfAnag(String str, int forStringLength, int firstStringstartIndex){
        int count = 0;

        for (int j=firstStringstartIndex+1; j+forStringLength <= str.length(); j++){

            count += checkAnagram(str, forStringLength, firstStringstartIndex,j);
         }
         return count;


    }


    static int checkAnagram(String str, int forStringLength, int firstStringstartIndex, int secondStringstartIndex){
        int[] arr = new int[130];
        int forLength = forStringLength;
        for (int i=firstStringstartIndex; forLength != 0 ; i++){
            int ch = str.charAt(i);
            arr[ch]++;
            forLength--;
        }
        forLength = forStringLength;
        for (int i=secondStringstartIndex; forLength > 0; i++){
            int ch = str.charAt(i);
            if(arr[ch] >0){
                arr[ch]--;
            } else{
                return 0;
            }
            forLength--;
        }
        return 1;
    }