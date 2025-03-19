class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        List<List<Integer>> answer = new ArrayList<>();
        int i = 0;
        int j = 0;
        while((i < nums1.length) && (j < nums2.length)) {
            answer.add(new ArrayList<Integer>());
            if (nums1[i][0] == nums2[j][0]) {
                answer.get(answer.size() - 1).add(nums1[i][0]);
                answer.get(answer.size() - 1).add(nums1[i][1] + nums2[j][1]);
                i++;
                j++;
            } else if (nums1[i][0] < nums2[j][0]) {
                answer.get(answer.size() - 1).add(nums1[i][0]);
                answer.get(answer.size() - 1).add(nums1[i][1]);
                i++;
            } else if (nums1[i][0] > nums2[j][0]) {
                answer.get(answer.size() - 1).add(nums2[j][0]);
                answer.get(answer.size() - 1).add(nums2[j][1]);
                j++;
            }

            if ((i == nums1.length) && (j != nums2.length)) {
                nums1[i-1][0] = nums2[j][0];
                nums1[i-1][1] = 0; 
                i = i-1;
            } else if ((j == nums2.length) && (i != nums1.length)) {
                nums2[j-1][0] = nums1[i][0];
                nums2[j-1][1] = 0;
                j = j-1; 
            }
        }

        int ans[][] = new int[answer.size()][2];
        for(i = 0; i < answer.size(); i ++) {
            ans[i][0] = answer.get(i).get(0);
            ans[i][1] = answer.get(i).get(1);
        }

        return ans;
    }
}