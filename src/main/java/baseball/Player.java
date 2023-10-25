package baseball;

import camp.nextstep.edu.missionutils.Console;

public class Player {
    public static String inputNumber() {
        String input = Console.readLine();
        return input;
    }

    public static int inputStrParseInt(String input, int i) {
        int len = input.length();
        Exception.checkInputSize(len);
        int num = stringToInt(input, i);
        return num;
    }

    public static int inputRestartStatus() {
        String input = Console.readLine();
        int num = stringToInt(input,0);
        return num;
    }

    public static int stringToInt(String str, int i) {
        char strToChar = str.charAt(i);
        int num = Character.getNumericValue(strToChar);
        return num;
    }




}
