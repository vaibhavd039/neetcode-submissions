class Solution {
    public int trap(int[] height) {
        int maxIndex = 0;

        // Find highest bar
        for (int i = 1; i < height.length; i++) {
            if (height[i] > height[maxIndex]) {
                maxIndex = i;
            }
        }

        int totalWater = 0;

        // Left side
        int leftMax = 0;
        for (int i = 0; i <= maxIndex; i++) {
            leftMax = Math.max(leftMax, height[i]);
            totalWater += leftMax - height[i];
        }

        // Right side
        int rightMax = 0;
        for (int i = height.length - 1; i >= maxIndex; i--) {
            rightMax = Math.max(rightMax, height[i]);
            totalWater += rightMax - height[i];
        }

        return totalWater;
    }
}