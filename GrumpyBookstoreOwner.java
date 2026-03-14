public class GrumpyBookstoreOwner {
      public static int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
      int customer = 0;
      for(int i=0;i<customers.length;i++){
        if(grumpy[i]==0)customer+=customers[i];
      }
      int extra =0;
      int max_extra = Integer.MIN_VALUE;
      for(int i=0;i<minutes;i++){
        if(grumpy[i]==1)extra+=customers[i];
      }
      max_extra = Math.max(extra, max_extra);
      for(int i =1;i<=customers.length-minutes;i++){
        if(grumpy[i-1]==1)extra = extra-customers[i-1];
        if(grumpy[i+minutes-1]==1)extra = extra+customers[i+minutes-1];
        max_extra = Math.max(extra, max_extra);
      }
      return customer+max_extra;
    }
    public static void main(String[] args) {
       int[] customers ={1,0,1,2,1,1,7,5};
        int[] grumpy={0,1,0,1,0,1,0,1};
     int minutes =3;
     System.out.println(maxSatisfied(customers, grumpy, minutes));
    }
}