
package Math;

public class MessageBuffer extends Buffer {
    
    /*
     * Dekoderio schemos virsutines atminties (is kanalo gautos zinutes buferio)
     * elementu, kurie turi buti pasiusti i sumatoriu, suma
     */
    
    int sum() {
        
        return (elements[2] + elements[5]) % 2;
    }
    
}
