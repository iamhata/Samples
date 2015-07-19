package algorithm;


public class FindString {

	public static void main(String[] args) {
		String s = "googlegood";
		String t = "google";
		
		int pos  = -1;
		int _pos = FindString.Index(s,t);
		System.out.println(_pos);
	}

	private static int Index(String S,String T ){
		int i = 0;
		char[] s = S.toCharArray();
		char[] t = T.toCharArray();
		int j = 1;
		while ( i <= S.length() && j <= T.length()){
			if(s[i] == t[j]){
				++i;
				++j;
			}else{
				i = i - j +2;
				j = 1;
			}
		}
		
		if(j > t[0]){
			return i-t[0];
		}else{
			return 0;
		}
		
		
	}
}
