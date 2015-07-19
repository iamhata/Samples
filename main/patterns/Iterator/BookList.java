package patterns.Iterator;

import java.util.LinkedList;
import java.util.List;

public class BookList implements Aggregatable {
	private List<Book> list;
	
	public BookList(){
		list = new LinkedList<>();
	}
	
	
	private class BookIterator implements Iterator{
		private int position = 0;
		
		@Override
		public boolean hasNext(){
			if(position < list.size())
				return true;
			else
				return false;
		}
		@Override
		public Object next(){
			if(this.hasNext())
				return list.get(position++);
			else
				return new RuntimeException("End of book list");
		}
	}
	
	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return new BookIterator();
	}
	public void addBook(Book aBook){
		list.add(aBook);
	}
	public int size(){
		return list.size();
	}
	public boolean isEmpty(){
		return list.isEmpty();
	}

}
