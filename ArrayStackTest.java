public class ArrayStackTest {
    public static void main(String[] args)
    {
        ArrayStack<String> stack = new ArrayStack<>();
        System.out.println(stack.size());
        System.out.println(stack.size()!=0);
        try{
            stack.push("1");
            stack.push("2");
            stack.push("3");
            System.out.println(stack.size());
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
