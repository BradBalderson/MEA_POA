package Alignment;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by gabe on 22/08/2016.
 */
public class PairHMMTest {


    public PairHMM createSimpleProfile(){

        HashProfile first = new HashProfile("TTG");
        HashProfile second = new HashProfile("CTG");
        HashProfile third = new HashProfile("AATG");
        HashProfile fourth = new HashProfile("-CCG");

        HashProfile firstJoined = new HashProfile(first, second);
        HashProfile secondJoined = new HashProfile(third, fourth);

        double tau = 0.1;
        double epsilon = 0.1;
        double delta = 0.2;



        PairHMM pairHMM = new PairHMM(firstJoined, secondJoined, tau, epsilon, delta);
        return pairHMM;

    }

    @Test
    public void testMatchArrayCorrectProfilePairHMM(){
        PairHMM pairHMM = createSimpleProfile();
        assertNotNull(pairHMM);
    }

    @Test
    public void testMEA(){
        PairHMM pairHMM = createSimpleProfile();


    }



}