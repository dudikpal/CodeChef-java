### Find Remainder Problem Code: FLOW002
Submit

Write a program to find the remainder when an integer A is divided by an integer B.
Input

The first line contains an integer T, the total number of test cases. Then T lines follow, each line contains two Integers A and B.
Output

For each test case, find the remainder when A is divided by B, and display it in a new line.
Constraints

    1 ≤ T ≤ 1000
    1 ≤ A,B ≤ 10000

Example

Input
3 
1 2
100 200
40 15

Output
1
100
10


### CodeChef version

```java
import java.util.*;
import java.lang.*;
import java.io.*;
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    String solution()throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int lines = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        String separator = "";
        while (lines-- > 0) {
            sb.append(separator);
            sb.append(sumOfDigits(br.readLine()));
            separator = "\n";
        }
        return sb.toString();
    }
    
     String sumOfDigits(String line) {
        String[] numbers = line.split("\\s");
        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);
        return String.valueOf(a % b);
    }
    
    public static void main (String[] args) throws java.lang.Exception
    {
            // your code goes here
            System.out.println(new Codechef().solution());
    }
}
```