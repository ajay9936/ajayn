public class Sorted {

	public static void main(String[] args) {
		int []a = {-3,-1,1,3,5};
        System.out.println(indexOf(1,a) );
         }  private static int indexOf( int j , int[] a ) {
         for( int i1 = 0 ; i1 < a.length ; i1++ ) {
          if( a[i1] == j ) { 
               return i1;
           }
        }
        return -1;
	}

}
