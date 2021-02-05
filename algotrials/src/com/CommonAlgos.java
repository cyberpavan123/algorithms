package com;

public class CommonAlgos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println(fibSeries(5));
	}
	
	public static String fibSeries(int series)
	{
		int count=0;
		int first,next;
		StringBuffer strBuf=new StringBuffer("0");
		for(int i=0;i<=series;i++)
		{    first=i;
			next =first+i+1;
			strBuf.append(next);
			strBuf.append(",");
		}
		
		
		return strBuf.toString();
	}
	

}
