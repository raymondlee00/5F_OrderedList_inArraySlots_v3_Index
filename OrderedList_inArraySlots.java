public class OrderedList_inArraySlots
    implements OrderedList {

    private java.util.ArrayList<Integer> list_iAS;


    /**
      @return the index of the first occurrence of
              \findMe in this list, or -1 if
              \findMe is absent from this list.
     */
    public int indexOf( Integer findMe) {
      	this.bSearch_while(findMe.valueOf());
      	//this.bSearch_recursive(0, this.length, findMe.valueOf());
        return -1;
    }


    // ------ code from previous assignments below here ----

    public OrderedList_inArraySlots() {
        list_iAS = new java.util.ArrayList<Integer>();
    }

    /**
      @return the number of elements in this list
     */
    public int size(){
        return list_iAS.size();
    }

    /**
      @return a string representation of this Orderedlist_iAS
     */
    public String toString() {
        return list_iAS.toString();
    }


    /**
      Put @value where it belongs in the list.
      @pre: the list is in increasing order
     */
     public boolean add( Integer value) {
         int dest = 0;
         for( ; dest < list_iAS.size() && list_iAS.get( dest) < value
              ; dest++) ;
         // System.out.println( "OL adding " + value
         //                   + " at index " + dest);
         list_iAS.add( dest, value);
         return true;
     }


     /**
      @return element @index from this list
      precondition: @index is within the bounds of the array.
          (Having warned the user about this precondition,
           you should NOT complicate your code to check
           whether the condition was violated.)
     */
    public Integer get( int index ) {
        return list_iAS.get( index);
    }


    /**
      Remove the element at position @index in this list.
      Shift any subsequent elements to the left (that is,
      decrease the index associated with each).
      @return the value that was removed from the list
     */
    public Integer remove( int index) {
        return list_iAS.remove( index);
    }

  	private int bSearch_while ( int target) {
  		lowerBound = 0;
        upperBound = this.length;
        while (upperBound - lowerBound > 0) {
          	midpoint = (upperBound + lowerBound) / 2;
        	if (list_iAS[midpoint].valueOf().compareTo(target) > 0):
          		lowerBound = midpoint + 1;
          	else if (list_iAS[midpoint].valueOf().compareTo(target) < 0):
              	upperBound = midpoint - 1;
          	else:
          		return midpoint;
        }
  	}

  	private int bSearch_recursive(int left, int right, int target) {
  		mid = (left + right) / 2;
      	if (list_iAS[midpoint].valueOf().compareTo(target) > 0):
          		this.bSearch_recursive(mid + 1, right, target);
      	else if (list_iAS[midpoint].valueOf().compareTo(target) < 0):
              	this.bSearch_recursive(left, mid - 1, target);
        else:
          		return midpoint;
    }
}
