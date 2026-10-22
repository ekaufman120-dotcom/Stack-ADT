public class ArrayStackTest {
    public static void main(String[] args)
    {
        LinkedStack<String> stack = new LinkedStack<>();
        System.out.println(stack.size());
        //System.out.println(stack.size()!=0);
        try{
            for(int i = 10; i > 0; --i) {
                stack.push(new String("#"+i));
                System.out.println(stack.search("#"+(i+1)));
            }
            stack.clear();
            System.out.println(stack.size());
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
