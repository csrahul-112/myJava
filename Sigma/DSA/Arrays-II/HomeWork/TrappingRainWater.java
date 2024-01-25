public class TrappingRainWater {
    public static int waterTrapped(int[] bHeight){
        int waterTrapped = 0;
        //LMB
        int lHeight = Integer.MIN_VALUE;
        int[]LMB = new int[bHeight.length];
        for(int i = 0; i < bHeight.length; i++){
            if(bHeight[i] > lHeight){
                lHeight = bHeight[i];
            }
            LMB[i] = lHeight;
        }

        //RMB
        int rHeight = Integer.MIN_VALUE;
        int[]RMB = new int[bHeight.length];
        for(int i = (bHeight.length-1); i >= 0; i--){
            if(bHeight[i] > rHeight){
                rHeight = bHeight[i];
            }
            RMB[i] = rHeight;
        }

        //Calculation of water trapped
        
        for(int i = 0; i < bHeight.length; i++){
            int wLevel = RMB[i] < LMB[i] ? RMB[i] : LMB[i];
            waterTrapped += (wLevel - bHeight[i]);
        }

        return waterTrapped;
    }
    public static void main(String[] args){
        int[] buildingHeight = {4, 2, 0, 3, 2, 5};
        System.out.println(waterTrapped(buildingHeight));
    }
}
