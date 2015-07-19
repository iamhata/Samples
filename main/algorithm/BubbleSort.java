package algorithm;

import java.util.List;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = {3,90,5,48,9,23,48,1,99};
		//BubbleSort.BubbleSort_formal(list);
		
		BubbleSort.BubbleSort_efficiency(list);
		
		for(int i = 0 ;i <list.length; i++){
			System.out.println("["+i+"]:"+list[i]);
		}
		
	}

	public static void BubbleSort(int[] list){
		
		for(int i = 0;i<list.length;i++){	
		
			for(int j = i+1;j< list.length; j++){
				System.out.println ("["+i+"]:,["+j+"]:"+list[j]);
				if(list[i]>list[j]){
					swap(list,i,j);
				}
			}
		}
	}
	public static void BubbleSort_formal(int[] list){
		
		for(int i = 0;i<list.length;i++){	
		
			for(int j =list.length-2;j>=i; j--){
				System.out.println ("["+i+"]:,["+j+"]:"+list[j]);
				if(list[j]>list[j+1]){
					swap(list,j,j+1);
				}
			}
		}
	}
    public static void BubbleSort_efficiency(int[] list){
		
    	boolean flag = true;
		for(int i = 0;i<list.length && flag;i++){
			flag=false;
			for(int j =list.length-2;j>=i; j--){
				System.out.println ("["+i+"]:,["+j+"]:"+list[j]);
				if(list[j]>list[j+1]){
					swap(list,j,j+1);
					flag=true;
				}
			}
		}
	}
	public static void swap(int[] list,int i, int j){
		int temp = list[i];
		list[i] = list[j];
		list[j] = temp;
	}
}
