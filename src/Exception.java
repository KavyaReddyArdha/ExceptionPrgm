class Vote extends Exception{
    Vote(String msg){
        super(msg);
    }


}
class IOException extends Throwable {
    public static void main(String args[]) throws Exception{
int age=15;
if (age>=18)
    System.out.println("Elliglible for voting");
else
    throw new Vote("Not Elligible for voting");
    }
}
