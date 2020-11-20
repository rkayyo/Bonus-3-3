import java.util.Scanner;
class PPAP{
    
public static void Main (String[] args){
    Scanner s = new Scanner(System.in);
    
    String object1 = "";
    String object2 = "";

    System.out.println("Please choose 2 objects");
    
    object1 = s.next();
    object2 = s.next();
    System.out.println("I have a " + object1 + ", I have a " + object2);
    object2 = object2.substring(0, 1).toUpperCase() + object2.substring(1);
    System.out.print("Uh! " + object2 +" "+ object1);
}

public static void Palindrome(String str){
    Scanner s = new Scanner(System.in);
    str = s.next(); 
    String copy = "";
    
    
    
    
    for(int i = 0; i < str.length(); i++){
        
        
    }
    
    
}
    
public static void tenToBin(){
    Scanner s = new Scanner (System.in);
    String answer = "";
    System.out.println("What Number Would you like to Change to Binary? (Ints only please)");
    int num = s.nextInt();
    int startNum = num;
    
    do{
    answer = num %2 + answer;
    num/=2;
}while(num/2 != 0);
    

if(startNum%2 == 1){
System.out.println(answer + "1");
}else if(startNum%2 == 0){
System.out.println(answer + "0");
}


}



    
}