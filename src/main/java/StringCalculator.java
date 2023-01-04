public class StringCalculator {

    public String[] stringToArray(String input) {
        return input.split(" ");
    }

    public int stringToInt(String str) {
        return Integer.parseInt(str);
    }

    public int calculator(int num1, String operator, int num2) {
        if(operator.equals("+")) return add(num1, num2);
        if(operator.equals("-")) return substract(num1, num2);
        if(operator.equals("*")) return multiply(num1, num2);
        if(operator.equals("/")) return divide(num1, num2);
        throw new RuntimeException();
    }

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int substract(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public int divide(int num1, int num2) {
        try {
            return num1 / num2;
        } catch (Exception e) {
            System.out.println("0으로 나눌 수 없습니다.");
        }
        return 0;
    }

    public int calculateInOrder(String[] arr) {
        int result = stringToInt(arr[0]);
        for(int i=1; i<arr.length; i+=2) {
            result = calculator(result, arr[i], stringToInt(arr[i+1]));
        }
        return result;
    }

    public boolean isBlank(String input) {
        if(input.equals(" ") || input == null) return true;
        return false;
    }

    public int makeResult(String input) {
        if(isBlank(input)) throw new RuntimeException();
        return calculateInOrder(stringToArray(input));
    }
}
