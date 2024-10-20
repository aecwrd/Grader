import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class LetterGraderTest {
    LetterGrader letterGrader = new LetterGrader();
    
    // Math Test Casess
    @Test
    public void twoPlusTwoShouldEqualFour() {
        assertEquals(4, letterGrader.add(2, 2)); 
    }

    // Grader Test Cases
    @Test
    public void zeroShouldReturnIlegalArgumentException() {
        assertThrows(IllegalArgumentException.class,
            () -> {
                letterGrader.determineLetterGrade(-1);
            });
    }

    @Test
    public void zeroShouldReturnF() {
        assertEquals('F', letterGrader.determineLetterGrade(0));
    } 

    @Test
    public void fiftyShouldReturnF() {
        assertEquals('F', letterGrader.determineLetterGrade(50));
    }
    
    @Test
    public void fiftyNineShouldReturnF() {
        assertEquals('F', letterGrader.determineLetterGrade(59));
    }

    @Test
    public void sixtyNineShouldReturnD() {
        assertEquals('D', letterGrader.determineLetterGrade(69));
    }

    @Test
    public void seventyNineShouldReturnC() {
        assertEquals('C', letterGrader.determineLetterGrade(79));
    }

    @Test
    public void eightyNineShouldReturnB() {
        assertEquals('B', letterGrader.determineLetterGrade(89));
    }

    @Test
    public void ninetyNineShouldReturnA() {
        assertEquals('A', letterGrader.determineLetterGrade(99));
    }

}
