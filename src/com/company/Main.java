package com.company;

import java.sql.Array;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner s3=new Scanner(System.in);
        Sentence s1=new Sentence();
        String s44=s3.nextLine();
        int s8=s3.nextInt();
        int q=s3.nextInt();
        String [] s=new String[s8];
        int d=-1;
        String s5=" ";
      char [] c=s44.toCharArray();
        for(int i=0;i<s44.length()-1;i++)
        {
            if(c[i]!=' ')
                s5+=c[i];
            else {if(s5=="") break; d++; s[d]=s5; s5="";}
        }
        Word w1=new Word(s,q);
        s1.zamena(w1,s.length);
        for(int i=0;i<s.length;i++)
        {
            System.out.print(w1.slovo[i]+" ");
        }

    }
}
