package patterns.Decorator;

public class EncodingStream extends StreamDecorator {
	public EncodingStream(Stream aStream){
		super(aStream);
	}
	@Override
	public void handleBufferFull(){
		//encode the _component._buffer data member, and 
		//call _component.handleBufferFull();
		System.out.println("Encoding stream...");
		_component.handleBufferFull();
	}

}
