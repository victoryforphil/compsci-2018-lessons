package lessons.chapter1.lesson2;
/*
Written by Alex Carter
GTHS AP CompSci - Peroid 2

Lesson 1.2

*/
public class Test {
    public static void main(String[] args) {
        System.out.println("An Emergency Broadcast");
    }

}
/*
a)
RESULTS:
- Task: Change Test to test
- Compiled: No. "Error:(9, 8) java: class test is public, should be declared in a file named test.java"
- Console: N/A

b)
RESULTS:
- Task: Change Emergency to emergency
- Compiled: Yes
- Console: An emergency Broadcast

c)
RESULTS:
- Task: Remove first quotation mark
- Compiled: No. "Error:(11, 50) java: unclosed string literal"
- Console: N/A

d)
RESULTS:
- Task: Remove last quotation mark
- Compiled: No. "Error:(11, 28) java: unclosed string literal"
- Console: N/A

e)
RESULTS:
- Task: Change main to man
- Compiled: Yes.
- Console: N/A (No function to run)

f)
RESULTS:
- Task: Change println to bogus
- Compiled: No.
- Console: "Error:(11, 19) java: cannot find symbol
  symbol:   method bogus(java.lang.String)
  location: variable out of type java.io.PrintStream"

g)
RESULTS:
- Task: Remove semicolon at end of prinln statement
- Compiled: No "Error:(11, 53) java: ';' expected"
- Console: N/A

h)
RESULTS:
- Task: Remove last bracket
- Compiled: No "Error:(12, 6) java: reached end of file while parsing"
- Console: N/A

*/