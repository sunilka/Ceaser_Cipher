import java.util.Scanner;

public class test {
	public static String message, encryptedMessage="", decryptedMessage = "";
	public static int key, choice;
	public static char ch;
	public static int n;
	public static int option;
	public static String ansencryptmessage;
	public static String ansdecryptmessage;
	
	public static void encrypt(String message,int key)
	{
		for(int i = 0; i < message.length(); ++i){
			ch = message.charAt(i);
			
			if(ch >= 'a' && ch <= 'z'){
	            ch = (char)(ch + key);
	            
	            if(ch > 'z'){
	                ch = (char)(ch - 'z' + 'a' - 1);
	            }
	            
	            encryptedMessage += ch;
	        }
	        else if(ch >= 'A' && ch <= 'Z'){
	            ch = (char)(ch + key);
	            
	            if(ch > 'Z'){
	                ch = (char)(ch - 'Z' + 'A' - 1);
	            }
	            
	            encryptedMessage += ch;
	        }
	        else {
	        	encryptedMessage += ch;
	        }
		}
	}

	
	public static void decrypt(String message,int key)
	{
		for(int i = 0; i < message.length(); ++i){
			ch = message.charAt(i);
			
			if(ch >= 'a' && ch <= 'z'){
	            ch = (char)(ch - key);
	            
	            if(ch < 'a'){
	                ch = (char)(ch + 'z' - 'a' + 1);
	            }
	            
	            decryptedMessage += ch;
	        }
	        else if(ch >= 'A' && ch <= 'Z'){
	            ch = (char)(ch - key);
	            
	            if(ch < 'A'){
	                ch = (char)(ch + 'Z' - 'A' + 1);
	            }		        		        
	            
	            decryptedMessage += ch;
	        }
	        else {
	        	decryptedMessage += ch;
	        }
		}
		
	}
	
	public static void main(String...s){
		
		Scanner sc = new Scanner(System.in);
		do{
		System.out.println("------------------Caeser Cipher Java---------------");
		System.out.println("1. Encrypt a Message");
		System.out.println("2. Decrypt a Message");
		System.out.println("3. EXIT");
		choice = sc.nextInt();
		
		if(choice == 1) {
			sc.nextLine();
			System.out.println("Enter a message: ");
			message = sc.nextLine();
			
			System.out.println("Enter key: ");
			key = sc.nextInt();
			
			System.out.println("\n Enter the no of times your want to encrypt");
			n=sc.nextInt();
			
			key=n*key;
			
			encrypt(message,key);
			System.out.println("ENCRYPTED MESSAGE IS "+encryptedMessage);
			
		}
			
		
		
		if(choice == 2) {
			sc.nextLine();
			System.out.println("Enter a message: ");
			message = sc.nextLine();
			
			//sc.nextLine();
			System.out.println("Enter key: ");
			key = sc.nextInt();
			
			System.out.println("\n please enter the no of times you want to decrypt");
			n=sc.nextInt();
			
			key=key*n;
			decrypt(message,key);
			System.out.println("DE-CRYPTED MESSAGE IS "+decryptedMessage);
		
		}}while(choice!=3);
		
		System.out.println("\n PROGRAM COMPLETE \n");
		System.out.println("\n -----------------\n");
		
}}
