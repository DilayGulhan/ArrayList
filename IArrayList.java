package ArrayList;

public interface IArrayList<T> {
public void add(T item ) ;
public void add ( int index  , T item) ;
public T remove(int index) ;
public void clear() ;
public 	T replace (int index , T item);
public T getEntry( int index);
public T[] toArray();

public boolean contains (T item);
public Integer getLength();
public boolean isEmpty();


}
