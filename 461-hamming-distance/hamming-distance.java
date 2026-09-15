class Solution {
    public int hammingDistance(int x, int y) {
        int res=x^y;
        return Integer.bitCount(res);
    }
}