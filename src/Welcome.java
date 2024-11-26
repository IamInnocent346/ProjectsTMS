/**
 * <p>This is not my first document on learning how to code...
 * Welcome to my document...
 * You are free to look through everything...
 * </p>
 * @author Aya Samid
 */

// Name of the document = name of the Class
class Welcome{
    public static void main(String[] args){
         // Entry-point

        // Method call
        // Compile-time error = grammar mistake mostly
        arithmeticOperators();

    }

    // If your method is used, the color must be blue or gray
    public static void learnBasicsOfJava(){
        // One-line comment

        /*
        This is multi-lines comment
         */

        // Java Code Convention:
        // 1. Class is always a noun.
        // 2. When we create object, we always use UpperCamelCase style.
        // 3. Functions in Java are called Methods.
        // 4. Methods names always start with the verb and then noun, etc.
        // 5. Use LowerCamelCase. (sendPhoto, etc.)
        // snake style uses in C and C++ -> my_variable_message
        // 6. Variables except Class level variables:
        // 6.1 Have clear understanding what it is
        // 6.2 Variables are written in the LowerCamelCase too, but starting with noun, etc.,
        // including array.
        // Sum-up: Object = noun, method = verb, variables only start with noun.


        // Keywords - important part of Java language, cannot be solely used as a variable, class,
        // or method names.
        // Class -> Upper Letter, white.
        // methods -> lower letter, white.

        // return 0 = compiler found no grammar mistakes.
        // return 0  < 1... mistake

        System.out.println("I love programming");
        System.out.print("I love programming 2x");

        // ln = next line.
        // \n = next line.

        System.out.print("Rethinking my life choices...");
        System.out.print("Return 0");

        // DO NOT make those mistakes you noob:
        // "" -> empty string, " " -> space, "\n" -> next line
        // () -> EMPTINESS
        // ASCII Table for Java (check it)
        System.out.print(""); // EMPTINESS
    }
    public static void setBasicVariables(){
        // Integer
        // Byte and short used for memory saving
        // If you use byte and short in arithmetic operations and/or pass it as parameters they will
        // be by default.
        // Turn to integer
        byte byteValue = 10;
        short shortValue = 1472;
        int intValue = 123456;
        long longValue = 23_8712_34L;


        // integer -2... til 2...
        // long -9... til 9...
        // long value = 2; -> long value = 2l or 2L;
        System.out.println(byteValue);
        System.out.println(shortValue);
        System.out.println(intValue);
        System.out.println(longValue);


        System.out.println("--------------");
                char charValue = 'b'; // '_character'
                System.out.println(charValue);
                char charASCIIValue = 90;
                System.out.println(charASCIIValue);


                // Floating numbers
                // float PI = 3.1415F; -> f, F
                // double PI = 3.145;  -> if arithmetic or parameters needed

        System.out.println("---------------------");
        float floatValue = 34.628F; // 7 numbers
        double doubleValue = 456.232323; // 15 numbers by default
        System.out.println(floatValue);
        System.out.println(doubleValue);



        // Logical
        // C/C++ !!!!! in Java boolean means only TRUE or FALSE


        System.out.println("---------------------------------");
        boolean isCursed = true;
        boolean isAlive = false;
        System.out.println(isCursed);
        System.out.println(isAlive);
    }

    public static void arithmeticOperators() {
// +, -, *, /, %, ==, --, pre-increment, pre-decrement
        int height = 150;
        double weight = 82;


        int getSumHeightAddition = height + height;
        int getSumHeightSubtraction = height - 20;
        double getSumWeightDivided = weight / 2;
        char storeChangingValue = 87;
        storeChangingValue = (char) (storeChangingValue + 3);


        System.out.println(storeChangingValue);

        System.out.println(10 % 4);

        System.out.println(11 % 2);


        int valueIncrement = 1;
        valueIncrement = valueIncrement + 1;
        int valueDecrement = 9;


        valueIncrement++;
        valueDecrement--;


        ++valueIncrement;
        --valueDecrement;

    }
}