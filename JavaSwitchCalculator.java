






    public class JavaSwitchCalculator {
        static void calc(double numA, int numB, char operation) {

            switch (operation) {
                case '+':
                    System.out.println(numA + numB);
                    break;
                case '-':
                    System.out.println(numA - numB);
                    break;
                case '*':
                    System.out.println(numA * numB);
                    break;
                case '/':
                    System.out.println(numA / numB);
                    break;
                default:
                    System.out.println("This operation does not exist!");
            }
        }


        public static void main(String[] args) {
            calc(3, 9, '+');
            calc(3, 9, '-');
            calc(3, 9,'*');
            calc(3, 9, '/');
            calc(3, 9, '@');
        }
    }