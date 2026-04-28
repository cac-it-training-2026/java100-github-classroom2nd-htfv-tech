/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題9 新商品の開発
 *
 * 翌日から新商品を発売することにしました。
 * 新商品の名前は「三色マカロン」です。
 * シトロン、ショコラ、ピスターシュの３つの味が
 * 1個のマカロンに集約されているのが特徴で、
 * その配合率は前日の売上比で決まり、
 * 価格はマカロン１個あたりの平均売上価格に準じて
 * 自動的に決定されます。（ただし、1の位は切り捨て）
 *
 * 以下の実行例を参考に処理を追記、改変してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 * 明日の三色マカロンの配合率が決まりました！
 *
 * シトロンの味    ・・・ 50%
 * ショコラの味    ・・・ 17%
 * ピスターシュの味・・・ 32%
 *
 * が楽しめます！
 *
 * 値段は\270です。
 *
 */

package lesson01.challenge09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {

		double buy_sum = 0, buy_money = 0;
		double sit = 30, sho = 30, pis = 30;
		double sit_par = 0, sho_par = 0, pis_par = 0;

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

		System.out.println("閉店時間になりました。");
		System.out.println("またのお越しをお待ちしております。\n");

		System.out.println("売上の割合");
		System.out.println("売上合計      \\" + (int) buy_money + "\n");
		System.out.println("内訳");
		sit_par = (100 * buy_sit * 250 / buy_money);
		sho_par = (100 * buy_sho * 280 / buy_money);
		pis_par = (100 * buy_pis * 320 / buy_money);

		System.out.println("シトロン      \\" + (int) (buy_sit * 250) + "・・・ " + (int) sit_par + "%");
		System.out.println("ショコラ      \\" + (int) (buy_sho * 280) + "・・・" + (int) sho_par + "%");
		System.out.println("ピスタージュ  \\" + (int) (buy_pis * 320) + "・・・" + (int) pis_par + "%\n");

		System.out.println("明日の三色マカロンの配合率が決まりました！\n");
		System.out.println("シトロンの味    ・・・" + (int) sit_par + "%");
		System.out.println("ショコラの味    ・・・" + (int) sho_par + "%");
		System.out.println("ピスタージュの味・・・" + (int) pis_par + "%\n");
		System.out.println("が楽しめます！\n");
		int threemaka = (((int) buy_money / (int) buy_sum) / 10) * 10;
		System.out.println("値段は\\" + threemaka + "です。");

	}

}
