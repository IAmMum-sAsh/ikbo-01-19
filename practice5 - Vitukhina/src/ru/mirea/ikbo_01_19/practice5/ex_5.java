package ru.mirea.ikbo_01_19.practice5;

public class ex_5 {

    ex_5(int n){
        rec(n, 0);
    }

    public void rec(int n, int s){
        if(n==0){System.out.println(s);}
        else{
            s+=n%10;
            rec(n/10, s);
        }

    }

}
