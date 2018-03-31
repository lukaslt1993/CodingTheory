package Math;


import static Math.Utils.charToInt;
import static Math.Utils.intToChar;

public class Coding {

    /*
     * Apskaiciuota isistacius i H(y,z) eilute,
     * taippat matosi ir is kodavimo schemos
     */
    
    static final int[] H = {1, 0, 1, 0, 0, 1, 1};
    
    /*
     * input - bitai (uzkoduojama informacija);
     * Sugrazina uzkoduotus bitus;
     * Uzkoduoja bitus. Igyvendinta eilutes principu
     * is Berlekamp knygos. Uzkoduojama ne tik vartotojo nurodyta
     * informacija, bet ir papildomi sesi nuliniai bitai (atsizvelgiant
     * i komentarus kodavimo teorijos puslapyje prie uzduoties)
     */
    
    public String encode(String input) {
        
        char[] inputArray = (input + "000000").replaceAll("\\s", "").toCharArray();
        int length = inputArray.length,
                counter = 0,
                counter2 = 0;
        char[] output = new char[length * 2];

        while (counter < length) {
            if (inputArray[counter] != '0' && inputArray[counter] != '1') {
                return "Neteisinga ivestis";
            }
            output[counter2] = inputArray[counter];
            output[counter2 + 1] = '0';

            for (int h = 0; h <= 6; h++) {
                if (counter >= h && H[h] != 0 && inputArray[counter - h] != '0') {
                    output[counter2 + 1] = intToChar((charToInt(output[counter2 + 1]) + 1) % 2);
                } else {
                    output[counter2 + 1] = intToChar(charToInt(output[counter2 + 1]) % 2);
                }
            }
            
            counter++;
            counter2 += 2;
        }
        
        return String.valueOf(output);
    }
}
