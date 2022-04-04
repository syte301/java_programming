class Post implements iPost {
  private String title;
  private String text;
  Post(String title, String text) {
     this.title = title;
     this.text = text;
  }
  @Override
  public String printTitle() {
    return this.title;
  }
  @Override
  public String printText() {
    return this.text;
  }
}
