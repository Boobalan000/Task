import java.util.Stack;

class StackExample{

    Stack<Integer> stack=new Stack<>();

    //method to add
    public void addNumber(int num)
    {
        stack.push(num);
    }

    //method to remove
    public void removeNumber()
    {
        stack.pop();
    }

    //method to display
    public void displayNumbers()
    {
        System.out.println(stack);
    }

    public static void main(String[] args) {

       StackExample se=new StackExample();
        
        se.addNumber(10);
        se.addNumber(20);
        se.addNumber(30);
        se.addNumber(40);
        se.addNumber(50);

        se.displayNumbers();

    }
}