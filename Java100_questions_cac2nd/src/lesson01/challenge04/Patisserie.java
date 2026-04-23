/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題4 注文を受ける
 *
 * 3種類のマカロンを任意の個数購入できるようにします。
 * [問題3]までの表示を行った後で
 * 実行例を参考に処理を追記してください。
 * （ >8 は >を表示した後で入力待ち状態になり、
 *   ユーザーがキーボードから8を入力したイメージです。）
 *
 *
 * <実行例>
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >8
 * ショコラ      >2
 * ピスターシュ  >6
 *
 * シトロン     8個
 * ショコラ     2個
 * ピスターシュ 6個
 *
 * をお買いあげですね。
 * 承りました。
 */

package lesson01.challenge04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {

		System.out.println("大変お待たせしました。");
		System.out.println("【ポエール・ネルメ】");
		System.out.println("ただいまより開店です！！\n");

		System.out.println("本日のおすすめ商品です。\n");

		int sit = 30, sho = 30, pis = 30;

		System.out.println("シトロン     \\250 ・・・ 残り" + sit + "個");
		System.out.println("ショコラ     \\280 ・・・ 残り" + sho + "個");
		System.out.println("ピスタージュ \\320 ・・・ 残り" + pis + "個\n");

		System.out.println("それぞれ何個ずつ買いますか？（最大30個まで）\n");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("シトロン     >");
		String str1 = reader.readLine();
		int buy_sit = Integer.parseInt(str1);

		System.out.print("ショコラ     >");
		String str2 = reader.readLine();
		int buy_sho = Integer.parseInt(str2);

		System.out.print("ピスタージュ >");
		String str3 = reader.readLine();
		int buy_pis = Integer.parseInt(str3);

		System.out.println("\nシトロン    " + buy_sit + "個");
		System.out.println("ショコラ    " + buy_sho + "個");
		System.out.println("ピスタージュ" + buy_pis + "個\n");

		System.out.println("をお買い上げですね。");
		System.out.println("承りました。");
	}

}
