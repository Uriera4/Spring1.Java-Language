package n1exercici1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.TreeMap;

class MesTest {
    @Test
    public void testLlistaMesos (){
        TreeMap<Integer, Mes> llistaMesos = new TreeMap<>();
        for (int i=0; i<12; i++){
            llistaMesos.put(i+1, (new Mes(i)));
        }
        assertEquals(12, llistaMesos.size()); //MIRA SI TÉ 12 POSICIONS
        assertNotEquals(null, llistaMesos.firstKey()); //MIRA SI ESTÀ PLENA
        assertEquals("Agost", llistaMesos.get(8).getNom()); //MIRA SI LA POSICIÓ 8 ÉS AGOST
    }
}