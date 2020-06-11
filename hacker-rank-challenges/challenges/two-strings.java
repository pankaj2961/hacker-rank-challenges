// Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {

        /*
            1. create a hashSet for string s1. Normally you should create a hash set for smaller string.
            2. traverse 2nd string and check if that character is present in set.
            3. If present then return "YEs".
            4. At the end return "NO" 
        **/

        Set<Character> charSet = new HashSet<>();
        for(char ch : s1.toCharArray()){
            charSet.add(ch);
        }
        for(char ch : s2.toCharArray()){
            if(charSet.contains(ch)) return "YES";
        }
        return "NO";



    }