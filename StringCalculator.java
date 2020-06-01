public class StringCalculator {
    public int add(String input) {
        
        String delimiter = ",|\n";
        if (input.startsWith("//")) {
            String[] parts = input.split("\n", 2);
            delimiter = parts[0].substring(2);
            input = parts[1];
        }
        
        String[] numbers = input.split(delimiter);
        
        if (input.isEmpty()) {
            return 0;
        }
        
        else if (numbers.length > 1) {
            return getSum(numbers);
        }
        return stringToInt(input);
    }
    
    private int getSum(String[] numbers) {
        int sum = 0;
        for (String currentNumber:numbers) {
            if (stringToInt(currentNumber) > 1000) {
                continue;
            }
            sum += stringToInt(currentNumber);
        }
        return sum;
    }
    
    private int stringToInt(String number) {
        int num = Integer.parseInt(number);
        if (num < 0) {
            throw new IllegalArgumentException("Negative input!");
        } 
        else {
            return num;
        }
    }
}
