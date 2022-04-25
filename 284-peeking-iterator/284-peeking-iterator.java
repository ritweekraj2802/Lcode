// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
    Integer peek = null;
    Iterator<Integer> it;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
        it = iterator;
        peek = null;
	    
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        if (peek == null) {
            peek = it.next();
        }
        return peek;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    if (peek != null) {
            Integer res = peek;
            peek = null;
            return res;
        }
        return it.next();
	}
	
	@Override
	public boolean hasNext() {
	    return peek != null || it.hasNext();
	}
}