
package Math;

import static Math.Utils.majority;
import static Math.Utils.charToInt;
import static Math.Utils.intToChar;

public class Decoding {

    /*
     * input - bitai dekodavimui;
     * Sugrazina dekoduotus bitus;
     * Dekoderis igyvendintas naudojant dekodavimo schema
     * is Berlekamp knygos (jei uzkoduot galima ir be schemos (eilute),
     * tai cia yra sunkesnis procesas ir aiskiau suprantamas naudojant schema).
     * Gali pasirodyti keistas skaiciu is atminties pasirinkimas siuntimui
     * i mod-2 sumatoriu. Kadangi pirma atliekama ivestis i atminti ir tik
     * paskui siunciami elementai i sumatoriu, tai ir sumuojama ne is ten, kur
     * schemose rodo rodykle, bet viena pozicija desiniau (atlikus ivesti
     * atmintyje ivyksta elementu perstumimas). Pirmi sesi is dekoderio
     * iseje bitai ignoruojami (atsizvelgiant i komentarus kodavimo teorijos
     * puslapyje prie uzduoties)
     */
    
    public String decode(String input) {

        char[] inputArray = input.replaceAll("\\s", "").toCharArray();
        if (inputArray.length % 2 != 0  || input.length() < 12) {
            return "Dekoduojamu simboliu turi buti lyginis skaicius ir ne maziau 12";
        }
        int length = inputArray.length,
                counter = 0;
        char[] output = new char[length / 2];

        MessageBuffer mb = new MessageBuffer();
        SyndromeBuffer sb = new SyndromeBuffer();

        while (counter < length) {
            if (inputArray[counter] != '0' && inputArray[counter] != '1'
                    && inputArray[counter + 1] != '0' && inputArray[counter + 1] != '1') {
                return "Neteisinga ivestis";
            }
            int input1 = charToInt(inputArray[counter]);
            int MessageBit = mb.InOut(input1);
            int input2 = charToInt(inputArray[counter + 1]);
            int sum = (MessageBit + input1 + input2 + mb.sum()) % 2;
            int fromSyndrome = sb.InOut(sum);
            int SyndromeBit = majority(sum, sb.get(1), sb.get(4), fromSyndrome);
            output[counter / 2] = intToChar((MessageBit + SyndromeBit) % 2);
            counter += 2;

        }
        return String.valueOf(output).substring(6);
    }
}
