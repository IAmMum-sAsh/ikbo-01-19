package ru.mirea.ikbo_01_19.lab10;

public class UniversalArray <E> {
    private E[] arr;

    public void setArr(E[] arr){
        this.arr = arr;
    }
    public E getElementByIndex(int i){
        return this.arr[i];
    }
    public int size(){
        return this.arr.length;
    }
}
