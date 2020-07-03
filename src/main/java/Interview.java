public class Interview {

    public static final int ASCII_CORRECTION = 64;
    public static final int ASCII_Z = 90 - ASCII_CORRECTION;
    public static final int ASCII_O = 79 - ASCII_CORRECTION;
    public static final int ASCII_R = 82 - ASCII_CORRECTION;
    public static final int ASCII_E = 69 - ASCII_CORRECTION;
    public static final int ASCII_N = 78 - ASCII_CORRECTION;
    public static final int ASCII_T = 84 - ASCII_CORRECTION;
    public static final int ASCII_W = 87 - ASCII_CORRECTION;
    public static final int ASCII_H = 72 - ASCII_CORRECTION;

    public static void main(String[] args) {
       String example = "OZONETOWERTHREETWO";
       int[] array = new int[32];
        for (int i = 0; i< example.length(); i++) {
           array[example.charAt(i) - ASCII_CORRECTION]++;
       }
        int zero = array[ASCII_Z];
        for (int j = 0; j< zero; j++) {
           System.out.print("0");
       }
        array[ASCII_Z]-=zero;
        array[ASCII_E]-=zero;
        array[ASCII_R]-=zero;
        array[ASCII_O]-=zero;

       int conditionOne = Math.min(Math.min(array[ASCII_O], array[ASCII_N]),array[ASCII_E]);
        for (int j=0; j<conditionOne; j++) {
            System.out.print("1");
        }
        array[ASCII_O]-=conditionOne;
        array[ASCII_N]-=conditionOne;
        array[ASCII_E]-=conditionOne;

        int conditionTwo = Math.min(Math.min(array[ASCII_T], array[ASCII_W]),array[ASCII_O]);
            for (int j=0; j<conditionTwo; j++) {
            System.out.print("2");
        }
        array[ASCII_T]-=conditionTwo;
        array[ASCII_W]-=conditionTwo;
        array[ASCII_O]-=conditionTwo;

        int conditionThree = Math.min(Math.min(Math.min(array[ASCII_T], array[ASCII_H]),array[ASCII_R]),array[ASCII_E]/2);
        for (int j=0; j<conditionThree; j++) {
            System.out.print("3");
        }
        array[ASCII_T]-=conditionThree;
        array[ASCII_H]-=conditionThree;
        array[ASCII_R]-=conditionThree;
        array[ASCII_E]-=conditionThree*2;

        int conditionFour = Math.min(Math.min(Math.min(array[ASCII_F], array[ASCII_O]),array[ASCII_U]),array[ASCII_R]);
        for (int j=0; j<conditionFour; j++) {
            System.out.print("4");
        }
        array[ASCII_F]-=conditionFour;
        array[ASCII_O]-=conditionFour;
        array[ASCII_U]-=conditionFour;
        array[ASCII_R]-=conditionFour;

        int conditionFive = Math.min(Math.min(Math.min(array[ASCII_F], array[ASCII_I]),array[ASCII_V]),array[ASCII_E]);
        for (int j=0; j<conditionFive; j++) {
            System.out.print("5");
        }
        array[ASCII_F]-=conditionFive;
        array[ASCII_I]-=conditionFive;
        array[ASCII_V]-=conditionFive;
        array[ASCII_E]-=conditionFive;

        int conditionSix = Math.min(Math.min(Math.min(array[ASCII_S], array[ASCII_I]),array[ASCII_X]));
        for (int j=0; j<conditionSix; j++) {
            System.out.print("6");
        }
        array[ASCII_S]-=conditionSix;
        array[ASCII_I]-=conditionSix;
        array[ASCII_X]-=conditionSix;

        int conditionSeven = Math.min(Math.min(Math.min(array[ASCII_S], array[ASCII_N]),array[ASCII_V]),array[ASCII_E]/2);
        for (int j=0; j<conditionSeven; j++) {
            System.out.print("7");
        }
        array[ASCII_S]-=conditionSeven;
        array[ASCII_E]-=conditionSeven*2;
        array[ASCII_V]-=conditionSeven;
        array[ASCII_N]-=conditionSeven;


    }


}
