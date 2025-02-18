/*
Implement the basic methods for a stack that holds characters. Make a stack testing method that uses the
push, pop, showStack, isStackEmpty, and init methods to load and unload the following strings to and from
the stack, print out the results.  Create your own stack method, do not use any built in stack facilities
in Java or other languages.

"bob"
"aet nomel"
"snoino dna revil etah i"
"SELUR LOBOC"
Turn in a pdf with an explanation of your code, the code, and screen shots of it running.  Due February 17.
 */
//directions didn't say i had to be efficient, just saying, it works

public class programTwo {
    public static class stack {
        private char array[];
        private int top;

        public stack() {
            array = new char[32];
            top = -1;
        }

        public void init() {
            top = -1;
        }

        public void push(char c) {
            array[++top] = c;
        }

        public char pop() {
            if (!isStackEmpty()) {
                return array[top--];
            } else {
                System.out.println("the stack is underflowed");
                return '\0';
            }
        }

        public boolean isStackEmpty() {
            return top == -1;
        }

        public void showStack() {
            if (isStackEmpty()){
                System.out.println("the stack is empty");
                return;
            }
            for (int i = 0; i <= top; i++) {
                System.out.print(array[i]);
            }
            System.out.println();
        }

        public static void test() {
            String bob = "bob";
            String lemonTea = "aet nomel";
            String food = "snoino dna revil etah i";
            String idk = "SELUR LOBOC";

            stack s = new stack();
            int j;
            s.init();


            //bob
            System.out.println();
            System.out.println("string 1");
            for (j = 0; j < bob.length(); j++) {
                s.push(bob.charAt(j)); //push
            }
            System.out.print("after push: ");
            s.showStack(); //print stack as is

            System.out.print("after pop: ");
            while (!s.isStackEmpty()) {
                System.out.print(s.pop()); //pop from top
            }
            System.out.println();


            //lemon tea
            System.out.println();
            System.out.println("string 2");
            for (j = 0; j < lemonTea.length(); j++) {
                s.push(lemonTea.charAt(j)); //same formula as bob
            }
            System.out.print("after push: ");
            s.showStack();

            System.out.print("after pop: ");
            while (!s.isStackEmpty()) {
                System.out.print(s.pop());
            }
            System.out.println();


            //food
            System.out.println();
            System.out.println("string 3");
            for (j = 0; j < food.length(); j++) {
                s.push(food.charAt(j)); //same formula as aet nomel
            }
            System.out.print("after push: ");
            s.showStack();

            System.out.print("after pop: ");
            while (!s.isStackEmpty()) {
                System.out.print(s.pop());
            }
            System.out.println();


            //idk
            System.out.println();
            System.out.println("string 4");
            for (j = 0; j < idk.length(); j++) {
                s.push(idk.charAt(j)); //same formula as food
            }
            System.out.print("after push: ");
            s.showStack();

            System.out.print("after pop: ");
            while (!s.isStackEmpty()) {
                System.out.print(s.pop());
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        stack.test();
    }
}



