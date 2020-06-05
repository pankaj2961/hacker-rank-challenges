public class Solution {

    /**
        1. loop through an array and check if arr[i] == i+1 or not 
        2. if present then increment i
        3. if not then check in cache if we already have entry or not if yes then swap and increment swap count and update cache
        4. if not then we need to traverse from the point ie max(i, j) where j is point where we previously stopped looking value

    */

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {

        int noOfSwap = 0,temp=0, j=0, currentVal = 0;
        Map<Integer,Integer> cacheMap = new HashMap<>();
        for (int i=0; i<arr.length; i++){
            currentVal = i+1;
            // if correct value is present at location i
            if(arr[i] == currentVal){
                //swapTwoVAlue(arr, i, i+1);
                if(cacheMap.get(currentVal) != null){
                    cacheMap.remove(currentVal);
                    continue;
                }
            } else if (cacheMap.get(currentVal) != null){
                // if we already have a entry in our cache for the currentVal
                int index = cacheMap.get(currentVal);
                //System.out.println("---swap for "+ Array.toString(arr));
                noOfSwap++;
                cacheMap.put(arr[i],index);
                cacheMap.remove(currentVal);
                swapTwoVAlue(arr, i, index);
                //printArray(arr);
            }else{
                // here we don't have a entry in our cache and we need to find the correct element to swap with a[i]
                j= Math.max(j,i);
                for (; j<arr.length; j++){
                    if(arr[j] == currentVal){
                        //System.out.println("---swap for "+ Array.toString(arr));
                        noOfSwap++;
                        cacheMap.put(arr[i],j);
                        swapTwoVAlue(arr, i, j);
                        //printArray(arr);
                        break;
                    }else{
                        cacheMap.put(arr[j],j);
                    }
                }
            }
        }
        return noOfSwap;


    }

    static void printArray(int[] arr){
        System.out.println("\n");
        for (int j=0; j<arr.length; j++){
            System.out.println("---swap for "+arr[j]);
        }
    }

    static void swapTwoVAlue(int[] arr, int source, int target){
        int temp=0;
        temp = arr[source];
        arr[source] = arr[target];
        arr[target] = temp;
    }