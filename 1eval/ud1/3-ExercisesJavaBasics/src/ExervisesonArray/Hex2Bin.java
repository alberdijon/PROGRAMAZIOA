package ExervisesonArray;

import java.util.Scanner;

public class Hex2Bin {public static void main(String[] args) {

    String hexStr;     
    int hexStrLen;    
    char hexChar;    
    String binStr ="";
    
    final String[] BIN_STRS =
       {"0000", "0001", "0010", "0011",
        "0100", "0101", "0110", "0111",
        "1000", "1001", "1010", "1011",
        "1100", "1101", "1110", "1111"};

    Scanner in = new Scanner(System.in);
    System.out.print("Enter a Hexadecimal string: ");
    hexStr = in.next();
    hexStrLen = hexStr.length();
    in.close();

    for (int charIdx = 0; charIdx < hexStrLen; ++charIdx) {
       hexChar = hexStr.charAt(charIdx);
       if (hexChar >= '0' && hexChar <= '9') {
          binStr += BIN_STRS[hexChar - '0']; 
       } else if (hexChar >= 'a' && hexChar <= 'f') {
          binStr += BIN_STRS[hexChar - 'a' + 10];
       } else if (hexChar >= 'A' && hexChar <= 'F') {
          binStr += BIN_STRS[hexChar - 'A' + 10];
       } else {
          System.err.println("error: invalid hex string \"" + hexStr + "\"");
          return; 
       }
    }
    System.out.println("The equivalent binary for \"" + hexStr + "\" is \"" + binStr + "\"");
 }
}
