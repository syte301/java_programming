class Post {
  private String title;
  private String text;
  Post(String title, String text) {
     this.title = title;
     this.text = text;
  }
  public String printTitle() {
    return this.title;
  }
  public String printText() {
    return this.text;
  }
}
