public class Snake_and_ladder {
    public static void main(String[] args) {
        int start_position = 0;
        int die_roll = (int) ((Math.random()*10)%6+1);
        System.out.println("Start position is : " +start_position);
        System.out.println("Die roll number is : " +die_roll);
    }
}
