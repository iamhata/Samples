package patterns.Decorator;

public class FileStream extends Stream {
	
	public FileStream(String aFileName){
		
	}

	@Override
	public void writeInt(int aInt) {
		// TODO Auto-generated method stub

	}

	@Override
	public void writeString(String aString) {
		// TODO Auto-generated method stub

	}

	@Override
	public void handleBufferFull() {
		// TODO Auto-generated method stub
		System.out.println("Write data to the file...");
	}

}
