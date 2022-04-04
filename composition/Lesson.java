class Lesson implements iPost {
  private Post post;
  private String homework;
  Lesson(Post post, String homework) {
     this.post = post;
     this.homework = homework;
  }
  public String printHomeWork() {
    return this.homework;
  }
  @Override
  public String printTitle() {
    return this.post.printTitle();
  }
  @Override
  public String printText() {
    return this.post.printText();
  }
}
