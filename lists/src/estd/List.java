package estd;

public interface List<T> extends Iterable<T>{

	void add(T value);
	
	boolean contains (T value);
	
	long getSize();
}
