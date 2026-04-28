/**
 * 第7章 武士のお仕事
 *
 * 問題8  equals()メソッドの利用
 *
 * equals()メソッドを適切にオーバーライドする。
 *
 * 問題7で作成した藩士クラスにequals()メソッドをオーバーライドする
 * 記述を追加し、同じ藩の所属かどうか確認する処理に変更してください。
 * （※藩士クラスにフィールドprotected String domainを追記）
 * （名前と一緒に藩名もコンストラクタで設定する）
 *
 * <実行例>
 * ○△□藩の藩士を二つ作ります。
 *
 * 拙者は○△□藩士、テスト太郎ともうす。
 * 拙者は○△□藩士、テスト次郎ともうす。
 *
 * 同じ藩に所属しているか確認します。
 *
 * 【同じ藩に所属しています】
 *
 * ○△×藩の藩士を一つ作ります。
 *
 * 拙者は○△×藩士、テスト三郎ともうす。
 *
 * 同じ藩に所属しているか確認します。
 *
 * 【同じ藩に所属していません】
 *
 */

package lesson07.challenge08;

class Samurai {

	protected String name;

	void fight() {
		System.out.println("戦うよ～。");
	}

	void work() {
		System.out.println("何かして働くよ～");
	}

}

//ここにRetainerクラスを記述
class Retainer extends Samurai {
	protected String domain;

	Retainer(String name, String domain) {
		this.name = name;
		this.domain = domain;
	}

	void getPaid() {
		System.out.println("給料をもらうよ～。");
	}

	@Override
	void work() {
		System.out.println("年貢を取り立てるよ～。");
	}

	@Override
	public String toString() {
		return "拙者は" + domain + "士、" + name + "ともうす。";
	}

	@Override //オーバーライドは「メソッド名」と「引数の型、数、順番が同じ」でないといけないからわざわざ
				//引数をObject型にして回りくどいことをしているが、フィールドの数等が多くなった時に恩恵を得られる。
	public boolean equals(Object ret) {//equalsの戻り値はboolean型,引数はObject型。
										//equals()メソッドは本来二つ変数が同じオブジェクトを参照しているかどうかを判定するが、
										//オーバーライドすることで「何をもって同じとするか」を自分で定義できる
		Retainer retainer = (Retainer) ret;//引数retをRetainer型のretainerという変数にRetainer型にキャストして代入。
		if (this.domain.equals(retainer.domain)) {//this.domainとさっきキャストした
													//引数retが入ったretainer.domainの「文字列の中身」が同じかどうか判定（オーバーライドで改造）し、Yesならtrue,Noならfalseを返す。
			return true;
		}
		return false;

	}
}

public class CastleTown {

	public static void main(String[] args) {
		System.out.println("○△□藩の藩士を二つ作ります。\n");

		//ここに適切な処理を記述
		Retainer ret1 = new Retainer("テスト太郎", "○△□藩");
		Retainer ret2 = new Retainer("テスト次郎", "○△□藩");
		System.out.println(ret1.toString());
		System.out.println(ret2.toString());

		System.out.println("\n同じ藩に所属しているか確認します。\n");

		//ここに適切な処理を記述
		boolean sameDomain = ret1.equals(ret2);
		if (sameDomain) {
			System.out.println("同じ藩に所属しています。\n");
		} else {
			System.out.println("同じ藩に所属していません。\n");
		}
		System.out.println("\n○△×藩の藩士を一つ作ります。\n");

		//ここに適切な処理を記述
		Retainer ret3 = new Retainer("テスト三郎", "○△×藩");
		System.out.println(ret3.toString());

		System.out.println("\n同じ藩に所属しているか確認します。\n");

		//ここに適切な処理を記述
		sameDomain = ret1.equals(ret3);
		if (sameDomain) {
			System.out.println("同じ藩に所属しています。\n");
		} else {
			System.out.println("同じ藩に所属していません。\n");
		}

	}
}
