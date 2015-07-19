package algorithm;

import java.util.List;

public class SimpleSelectionSort {

	public static void main(String[] args) {
		int[] list = {3,90,5,48,9,23,48,1,99};
		//BubbleSort.BubbleSort_formal(list);
		
		SimpleSelectionSort.SelectSort(list);
		
		for(int i = 0 ;i <list.length; i++){
			System.out.println("["+i+"]:"+list[i]);
		}

	}
	public static void SelectSort(int[] list){
		int min = 0;
		for(int i = 0 ; i <list.length; i++){
			min = i;
			for(int j = i+1; j <=list.length-1; j++){
				if(list[min]>list[j]){
					min = j;
				}
			}
			if(i!=min){
				swap(list,i,min);
			}
			//System.out.print(i+":");
			//for(int k = 0; k < list.length;k++){
			//	System.out.print(list[k]+",");
			//}
			//System.out.println("****************");
			//System.out.println("["+i+"]:"+list[i]);
		}
	}
	public static void swap(int[] list,int i, int j){
		int temp = list[i];
		list[i] = list[j];
		list[j] = temp;
	}
}
