package Math;

public class Utils {

    /*
     * c - simbolis;
     * Sugrazina dvejetaini skaiciu, gauta is simbolio c;
     * Pavercia simboli c
     * i dvejetaini skaiciu
     */
    
    static int charToInt(char c) {

        return Character.digit(c, 2);
    }

    /*
     * i - skaicius;
     * Sugrazina simboli, vaizduojanti
     * skaiciu i, paversta i dvejetaini;
     * Pavercia dvejetaini skaiciu i
     * i simbolio pavidala
     */
    
    static char intToChar(int i) {

        return Character.forDigit(i, 2);
    }

    /*
     * s1, s2, s3, s4 - dvejetainiai skaiciai (0 arba 1);
     * Jei tarp siu keturiu skaiciu bent trys vienetai, tai sugrazins 1
     * Kitu atveju, sugrazins 0
     */
    
    static int majority(int s1, int s2, int s3, int s4) {

        int counter = 0;
        if (s1 == 1) {
            counter++;
        }
        if (s2 == 1) {
            counter++;
        }
        if (s3 == 1) {
            counter++;
        }
        if (s4 == 1) {
            counter++;
        }
        if (counter > 2) {
            return 1;
        } else {
            return 0;
        }
    }
    
    /*
     * data - baitu masyvas;
     * pos - bito pozicija (pvz desimta pozicija yra antro baito masyve
     * antras bitas;
     * Sugrazina bita (0 arba 1);
     * Sugrazina bita is nurodytos pozicijos baitu masyve
     */
    
    private static int getBit(byte[] data, int pos) {
        int posByte = pos/8; 
        int posBit = pos%8;
        byte valByte = data[posByte];
        int valInt = valByte>>(8-(posBit+1)) & 0x0001;
        return valInt;
   }
    
    /*
     * input - tekstas;
     * Sugrazina teksta, paversta i binarine informacija;
     * Pavercia teksta i binarine informacija
     */
    
    public static String stringToBits(String input) {
        byte[] bytes = input.getBytes();
        char[] bits = new char[bytes.length * 8];
        for (int i = 0; i < bits.length; i++) {
            bits[i] = intToChar(getBit(bytes, i));
        }
        return String.valueOf(bits);
    }
    
    /*
     * input - baitu masyvas;
     * Sugrazina baitu masyva, paversta i bitus;
     * Pavercia baitu masyva i bitus
     */
    
    public static String bytesToString(byte[] input) {
        char[] bits = new char[input.length * 8];
        for (int i = 0; i < bits.length; i++) {
            bits[i] = intToChar(getBit(input, i));
        }
        return String.valueOf(bits);
    }
    
    /*
     * data - baitu masyvas;
     * pos - bito pozicija baitu masyve;
     * Sugrazina reiksme (0 arba 1), kuria igauna bitas nurodytoje pozicijoje;
     * Nustato bito reiksme nurodytoje pozicijoje
     */
    
     private static void setBit(byte[] data, int pos, int val) {
        int posByte = pos/8; 
        int posBit = pos%8;
        byte oldByte = data[posByte];
        oldByte = (byte) (((0xFF7F>>posBit) & oldByte) & 0x00FF);
        byte newByte = (byte) ((val<<(8-(posBit+1))) | oldByte);
        data[posByte] = newByte;
     }
    
     /*
      * input - bitai;
      * Sugrazina teksta, kuris gautas is bitu;
      * Pavercia bitus i teksta
      */
     
    public static String bitsToString(String input) {
        byte[] output = new byte[(int) Math.ceil(input.length() / 8)];
        for (int i = 0; i < output.length * 8; i++) {
            setBit(output, i, charToInt(input.charAt(i)));    
        }
        return new String(output);
    }
    
     /*
      * input - bitai;
      * Sugrazina baitu masyva;
      * Bitus pavercia i baitu masyva
      */
    
    public static byte[] bitsToBytes(String input) {
        byte[] output = new byte[(int) Math.ceil(input.length() / 8)];
        for (int i = 0; i < output.length * 8; i++) {
            setBit(output, i, charToInt(input.charAt(i)));    
        }
        return output;
    }
}
