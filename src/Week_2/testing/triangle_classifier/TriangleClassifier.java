package Week_2.testing.triangle_classifier;

public class TriangleClassifier {
    public static String checkTriangleClassifier(int edge1, int edge2, int edge3) {
        if (edge1 >= edge2 + edge3 || edge2 >= edge1 + edge3 || edge3 >= edge1 + edge2) {
            return "không phải là tam giác";
        } else if (edge1 == edge2 && edge1 == edge3)
            return "tam giác đều";
        if (edge1 == edge2 || edge1 == edge3 || edge2 == edge3)
            return "tam giác cân";
        else return "tam giác thường";
    }
}
