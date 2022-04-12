public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        for (int i = triangle.size() - 1; i >= 0; i --){
            List<Integer> row = triangle.get(i);
            for (int j = 0; j < row.size(); j ++){
                if (i == triangle.size() - 1){
                    res.add(row.get(j));
                }
                else{
                    res.set(j, Math.min(res.get(j),res.get(j+1)) + row.get(j));
                }
            }
        }
        return res.get(0);
    }
}