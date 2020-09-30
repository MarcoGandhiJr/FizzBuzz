package xavierdufour;

public class FizzBuzzConverter {

    public String convert(int number) {
        String answer = String.valueOf(number);
        if (number % 3 == 0) {
            answer = "Fizz";
        }

        if (number % 5 == 0) {
            if (number % 3 == 0) {
                answer += " Buzz";
                return answer;
            }
            answer = "Buzz";
        }

        return answer;
    }
}
