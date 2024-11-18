import java.io.*;

class Input
{
public static void main(String args[]) throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

System.out.println("Enter a number1");
int num1 = Integer.parseInt(br.readLine());

System.out.println("Enter a number2");
int num2 = Integer.parseInt(br.readLine());

int sum= num1+num2;

System.out.println("Sum of num1 and num2 is" + sum);

}
}
