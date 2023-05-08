import java.util.*;

public class Convert
{
    String hex;
    String oct;
    String bin;
    int length;
    public Convert() {
        hex = "";
        oct = "";
        bin = "";
    }
    
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the hexadecimal no.");
        hex = sc.next().toUpperCase();
        length = hex.length();
    }
    
    public void hexToBin() {
        // Hex to binary
        for(int i = 0; i<length; i++) {
            char dig = hex.charAt(i);
            int digit;
            if(Character.isDigit(dig))
                // If the dig is a number, convert to ascii value and subtract 48
                digit = dig-48;
            else
                // adding 10 because A=10 not 0
                digit = 10 + dig - 65;
            
            String binDigits = "";
            // converting each individual digit to binary
            while(digit > 0) {
                binDigits = (digit%2) + binDigits;
                digit /= 2;
            }
            
            // making binary number 4 digits
            while(binDigits.length() < 4)
                binDigits = "0" + binDigits;
            // this is instance variable bin
            bin = bin + binDigits;
        }
    }
    
    public void binToOct() {
        // Making no of digits divisble by 3
        while(bin.length()%3 != 0)
            bin = "0"+bin;
        
        // binary to octal
        for(int i = 0; i<bin.length(); i+=3) {
            String binDigit = bin.substring(i, i+3);
            int digit = 0;
            // converting each set of 3 binary numbers to decimal
            for(int pos = 0; pos < 3; pos++) {
                int num = binDigit.charAt(pos)-48;
                digit = digit + (int)Math.pow(2, 2-pos)*num;
            }
            oct = oct + digit;
        }
        System.out.println(oct);
    }
    
    public static void main() {
        Convert obj = new Convert();
        obj.input();
        obj.hexToBin();
        obj.binToOct();
    }
}
