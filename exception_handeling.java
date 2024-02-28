public class exception_handeling {
    




        public static void main(String[] args) {
            int[] arr = new int [10];
    
            try {
                System.out.println(arr[11]);
            }
            catch (ArrayIndexOutOfBoundsException exception){
                System.out.println("array out of bound");
            }
    
            try {
                System.out.println(100/0);
            }
            catch (ArithmeticException exception){
                System.out.println("Arithmatic exception");
            }
    
            int [][] arrr=new int[10][];
            try {
                System.out.println(arrr[1][0]);
            }
            catch (NullPointerException exception){
                System.out.println("null pointer exception");
            }
    
    
            System.out.println();
        }
    }
    

