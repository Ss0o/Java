package JAVA.Chapter01;

public class SCE {
    //SCE(Short-Circuit Evaluation
    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 0;
        boolean result;

        result= ((num1 += 10) < 0) && ((num2 += 10) > 0);
        System.out.println("result = " + result);
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2 + '\n');

        result= ((num1 += 10) > 0) || ((num2 += 0) > 0);
        System.out.println("result = " + result);
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);


        /*
        num1,num2 둘의 값의 결과가 20으로 나오지 않는 이유
        (num1 += 10)<0 && (num2 += 10)>0 에서 (num1 += 10)<0 가 false면 (num2 += 10)>0의 과정이 생략
        (num1 += 10)>0 || (num2 += 10)>0 에서 (num1 += 10)<0 가 true면 (num2 += 10)>0의 과정이 생략
        즉, &&의 왼쪽 피연산자가 false면, 오른쪽 피연산자는 확인하지 않는다.
            ||의 왼쪽 피연산자가 true면, 오른쪽 피연산자는 확인하지 않는다.

       SCE의 부작용(뒤의 연산 생략) 해결: 나누어 계산
        num1 += 10;
        num2 += 10;
        result = (num1 < 0) && (num2 > 0);

        */
    }
}
