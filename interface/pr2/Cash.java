public class Cash {
  private Number dollars;
  Cash(String dlr) {
    this(new StringAsInteger(dlr));
  }
  Cash(Number dlr) {
    this.dollars = dlr;
  }
}