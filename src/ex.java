// сумма элементов списка
public class ex {
    public static void main(String[] args) {
        int[] listNum = {1, 2, 3 , 4};
        System.out.println(sumElem(listNum, listNum.length - 1));
    }

    static int sumElem(int[] mass, int num) {
        if (num == 0) {
            return mass[0];
        }
        return mass[num] + sumElem(mass, num-1);


    }
}
