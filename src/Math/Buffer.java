
package Math;

public class Buffer {
    
    int[] elements = {0, 0, 0, 0, 0, 0};
    
    /*
     * in - skaicius, ieinantis i atminti (buferi);
     * Sugrazina skaiciu, isejusi is atminties;
     * Skaicius ieina i atminti, atmintyje esantys skaiciai pasislenka
     * viena pozicija i desine, paskutinis skaicius isstumiamas (jis
     * taippat ir sugrazinamas funkcijos)
     */
    
    public int InOut(int in) {
        
        int out = elements[5];
        
        for (int i = 5; i > 0; i--) {
            elements[i] = elements[i - 1];
        }
        
        elements[0] = in;
        return out;
    }
    
    
    
    
}
