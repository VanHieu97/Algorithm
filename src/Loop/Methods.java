package Loop;

import java.util.ArrayList;
import java.util.List;

public class Methods {
    public void SquareNumber(int numberA, int numberB) {
        for (int i = numberA; i <= numberB; i++) {
            int a = (int) Math.sqrt(i);
            if (a * a == i) {
                System.out.println("Số chính phương là" + i);
            }

        }
    }

    public void SumSquare(int x, int y) {
        double SumSquare = 0;
        for (int i = x; i <= y; i++) {
            SumSquare += Math.sqrt(i);
        }
        System.out.println(" Tổng là " + SumSquare);
    }
    public List<Integer> Plan() {
        int[] Arr = {5000, 2000, 1000};
        double SumMoney = 20000;
        List<Integer> newArr = new ArrayList<Integer>();
        for (int i = 0; i < Arr.length; i++) {
            double x = SumMoney / Arr[i];
            if (SumMoney % Arr[i] == 0) {
                if (x > 1) {
                    x = x - 1;
                }
            } else {
                x = Math.floor(x);
            }
            newArr.add((int) x);
            SumMoney = SumMoney - x * Arr[i];
        }
        return newArr;
    }
    public void dredgeUp(){
        int moneyA = 5000;
        int moneyB = 2000;
        int moneyC = 1000;
        int sumMoney =20000;
        int count = 0;
        for (int i = 0; i < sumMoney/moneyA; i++) {
            for (int j = 0; j < sumMoney/moneyB; j++) {
                for (int k = 0; k < sumMoney/moneyC; k++) {
                    if(i*moneyA + j*moneyB + k*moneyC == 20000){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
    public void arrange(int a, int b, int c){
        int[] arr = {a,b,c};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr.length; k++) {
                    if(i == j  || j == k || k == i){
                            int Sum = a * (int) Math.pow(10, i -1)+
                                    b* (int) Math.pow(10, j -1)+
                                    c* (int) Math.pow(10, k-1);
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
