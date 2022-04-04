class PaidLesson {
  private Lesson lesson;
  private double price;
  PaidLesson(Lesson lesson, double price) {
    this.lesson = lesson;
    this.price = price;
  }
  public String printTitle() {
    return this.lesson.printTitle();
  }
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
