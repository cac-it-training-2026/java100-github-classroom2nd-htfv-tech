/**
 * 第7章 武士のお仕事
 *
 * 問題12 インターフェース①
 *
 * 勘定奉行インターフェースを作る。
 *
 * 抽象メソッドfigure()を持つ勘定奉行インターフェースIChiefTreasurerを
 * 作成し、問題3で作成した奉行クラスMagistrateに実装してください。
 *
 * <実行例>
 * 奉行に勘定奉行を兼ねてもらうことになりました。
 *
 * 奉行1：
 * 藩の資産を計算するよ～。
 *
 */

package lesson07.challenge12;

//ここにIChiefTreasurerインターフェースを記述
interface IChiefTreasurer {
	void figure();
}

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

class Magistrate extends Retainer implements IChiefTreasurer {
	void judge() {
		System.out.println("判決を下すよ～。");
	}

	@Override
	public void figure() {
		System.out.println("藩の資産を計算するよ～。");
	}
}

public class CastleTown {

	public static void main(String[] args) {
		System.out.println("奉行に勘定奉行を兼ねてもらうことになりました。\n");

		System.out.println("奉行1：");

		//ここに適切な処理を記述
		Magistrate magistrate = new Magistrate();
		magistrate.figure();

	}
}
