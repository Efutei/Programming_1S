import javax.print.DocFlavor.INPUT_STREAM;

public class Main{
    //�Q������p���ē��͂��ꂽ���̕����������߂���
    public static void main(String args[]){
        String in_num_str = System.console().readLine("��������͂��Ă�������:");
        int num = Integer.parseInt(in_num_str);
        double a = 1.0;
        for(int i = 0 ; i < 30; i ++){
            a = (a + num / a) / 2;
        }
        System.out.println("����"+ num +"�̕�������" + a + "�ł���");
    }
}