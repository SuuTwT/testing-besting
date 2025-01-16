package Exercises;

public class Ex7 {
    public static void main(String[] args) {
        Point point = new Point(5, 10);


    }
}

    class Point{
        private int x;
        private int y;

        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }

        public int increasex(){
            return x++;
        }
        public int increasey(){
            return y++;
        }
        public int setx(int x){
            this.x = x;
            return x;
        }
        public int sety(int y){
            this.y = y;
            return y;
        }
        public String getCoords(){
            return "(" + x + ", " + y + ")";
        }
    }

