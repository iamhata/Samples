package patterns.singleton;

public class FileSystem1 {
	private static volatile FileSystem1 myFileSystem1 = null;
	
	public static FileSystem1 getInstance(){
		if(null == myFileSystem1){
			synchronized(FileSystem1.class){
				if(null == myFileSystem1){
					myFileSystem1 = new FileSystem1();
					
				}
			}
		}
		return myFileSystem1;
	}

}
