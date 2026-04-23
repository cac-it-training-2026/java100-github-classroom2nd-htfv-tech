/**
 * 第6章 宇宙飛行士のお仕事
 *
 * 問題12 StringBufferクラス（replace）
 *
 * 宇宙船が次の目的地Ω星に到着しました。
 * Ω星は不思議な星です。Ω星では名前の
 * 末尾が数字が入っているものは英語表記に置き換える
 * というルールがあります。
 * 例えば、「apple2」は「appletwo」に
 * 「windows98」は「windows9eight」に変更されます。
 *
 * Ω星人クラスOmegalianを新たに作成してください。
 * OmegalianはString型フィールドitemを持ち、メソッドsetItem()で登録します。
 * また、setItem()内で呼び出されるメソッドとして、
 * 受け取った数字を英語表記に変換して戻す
 * private String changeLastChar(char ch)を持ちます。
 *
 * <実行例>
 *
 * Ω星人にアイテムを渡してください＞iPhone6
 *
 * Ω星人：
 * えっ！iPhonesixをくれるオメガか！
 * ありがとうオメガ。
 *
 */

package lesson06.challenge12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//ここにOmegalianクラスを記述する
class Omegalian {
	String item;

	public void setItem(String item) {
		int lastIndex;
		char lastch;
		lastIndex = item.length() - 1;//最後の文字の位置を取る。
		lastch = item.charAt(lastIndex);//最後の文字を取得する。
		String laststr = changeLastChar(lastch);//最後の文字が数字ならそれを英語にする。
		if (laststr != null) {
			StringBuilder stringBuilder = new StringBuilder(item);//文字列を編集できる形にする（item（String型）をStringBuilder型にする。）
			stringBuilder.replace(lastIndex, lastIndex + 1, laststr);//stringBuilder.replace(開始位置,終了位置（この位置は含まない）,置き換える文字);←文字の置き換え。
			this.item = stringBuilder.toString();//編集できる状態→編集できない状態に戻す（StringBuilder型からString型に戻す）そのあとthis.でフィールドに戻す。
		} else {
			this.item = item;
		}

	}

	private String changeLastChar(char ch) {
		String str = null;
		switch (ch) {
		case '1':
			str = "one";
			break;

		case '2':
			str = "two";
			break;

		case '3':
			str = "three";
			break;

		case '4':
			str = "four";
			break;

		case '5':
			str = "five";
			break;

		case '6':
			str = "six";
			break;

		case '7':
			str = "seven";
			break;

		case '8':
			str = "eight";
			break;

		case '9':
			str = "nine";
			break;
		}
		return str;
	}

	public String getItem() {
		return item;
	}

}

public class Astronaut {

	public static void main(String[] args) throws IOException {

		System.out.print("Ω星人にアイテムを渡してください＞");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String present = br.readLine();

		//ここに適切な処理を記述する
		Omegalian omega = new Omegalian();

		String item = null;

		//ここに適切な処理を記述する
		omega.setItem(present);
		item = omega.getItem();

		System.out.println("\nΩ星人：");
		System.out.println("えっ！" + item + "をくれるオメガか！");
		System.out.println("ありがとうオメガ。");
	}
}
