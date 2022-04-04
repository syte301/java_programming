public class StringAsInteger implements Number {
  private String source;
  StringAsInteger(String src) {
     this.source = src;
  }
  int intValue() {
    return Integer.parseInt(this.source);
  }
}