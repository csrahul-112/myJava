/*
 We are given a bar of chocolate composed of mn square pieces. One should break the chocolate into single squares. Each break of a part of the chocolate is charged a cost expressed by a positive integer. This cost does not depend on the size of the part that is being broken but only depends on the line the break goes along. Let us denote the costs of breaking along consecutive vertical lines with x1, 2, .., xm-1 and along horizontal lines with y1, 2, .., yn-1.
Compute the minimal cost of breaking the whole chocolate into single squares

Solution:
Sort The Costs of Horizontal and vertical in Decreasing Order 
1 All cuts will be made -> so Order of cuts will be deciding the final cost.
2 After each cut peices will increase so cut expensive cuts first
3 for every vertical cut cost = cost of vertical cut * horizontal peices
4 Same as point 3 for horizontal cut

psudo code 
Sort cost -> Decreasing Order 
int h and v = 0
int hp = 1, vp =1;
while(h < hor.length && v < ver.length){
    (h < v){
        vertical cut (cost, vp, hp);
    }else{
        hp
    }
}
 */

import java.util.*;

public class ChocolaProblem {

    static int minCostToCutChocolate(Integer[] costHor, Integer[] costVer, int n, int m){
        
        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());

        int v = 0, h = 0, vPeices = 1, hPeices = 1;
        int totalCost = 0;
        while(v < costVer.length && h < costHor.length){
            if (costVer[v] >= costHor[h]) {
                if (h > 0) {
                    totalCost += costVer[v] * hPeices;
                }else{
                    totalCost += costVer[v];
                }
                vPeices++;
                v++;
            }else {
                if (v > 0) {
                    totalCost += costHor[h] * vPeices;
                }else{
                    totalCost += costHor[h];
                }
                hPeices++;
                h++;
            }
        }
        while(v < costVer.length){
            if (h > 0) {
                totalCost += costVer[v]*hPeices;
            }else{
                totalCost += costVer[v];
            }
            vPeices++;
            v++;
        }
        while(h < costHor.length){
            if (v > 0) {
                totalCost += costHor[h] * vPeices;
            }else{
                totalCost += costHor[h];
            }
            hPeices++;
            h++;
        }

        return totalCost;
    }
    public static void main(String args[]){
        int n = 4, m = 6;
        Integer costVer[] = {2, 1, 3, 1, 4};
        Integer costHor[] = {4, 1, 2};

        System.out.println("The Minimum Cost of Cutting Chocolate is : " + minCostToCutChocolate(costHor, costVer, n, m));


    }
}
