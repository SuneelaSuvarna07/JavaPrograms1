package com.java.program;

import java.util.Random;

public class Zeta2 {

	    private static Random rd = new Random(); 
	    public static void main(String[] args) {
	    //	System.out.println(rd.nextInt(2));
	    StringBuffer word = null;
	    int c = rd.nextInt(2);
	    switch(c) {
	        case 1: word = new StringBuffer('P');
	        break;
	        case 2: word = new StringBuffer('G');
	        break;
	        default: word = new StringBuffer('M');
	        
	       
	    }
	    word.append('a');
	    word.append('i');
	    word.append('n');
	    
	    StringBuffer w=new StringBuffer('C');
	    System.out.println(w);
	    w.append("abc");
	    System.out.println(w);
	    System.out.println(word);
	    
	    char x = 'X';
	    int i = 0;
	    System.out.print(true ? x : 0);
	    System.out.print(false ? i : x);
	    
	}
}
