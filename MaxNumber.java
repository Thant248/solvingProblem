class MaxNumber{
    public static void main(String[] args) {
        int[] number = {5,6,2,7,4};
        System.out.println(maxVlaue(number));
    }

    public static int maxVlaue(int[] number){

        int firstSmall = 0;
        int secondSmall = 0;
        int firstBig = Integer.MAX_VALUE;
        int seocndBig = Integer.MAX_VALUE;

        for(int n : number){

            if(n > firstSmall){
                secondSmall = firstSmall;
                firstSmall = n;
            }else if (n > secondSmall){
                secondSmall  = n;
            }

            if ( n < firstBig){
                seocndBig = firstBig;
                firstBig = n;
        }else if (n < seocndBig) {
                seocndBig = n;
            }
        }
        
        return  (firstSmall*secondSmall) - (firstBig*seocndBig) ;
    }
}