public class day1{
    public int getSecondLargest(int[] arr) {
        // code here
        // code here
    if(arr.length<2){
        return -1;
    }
    int largest=Integer.MIN_VALUE;
    int secondlargest=Integer.MIN_VALUE;
    
    for(int num:arr){
        if(num>largest){
            secondlargest=largest;
            largest=num;
        }else if(num>secondlargest && num!=largest){
            secondlargest=num;
        }
    }return (secondlargest==Integer.MIN_VALUE)?-1:secondlargest;
    }
}