public class StackA {

    private int maxSize;
    private int top;
    private double []array;

    public StackA(int x){
        maxSize = x;
        top = -1;
        array = new double[maxSize];
    }

    public void push(double x){
        if(top == maxSize - 1){
            System.out.println("Stack is full");
        }else {
            array[++top] = x;
        }
    }

}
