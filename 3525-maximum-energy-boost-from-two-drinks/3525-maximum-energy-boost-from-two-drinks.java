class Solution {

    public long maxEnergyBoost(int[] energyDrinkA, int[] energyDrinkB) {
        long a0 = 0, a1 = 0, b0 = 0, b1 = 0;
        int n = energyDrinkA.length;
        for (int i = 0 ; i < n; i++) {
            a1 = Math.max(energyDrinkA[i] + a0, b0);
            b1 = Math.max(energyDrinkB[i] + b0, a0);
            a0 = a1;
            b0 = b1;
        }

        return Math.max(a1,b1);
    }
}