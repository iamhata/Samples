package patterns.Decorator;

public class StreamDecorator extends Stream {
	protected Stream _component = null;
	public StreamDecorator(Stream aStream){
		_component = aStream;
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

	}

}
