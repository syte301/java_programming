class Lesson {
  private Post post;
  private String homework;
  Lesson(Post post, String homework) {
     this.post = post;
     this.homework = homework;
  }
  public String printHomeWork() {
    return this.homework;
  }
  public String printTitle() {
    return this.post.printTitle();
  }
  public String printText() {
    return this.post.printText();
  }
}
