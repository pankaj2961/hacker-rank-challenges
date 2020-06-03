    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int noOfJump = 0;
        for (int i=0; i< c.length-1; i++){
            // if next cloud is 1 we don't have option we have to jump by 2
            // if next is 0 and next-> next is also 0 then we can jump by 2 otherwise we have to jump by 1 only
            if(c[i+1] == 1 || (c[i+1] == 0 && i+2< c.length && c[i+2] == 0)){
                i++;
            } 
            noOfJump ++;
        }
        return noOfJump;

    }
