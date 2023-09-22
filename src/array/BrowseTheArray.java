package array;

import java.util.ArrayList;

public class BrowseTheArray {
    public void Arr() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }

    }

    public void CheckNegative() {
        int[] arr = {1, 2, -3, 5, -6, 7, 8, -9, 10};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                System.out.println(arr[i]);
            }
        }
    }

    public void CheckLagerNumber() {
        int[] arr = {1, 2, -3, 5, -6, 7, 8, -9, 10};
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] > arr[i]) {
                System.out.println(arr[i + 1]);

            }
        }
    }

    public void TotalOddPosition() {
        int EvenTotal = 0;
        int oddSum = 0;
        int[] number = {1, 5, 3, 5, 7, 4, 8, 9, 6, 4, 6, 8};
        for (int i = 0; i < number.length; i++) {
            if (i % 2 != 0) {
                oddSum += number[i];
            } else if (i % 2 == 0) {
                EvenTotal += number[i];
            }
        }
        if (oddSum > EvenTotal) {
            System.out.println("Số lẻ nhiều hơn số chẵn");
        } else {
            System.out.println("Số chẵn nhiều hơn số lẻ");
        }
        System.out.println(oddSum);
        System.out.println(EvenTotal);
    }

    public void FindMax() {
        int[] number = {4, 5, 6, 54, 52, 8, 54, 3, 6, 9};
        int maxIndex = number[0];
        for (int i = 0; i < number.length; i++) {
            if (maxIndex < number[i]) {
                maxIndex = number[i];
            }
        }
        System.out.println(maxIndex);
    }

    public void FindMax2toArr() {
        int[] number = {7, 6, 1, 4, 6, 9, 5, 7, 9, 4, 2, 5, 7, 8};
        int max1 = number[0];
        int max2 = 0;
        for (int i = 0; i < number.length; i++) {
            if (max1 < number[i]) {
                max2 = max1;
                max1 = number[i];
            }
            if (number[i] < max1 && number[i] > max2) {
                max2 = number[i];
            }
        }
        System.out.println(max1);
        System.out.println(max2);
    }

    public void FindMaxToWay() {
        int number[][] = {{1, 23, 4, 5, 3, 54}, {5, 6, 3, 5, 7, 3, 6, 8}, {8, 5, 7, 9, 9, 3, 23, 4, 6, 76}};
        int maxToWay = number[0][0];
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                if (number[i][j] > maxToWay) {
                    maxToWay = number[i][j];
                }
            }
        }
        System.out.println(maxToWay);
    }

    public void TotalElement() {
        int Total = 0;
        int[] number = {5, 6, 7, 8, 23, 4, 6};
        for (int i = 0; i < number.length; i++) {
            Total += number[i];
        }
        System.out.println(Total);
    }

    public void DivisibleBy3() {
        int[] number = {1, 5, 67, 4, 5, 7, 4, 4, 567, 8, 9, 6, 45, 3};
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 3 == 0) {
                sum += number[i];
            }
        }
        System.out.println(sum);
    }

    public void AverageOfTheElements() {
        int[] number = {4, 5, 6, 34, 23, 4, 5, 7, 8, 5};
        double AvgElement = 0;
        int count = 0;
        for (int i = 0; i < number.length; i++) {
            AvgElement += number[i];
            count++;
        }
        System.out.println(AvgElement / count);
    }

    public void checkAscendingArray() {
        boolean check = false;
        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 8};
        for (int i = 0; i < number.length - 1; i++) {
            if (number[i] < number[i + 1]) {
                check = true;
            } else {
                check = false;
                System.out.println("Kết quả là " + check);
                return;
            }
        }
        System.out.println("Kết quả là " + check);
    }

    public void CheckNumberInArrayNumber() {
        boolean check;
        int[] numberA = {1, 2, 3};
        int[] numberB = {1, 2, 4, 1, 2, 3, 5};
        if (numberA.length > numberB.length) {
            System.out.println("không thể kiểm tra");
            return;
        }
        for (int i = 0; i < numberA.length; i++) {
            check = false;
            for (int j = 0; j < numberB.length; j++) {
                if (numberA[i] == numberB[j]) {
                    check = true;
                }
            }
            if (!check) {
                return;
            }
        }
        System.out.println("Có");
    }

    public void checkNumberA1InA2() {
        int[] numberA1 = {8 ,8, 8, 5, 4,8};
        int[] numberA2 = {3, 8, 8, 8, 9, 4, 7};
        int lengthA1 = numberA1.length;
        int lengthA2 = numberA2.length;
        int count = 0;
        for (int i = 0; i < lengthA1; i++) {
            for (int j = 0; j < lengthA2; j++) {
                if (numberA1[i] == numberA2[j]) {
                    count+=1;
                    numberA1[i] = 0;
                    numberA2[j] = 0;
                    break;
                }
            }
        }
        System.out.println(count);
    }
    public void CheckPeople(){
        int[] people = {2, 3, 4, 4, 2, 1, 3, 1};
        int count = 0;
        int count1 = 0;
        for (int i = 0; i < people.length-1; i++) {
            if(people[i]+people[i+1]%4!=0){
                count+=1;
            }else {
                count1+=2;
            }
        }
        System.out.println(count);
    }
}

