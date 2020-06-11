    /**
        1. traverse string s and copy it to string p if character is unique ie(not present ) for string p;
        2.  if its not unique then skip that.

    */

    // Complete the stringConstruction function below.
    static int stringConstruction(String s) {

        int cost = 0;
        Set cache = new HashSet<Character>();
        for (int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(!cache.contains(ch)){
                cost++;
                cache.add(ch);
            }
        }
        return cost;
    }