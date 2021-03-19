public class ClassNotFound {
        public static void main(String args[]) {
            try {
                Class.forName("The Class do not Exist");
            }
            catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
}
