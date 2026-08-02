class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()) return true;
        int l=0;
        int r=s.length()-1;
        while(l<=r){
            char curr=s.charAt(l);
            char last=s.charAt(r);
            if(!Character.isLetterOrDigit(curr)){
                l++;
            }
            else if(!Character.isLetterOrDigit(last)){
                r--;
            }
            else{
                if(Character.toLowerCase(curr)!=Character.toLowerCase(last)){
                     return false;
            }
            l++;
            r--;
            }
        }
        return true;
    }
      
    
}