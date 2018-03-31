package Math;

import static Math.Utils.charToInt;
import static Math.Utils.intToChar;

public class Sending {
    
    /*
     * input - siunciami bitai;
     * probability - kanalo klaidu tikimybe;
     * Sugrazina siusta (is kanalo atejusia) informacija;
     * Siuncia informacija kanalu ir gauna atejusia is kanalo informacija.
     * Kanalas realizuotas kaip aprasyta siulomoje realizacijoje.
     */
    
    public String send(String input, double probability) {

        char[] inputArray = input.toCharArray();
        int length = inputArray.length;
        char[] output = new char[length];

        for (int i = 0; i < length; i++) {
            if (inputArray[i] != '0' && inputArray[i] != '1') {
                return "Neteisinga ivestis";
            }

            if (Math.random() < probability) {
                output[i] = intToChar((charToInt(inputArray[i]) + 1) % 2);
            } else {
                output[i] = inputArray[i];
            }
        }
        return String.valueOf(output);
    }
}
