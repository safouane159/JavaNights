IZO – 808 Study Guide



Chapter I : Java Building Blocks 

Class zoo contains main methods:
$ javac Zoo.java  // Compile
$ java Zoo    // execute
Rules : 
•	Each file can contain only one class.
•	The filename must match the class name, including case, and have a .java extension. 
•	The key- word public is what’s called an access modifier 


Instance Initializer Blocks 
public class Egg { public Egg() { 
number = 5; } 
public static void main(String[] args) { Egg egg = new Egg(); System.out.println(egg.number); 
}
private int number = 3; 
{ number = 4; } // this is an instance initializer 
} 

Rules : The constructor runs after all fields and instance initializer blocks have run. 

Object References and Primitives 

	Primitive Types 
Java has eight built-in data types, referred to as the Java primitive types. These eight data types represent the building blocks for Java objects, because all Java objects are just a com- plex collection of these primitive data types. 

-	hold their values in the memory where the variable is allocated 
-	Primitive types will give you a compiler error if you attempt to assign them null.
-	int value = null; // DOES NOT COMPILE
-	Primitives do not have methods declared on them. 
-	primitive types have lowercase type names 



 

Reference Types 
-	A reference type refers to an object (an instance of a class). 
-	a reference “points” to an object by storing the memory address where the object is located 
-	reference types can be assigned null, which means they do not currently refer to an object. 
-	String s = null; 
-	All classes that come with Java begin with uppercase 
-	reference types can be used to call methods 
Identifiers (names)

-	The name must begin with a letter or the symbol $ or _. 
-	Subsequent characters may also be numbers. 
-	You cannot use the same name as a Java reserved word. 
-	Java is key sensitive 
Reserved key words :
 
Instance and Class Variables 
Instance and class variables do not require you to initialize them. As soon as you declare these variables, they are given a default value. 
 


Ordering Elements in a Class 
 
Rule : 
multiple classes can be defined in the same file, but only one of them is allowed to be public. The public class matches the name of the file. 
Benefits of Java 
Object Oriented Java is an object-oriented language, which means all code is defined in classes and most of those classes can be instantiated into objects. We’ll discuss this more throughout the book. Many languages before Java were procedural, which meant there were routines or methods but no classes. Another common approach is functional programming. Java allows for functional programming within a class, but object oriented is still the main organization of code. 
Encapsulation Java supports access modifiers to protect data from unintended access and modification. Most people consider encapsulation to be an aspect of object-oriented languages. Since the exam objectives call attention to it specifically, so do we. 
Platform Independent Java is an interpreted language because it gets compiled to bytecode. A key benefit is that Java code gets compiled once rather than needing to be recompiled for different operating systems. This is known as “write once, run everywhere.” On the OCP exam, you’ll learn that it is possible to write code that does not run every- where. For example, you might refer to a file in a specific directory. If you get asked on the OCA exam, the answer is that the same class files run everywhere. 
Robust One of the major advantages of Java over C++ is that it prevents memory leaks. Java manages memory on its own and does garbage collection automatically. Bad memory management in C++ is a big source of errors in programs. 
Simple Java was intended to be simpler than C++. In addition to eliminating pointers, it got rid of operator overloading. In C++, you could write a + b and have it mean almost anything. 
Secure Java code runs inside the JVM. This creates a sandbox that makes it hard for Java code to do evil things to the computer it is running on. 

Numeric Promotion Rules :

1.	If two values have different data types, Java will automatically promote one of the val- ues to the larger of the two data types. 
What is the data type of x * y? 
int x = 1;
long y = 33; 
x * y => long

2.	If one of the values is integral and the other is floating-point, Java will automatically promote the integral value to the floating-point value’s data type. 
3.	Smaller data types, namely byte, short, and char, are first promoted to int any time they’re used with a Java binary arithmetic operator, even if neither of the operands is int. 
What is the data type of x / y? 
short x = 10;
short y = 3; 
x / y => int should be promoted to int 
4.	After all promotion has occurred and the operands have the same data type, the result- ing value will have the same data type as its promoted operands. 

