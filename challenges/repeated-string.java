// Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        /***
            1. create an array and populate no of a found in string from left to right and aslo find no of occurence of a in one string
            2. divide n / string length and find  quotient and remainer
            3. total count will be quotient * no of a's in one(ie single) string + no of a's for remainder length of string


        ***/
        int[] countArr = new int[102];
        int countOfAInS = 0;
        long totalCountOFA = 0;
        int strLength = s.toCharArray().length;
        for (int i=0; i<strLength; i++){
            char ch = s.charAt(i);
            if(ch == 'a'){
                countOfAInS++;
            }
            countArr[i+1] = countOfAInS;
        }

        if (countOfAInS == 0) return 0;
        if (strLength ==1 && countOfAInS == 1) return n;

        int remainder = (int)(n % strLength);
        //totalCountOFA = remainder > 0 ? countArr[remainder-1] : 0;
        totalCountOFA = ((n/strLength) * countOfAInS)+ countArr[remainder];
        //System.out.println(strLength+"----"+totalCountOFA + "---" +remainder+ "---"+ countOfAInS);
        return totalCountOFA;

    }