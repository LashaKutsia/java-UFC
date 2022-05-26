public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Rectangle rectangle1 = new Rectangle();

        rectangle.setParam(5,4);
        rectangle1.setParam(4,8);

//
//        ##3
//        rectangle==rectangle1; ამ დროს მოხდება შეცდომა
//        rectangle=rectangle1; ამ დროს შეცდომა არ მოხდება რადგან rectangle და rectangle1 ერთი და იგივე ადგილი აქვთ მეხსიერებასი;
//        Rectangle rectangle=null; დაგვიბრუნებს NullPointerException-ს
//        setter-ის გარეშე getX , getY გამოძახება გვიბრუნებს 0-ს.

//        rectangle=rectangle1;
//        rectangle.setParam(4,4); //ამის შემდეგ ორივე ობიექტი იღებს ერთსა და იმავე X და Y-ს



//        System.out.println(rectangle.getX());
//        System.out.println(rectangle.getY());
//        System.out.println(rectangle1.getX());
//        System.out.println(rectangle1.getY());
//
//      ##2
        rectangle.Area();
        rectangle.Perimeter();
        rectangle1.Area();
        rectangle1.Perimeter();
//
//        ##4
        rectangle.A(rectangle,rectangle1);
    }
}
