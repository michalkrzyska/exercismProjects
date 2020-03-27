import org.junit.Test;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class TriangleTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void equilateralTrianglesHaveEqualSides() throws TriangleException { //done
        Triangle triangle = new Triangle(2, 2, 2);

        assertTrue(triangle.isEquilateral());
    }

   
    @Test
    public void trianglesWithOneUnequalSideAreNotEquilateral() throws TriangleException { //done
        Triangle triangle = new Triangle(2, 3, 2);

        assertFalse(triangle.isEquilateral());
    }

   
    @Test
    public void trianglesWithNoEqualSidesAreNotEquilateral() throws TriangleException { //done
        Triangle triangle = new Triangle(5, 4, 6);

        assertFalse(triangle.isEquilateral());
    }

   
    @Test
    public void trianglesWithNoSizeAreIllegal() throws TriangleException { //done
        expectedException.expect(TriangleException.class);
        new Triangle(0, 0, 0);
    }

   
    @Test
    public void verySmallTrianglesCanBeEquilateral() throws TriangleException { //done
        Triangle triangle = new Triangle(0.5, 0.5, 0.5);

        assertTrue(triangle.isEquilateral());
    }

   
    @Test
    public void isoscelesTrianglesHaveLastTwoSidesEqual() throws TriangleException { //done
        Triangle triangle = new Triangle(3, 4, 4);

        assertTrue(triangle.isIsosceles());
    }

   
    @Test
    public void isoscelesTrianglesHaveTwoFirstSidesEqual() throws TriangleException { //done
        Triangle triangle = new Triangle(4, 4, 3);

        assertTrue(triangle.isIsosceles());
    }

   
    @Test
    public void isoscelesTrianglesHaveFirstAndLastSidesEqual() throws TriangleException { //done
        Triangle triangle = new Triangle(4, 3, 4);

        assertTrue(triangle.isIsosceles());
    }

   
    @Test
    public void equilateralTrianglesAreAlsoIsosceles() throws TriangleException { //done
        Triangle triangle = new Triangle(4, 4, 4);

        assertTrue(triangle.isIsosceles());
    }

   
    @Test
        public void noSidesAreEqualCantBeIsoceles() throws TriangleException { //done
        Triangle triangle = new Triangle(2, 3, 4);

        assertFalse(triangle.isIsosceles());
    }

   
    @Test
    public void firstTriangleInequalityViolation() throws TriangleException { //done
        expectedException.expect(TriangleException.class);
        new Triangle(1, 1, 3);
    }
    
   
    @Test
    public void secondTriangleInequalityViolation() throws TriangleException { //done
        expectedException.expect(TriangleException.class);
        new Triangle(1, 3, 1);
    }
    
   
    @Test
    public void thirdTriangleInequalityViolation() throws TriangleException { //done
        expectedException.expect(TriangleException.class);
        new Triangle(3, 1, 1);
    }

   
    @Test
    public void verySmallTrianglesCanBeIsosceles() throws TriangleException { //done
        Triangle triangle = new Triangle(0.5, 0.4, 0.5);

        assertTrue(triangle.isIsosceles());
    }

   
    @Test
    public void scaleneTrianglesHaveNoEqualSides() throws TriangleException { //done
        Triangle triangle = new Triangle(5, 4, 6);

        assertTrue(triangle.isScalene());
    }

   
    @Test
    public void allSidesEqualAreNotScalene() throws TriangleException { //done
        Triangle triangle = new Triangle(4, 4, 4);

        assertFalse(triangle.isScalene());
    }

   
    @Test
    public void twoSidesEqualAreNotScalene() throws TriangleException { //done
        Triangle triangle = new Triangle(4, 4, 3);

        assertFalse(triangle.isScalene());
    }

   
    @Test
    public void mayNotViolateTriangleInequality() //done
            throws TriangleException {
        expectedException.expect(TriangleException.class);
        new Triangle(7, 3, 2);
    }

   
    @Test
    public void verySmallTrianglesCanBeScalene() throws TriangleException { //done
        Triangle triangle = new Triangle(0.5, 0.4, 0.6);

        assertTrue(triangle.isScalene());
    }
}
