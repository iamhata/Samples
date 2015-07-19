package patterns.Decorator;

public class CompressingStream extends StreamDecorator {
	public CompressingStream(Stream aStream){
		super(aStream);
	}
	@Override
	public void handleBufferFull(){
		//compress the _component._buffer data member , and 
		//call _component.handleBufferFull();
		System.out.println("Compressing stream...");
		_component.handleBufferFull();
	}

}
