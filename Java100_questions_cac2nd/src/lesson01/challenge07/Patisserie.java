/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題7 10分割して販売する
 *
 * マカロンが大きすぎて売上が芳しくないので
 * 1個のマカロンを10分割して0.1個から販売することにします。
 * (値段も0.1倍～)
 * ただし合計金額と在庫は小数を切り捨て、
 * 常に整数で表示します。
 *
 * 問題6の答えを改変し、以下の実行例を参考に処理を記述してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >5
 * ショコラ      >1.5
 * ピスターシュ  >2.5
 *
 * シトロン     5.0個
 * ショコラ     1.5個
 * ピスターシュ 2.5個
 *
 * 合計個数    9.0個
 * 合計金額   2470円
 *
 * をお買いあげですね。
 * 承りました。
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り25個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り27個
 *
 */

package lesson01.challenge07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {

		double buy_sum = 0, buy_money = 0;
		double sit = 30, sho = 30, pis = 30;

		System.out.println("大変お待たせしました。");
		System.out.println("【ポエール・ネルメ】");
		System.out.println("ただいまより開店です！！\n");

		System.out.println("本日のおすすめ商品です。\n");

		System.out.println("シトロン     \\250 ・・・ 残り" + (int) sit + "個");
		System.out.println("ショコラ     \\280 ・・・ 残り" + (int) sho + "個");
		System.out.println("ピスタージュ \\320 ・・・ 残り" + (int) pis + "個\n");

		System.out.println("それぞれ何個ずつ買いますか？（最大30個まで）\n");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("シトロン     >");
		String str1 = reader.readLine();
		double buy_sit = Double.parseDouble(str1);
		buy_sum += buy_sit;
		buy_money += (buy_sit * 250);
		sit -= buy_sit;

		System.out.print("ショコラ     >");
		String str2 = reader.readLine();
		double buy_sho = Double.parseDouble(str2);
		buy_sum += buy_sho;
		buy_money += (buy_sho * 280);
		sho -= buy_sho;

		System.out.print("ピスタージュ >");
		String str3 = reader.readLine();
		double buy_pis = Double.parseDouble(str3);
		buy_sum += buy_pis;
		buy_money += (buy_pis * 320);
		pis -= buy_pis;

		System.out.println("\nシトロン    " + buy_sit + "個");
		System.out.println("ショコラ    " + buy_sho + "個");
		System.out.println("ピスタージュ" + buy_pis + "個\n");

		System.out.println("合計個数    " + buy_sum + "個");
		System.out.println("合計金額    " + (int) buy_money + "円\n");

		System.out.println("をお買い上げですね。");
		System.out.println("承りました。\n");

		System.out.println("本日のおすすめ商品です。\n");

		System.out.println("シトロン     \\250 ・・・ 残り" + (int) sit + "個");
		System.out.println("ショコラ     \\280 ・・・ 残り" + (int) sho + "個");
		System.out.println("ピスタージュ \\320 ・・・ 残り" + (int) pis + "個\n");

	}

}