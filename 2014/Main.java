import javax.print.DocFlavor.INPUT_STREAM;

public class Main{
    public static void main(String args[]){
        String in_sub_str = System.console().readLine("���Ȑ�����͂��Ă�������");
        int sub_n = Integer.parseInt(in_sub_str);
        
        String in_stu_str = System.console().readLine("�w��������͂��Ă�������");
        int stu_n = Integer.parseInt(in_stu_str);

        for(int i = 0; i < sub_n; i++){
            int top = 0;
            double sum = 0;
            for(int j = 0; j < stu_n; j++){
                String message = "�w��" + j +"�̋���"+ i +"�̂���͂��Ă�������";
                int score = Integer.parseInt(System.console().readLine(message));
                sum += score;
                if( top < score ) top = score;
            }
            System.out.println("����"+ i +"�̃g�b�v��" + top + "�_�ł���");
            System.out.println("����"+ i +"�̕��ς�" + (sum/stu_n) + "�_�ł���");
        }
    }
}