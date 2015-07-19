package patterns.Decorator;

public abstract class Stream {
	protected byte[] _buffer = new byte[1024];
	
	public Stream(){}
	public abstract void writeInt(int aInt);
	public abstract void writeString(String aString);
	public abstract void handleBufferFull();

}
