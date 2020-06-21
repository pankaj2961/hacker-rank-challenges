 /**
        1. create 2 map 1 for storing count for each number and 2nd for quering the count
        2. for new no add operation increment count in countMap and increment in query map as well 
        3. for existing no add operation increment count in countMap and increment and decrement in query map 
        4. for delete operation decrement in both queryMap and countMAp 


    */

    // Complete the freqQuery function below.
    static List<Integer> freqQuery(List<List<Integer>> queries) {

        List<Integer> output = new ArrayList<>();
        Map<Integer,Integer> countMap = new HashMap<>();
        Map<Integer,Integer> queryMap = new HashMap<>();

        int frequencyCount = 0;
        int tempCount = 0;
        int number = 1;
        int operation = 1;

        for (List<Integer> list : queries){
            operation = list.get(0);
            number = list.get(1);
            tempCount = 0;
            
            switch (operation){
                case 1:
                    if(countMap.containsKey(number)){

                        tempCount = countMap.get(number);
                        incrementCountByOne(countMap, number);
                            
                        decrementCountByOne(queryMap,tempCount);
                        incrementCountByOne(queryMap, tempCount+1);

                    } else{
                        countMap.put(number,tempCount+1);

                        incrementCountByOne(queryMap, 1);

                    }
                break;

                case 2:
                    if(countMap.containsKey(number)){

                        tempCount = countMap.get(number);
                        decrementCountByOne(countMap, number);
                            
                        decrementCountByOne(queryMap,tempCount);
                        incrementCountByOne(queryMap, tempCount-1);

                    }
                break;

                case 3:
                    if(queryMap.containsKey(number)) tempCount = queryMap.get(number);

                    if (tempCount  >= 1) tempCount = 1;
                    output.add(tempCount);
                break;
            }
            
        }
        return output;

        



    }

    static void incrementCountByOne( Map<Integer,Integer> queryMap, int key){
        int count = 0;
        if(queryMap.containsKey(key)){
            count = queryMap.get(key);
        }
        queryMap.put(key,count+1);
    }

    static void decrementCountByOne( Map<Integer,Integer> queryMap, int key){
        // int count = 0;
        if(queryMap.containsKey(key)){
            int count = queryMap.get(key);
            if (count-1 ==0 ) queryMap.remove(key);
            else queryMap.put(key,count-1);
        }
    }