package task_1;


public class SquareRoot {

        public static void main(String[] args) {
            double a = 3;
            double b = 2.5;
            double c = -0.5;

            double discriminant = Math.pow(b, 2) - 4 * a * c;

                if (discriminant < 0) {
                    System.out.println("x1=");
                    System.out.println("x2=");
                } else if (discriminant == 0){
                    double root = -b / (2 * a);
                    if (Double.isNaN(root) || Double.isInfinite(root)) {
                        System.out.println("x1=");
                        System.out.println("x2=");
                    } else if (root == 0) {
                        System.out.println("x1=0.0");
                        System.out.println("x2=0.0");
                    } else {
                        System.out.println("x1=" + root);
                        System.out.println("x2=" + root);
                    }
                }else{
                    double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                    double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                    if (Double.isNaN(root1) || Double.isInfinite(root1) ||
                            Double.isNaN(root2) || Double.isInfinite(root2)) {
                        System.out.println("x1=");
                        System.out.println("x2=");
                    } else if (root1 == 0 || root2 == 0) {
                        System.out.println("x1=0.0");
                        System.out.println("x2=0.0");
                    } else {
                        System.out.println("x1=" + root1);
                        System.out.println("x2=" + root2);
                    }
                };
            }
        }