public class MagicSquare {

    /**
     *
     * @param array2d
     * @return the sum of the first row in array2d.
     */
    public static int calculateCheckSum(int[][] array2d) {
        int sum = 0;
        for(int i = 0; i < array2d.length; i++){
            sum = array2d[0][i] + sum;
        }return sum;
    }

    /**
     *
     * @param array2d
     * @param checkSum
     * @return whether the sum of each row in array2d is equal to checkSum or not.
     *         Because we have already determined the sum of the first row
     *         via the method 'calculateCheckSum', this method can begin
     *         iterating from the second row.
     */
    public static boolean magicRows(int[][] array2d, int checkSum) {
        int sum = 0;
        for(int e = 0; e < array2d.length-1; e++){
        for(int i = 0; i < array2d[e].length; i++){
            sum = array2d[0][i] + sum;}

        if (sum != checkSum){
            return false;
            }}
    return true;}

    /**
     *
     * @param array2d
     * @param checkSum
     * @return whether the sum of each column in array2d is equal to checkSum or not.
     */
    public static boolean magicColumns(int[][] array2d, int checkSum) {
        int sum = 0;
        for(int e = 0; e < array2d.length-1; e++){
            for(int i = 0; i < array2d[e].length; i++){
                sum = array2d[i][0] + sum;}
            if (sum != checkSum){
                return false;
            }}
        return true;}


    /**
     *
     * @param array2d
     * @param checkSum
     * @return whether the sum of each of the two main diagonals is equal to checkSum or not.
     */
    public static boolean magicDiagonals(int[][] array2d, int checkSum) {
        int sum = 0; int sum2 = 0;
        for(int e = 0; e < array2d.length -1; e++){
            for(int i = 0; i < array2d[e].length; i++){
                sum = array2d[i][i] + sum;}
            if (sum != checkSum){
                return false;
            }
            for(int i = array2d[e].length - 1; i > 0; i--){
                sum2 = array2d[i][i] + sum;}
            if (sum2 != checkSum){
                return false;
            }}
        return true;}


    /**
     *
     * @param array2d
     * @return whether array2d is magic or not.
     */
    public static boolean isMagic(int[][] array2d) {
        int sum = calculateCheckSum(array2d);
        return magicColumns(array2d, sum) && magicRows(array2d, sum) && magicDiagonals(array2d, sum);
    }

}
