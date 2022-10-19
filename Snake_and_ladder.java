public class Snake_and_ladder {
    public static void main(String[] args) {
        int start_position = 0;
        int die_roll = (int) ((Math.random()*10)%6+1);
        System.out.println("Start position is : " +start_position);
        System.out.println("Die roll number is : " +die_roll);

        int check_option_play= (int) ((Math.random()*10)%3+1);
        //System.out.println("Check option for play : " +check_option_play);

        if (check_option_play == 1 ) {
            System.out.println("You got no move");
            //start_position=start_position+0;
        }
        else if (check_option_play == 2 ) {
            System.out.println("You got Ladder");
            start_position=start_position+die_roll;
            System.out.println("You move " +start_position+ " positions forward");

        } else {
            System.out.println("You got Snake");
            start_position=start_position-die_roll;
            System.out.println("You move " +start_position+ " positions back");
        }


    }
}

