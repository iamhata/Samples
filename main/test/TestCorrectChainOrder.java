package test;

import static org.junit.Assert.*;

import org.junit.Test;

import patterns.Decorator.CompressingStream;
import patterns.Decorator.EncodingStream;
import patterns.Decorator.FileStream;
import patterns.Decorator.Stream;

public class TestCorrectChainOrder {

	@Test
	public void testCorrectChainOrder() {
		Stream encodedAndCompressedStream = new EncodingStream(
				new CompressingStream(
						new FileStream("./a.txt")));
		encodedAndCompressedStream.writeString("User=Teddy");
		encodedAndCompressedStream.writeInt(8080);
		encodedAndCompressedStream.handleBufferFull();
	}

}
