
package Stack;

import java.util.Stack;

    public class ReverseStack {
        public static void Stackimp_empty(Stack<Integer> stack,int n){

            for(int i=1;i<=n;i++){
                int t = stack.pop();
                System.out.println(t);
            }

        }
        public static void printStack(Stack<Integer> stack){
            if(stack.isEmpty()){
                return;
            }
            int value = stack.pop();
            printStack(stack);
            System.out.println(value);
            stack.add(value);
        }

        public static void reversePrint(Stack<Integer> stack){
            if(stack.isEmpty()){
                return;
            }
            int value = stack.pop();
            System.out.println(value);
            reversePrint(stack);
            stack.add(value);
        }

        public static void main(String[] args){
            Stack<Integer> stack = new Stack<>();
            for(int i=1;i<=5;i++){

                int p = stack.push(i);
            }
            System.out.println(stack.size());
            System.out.println("\n");
            printStack(stack);
            System.out.println("\n");
            reversePrint(stack);
            System.out.println("\n");


        }
    }

