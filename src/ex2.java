public class ex2 {
    public static void main(String[] args) {
        int[] listNum = {55, 84, 5, 7};
        int lenNum;
        lenNum = listNum.length;
        int maxElem = listNum[lenNum - 1];
        for (int i = 0; i < lenNum; i++) {
            if (listNum[i] > maxElem*maxElem) {
                System.out.println(listNum[i]);
            }
        }
    }
}
