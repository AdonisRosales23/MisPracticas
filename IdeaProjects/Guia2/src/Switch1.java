public class Switch1 {
    public static void main(String[] args){
        int a = 1;
        int b = 1;
        char op = '+';
        System.out.print("El resultado es:");
        switch (op){
            case '+':
            System.out.print(a + b);
            break;
            case '-':
                System.out.print(a - b);
                break;
            case '*':
                System.out.print(a * b);
                break;
            case '/':
                System.out.print(a / b);
                break;
            default:
                System.out.print("Error");
                break;
        }
    }
}
