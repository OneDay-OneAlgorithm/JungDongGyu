class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int cnt = 0;
        s = s.toLowerCase();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='p') cnt++;
            else if(s.charAt(i)=='y') cnt--;
        }

        return cnt == 0 ? true : false;
    }
}