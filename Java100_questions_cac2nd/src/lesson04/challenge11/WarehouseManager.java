/**
 * 第4章 倉庫番のお仕事
 *
 * 問題11 荷物の入れ替え（三つの配列をまとめる）
 *
 * MQ運送から、新たに三つのコンテナ群を預かり
 * 委託管理を行うことになりました。
 * 三つのコンテナ群はそれぞれ5箱ずつからなり、
 * 合計すると15箱の入れ物になります。
 *
 * 併せてMQ運送から依頼があり、
 * コンテナ群のうち空き箱がいくつかあるので、
 * 空いてるところは詰めてほしいと言われました。
 * つまり、
 *
 * 有、空、有、空、有
 *
 * と並んでいた場合は、
 *
 * 有、有、有、空、空
 *
 * としてほしいという依頼です。
 *
 * 各コンテナのどの箱が空き箱なのかはランダムに決定し、
 * 空き箱である確率は1/4です。
 * 中身がある箱には1～10の何れかの数値が入り、
 * これもランダムに決定します。
 *
 * コメントの位置に適切なコードを記述し、
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例>
 *  E主任：
 *  MQ運送の件、お願いします。
 *
 *  Yさん：
 *  はい、まずは現状から確認いたします。
 *
 *  C...3,4,4,0,7
 *
 *  D...0,5,0,9,0
 *
 *  E...2,1,3,10,6
 *
 *  でした。直してきます...
 *
 *  Yさん：
 *  直してきました。
 *
 *  C...3,4,4,7,5
 *
 *  D...9,2,1,3,10
 *
 *  E...6,0,0,0,0
 *
 *  になりました。
 *
 *  E主任：
 *  ご苦労さまでした。
 *
 */

package lesson04.challenge11;

public class WarehouseManager {

	public static void main(String[] args) {

		//ここに必要な配列の宣言を記述する。
		int[] CArray = { 0, 0, 0, 0, 0 };
		int[] DArray = { 0, 0, 0, 0, 0 };
		int[] EArray = { 0, 0, 0, 0, 0 };

		//ここに配列に値を代入する処理を記述する。(要素はランダム)
		int randten = 0;

		for (int i = 0; i < 5; i++) {
			randten = (int) (Math.random() * 100) + 1;
			if (randten > 25) {
				CArray[i] = randten / 10;
			}
			randten = (int) (Math.random() * 100) + 1;
			if (randten > 25) {
				DArray[i] = randten / 10;
			}
			randten = (int) (Math.random() * 100) + 1;
			if (randten > 25) {
				EArray[i] = randten / 10;
			}
		}

		System.out.println("E主任：");
		System.out.println("MQ運送の件、お願いします。\n");

		System.out.println("Yさん：");
		System.out.println("はい、まずは現状から確認いたします。\n");

		System.out.print("C...");

		//ここに配列Cの要素をすべて出力する処理を記述する。
		for (int i = 0; i < CArray.length; i++) {
			if (i == CArray.length - 1) {
				System.out.println(CArray[i]);
				break;
			}
			System.out.print(CArray[i] + ",");
		}
		System.out.print("\n\nD...");

		//ここに配列Dの要素をすべて出力する処理を記述する。
		for (int i = 0; i < DArray.length; i++) {
			if (i == DArray.length - 1) {
				System.out.println(DArray[i]);
				break;
			}
			System.out.print(DArray[i] + ",");
		}

		System.out.print("\n\nE...");

		//ここに配列Eの要素をすべて出力する処理を記述する。
		for (int i = 0; i < EArray.length; i++) {
			if (i == EArray.length - 1) {
				System.out.println(EArray[i]);
				break;
			}
			System.out.print(EArray[i] + ",");
		}

		System.out.println("\n\nでした。直してきます...\n");

		//ここに詰め替え処理を記述する
		int tmp = 0;
		int[] allArray = new int[15];
		for (int i = 0; i < allArray.length; i++) {
			if (i < 5) {
				allArray[i] = CArray[i];
			} else if (i >= 5 && i < 10) {
				allArray[i] = DArray[i - 5];
			} else if (i >= 10 && i < 15) {
				allArray[i] = EArray[i - 10];
			}
		}

		for (int i = 0; i < allArray.length; i++) {
			if (allArray[i] == 0) {
				tmp = allArray[i];
				for (int j = i + 1; j < allArray.length; j++) {
					if (allArray[j] > 0) {
						allArray[i] = allArray[j];
						allArray[j] = tmp;
						break;
					}
				}
			}
		}

		for (int i = 0; i < allArray.length; i++) {
			if (i < 5) {
				CArray[i] = allArray[i];
			} else if (i >= 5 && i < 10) {
				DArray[i - 5] = allArray[i];
			} else if (i >= 10 && i < 15) {
				EArray[i - 10] = allArray[i];
			}
		}

		System.out.println("Yさん：");
		System.out.println("直してきました。\n");

		System.out.print("C...");

		//ここに配列Cの要素をすべて出力する処理を記述する。
		for (int i = 0; i < CArray.length; i++) {
			if (i == CArray.length - 1) {
				System.out.println(CArray[i]);
				break;
			}
			System.out.print(CArray[i] + ",");
		}
		System.out.print("\n\nD...");

		//ここに配列Dの要素をすべて出力する処理を記述する。

		for (int i = 0; i < DArray.length; i++) {
			if (i == DArray.length - 1) {
				System.out.println(DArray[i]);
				break;
			}
			System.out.print(DArray[i] + ",");
		}

		System.out.print("\n\nE...");

		//ここに配列Eの要素をすべて出力する処理を記述する。
		for (int i = 0; i < EArray.length; i++) {
			if (i == EArray.length - 1) {
				System.out.println(EArray[i]);
				break;
			}
			System.out.print(EArray[i] + ",");
		}
		System.out.println("\n\nになりました。\n");

		System.out.println("E主任：");
		System.out.println("ご苦労さまでした。");
	}
}
