    // this function basically removes one ie first no from previous window of length d and add one ie last no from current window to the array
    public static void updateArray(int[] arr, int[] expdArr,  int i, int d){
        //  for first time we don't need to insert prev no  and remove 1ast no
        if( i -d-1 < 0) return;

        int prevNo = expdArr[i -d-1];
        if(arr[prevNo] !=0 ) arr[prevNo]--;
        
        arr[expdArr[i-1]]++;
    }

    public static double findMedian(int[] arr, int d){
        // printArray(arr);
        int countSoFar=0;
        for(int i=0; i<arr.length; i++){
            countSoFar += arr[i];
            // for odd length median is arr[middle]
            if(d%2 ==1 && countSoFar >= (d/2 + 1)){
                return i;
            } else if(d%2 ==0 && countSoFar >= (d/2)){
                // for even length median is (arr[middle] + arr[middle])2
                if(countSoFar > d/2){
                    return ((double)i+i)/2;
                } else {
                    int j = i+1;
                    while(j == 0) j++;
                    return ((double)i+j)/2;
                }
            }
            // countSoFar += arr[i]; 
        }
        return -1;
    }

    // static void printArray(int[] arr){
    //     for(int i=0; i<10; i++){
    //         System.out.println("Array");
    //         System.out.println("i="+arr[i]);
    //     }
    // }

    // Complete the activityNotifications function below.
    static int activityNotifications(int[] expenditure, int d) {

        if( expenditure.length <= d) return 0;

        int[] arr = new int[201];
        for(int i=0; i<d; i++){
            arr[expenditure[i]]++;
        }

        int i=d;
        int count=0;
        while(i < expenditure.length){
            updateArray(arr,expenditure,i,d);
            double median = findMedian(arr,d);
            if(expenditure[i] >= 2* median) {
                // System.out.println("for i, median "+i+","+ median);
                count++;
            }
            i++;
        }
        return count++;
    }