What is the data type of x * y / z? 
short x = 14; 
float y = 13; 
double z = 30; 
In this case, we must apply all of the rules. First, x will automatically be promoted to int solely because it is a short and it is being used in an arithmetic binary operation. The promoted x value will then be automatically promoted to a float so that it can be multiplied with y. The result of x * y will then be automatically promoted to a double, so that it can be multiplied with z, resulting in a double value. 
Increment and Decrement Operators 

The following code snippet illustrates this distinction: 
int counter = 0; 
System.out.println(counter); // Outputs 0 
System.out.println(++counter); // Outputs 1 
System.out.println(counter); // Outputs 1 
System.out.println(counter--); // Outputs 1 
System.out.println(counter); // Outputs 0 

Assignment Operators 

Java will automatically promote from smaller to larger data types 
int x = 1.0; // DOES NOT COMPILE
short y = 1921222; // DOES NOT COMPILE
int z = 9f; // DOES NOT COMPILE
Logical Operators 

A more common example of where short-circuit operators are used is checking for null objects before performing an operation, such as this: 
if(x != null && x.getValue() < 5) { 
// Do something 
} 
In this example, if x was null, then the short-circuit prevents a NullPointerException from ever being thrown, since the evaluation of x.getValue() < 5 is never reached. 
Another example :
int x = 6;
boolean y = (x >= 6) || (++x <= 7); System.out.println(x); 
Because x >= 6 is true, the increment operator on the right-hand side of the expression is never evaluated, so the output is 6. 
The if-then-else Statement
If ( //here should be a Boolean value )
Example : 
int x = 1;
if(x) { // DOES NOT COMPILE 
... } 
Ternary Operator 
booleanExpression ? expression1 : expression2 


The switch Statement 
If the case do not contain a break and the case match the variable value: the jvm will execute inside the case and all the cases after
Example : 
int dayOfWeek =5; 
switch(dayOfWeek) { 
case 0: System.out.println("Sunday"); 
default: System.out.println("Weekday"); 
case 6: System.out.println("Saturday"); break; 
} 
Output : 
Weekday
Saturday




Rules: 
data type for case statements must all match the data type of the switch variable. 

Example :
 private int getSortOrder(String firstName, final String lastName) { 
String middleName = "Patricia"; final String suffix = "JR";
int id = 0;
switch(firstName) { 
case "Test": return 52; 
case middleName: // DOES NOT COMPILE id = 5; 
break; 
case suffix: 
id = 0; 
break;
case lastName: // DOES NOT COMPILE 
id = 8; 
break;
case 5: // DOES NOT COMPILE 
id = 7; 
break;
case 'J': // DOES NOT COMPILE 
id = 10; 
break;
case java.time.DayOfWeek.SUNDAY: // DOES NOT COMPILE 
id=15; 
break; } 
return id; } 





The for Statement 
The variables in the initialization block must all be of the same type. 
for(long y = 0, int x = 4; x < 5 && y<10; x++, y++) { // DOES NOT COMPILE 
System.out.print(x + " "); 
} 

The break Statement 
As you saw when working with switch statements, a break statement transfers the flow of control out to the enclosing statement. The same holds true for break statements that appear inside of while, do-while, and for loops, as it will end the loop early, as shown in Figure 2.9 
 

Notice that you can add in front of the break an optional label ( refer to the name of the loop to break ), yes you can name a loop  
PARENT_LOOP: for(int i=0; i<list.length; i++) { for(int j=0; j<list[i].length; j++) { 
if(list[i][j]==searchValue) { positionX = i;
positionY = j;
break PARENT_LOOP; 
} } 
}




public class SwitchSample {
public static void main(String[] args) { 
FIRST_CHAR_LOOP: for (int a = 1; a <= 4; a++) { for (char x = 'a'; x <= 'c'; x++) { 
if (a == 2 || x == 'b') continue FIRST_CHAR_LOOP; 
System.out.print(" " + a + x); } 
} } 
} 

The continue Statement 

With the structure as defined, the loop will return control to the parent loop any time the first value is 2 or the second value is b. This results in one execution of the inner loop for each of three outer loop calls. The output looks like this: 
1a 3a 4a 

 




Calling a Static Variable or Method 
Koala k = new Koala();
6: System.out.println(k.count); // k is a Koala
7: k = null;
8: System.out.println(k.count); // k is still a Koala 



 



Final 

private static final ArrayList<String> values = new ArrayList<>(); public static void main(String[] args) { 
values.add("changed"); //does compiles!
 } 
Static Imports 
Remember that static imports are only for importing static members. 
import static java.util.Arrays; // DOES NOT COMPILE 
import static java.util.Arrays.asList;
static import java.util.Arrays.*; // DOES NOT COMPILE
 public class BadStaticImports { 
public static void main(String[] args) { 
Arrays.asList("one"); // DOES NOT COMPILE 
} } 




Concatenation 
Rules :
If both operands are numeric, + means numeric addition. 
If either operand is a String, + means concatenation. 
The expression is evaluated left to right. 

•	System.out.println(1 + 2); //  3 

•	System.out.println("a" + "b");//  ab 

•	 System.out.println("a" + "b" + 3); //  ab3 

•	 System.out.println(1 + 2 + "c"); //  3c 

substring() 
String string = "animals"; 
System.out.println(string.substring(3)); // mals 
System.out.println(string.substring(string.indexOf('m'))); // mals 
System.out.println(string.substring(3, 3)); // empty string 
System.out.println(string.substring(3, 2)); // throws exception
 System.out.println(string.substring(3, 8)); // throws exception 
equals() and equalsIgnoreCase() 
System.out.println("abc".equals("ABC")); // false
 System.out.println("ABC".equals("ABC")); // true
 System.out.println("abc".equalsIgnoreCase("ABC")); // true 
startsWith() and endsWith()
System.out.println("abc".startsWith("a")); // true
 System.out.println("abc".startsWith("A")); // false
 System.out.println("abc".endsWith("c")); // true 
System.out.println("abc".endsWith("a")); // false 
contains() 
System.out.println("abc".contains("b")); // true
 System.out.println("abc".contains("B")); // false 

Searching  arrays
As soon as you see the array isn’t sorted, look for an answer choice about unpredict- able output. 
3: int[] numbers = {2,4,6,8};
4: System.out.println(Arrays.binarySearch(numbers, 2)); // 0 
5: System.out.println(Arrays.binarySearch(numbers, 4)); // 1 
6: System.out.println(Arrays.binarySearch(numbers, 1)); // -1 
7: System.out.println(Arrays.binarySearch(numbers, 3)); // -2 
8: System.out.println(Arrays.binarySearch(numbers, 9)); // -5 


Using an ArrayList 
Add()
4: List<String> birds = new ArrayList<>(); 
5: birds.add("hawk");
6: birds.add(1, "robin");
7: birds.add(0, "blue jay"); 8: birds.add(1, "cardinal"); 9: System.out.println(birds); 
// [hawk]
// [hawk, robin]
// [blue jay, hawk, robin]
// [blue jay, cardinal, hawk, robin] // [blue jay, cardinal, hawk, robin] 

Wrapper Classes 

arseInt(), return a primitive, and the valueOf() method returns a wrapper class. 

Example :
 int primitive = Integer.parseInt("123"); 
Integer wrapper = Integer.valueOf("123"); 

Dates and Times 
System.out.println(LocalDate.now()); 2015-01-20
System.out.println(LocalTime.now()); 12:45:18.401
 System.out.println(LocalDateTime.now()); 2015-01-20T12:45:18.401
Periods 
ou cannot chain methods when creating a Period. The following code looks like it is equivalent to the everyYearAndAWeek example, but it’s not. Only the last method is used because the Period.ofXXX methods are static methods. 
Period wrong = Period.ofYears(1).ofWeeks(1); // every week 
Working with Varargs 
Rules : 
A vararg parameter must be the last element in a method’s parameter list. 
This implies you are only allowed to have one vararg parameter per method. 
Example :
public static void walk( int start, int... nums) {
 System.out.println(nums.length);

}

18: public static void main(String[] args) { 
19: walk(1); // 0
 20: walk(1, 2); // 1 
21: walk(1, 2, 3); // 2
 22: walk(1, new int[] {4, 5}); // 2 
} 



Overloading and Varargs 
public void fly(int[] lengths) { }
public void fly(int... lengths) { } // DOES NOT COMPILE 
Remember that Java treats varargs as if they were an array. 


Overloading Methods (important pay attention!!)


 

Another one ( read it slowly and understand) : 

If there is to method with different signature ( fly(long) and fly(int) ), in calling fly(6) , java will choose the most specifique one ( fly(int) ) but if fly(int) does not exist java will cal fly(long), it will convert the int to long BUT if there is fly(Long) ( Long is not long : autoboxing ), 
Java wont do the 2 steps conversion from int to long to Long. Compilling erreur 



Default Constructor 
Every class in Java has a constructor whether you code one or not. 


Overloading Constructors 

this() has one special rule you need to know. If you choose to call it, the this() call must be the first noncommented statement in the constructor 
public Hamster(int weight) { 
System.out.println("in constructor");
// ready to call this
this(weight, "brown"); // DOES NOT COMPILE 
} 
Constructor and final
The constructor is part of the initialization process, so it is allowed to assign final instance variables in it. By the time the constructor completes, all final instance variables must have been set. 

Order of Initialization ( imprtant !)
1.	If there is a superclass, initialize it first (we’ll cover this rule in the next chapter. For now, just say “no superclass” and go on to the next rule.) 
2.	Static variable declarations and static initializers in the order they appear in the file. 
3.	Instance variable declarations and instance initializers in the order they appear in the file. 
4.	The constructor.
Example :
Let’s try the first example: 
 


JavaBeans naming conventions 


 



Lambda 
Syntax :
-	a -> a.canHop()
-	(Animal a) -> { return a.canHop(); } 

Reviewing Constructor Rules 



1.	The first statement of every constructor is a call to another constructor within the class using this(), or a call to a constructor in the direct parent class using super(). 
2.	The super() call may not be used after the first statement of the constructor. 
3.	If no super() call is declared in a constructor, Java will insert a no-argument super() as the first statement of the constructor. 
4.	If the parent doesn’t have a no-argument constructor and the child doesn’t define any constructors, the compiler will throw an error and try to insert a default no-argument constructor into the child class. 
5.	If the parent doesn’t have a no-argument constructor, the compiler requires an explicit call to a parent constructor in each child constructor. 
Defining an Abstract Class 

 




TO REMEMBER !!!!!

Float should always assigned with XXf either way , it not compile, example: 
Float = 23,2  //erreur compiling
Float = 23,2f  //correct

--------
int x = !5; // DOES NOT COMPILE 
boolean y = -true; // DOES NOT COMPILE 
boolean z = !0; // DOES NOT COMPILE 
-----
long t = 192301398193810323; // DOES NOT COMPILE 
Java interprets the literal as an int and notices that the value is larger than int allows. The literal would need a postfix L to be considered a long. 
-------

Java is case sensitive 

----------

Java allows only one public class per file 
------------
overriding a method, the subclass cannot reduce the visibility of the parent method, 

![image](https://user-images.githubusercontent.com/57716423/202866405-d4aa80bd-fd86-4bc3-938d-7eda759d74dd.png)
