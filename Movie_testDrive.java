class Movie{
  String title;
  String genre;
  float rating;
  void playIt(){
    System.out.println("Playing the movie "+title+" ...");
  }
}
public class Movie_testDrive {
  public static void main(String[] args) {
    Movie movie1=new Movie();
    movie1.title="proof";
    movie1.genre="educational,drama";
    movie1.rating=5;
    Movie movie2=new Movie();
    movie2.title="The man who knew infinity";
    movie2.genre="educational,biography";
    movie2.rating=5;
    Movie movie3=new Movie();
    movie3.title="dont mess with zohan";
    movie3.genre="comedy";
    movie3.rating=5;
    movie1.playIt();

  }
}
