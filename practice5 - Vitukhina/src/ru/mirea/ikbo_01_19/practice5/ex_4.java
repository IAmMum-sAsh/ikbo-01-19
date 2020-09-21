package ru.mirea.ikbo_01_19.practice5;

public class ex_4 {

    ex_4(){}

    ex_4(int k, int s){
        System.out.print(rec(k, s, 0, 0));
    }

    public int rec(int k, int s, int st, int sum){
        if(st == k){
            if(sum == s){return 1;}
            else{return 0;}
        }
        else{
            int count = 0;
            int c = (st == 0 ? 1 : 0);
            for(int i=c; i<10; i++){
                count += rec(k, s, st+1, sum+i);
            }
            return count;
        }
    }
}
