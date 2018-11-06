
public class ChatBot {
  public static void main(String[] args) {
    String keywords[] = {"processor", "ram", "cooler", "graphics card", "case", "motherboard", "power supply", "i/o", "ports", "peripherals", "operating system", "asics", "risers", "daisy chaining", "sli", "crossfire", "resolution", "refresh rate"}
    SOP("Hello, Welcome to my Computer Hardware bot! \nThanks for using me!\nPlease type yes to use this bot, or no to exit: ");
    Scanner scan = new scanner(System.in);
    String useQuery = scan.next();
    if (useQuery.toLowerCase().equals("no") {
      SOP("Goodbye!");
    }
    
  }

  public static void SOP(String s) {
    System.out.println(s)
  }
}
