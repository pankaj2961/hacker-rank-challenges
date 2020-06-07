    // Complete the catAndMouse function below.
    static String catAndMouse(int x, int y, int z) {
        /**
            1. first find absolute difference of distance cat a and mouse  and similarly for cat b and mouse
            2. if distance is same then mouse escape
            3. otherwise closest distance cat will get mouse

        */

        int catADistance = Math.abs(x-z);
        int catBDistance = Math.abs(y-z);

        if(catADistance == catBDistance) return "Mouse C";
        if(catADistance < catBDistance) return "Cat A";
        else return "Cat B";

    }