/**
 * 第7章 武士のお仕事
 *
 * 問題10  抽象クラス
 *
 * 抽象クラス、抽象メソッドを作る。
 *
 * 侍クラスのwork()メソッドを抽象化してください。
 *
 * <実行例>
 * 侍は働きます。
 *
 * 具体的に言うと藩士は年貢を取り立てます。
 *
 * 藩士1：
 * 年貢を取り立てるよ～。
 *
 * 具体的に言うと浪人は傘張りをします。
 *
 * 浪人1：
 * 傘張るよ～。
 *
 */

package lesson07.challenge10;

abstract class Samurai {

	protected String name;

	void fight() {
		System.out.println("戦うよ～。");
	}

	abstract void work();

}

//ここにRetainerクラスを記述
class Retainer extends Samurai {
	protected String domain;

	Retainer(String name, String domain) {
		this.name = name;
		this.domain = domain;
	}

	Retainer() {

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

//ここにRoninクラスを記述
class Ronin extends Samurai {

	public Ronin() {

	}

	public Ronin(String name) {
		this.name = name;
	}

	void covered() {
		System.out.println("傘張りするよ～。");
	}

	@Override
	void work() {
		System.out.println("傘張るよ～。");
	}

	@Override
	public String toString() {
		return "拙者は武州○△□村の浪人、" + name + "ともうす。";
	}
}

public class CastleTown {

	public static void main(String[] args) {
		System.out.println("侍は働きます。");

		System.out.println("\n具体的に言うと藩士は年貢を取り立てます。\n");

		System.out.println("藩士1：");

		//ここに適切な処理を記述
		Retainer ret = new Retainer();
		ret.work();

		System.out.println("\n具体的に言うと浪人は傘張りをします。\n");

		System.out.println("浪人1：");

		//ここに適切な処理を記述
		Ronin ronin = new Ronin();
		ronin.work();

	}
}
