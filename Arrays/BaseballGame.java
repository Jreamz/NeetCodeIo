package Arrays;

// https://leetcode.com/problems/baseball-game/

import java.util.Stack;

public class BaseballGame {

    public int calPoints(String[] operations) {

        int score = 0;
        Stack<Integer> stack = new Stack<>();

        for (String operation : operations) {

            // first time using switch statements, IntelliJ recommended
            switch (operation) {
                case "+" -> {
                    int scoreOne = stack.pop();
                    int scoreTwo = stack.peek();
                    int sumScore = scoreOne + scoreTwo;
                    stack.push(scoreOne);
                    stack.push(sumScore);
                }
                case "D" -> {
                    int lastScore = stack.peek();
                    stack.push(lastScore * 2);
                }
                case "C" -> stack.pop();
                default -> stack.push(Integer.parseInt(operation));
            }

        }
        while (!stack.isEmpty()) {
            score += stack.pop();
        }
        return score;
    }
}
