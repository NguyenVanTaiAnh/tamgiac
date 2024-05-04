package Source;

public class CheckTriangle {

    public static String CheckTriangleFunction(double a, double b, double c) {
        // Kiểm tra điều kiện không phải tam giác
        if (a <= 0 || b <= 0 || c <= 0 || (a + b <= c) || (b + c <= a) || (a + c <= b)) {
            return "NotATriangle";
        }

        // Kiểm tra tam giác đều
        if (a == b && b == c) {
            return "Equilateral";
        }

        // Kiểm tra tam giác vuông
        if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
            return "RightTriangle";
        }

        // Kiểm tra tam giác cân
        if (a == b || b == c || a == c) {
            return "Isosceles";
        }

        // Các trường hợp còn lại là tam giác thường
        return "Scalene";
    }

}