// Author: Jon Poret
// Date: 11/6/2018
// Purpose: To create a chatbot

import java.util.Scanner;
public class ChatBot {
  public static void main(String[] args) {
    String keywords[] = {"processor", "ram", "cooler", "graphics card", "case", "motherboard", "power supply", "i/o", "ports", "peripherals", "operating system", "asics", "risers", "daisy chaining", "sli", "crossfire", "resolution", "refresh rate", "response time", "core count", "frequence", "fans", "intel", "amd", "nvidia", "atx", "mid tower", "itx", "windows", "macos", "linux", "ubuntu", "kali", "rasbian", "arduino", "raspberry pi"};
    pront("Hello, Welcome to my Computer Hardware bot! \nThanks for using me!\nPlease type yes to use this bot, or no to exit: ");
    Scanner scan = new Scanner(System.in);
    String useQuery = scan.next();
    if (useQuery.toLowerCase().equals("no")) {
      SOP("Goodbye!");
    }
    else if (useQuery.toLowerCase().equals("yes")) {
      while(true) {
        pront("Please enter the computer term you would like to learn more about: ");
        Scanner scanner1 = new Scanner(System.in);
        String termasked = scanner1.next();
    }}
  }

  public static void SOP(String s) {
    System.out.println(s);
  }
  
  public static void pront(String c) {
	  System.out.print(c);
  }
}
