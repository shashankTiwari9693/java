package com.sank;
import java.util.Locale;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
               String Name ="Sank";
               String Name1 ="  Sank  1 ";
               System.out.println(Name.toUpperCase());
               System.out.println(Name.length());
               System.out.println(Name.replace("Sank","SHASHANK"));
               System.out.println(Name.toLowerCase());
               System.out.println(Name.concat(" Tiwari"));
               System.out.println(Name.trim());
               System.out.println(Name1);
               System.out.println(Name1.trim());
               System.out.println(Name.startsWith("S"));
               System.out.println(Name.substring(3));
		       System.out.println(Name.substring(1,4));
		       System.out.println(Name.replace('S','A'));
		       System.out.println(Name.charAt(3));
		       System.out.println(Name.equals("Sank"));
	}

    }


/* 
"C:\Program Files\Java\jdk-16.0.1\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.1.3\lib\idea_rt.jar=58250:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.1.3\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\19282\Desktop\code\Practice\out\production\Practice com.sank.Main
SANK
4
SHASHANK
sank
Sank Tiwari
Sank
  Sank  1 
Sank  1
true
k
ank
Aank
k
true

Process finished with exit code 0

*/
