import javax.print.DocFlavor.INPUT_STREAM;

public class Main{
    public static void main(String args[]){
        //2の累乗を求める問題
        System.out.println("2のn乗を求めます");
        int q1_num = Integer.parseInt(System.console().readLine("数字nを入力してください:"));
        int ret1 = 1;
        for(int i = 0 ; i < q1_num; i ++){
            ret1 *= 2;
        }
        System.out.println("2の"+ q1_num +"乗は" + ret1 + "です");

        System.out.println("----------------------------------------------");
        
        //5の階乗を求める問題
        System.out.println("5の階乗を求めます");
        int ret2 = 1;
        for(int i = 0 ; i < 5; i ++){
            ret2 *= (i+1);
        }
        System.out.println("5の階乗は" + ret2 + "です");

        System.out.println("----------------------------------------------");

        //与えられた降水確率によって出力する文章を変える問題(”以上”や”以下”、”未満”、”より上”の判定)
        System.out.println("降水確率によってメッセージを表示します");
        int q3_num = Integer.parseInt(System.console().readLine("降水確率を入力してください(0~100):"));
        if(q3_num >= 80){
            System.out.println("傘を忘れずに持ってくださいね");
        }else if(q3_num > 30){
            System.out.println("念のため折り畳み傘を持ちましょう");
        }else{
            System.out.println("快晴日和です！");
        }
    }
}