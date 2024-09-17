import java.util.*;

public class calculater {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter operand a :");
        int a = sc.nextInt();
       
            case '+':
                    System.out.println(a+b);
                    break;
            case '-':     
                    System.out.println(a-b);
                    break;
            case '*':
                    System.out.println(a*b);
                    break;
            case '/':                
                    System.out.println(a/b);
                    break;
            case '%':        
                    System.out.println(a%b);
                    break;
            default:
                    System.out.println("wrong operator selected");        
        }

    }
}
