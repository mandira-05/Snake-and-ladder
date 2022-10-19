public class Snake_and_ladder {
    public static void main(String[] args) {
        int finish=100;
        int start_position = 0;

        while (start_position<finish) {

            int die_roll = (int) ((Math.random()*10)%6+1);
            int check_option_play = (int) ((Math.random() * 10) % 3 + 1);


            if (check_option_play == 1) {
                System.out.println("You got no move");

            } else if (check_option_play == 2) {
                System.out.println("You got Ladder");
                start_position = start_position + die_roll;
                System.out.println("You move " + die_roll + " positions forward");

            } else {
                System.out.println("You got Snake");
                start_position = start_position - die_roll;
                System.out.println("You move " + die_roll + " positions back");
                if (start_position < 0 ) {
                    System.out.println("Start Again");
                    start_position = 0;
                }
            }

        }
        System.out.println("Position is now: " +start_position);
    }
}


