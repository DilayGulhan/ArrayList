package ArrayList;

public class ArrayList<T> implements IArrayList<T>{

	  private static final int defaultCapacity = 10;
	  private T[] itemArray ;
	  
	  private int itemNo;
	
	  
	  
	  ArrayList(){
		  this(defaultCapacity);
		  
		  
	  }
	  ArrayList(int capacity){
		  itemArray = (T[])new Object[capacity] ;
		  itemNo = 0 ;
		  
	  }
	
	
	
	@Override
	public void add(T item) {
		if(itemNo == itemArray.length) {
			increaseCapacity();
		}
		itemArray[itemNo]= item ;
		itemNo ++ ;
		
	}

	@Override
	public void add(int index, T item) {
		if(itemNo == itemArray.length) {
			increaseCapacity();
		}
		
		else {
			T[]tempItems = (T[]) new Object[itemNo*2] ;
			tempItems[index] = item ;
			for(int i = 0 ; i< index ; i++) {
				tempItems[i] = itemArray[i] ;
			}
			for (int i = (index) ; i<itemNo ; i++) {
				tempItems[i+1] = itemArray[i];
			}
			itemNo ++ ;

			itemArray = tempItems;
		}
				
	}

	@Override
	public T remove(int index) {
		T[]tempItems = (T[]) new Object[itemNo*2] ;
		T removedIndex = itemArray[index];
		itemArray[index] = null ;
		for(int i =0; i<index ; i++) {
			tempItems[i]= itemArray[i];
			
		}
		for (int i = index; i < itemNo-1 ; i++) {
			tempItems[i] = itemArray[i+1] ;
			
		}
		itemNo-- ;
		itemArray= tempItems ;
		
		return removedIndex ;
	}

	@Override
	public void clear() {
		if(isEmpty()) {
			throw new IllegalStateException("The list is empty");
		}
		for(int i = 0 ; i< itemNo ; i++) {
			itemArray[i] = null ;
		}
		
	}

	@Override
	public T replace(int index, T item) {
		itemArray[index] = item ;
		return itemArray[index];
	}

	@Override
	public T getEntry(int index) {
		// TODO Auto-generated method stub
		return itemArray[index];
	}

	
	

	@Override
	public boolean contains(T item) {
	for (int i = 0 ; i< itemNo; i++) {
		if(itemArray[i] == item ) {
			return true ;
		}
		
			
	}
	return false;
		
	}

	@Override
	public Integer getLength() {
		
		
		return itemNo;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return itemNo== 0;
	}
	public void increaseCapacity() {
		T[] increaseItems = (T[]) new Object[(itemNo+1)*2];
		for(int i = 0 ; i< itemNo ; i++) {
			increaseItems [i] =itemArray [i]; 
			
		}
			}
	@Override
	public T[] toArray() {
		T[] newArray = (T[])new Object [itemNo];
		for(int i = 0 ; i< itemNo; i++ ) {
			newArray[i]= itemArray[i];
		}
		return newArray;
	}
	public String toString() {
		
	 String result = "";

    for (int i = 0; i < itemNo; i++)
        result = ""+result + itemArray[i].toString() + " ";
    
    return result;
}
	

	

}
