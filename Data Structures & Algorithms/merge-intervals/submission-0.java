class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<int[]> list = new ArrayList<>();
        Arrays.sort(intervals, (a,b)-> a[0]-b[0]);
        for(int[] curr: intervals){
            if(list.isEmpty()) list.add(curr);
            else {
                int[] last = list.get(list.size()-1);
                if(last[1]>= curr[0]){
                    last[1] = Math.max(last[1], curr[1]);
                }else{
                    list.add(curr);
                }
            }
        }
        return list.toArray(new int[0][]);
    }
}
