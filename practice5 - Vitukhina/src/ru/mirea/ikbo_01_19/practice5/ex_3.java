package ru.mirea.ikbo_01_19.practice5;

public class ex_3 {

    ex_3(){}

    ex_3(int a, int b){
        if (a>b){rec_Ab(a, b);}
        else {rec_aB(a, b);}
    }

    public void rec_aB(int a, int b){
        if(a>b){
            return;
        }
        else{
            System.out.print(a + " ");
            rec_aB(a+1, b);
        }
    }

    public void rec_Ab(int a, int b){
        if(a<b){
            return;
        }
        else{
            System.out.print(a + " ");
            rec_Ab(a-1, b);
        }
    }
}
