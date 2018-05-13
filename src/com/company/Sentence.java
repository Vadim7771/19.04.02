package com.company;

public class Sentence {
    public final String podstroka="never";
    int i=0;
    public void zamena( Word b,int cs)
    {
        for( i=0;i<cs;i++)
        for(int q=0;q<b.slovo[i].length();q++)
        if(q>b.colslov-1) b.slovo[i]=podstroka;
    }

}
