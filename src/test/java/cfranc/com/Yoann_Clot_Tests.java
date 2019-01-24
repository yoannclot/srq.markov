/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cfranc.com;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

import org.junit.Test;
/**
 *
 * @author yoannclot
 */
public class Yoann_Clot_Tests {
    @Test
    public void test(){
        Markov m = new Markov();
        m.readFile("testCouples.txt");
        Couple p = new Couple("il", "etait");
        assertEquals(1, m.couples.size());
    }
    
    @Test
    public void testCouple(){
        Markov m = new Markov();
        m.readFile("testCouples.txt");
        Couple p = new Couple("il", "etait");
        List<String> l = new ArrayList<String>();
        l.add("une");
        assertEquals(l, m.couples.get(p));
    }
    
    @Test
    public void testGeneration(){
        Markov m = new Markov();
        m.readFile("testCouples.txt");
        Couple p = new Couple("il", "etait");
        assertEquals("il etait une ", m.generateText(p, 3));
    }
    
    @Test
    public void testPhraseIdentique(){
        Markov m = new Markov();
        m.readFile("histoire1.txt");
        Couple p = new Couple("il", "etait");
        assertEquals(3, m.couples.size());
    }
    
    @Test
    public void testPhraseDiff(){
        Markov m = new Markov();
        m.readFile("histoire2.txt");
        Couple p = new Couple("il", "etait");
        List<String> l = new ArrayList<String>();
        l.add("une");
        l.add("deux");
        assertEquals(l, m.couples.get(p));
    }
    
}
