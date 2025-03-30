This Java program is a number guessing game where the user tries to guess a randomly generated number between 1 and 100.

How It Works:
1.The program generates a random number between 0 and 99 (but should be adjusted to 1–100 for accuracy).
2.The user repeatedly inputs guesses until they find the correct number.
3.After each guess, the program provides feedback:
4.If the guess is too high, it prompts the user to guess a lower number.
5.If the guess is too low, it prompts the user to guess a higher number.
6.If the guess is correct, it congratulates the user and displays the number of attempts taken.
7.After a successful guess, the user is asked if they want to play again.
8.If they input "yes," the game restarts with a new random number.
9.If they input "no," the game ends.

Potential Issues & Improvements
The random number should be generated within 1–100 instead of 0–99:
int randNum = rand.nextInt(100) + 1;

r.nextInt() could cause an error if the input is not an integer. Using r.hasNextInt() before reading input could improve robustness.

The case handling for "yes" works, but "Yes" or "YES" wouldn't work as expected. Using play.equalsIgnoreCase("yes") would be better.
