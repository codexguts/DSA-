class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer>  row = new ArrayList<>();

        long current =1;
        row.add(1);

        for(int col=1; col<=rowIndex; col++){
            current = current * (rowIndex - col +1)/col;

            row.add((int) current);
        }
        return row;
    }
}