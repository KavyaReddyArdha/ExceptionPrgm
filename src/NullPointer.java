public class NullPointer {
    public static void main(String args[]){
        int a=10,b=0;

        System.out.println("statement-1 and sum="+(a+b));
        try{
            System.out.println("statement-2 and mul="+(a*b));

            System.out.println("statement-3 and div="+(a/b));
            System.out.println("statement-4 and sub="+(a-b));
            throw new ArithmeticException();
        }
        catch (NullPointerException np){
            np.printStackTrace();
        }

    }

}
