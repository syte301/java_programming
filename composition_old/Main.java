public class Main {
  public static void main(String[] args) {

    // Lesson lesson = new Lesson( new Post("Урок о наследовании в PHP", "Лол, кек, чебурек"),
    //                             "Ложитесь спать, утро вечера мудренее"
    //                 );
    // System.out.println(lesson.printHomeWork());

  	PaidLesson paidlesson = new PaidLesson(
                                    new Lesson(
                                      new Post("Урок о наследовании в PHP", "Лол, кек, чебурек"),
                                      "Ложитесь спать, утро вечера мудренее"
                                    ),
                                    99.90
                                  );

    System.out.println("composition better than inheritance");
    System.out.println("Title = " + paidlesson.printTitle());  // Немогу получить доступ к методу класса Post.title()
    System.out.println("Text = " + paidlesson.printText());  // Немогу получить доступ к методу класса Post.title()
    System.out.println("HomeWork = " + paidlesson.printHomeWork());  // Немогу получить доступ к методу класса Post.title()
    System.out.println("Price = " + paidlesson.printPrice());  // Немогу получить доступ к методу класса Post.title()
  }
}
