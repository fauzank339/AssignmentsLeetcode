class Solution {
    public int minPartitions(String n) {
       for(int i = 9; i > 0; i--){
            String s=String.valueOf(i);
            if(n.contains(s)){
                return i;
            }
        }
        return 0;
    }
}