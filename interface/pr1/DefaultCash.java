class DefaultCash implements Cash {
  private int dollars;
  DefaultCash(int dlr) {
    this.dollars = dlr;
  }

  @Override 
  public Cash multiply(int factor) {
   return new DefaultCash(this.dollars * factor);
  }
}
