## the Sorting package include sevral algorithms of sorting ##
------------------------------------------------------------------
UnSortableException.java contains the exception class which would
be thrown when the array is un-sortable.

UnSortableException e = new UnSortableExcetion();
System.out.println(e.getMessage());
------------------------------------------------------------------
Insertion.java implements the insertion sorting algorithm.

int[] toBeSorted = null;
/*........*/
Insertion insertion = new Insertion(toBeSorted);
toBeSorted = insertion.sort();
------------------------------------------------------------------
MergeSort.java implements the merge sorting algorithm.

int[] toBeSorted = null;
/*........*/
MergeSort merge = new MergeSort(toBeSorted);
toBeSorted = merge.sort();
------------------------------------------------------------------


