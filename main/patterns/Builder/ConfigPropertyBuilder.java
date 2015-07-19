package patterns.Builder;

public interface ConfigPropertyBuilder {
	void platform(String aValue);
	void timeout(int aValue);
	void location(String aPath);
	String build() throws ConfigurationError;

}
