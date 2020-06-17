import java.awt.event.TextEvent;
import java.util.ArrayList;
import java.util.List;

public class Interview {


    public static void main(String[] args) {
       String example = "OZONETOWERTHREETWO";
       int[] array = new int[32];
        int ASCII_correction = 64;
        for (int i = 0; i< example.length(); i++) {
           array[example.charAt(i)- ASCII_correction]++;
       }
        int zero = array['Z' - ASCII_correction];
        for (int j = 0; j< zero; j++) {
           System.out.print("0");
       }
        array[90- ASCII_correction]-=zero;
        array[69- ASCII_correction]-=zero;
        array[82- ASCII_correction]-=zero;
        array[79- ASCII_correction]-=zero;

       int conditionOne = Math.min(Math.min(array[79- ASCII_correction], array[78- ASCII_correction]),array[69- ASCII_correction]);
        for (int j=0; j<conditionOne; j++) {
            System.out.print("1");
        }
        array[79- ASCII_correction]-=conditionOne;
        array[78- ASCII_correction]-=conditionOne;
        array[69- ASCII_correction]-=conditionOne;

        int conditionTwo = Math.min(Math.min(array[84- ASCII_correction], array[87- ASCII_correction]),array[79- ASCII_correction]);
            for (int j=0; j<conditionTwo; j++) {
            System.out.print("2");
        }
        array[84- ASCII_correction]-=conditionTwo;
        array[87- ASCII_correction]-=conditionTwo;
        array[79- ASCII_correction]-=conditionTwo;

        int conditionThree = Math.min(Math.min(Math.min(array[84- ASCII_correction], array[72- ASCII_correction]),array[82- ASCII_correction]),array[69- ASCII_correction]/2);
        for (int j=0; j<conditionThree; j++) {
            System.out.print("3");
        }
        array[84- ASCII_correction]-=conditionThree;
        array[72- ASCII_correction]-=conditionThree;
        array[82- ASCII_correction]-=conditionThree;
        array[69- ASCII_correction]-=conditionThree*2;

    }


}
