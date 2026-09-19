import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);
    int kaisuu = 1;
    boolean isFull = false;
    int gekikara = 0;
    int HP = 100;

    System.out.println("わんこそばチャレンジぃぃぃ！");
    System.out.println("【Enter】" + "を押してドンドン食べよう！\n何杯までいけるかな？");
    while (!isFull){
        scanner.nextLine();

        int dice = (int)(Math.random()*50)+1;

        if (dice == 1 ){
            System.out.print(kaisuu + "杯目でもう食べきれない...\n激辛記録" + gekikara + "杯！");
            isFull = true;
        } else if(dice >=2 && dice <=8) {
            gekikara = gekikara + 1;
            HP = HP - 30;
            System.out.print("辛っ！激辛わんこそばを食べてダメージを30くらった！");

            if(HP <= 0){
               System.out.println("舌が痛くてもう食べられない...\n連続記録"+kaisuu+"杯\n激辛記録"+gekikara+"杯");
               isFull = true;
            } else {
                System.out.println("残りHP"+HP);
            }
        } else {
            System.out.print(kaisuu + "杯目 : はいちゃーんちゃん！");
            kaisuu = kaisuu + 1;
            if (HP < 100){
                HP +=1;
            }

        }
    }

    System.out.println("おつかれさまでした！");
}