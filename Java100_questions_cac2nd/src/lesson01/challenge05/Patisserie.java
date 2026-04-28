/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題5 合計金額を求める
 *
 * 入力されたマカロンの個数から合計購入数、合計金額を求めます。
 * 合計購入数、合計金額を求める処理を追記した後で
 * [問題4]の表示を実行例を参考にして改変してください。
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
 * 合計個数    16個
 * 合計金額  4480円
 *
 * をお買いあげですね。
 * 承りました。
 *
 */

package lesson01.challenge05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {

		int buy_sum = 0, buy_money = 0;

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
		buy_sum += buy_sit;
		buy_money += (buy_sit * 250);

		System.out.print("ショコラ     >");
		String str2 = reader.readLine();
		int buy_sho = Integer.parseInt(str2);
		buy_sum += buy_sho;
		buy_money += (buy_sho * 280);

		System.out.print("ピスタージュ >");
		String str3 = reader.readLine();
		int buy_pis = Integer.parseInt(str3);
		buy_sum += buy_pis;
		buy_money += (buy_pis * 320);

		System.out.println("\nシトロン    " + buy_sit + "個");
		System.out.println("ショコラ    " + buy_sho + "個");
		System.out.println("ピスタージュ" + buy_pis + "個\n");

		System.out.println("合計個数    " + buy_sum + "個");
		System.out.println("合計金額    " + buy_money + "円\n");

		System.out.println("をお買い上げですね。");
		System.out.println("承りました。");
	}

}