### Small factorials Problem Code: FCTRL2
Solved
Submit
A tutorial for this problem is now available on our blog. Click here to read it.

You are asked to calculate factorials of some small positive integers.
Input

An integer t, 1<=t<=100, denoting the number of testcases, followed by t lines, each containing a single integer n, 1<=n<=100.
Output

For each integer n given at input, display a line with the value of n!
Example
Sample input:

4
1
2
5
3

Sample output:

1
2
120
6

### CodeChef version

```java
import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;
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
            sb.append(factorial(Integer.parseInt(br.readLine())));
            separator = "\n";
        }
        return sb.toString();
    }
    
    private String factorial(int number) {
        BigInteger fact = new BigInteger("1");
        for (int i = 1; i <= number; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact.toString();
    }
    
    public static void main (String[] args) throws java.lang.Exception
    {
            // your code goes here
            System.out.println(new Codechef().solution());
    }
}
```