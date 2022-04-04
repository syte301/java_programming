class PaidLesson implements iPost {
  private Lesson lesson;
  private double price;
  PaidLesson(Lesson lesson, double price) {
    this.lesson = lesson;
    this.price = price;
  }
  @Override
  public String printTitle() {
    return this.lesson.printTitle();
  }
  @Override
  public String printText() {
    return  this.lesson.printText();
  }
  public String printHomeWork() {
    return this.lesson.printHomeWork();
  }
  public double printPrice() {
    return this.price;
  }
}
