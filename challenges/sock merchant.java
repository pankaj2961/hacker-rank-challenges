
    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        int arLength = ar.length;
        if(  n == 0 || n == 1 || arLength == 0 || arLength == 1) return 0;
        int pair=0;
        // array size is declared as 101 because 1 <= n <= 100
        int[] tempArr = new int[101];
        for (int i=0; i<ar.length; i++){
           
            if(tempArr[ar[i]] == 0){
                 // one piece of pair found
                tempArr[ar[i]]++;
            } 
            else if(tempArr[ar[i]] == 1){
                // pair found
                pair++;
                tempArr[ar[i]] = 0;
            }
        }
        return pair;



    }
