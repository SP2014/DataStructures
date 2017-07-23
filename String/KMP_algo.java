import java.util.*;
import java.lang.*;
import java.io.*;


class KMP
{
	char[] T; // Array to hold actual string
	char[] P; //Array to hold pattern string
	int[] F; // Prefix table
	public KMP(String str,String pat){
		T = str.toCharArray();
		P = pat.toCharArray();
		F = new int[P.length];
		buildPrefixTable();
	}
	
	private void buildPrefixTable(){
		int i = 1;j=0;
		F[0] = 0;
		while(i<P.length){
			if(P[i]==P[j]){
				F[i] = j+1;
				i++;j++;
			}
			else if(j>0){j=F[j-1];}
			else{
				F[i]=0;
				i++;
			}
		}
	}
	
	public int search(){
		int i=0,j=0;

		while(i<T.length){
			if(T[i]==P[j]){
				if(j==P.length-1){ return (i-j);}
				else{i++;j++;}
			}
			else if(j>0) j = F[j-1];
			else i++;
		}
		return -1;
	}

	
}