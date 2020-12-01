class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<Integer>();
        if (rowIndex < 0) return row;
        
        row.add(1);
        for (int currRow = 1; currRow <= rowIndex; currRow++){
            List<Integer> prevRow = new ArrayList<Integer>(row);
            for (int j = 1; j < currRow; j ++) {
                row.set(j, prevRow.get(j-1) + prevRow.get(j));
            }
            row.add(1);
        }

        return row;
    }
}

//若要节省空间，可以从后向前更新；