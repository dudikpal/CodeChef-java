### Sum of Digits Problem Code: FLOW006
Submit

You're given an integer N. Write a program to calculate the sum of all the digits of N.
Input

The first line contains an integer T, the total number of testcases. Then follow T lines, each line contains an integer N.
Output

For each test case, calculate the sum of digits of N, and display it in a new line.
Constraints

    1 ≤ T ≤ 1000
    1 ≤ N ≤ 1000000

Example

Input
3 
12345
31203
2123
Output
15
9
8


### CodeChef version

```java
/* package codechef; // don't place package name! */

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
    
     String sumOfDigits(String digits) {
        int sum = 0;
        for (char digit : digits.toCharArray()) {
            sum += Character.getNumericValue(digit);
        }
        return String.valueOf(sum);
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		System.out.println(new Codechef().solution());
	}
}
```