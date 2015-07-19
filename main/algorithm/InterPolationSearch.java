package algorithm;

public class InterPolationSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sourceNum = {0,1,16,24,35,47,59,62,73,88,99};
		int targetNum = 16;
		System.out.println (interPolation_Search(sourceNum,targetNum));

	}
	private static int interPolation_Search(int[] sourceNum,int key ){
		int low,high;
		int mid = 0; 
		
		low = 1;
		high = sourceNum.length -1;
		
		while(low <= high){
			mid = low+(high-low )* (key-sourceNum[low]) /(sourceNum[high] -sourceNum[low]);
			System.out.println("mid:"+mid);
			if(key < sourceNum[mid]){
				high = mid -1;
			}else if (key > sourceNum[mid]){
				low = mid +1;
			}else{
				return mid;
			}
		}
		return mid;
	}
}
