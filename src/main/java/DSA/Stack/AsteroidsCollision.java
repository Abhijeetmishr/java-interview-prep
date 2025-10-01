package DSA.Stack;

import java.util.Stack;

/**
 * We are given an array asteroids of integers representing asteroids in a row. The indices of the asteriod in the array represent their relative position in space.

For each asteroid, the absolute value represents its size, and the sign represents its direction (positive meaning right, negative meaning left). Each asteroid moves at the same speed.

Find out the state of the asteroids after all collisions. If two asteroids meet, the smaller one will explode. If both are the same size, both will explode. Two asteroids moving in the same direction will never meet.

 

Example 1:

Input: asteroids = [5,10,-5]
Output: [5,10]
Explanation: The 10 and -5 collide resulting in 10. The 5 and 10 never collide.
Example 2:

Input: asteroids = [8,-8]
Output: []
Explanation: The 8 and -8 collide exploding each other.
Example 3:

Input: asteroids = [10,2,-5]
Output: [10]
Explanation: The 2 and -5 collide resulting in -5. The 10 and -5 collide resulting in 10.

 */
public class AsteroidsCollision {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int ast : asteroids) {
            if (ast > 0) {
                stack.push(ast);
            } else {
                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < -ast) {
                    stack.pop();
                }
                if (stack.isEmpty() || stack.peek() < 0) {
                    stack.push(ast);
                } else if (stack.peek() == -ast) {
                    stack.pop();
                }
            }
        }

        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        return result;
    }
}

// https://leetcode.com/problems/asteroid-collision/description/?envType=study-plan-v2&envId=leetcode-75

/* Go version
func asteroidCollision(asteroids []int) []int {
    stack := []int{}

    for _, ast := range asteroids {
        if ast > 0 {
            stack = append(stack, ast)
        } else {
            for len(stack) > 0 && stack[len(stack)-1] > 0 && stack[len(stack)-1] < -ast {
                stack = stack[:len(stack)-1]
            }
            if len(stack) == 0 || stack[len(stack)-1] < 0 {
                stack = append(stack, ast)
            } else if stack[len(stack)-1] == -ast {
                stack = stack[:len(stack)-1]
            }
        }
    }

    return stack
}
*/