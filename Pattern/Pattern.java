package Pattern;

public class Pattern {

    public static void squarePattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void rightAngle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void rightAngleWithNumber(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.printf("%d ", j + 1);
            }
            System.out.println("");
        }
    }

    public static void rightAngleWithSameNumber(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.printf("%d ", i + 1);
            }
            System.out.println("");
        }
    }

    public static void leftReverseRightAngle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void leftReverseRightAngleWithNumber(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.printf("%d ", j);
            }
            System.out.println("");
        }
    }

    public static void triangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }
            System.out.println("");
        }
    }

    public static void reverseTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < 2 * n - 2 * i - 1; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            System.out.println("");
        }
    }

    public static void kite(int n) {
        triangle(n);
        reverseTriangle(n);
    }

    public static void symmetricTriangles(int n) {
        for (int i = 0; i < 2 * n; i++) {
            int stars = i;
            if (i > n) {
                stars = 2 * n - i;
            }
            for (int j = 0; j < stars; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void rightAngleWithBinaryNumber(int n) {
        int star = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                star = 1;
            else
                star = 0;
            for (int j = 0; j <= i; j++) {
                System.out.printf("%d ", star);
                star = 1 - star;
            }
            System.out.println("");
        }
    }

    public static void hollowTriangle(int n) {
        int space = 2 * (n - 1);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d ", j);
            }
            for (int j = 1; j <= space; j++) {
                System.out.print("  ");

            }
            for (int j = i; j >= 1; j--) {
                System.out.printf("%d ", j);

            }
            System.out.println(" ");
            space = space - 2;
        }
    }

    public static void rightAngleWithNumberIncrement(int n) {
        int number = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d ", number);
                number = number + 1;
            }
            System.out.println("");
        }
    }

    public static void rightAngleWithAlphabet(int n) {
        for (int i = 0; i < n; i++) {
            for (char j = 'A'; j <= 'A' + i; j++) {
                System.out.printf("%c ", j);
            }
            System.out.println("");
        }
    }

    public static void reverseRightAngleWithAlphabet(int n) {
        for (int i = 0; i < n; i++) {
            for (char j = 'A'; j <= 'A' + (n - i - 1); j++) {
                System.out.printf("%c ", j);
            }
            System.out.println("");
        }
    }

    public static void rightAngleWithSameAlphabet(int n) {
        for (int i = 0; i < n; i++) {
            char ch = (char) ('A' + i);
            for (int j = 0; j <= i; j++) {
                System.out.printf("%c ", ch);
            }
            System.out.println("");
        }
    }

    public static void alphabetTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }

            char ch = 'A';
            int breakpoint = (2 * i + 1) / 2;
            for (int j = 1; j <= 2 * i + 1; j++) {
                System.out.printf("%c ", ch);
                if (j <= breakpoint)
                    ch = (char) (ch + 1);
                else
                    ch = (char) (ch - 1);
                // ch = (char) (ch - 1);
            }
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }
            System.out.println("");
        }
    }

    public static void reverseRightAngleWithReverseAlphabet(int n) {
        for (int i = 0; i < n; i++) {
            char ch = (char) ('A' + (n - i - 1));
            for (int j = 0; j <= i; j++) {
                System.out.printf("%c ", ch);
                ch = (char) (ch + 1);
            }
            System.out.println("");
        }
    }

    public static void hollowSquare(int n) {
        int spaces = 0;
        for (int i = 1; i <= n; i++) {
            int stars = n - i;
            // stars
            for (int j = 0; j <= stars; j++) {
                System.out.print("* ");
            }

            // space
            for (int j = 0; j < spaces; j++) {
                System.out.print("  ");
            }

            // stars
            for (int j = 0; j <= stars; j++) {
                System.out.print("* ");
            }

            System.out.println("");
            spaces += 2;
        }
        spaces = 2 * n - 2;
        for (int i = 1; i <= n; i++) {
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // space
            for (int j = 0; j < spaces; j++) {
                System.out.print("  ");
            }

            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println("");
            spaces -= 2;
        }
    }

    public static void xPattern(int n) {
        int spaces = 2 * n - 2;
        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = i;
            if (i > n)
                stars = 2 * n - i;

            for (int j = 1; j <= stars; j++) {
                System.out.print("* ");
            }

            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= stars; j++) {
                System.out.print("* ");
            }
            System.out.println("");
            if (i < n)
                spaces -= 2;
            else
                spaces += 2;
        }
    }

    public static void hollowSquarePattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println("");
        }
    }

    public static void squareWithNumbers(int n) {
        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                int left = j;
                int top = i;
                int right = 2 * n - 2 - j;
                int down = 2 * n - 2 - i;
                System.out.printf("%d ", n - Math.min(Math.min(left, right), Math.min(top, down)));
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int n = 4;
        squareWithNumbers(n);
    }
}
