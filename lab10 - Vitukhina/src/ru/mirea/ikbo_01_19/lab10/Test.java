package ru.mirea.ikbo_01_19.lab10;

public class Test {//Character.isDigit('c')

    public static <E> void convert(E[] arr){
        UniversalArray<E> universalArray = new UniversalArray<E>();
        universalArray.setArr(arr);

        System.out.print("Преобразование совершено:");
        for(int i=0; i<universalArray.size(); i++){
            System.out.print(" " + universalArray.getElementByIndex(i));
        }
        System.out.println();
    }

    public static void main(String[] args){
        Integer[] intArr = {1227, 13, 65, 72, 56, 22};
        convert(intArr);

        String[] strArr = {"Зачем,", "зачем", "под", "ногами", "земля?"};
        convert(strArr);
    }

}
