package Week_2.testing.triangle_classifier;

import org.junit.jupiter.api.Test;

import static Week_2.testing.triangle_classifier.TriangleClassifier.checkTriangleClassifier;
import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    void testTriangleClassifier() {
        int edgeA = 2;
        int edgeB = 2;
        int edgeC = 2;
        String testResult = checkTriangleClassifier(edgeA, edgeB, edgeC);
        String result = "tam giác đều";
        assertEquals(result, testResult);
    }

    @Test
    void testTriangleClassifier1() {
        int edgeA = 2;
        int edgeB = 2;
        int edgeC = 3;
        String testResult = checkTriangleClassifier(edgeA, edgeB, edgeC);
        String result = "tam giác cân";
        assertEquals(result, testResult);
    }

    @Test
    void testTriangleClassifier2() {
        int edgeA = 3;
        int edgeB = 4;
        int edgeC = 5;
        String testResult = checkTriangleClassifier(edgeA, edgeB, edgeC);
        String result = "tam giác thường";
        assertEquals(result, testResult);
    }

    @Test
    void testTriangleClassifier3() {
        int edgeA = 8;
        int edgeB = 2;
        int edgeC = 3;
        String testResult = checkTriangleClassifier(edgeA, edgeB, edgeC);
        String result = "không phải là tam giác";
        assertEquals(result, testResult);
    }

    @Test
    void testTriangleClassifier4() {
        int edgeA = -1;
        int edgeB = 2;
        int edgeC = 1;
        String testResult = checkTriangleClassifier(edgeA, edgeB, edgeC);
        String result = "không phải là tam giác";
        assertEquals(result, testResult);
    }

    @Test
    void testTriangleClassifier5() {
        int edgeA = 0;
        int edgeB = 1;
        int edgeC = 1;
        String testResult = checkTriangleClassifier(edgeA, edgeB, edgeC);
        String result = "không phải là tam giác";
        assertEquals(result, testResult);
    }


}