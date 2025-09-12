class Solution {
    public static int minCost(int n, int m, int[] x, int[] y) {
        // code here
     Arrays.sort(x);
     Arrays.sort(y);
     
     int vp=1;
     int hp=1;
     int cost=0;
     int v=x.length-1;
     int h=y.length-1;

     while(v>=0&&h>=0){
         if(x[v]>y[h]){
             cost=cost+(x[v]*hp);
             vp++;
             v--;
         }
         else{
             cost=cost+(y[h]*vp);
             hp++;
             h--;
         }
     }
     
     while(v>=0){
        cost=cost+(x[v]*hp);
        vp++;
        v--;
     }
     
     while(h>=0){
        cost=cost+(y[h]*vp);
        hp++;
        h--;  
     }

     return cost;
    }
}
