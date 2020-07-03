import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.Math.min;

public class PhoneDecoder {

        public static final int ASCII_CORRECTION = 64;
        public static final int ASCII_Z = 90 - ASCII_CORRECTION;
        public static final int ASCII_O = 79 - ASCII_CORRECTION;
        public static final int ASCII_F = 70 - ASCII_CORRECTION;
        public static final int ASCII_R = 82 - ASCII_CORRECTION;
        public static final int ASCII_E = 69 - ASCII_CORRECTION;
        public static final int ASCII_N = 78 - ASCII_CORRECTION;
        public static final int ASCII_T = 84 - ASCII_CORRECTION;
        public static final int ASCII_S = 83 - ASCII_CORRECTION;
        public static final int ASCII_W = 87 - ASCII_CORRECTION;
        public static final int ASCII_H = 72 - ASCII_CORRECTION;
        public static final int ASCII_U = 85 - ASCII_CORRECTION;
        public static final int ASCII_I = 73 - ASCII_CORRECTION;
        public static final int ASCII_V = 86 - ASCII_CORRECTION;
        public static final int ASCII_X = 88 - ASCII_CORRECTION;
        public static final int ASCII_G = 71 - ASCII_CORRECTION;

        public String decode(String phone) {
            List<String> decoded = new ArrayList();
            int[] array = new int[32];
            for (int i = 0; i< phone.length(); i++) {
                array[phone.charAt(i) - ASCII_CORRECTION]++;
            }
            int zero = array[ASCII_Z];
            for (int j = 0; j< zero; j++) {
                decoded.add("0");
            }
            array[ASCII_Z]-=zero;
            array[ASCII_E]-=zero;
            array[ASCII_R]-=zero;
            array[ASCII_O]-=zero;


            int conditionTwo = min(min(array[ASCII_T], array[ASCII_W]),array[ASCII_O]);
            for (int j=0; j<conditionTwo; j++) {
                decoded.add("2");
            }
            array[ASCII_T]-=conditionTwo;
            array[ASCII_W]-=conditionTwo;
            array[ASCII_O]-=conditionTwo;

            int conditionEight = min(min(min(min(array[ASCII_E], array[ASCII_I]),array[ASCII_G]),array[ASCII_H]),array[ASCII_T]);
            for (int j=0; j<conditionEight; j++) {
                decoded.add("8");
            }
            array[ASCII_E]-=conditionEight;
            array[ASCII_I]-=conditionEight;
            array[ASCII_G]-=conditionEight;
            array[ASCII_H]-=conditionEight;
            array[ASCII_T]-=conditionEight;

            int conditionThree = min(min(min(array[ASCII_T], array[ASCII_H]),array[ASCII_R]),array[ASCII_E]/2);
            for (int j=0; j<conditionThree; j++) {
                decoded.add("3");
            }
            array[ASCII_T]-=conditionThree;
            array[ASCII_H]-=conditionThree;
            array[ASCII_R]-=conditionThree;
            array[ASCII_E]-=conditionThree*2;

            int conditionFour = min(min(min(array[ASCII_F], array[ASCII_O]),array[ASCII_U]),array[ASCII_R]);
            for (int j=0; j<conditionFour; j++) {
                decoded.add("4");
            }
            array[ASCII_F]-=conditionFour;
            array[ASCII_O]-=conditionFour;
            array[ASCII_U]-=conditionFour;
            array[ASCII_R]-=conditionFour;

            int conditionFive = min(min(min(array[ASCII_F], array[ASCII_I]),array[ASCII_V]),array[ASCII_E]);
            for (int j=0; j<conditionFive; j++) {
                decoded.add("5");
            }
            array[ASCII_F]-=conditionFive;
            array[ASCII_I]-=conditionFive;
            array[ASCII_V]-=conditionFive;
            array[ASCII_E]-=conditionFive;

            int conditionSix = min(min(array[ASCII_S], array[ASCII_I]),array[ASCII_X]);
            for (int j=0; j<conditionSix; j++) {
                decoded.add("6");
            }
            array[ASCII_S]-=conditionSix;
            array[ASCII_I]-=conditionSix;
            array[ASCII_X]-=conditionSix;

            int conditionSeven = min(min(min(array[ASCII_S], array[ASCII_N]),array[ASCII_V]),array[ASCII_E]/2);
            for (int j=0; j<conditionSeven; j++) {
                decoded.add("7");
            }
            array[ASCII_S]-=conditionSeven;
            array[ASCII_E]-=conditionSeven*2;
            array[ASCII_V]-=conditionSeven;
            array[ASCII_N]-=conditionSeven;

            int conditionOne = min(min(array[ASCII_O], array[ASCII_N]),array[ASCII_E]);
            for (int j=0; j<conditionOne; j++) {
                decoded.add("1");
            }
            array[ASCII_O]-=conditionOne;
            array[ASCII_N]-=conditionOne;
            array[ASCII_E]-=conditionOne;

            int conditionNine = min(min(array[ASCII_I],array[ASCII_E]),array[ASCII_N]/2);
            for (int j=0; j<conditionNine; j++) {
                decoded.add("9");
            }
            array[ASCII_N]-=conditionNine;
            array[ASCII_I]-=conditionNine;
            array[ASCII_E]-=conditionNine*2;

            decoded.sort(String.CASE_INSENSITIVE_ORDER);
            return decoded.stream().collect(Collectors.joining(""));
        }


}
