    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int diffFromSeaLevel = 0;
        int maxValleyReached = 0;
        if (n==0) return 0;

        for (int i=0; i< n; i++){
            char c = s.charAt(i);
            if(c== 'D') diffFromSeaLevel -= 1;
            if(c== 'U') diffFromSeaLevel += 1;
            if(c == 'U' && diffFromSeaLevel ==0)
                maxValleyReached ++;
             
        }
        return maxValleyReached;

    }