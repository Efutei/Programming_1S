import javax.print.DocFlavor.INPUT_STREAM;

public class Main{
    public static void main(String args[]){
        //2�̗ݏ�����߂���
        System.out.println("2��n������߂܂�");
        int q1_num = Integer.parseInt(System.console().readLine("����n����͂��Ă�������:"));
        int ret1 = 1;
        for(int i = 0 ; i < q1_num; i ++){
            ret1 *= 2;
        }
        System.out.println("2��"+ q1_num +"���" + ret1 + "�ł�");

        System.out.println("----------------------------------------------");
        
        //5�̊K������߂���
        System.out.println("5�̊K������߂܂�");
        int ret2 = 1;
        for(int i = 0 ; i < 5; i ++){
            ret2 *= (i+1);
        }
        System.out.println("5�̊K���" + ret2 + "�ł�");

        System.out.println("----------------------------------------------");

        //�^����ꂽ�~���m���ɂ���ďo�͂��镶�͂�ς�����(�h�ȏ�h��h�ȉ��h�A�h�����h�A�h����h�̔���)
        System.out.println("�~���m���ɂ���ă��b�Z�[�W��\�����܂�");
        int q3_num = Integer.parseInt(System.console().readLine("�~���m������͂��Ă�������(0~100):"));
        if(q3_num >= 80){
            System.out.println("�P��Y�ꂸ�Ɏ����Ă���������");
        }else if(q3_num > 30){
            System.out.println("�O�̂��ߐ܂��ݎP�������܂��傤");
        }else{
            System.out.println("�������a�ł��I");
        }
    }
}