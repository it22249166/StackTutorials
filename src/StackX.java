public class StackX {

    private int maxSize;
    private double [] stackArray;
    private int top;

    public StackX(int s){
        maxSize = s;
        stackArray = new double[maxSize];
        top = -1;
    }

    public void push(double x){
        if(top == maxSize - 1){
            System.out.println("Stack is full");
        }else{
            stackArray [++top] = x;
    }
}
}
