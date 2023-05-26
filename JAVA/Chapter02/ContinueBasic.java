package JAVA.Chapter02;

public class ContinueBasic {
    public static void main(String[] args) {
        int num=0,count=0;

        while( (num++) < 100 )
        {
            if((num % 5 != 0)||(num % 7 != 0))   //5의 배수가 아니거나 7의 배수가 아니라면 건너뛰고 while문 다시 시작
                continue;
            count++;                     //5와7의 배수인 경우 count값 증가 및 num출력
            System.out.println(num);
        }
        System.out.println("count: "+ count);
    }
}
