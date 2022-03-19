class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        ArrayList<Integer> a=new ArrayList<Integer>();
        int r=matrix.length;
        int c=matrix[0].length;
        int top=0;
        int bottom=r-1;
        int left=0;
        int right=c-1;
        while(top<=bottom&&left<=right)
        {
            for(int i=left;i<=right;i++)
            {
                a.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++)
            {
                a.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom)
            {
                for(int i=right;i>=left;i--)
                {
                    a.add(matrix[bottom][i]);
                }
                bottom--;
                
            }
            if(left<=right)
            {
                for(int i=bottom;i>=top;i--)
                {
                    a.add(matrix[i][left]);
                }
                left++;;
                
            }
        }
        return a;
    }
}