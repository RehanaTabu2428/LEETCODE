class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int r=ransomNote.length();
        int m=magazine.length();
        if(r>m) return false;
        int[] arr=new int[26];
        for(int i=0;i<m;i++){
          arr[magazine.charAt(i)-'a']++;
        }

        for(int i=0;i<r;i++){
            arr[ransomNote.charAt(i)-'a']--;

            if(arr[ransomNote.charAt(i)-'a']<0) return false;
        }
        return true;
    }
}