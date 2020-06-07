// Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {

        long max = 0;
        int[] arr = new int[n+1];
        for (int i=0; i<queries.length;i++){
            arr[queries[i][0]] +=  queries[i][2];
            if(queries[i][1] + 1 <= n)   arr[queries[i][1]+1] -= queries[i][2];
        }
        long sum = 0;
        for (int i=0; i<=n;i++){
            //System.out.println(arr[i]);
            sum += arr[i];
            max = Math.max(sum, max);
        }
        return max;


    }