import java.io.Console;

public class Main{
  public static void main(String args[]){
    int[] m = {3,1,4,1,5,9,2,6,5,3,5,8,9,7,9,3,2,3,8,4,6,2,6,4,3,3,8,3,2,7,9,5};

    //(1) �z��m�̗v�f�Ɨv�f����\������
    System.out.println("(1)���̔z��:");
    for(int i=0;i<m.length;i++){
      System.out.print(" "+m[i]);
    }
    System.out.println();
    System.out.println("�z��̗v�f��:"+m.length);

    //(2) �z��m�̎Z�p���ς����߂�
    double arithmeric_mean = 0;
    for(int i=0;i<m.length;i++){
      arithmeric_mean += m[i];
    }
    arithmeric_mean /= m.length;
    System.out.println("(2)�Z�p����:"+arithmeric_mean);

    //(3) �z��m�̗v�f�ɂ��āA�����͉��Z�A��͌��Z�Ƃ��āA�a�����ߕ\������
    int calculated = 0;
    for(int i=0;i<m.length;i++){
      if(m[i] % 2 == 0){
        calculated += m[i];
      }else{
        calculated -= m[i];
      }
    }
    System.out.println("(3)�v�Z����:"+calculated);

    //(4) �z��m�̗v�f���t���ɂ����z��r�����߂�
    int[] r = new int[m.length];
    for(int i = 0;i<m.length;i++){
      r[i] = m[m.length - i - 1];
    }
    System.out.println("(4)�z��r:");
    for(int i=0;i<r.length;i++){
      System.out.print(" "+r[i]);
    }
    System.out.println();

    //(5) �z��m�̗v�f�̂����A���lz�̌������ߕ\������B�������Az��0����9�̔C�ӂ�
    //�l�ł���A�L�[�{�[�h������͂�����̂Ƃ���B�����z���폜�����z��s�����߂�B
    //�܂��폜�����v�f�ʒu�͏������̗v�f���l�߂邱�ƁB����ɁA�폜�����v�f�̌���
    //��-1��z��̌�납�疄�߂�B�z��s�̗v�f��\������B
    Console console = System.console();
    String line = console.readLine();
    int z = Integer.parseInt(line);
    int z_count = 0;
    for(int i=0;i<m.length;i++){
      if(m[i] == z){
        z_count++;
      }
    }
    System.out.println("(5.1)���lz�̌�:"+z_count);
    int[] s = new int[m.length];
    int tmp = 0;
    for(int i=0;i<s.length;i++){
      if(m[i] != z){
        s[i-tmp] = m[i];
      }else{
        tmp++;
      }
    }
    for(int i=0;i<z_count;i++){
      s[s.length-i-1] = -1;
    }
    System.out.println("(5.2)�z��s:");
    for(int i=0;i<s.length;i++){
      System.out.print(" "+s[i]);
    }
    System.out.println();

  }
}
