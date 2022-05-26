public class Rectangle {
    private int x;
    private int y;

    public void setParam(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public int Area(){
        int k = x*y/2; //##5 k გამოყენება Area და Perimeter-ში არ გვაძლევს კომპილაციის  შეცდომას რომ "ცვლადი უკვე არსებობს".
        return x*y;
    }
    public int Perimeter(){
        int k = x+y;
        return 2*(x+y);
    }
    public void A(Rectangle a, Rectangle b){
        if(a.Area()>b.Area()){
            System.out.println(1);
        }
        else if(a.Area()==b.Area()) {
            System.out.println(0);
        }
        else {
            System.out.println(-1);
        }

    }
}
