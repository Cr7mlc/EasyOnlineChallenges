/**
 * Write a function that takes such collection and counts the points of our team in the championship. Rules for counting points for each match:
 *
 * for a set of score board that looks like:
 *
 * {"0:1", "0:2", "0:3", "0:4", "1:2", "1:3", "1:4", "2:3", "2:4", "3:4"}
 *
 * if x>y - 3 points
 * if x<y - 0 point
 * if x=y - 1 point
 * Notes:
 *
 * there are 10 matches in the championship
 * 0 <= x <= 4
 * 0 <= y <= 4
 *
 *
 *
 */


public class CountingPoints {
    public static int points(String[] games) {

        int count = 0;
        for (String game : games) {
            if (game.charAt(0) > game.charAt(game.length() - 1)) {
                count += 3;
            } else if (game.charAt(0) < game.charAt(game.length() - 1)) {
                count += 0;
            } else
                count += 1;
        }
        return count;
    }

        public static void main(String[] args) {
            String[] games = {"0:1", "0:2", "0:3", "0:4", "1:2", "1:3", "1:4", "2:3", "2:4", "3:4"};
            String[] games2 =   {"1:0","2:0","3:0","4:4","2:2","3:3","1:4","2:3","2:4","3:4"};
            System.out.println(points(games2));
            System.out.println(points(games));

        }
}
