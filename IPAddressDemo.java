import java.net.*;
import java.util.Scanner;
import java.io.*;
class IPAddressDemo
{
public static void main(String[] args) throws Exception
{
//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	Scanner br=new Scanner(System.in);
System.out.println("please enter site name");
String sitename=br.nextLine();

InetAddress in=InetAddress.getByName(sitename);
System.out.println("the ip address is:"+in);
}
}
