package patterns.singleton;

public class FileSystem {
	private static final FileSystem myFileSystem = new FileSystem();
	
	protected FileSystem(){};
	
	public static synchronized FileSystem getInstance(){
		return myFileSystem;
	}

}
