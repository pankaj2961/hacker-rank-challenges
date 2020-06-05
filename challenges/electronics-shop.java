    static int getMoneySpent(int[] keyboards, int[] drives, int b) {


        /*
         * Write your code here.
         Steps
         ******
         1. arrange both the array in ascending order
         2. take two pointer i = keyboard.length-1 && j = 0(ie of drives)
         3. if keyboard[i]+ drives[j] > b then increment i only
         4. if keyboard[i]+ drives[j] <= b then check for max value and then increment i and j
         */

        Arrays.sort(keyboards);//Ascending order
        Arrays.sort(drives);//Ascending order
        //Collections.sort(x)
        
        int max = -1;
        for(int i = keyboards.length-1, j = 0; i >= 0; i--){
            for(; j < drives.length; j++){
                if(keyboards[i]+drives[j] > b) break; //This prevents j from incrementing
                if(keyboards[i]+drives[j] > max)
                    max = keyboards[i]+drives[j];
            }
        }
        //System.out.println(max);
        return max;

    }