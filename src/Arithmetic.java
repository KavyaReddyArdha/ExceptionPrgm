class Arithmetic {
    public static void main(String[] args){
        int a=10,b=0;
        System.out.println("statement-1 and sum="+(a+b));
        try{
            System.out.println("statement-2 and div="+(a/b));
        }
        catch(ArithmeticException ae){
           ae.printStackTrace();
        }
        System.out.println("statement-3 and sub="+(a-b));
    }

}
