class Solution {
    public int lengthOfLongestSubstring(String s) {

        boolean[] seen = new boolean[128]; 

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            char current = s.charAt(right);
            while (seen[current]) {
                seen[s.charAt(left)] = false;
                left++;
            }

            seen[current] = true;
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}