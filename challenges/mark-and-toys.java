/**
        1. first perform sorting
        2. keep on adding the prices of smallest item untill it reaches budget and simulatneously keep incrementing item count
        3. when toys sum is more than budget return no of item count

    **/

    // Complete the maximumToys function below.
    static int maximumToys(int[] prices, int k) {
        
        mergeSort(prices, 0, prices.length-1);

        int maximumItems = 0;
        int sumTill = 0;
        for(int i=0; i< prices.length; i++){
            sumTill += prices[i];
            if(sumTill > k) return maximumItems;
            maximumItems++;
        }
        return maximumItems;
    }

    static void mergeSort(int[] arr, int low, int high ){

        // int low= 0;
        // int high = arr.length-1;
        int mid = (low+high)/2;

        if(low<high){
            mergeSort(arr, low, mid);
            mergeSort(arr, mid+1, high);
            merge(arr,low,mid, high);
        }
    }

    static void merge(int arr[], int l, int m, int r) 
    { 
        // Find sizes of two subarrays to be merged 
        int n1 = m - l + 1; 
        int n2 = r - m; 
  
        /* Create temp arrays */
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
  
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i) 
            L[i] = arr[l + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = arr[m + 1+ j]; 
  
  
        /* Merge the temp arrays */
  
        // Initial indexes of first and second subarrays 
        int i = 0, j = 0; 
  
        // Initial index of merged subarry array 
        int k = l; 
        while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) 
            { 
                arr[k] = L[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
  
        /* Copy remaining elements of L[] if any */
        while (i < n1) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) 
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 