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
    }


}
