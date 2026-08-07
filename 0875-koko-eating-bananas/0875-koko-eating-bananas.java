class Solution {

    public long canFinish(int[] piles, int mid) {

        long th = 0;

        for (int i = 0; i < piles.length; i++) {

            th += Math.ceil((double) piles[i] / mid);
        }

        return th;
    }


    public int findK(int[] piles, int h, int start, int end, int min) {

        if (start > end) {
            return min;
        }


        int mid = start + (end - start) / 2;


        long hours = canFinish(piles, mid);


        if (hours <= h) {

            // Current speed works, try smaller speed
            min = Math.min(min, mid);

            return findK(piles, h, start, mid - 1, min);

        } 
        else {

            // Speed is too slow, increase speed
            return findK(piles, h, mid + 1, end, min);
        }
    }


    public int minEatingSpeed(int[] piles, int h) {

        int end = 0;


        // Maximum possible speed
        for (int pile : piles) {
            end = Math.max(end, pile);
        }


        return findK(piles, h, 1, end, Integer.MAX_VALUE);
    }
}