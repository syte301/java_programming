public class Main {
  public static void main(String[] args) {

  	PaidLesson paidlesson = new PaidLesson(
                              new Lesson(
                                new Post("Lesson about inheritance", "Composition is preferred over inheritance"),
                                "Try changing inheritance to Composition"
                              ),
                              99.90
                            );

    System.out.println("composition better than inheritance");
    System.out.println("Title = " + paidlesson.printTitle());
    System.out.println("Text = " + paidlesson.printText());
    System.out.println("HomeWork = " + paidlesson.printHomeWork());
    System.out.println("Price = " + paidlesson.printPrice());
  }
}
