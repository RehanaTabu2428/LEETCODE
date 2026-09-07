class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for(char let:letters){
            if(let>target) return let;
        }
        return letters[0];
    }
}