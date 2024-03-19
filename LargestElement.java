public class LargestElement {
    public static void main(String[] args) {
      int array[]={23,24,56,122,53,25,87,90,} ; 

      int largest=array[0];  //here we assuming the first element of array is largest
       
      for(int i=1;i<array.length;i++){
        if(array[i]>largest){
            largest=array[i];
        }
      }
      System.out.println("Largest Element of array is "+largest);
    }
}
