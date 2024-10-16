package java_oops.exceptions;

import java_basics.utils.base;

public class exceptionDemo extends base {
    public static void main(String[] args) {
        int b = 7;
        int c = 0;
        try{
            int k = b / c;
            printMe(k);
        }catch (ArithmeticException e){
            printMe("I am Arithmetic exception");
        }
        catch(Exception e){
            printMe("I catched the error/exception");
        }

        try{
            int[] arr = new int[5];
            printMe(arr[7]);
        }
        catch (ArithmeticException e){
            printMe("I am Arithmetic exception");
        }catch (IndexOutOfBoundsException e) {
            printMe("I am index out of exception");
        }finally {
            printMe("I am finally - executed irrespective of exception thrown or not");
        }

    }
}
