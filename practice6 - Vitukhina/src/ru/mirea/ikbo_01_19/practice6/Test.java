package ru.mirea.ikbo_01_19.practice6;

import java.util.Scanner;

public class Test {

    public static SortingStudentsByGPA[] sortArray(SortingStudentsByGPA[] array){
        if (array == null) { return null; }

        if (array.length < 2) { return array; }

        SortingStudentsByGPA[] array1 = new SortingStudentsByGPA[array.length / 2];
        System.arraycopy(array, 0, array1, 0, array.length / 2);

        SortingStudentsByGPA[] array2 = new SortingStudentsByGPA[array.length - array.length / 2];
        System.arraycopy(array, array.length / 2, array2, 0, array.length - array.length / 2);

        array1 = sortArray(array1);
        array2 = sortArray(array2);

        return mergeArray(array1, array2);
    }

    public static SortingStudentsByGPA[] mergeArray(SortingStudentsByGPA[] array1, SortingStudentsByGPA[] array2) {
        SortingStudentsByGPA[] result = new SortingStudentsByGPA[array1.length + array2.length];
        int i = 0, j = 0;

        for (int k = 0; k < result.length; k++) {
            result[k] = new SortingStudentsByGPA();
            if (i > array1.length-1) {
                result[k].setGpa(array2[j].getGpa()); result[k].setSurname(array2[j].getSurname());
                j++;
            } else if (j > array2.length-1) {
                result[k].setGpa(array1[i].getGpa()); result[k].setSurname(array1[i].getSurname());
                i++;
            } else if (array1[i].compareTo(array2[j]) < 0) {
                result[k].setGpa(array1[i].getGpa()); result[k].setSurname(array1[i].getSurname());
                i++;
            } else {
                result[k].setGpa(array2[j].getGpa()); result[k].setSurname(array2[j].getSurname());
                j++;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите кол-во студентов в первом списке: "); int size = scan.nextInt();
        SortingStudentsByGPA[] array1 = new SortingStudentsByGPA[size];

        for (int i = 0; i < size; i++){
            System.out.print("Фамилия " + (i+1) +" студента = "); String surname = scan.next();
            System.out.print("Среднй балл " + (i+1) +" студента = "); int b = scan.nextInt();
            SortingStudentsByGPA a = new SortingStudentsByGPA(surname, b);
            array1[i] = a;
        }

        System.out.print("\nВведите кол-во студентов во втором списке: "); size = scan.nextInt();
        SortingStudentsByGPA[] array2 = new SortingStudentsByGPA[size];

        for (int i = 0; i < size; i++){
            System.out.print("Фамилия " + (i+1) +" студента = "); String surname = scan.next();
            System.out.print("Среднй балл " + (i+1) +" студента = "); int b = scan.nextInt();
            SortingStudentsByGPA a = new SortingStudentsByGPA(surname, b);
            array2[i] = a;
        }

        SortingStudentsByGPA[] result = mergeArray(sortArray(array1), sortArray(array2));

        System.out.print("\nОтсортировано: \n");
        for (int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }
    }
}

/*
    5
    Петров 3
    Внсечкин 5
    Игоренко 11
    Фёдоров 2
    Иисус 666
    3
    Каин -99
    Транзакция 72
    Тупик 0
 */
