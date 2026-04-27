package lesson05.challenge10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SuperRobot {
	int getenergy() {
		return energy;
	}

	// フィールド
	int energy = 100;

	void makeLuxuryDish(int meat, int vegetables, int spice) {

		System.out.println("SuperRobot：調理を開始します...\n");

		energy -= 20;

		if (meat >= 5 && vegetables >= 5 && spice >= 5) {
			System.out.println("超豪華フルコースを作成しました！");
		} else if (meat >= 2 && vegetables >= 2 && spice >= 1) {
			System.out.println("豪華ステーキディナーを作成しました！");
		} else if (meat >= 1 && vegetables >= 1) {
			System.out.println("肉野菜炒めをどうぞ！");
		} else if (vegetables >= 1) {
			System.out.println("サラダをどうぞ！");
		} else {
			System.out.println("頑張りましたが、何も作れませんでした…");
		}

		System.out.println("残りエネルギー：" + energy + "\n");
	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		SuperRobot robot = new SuperRobot();
		int meats, vegetables, spices;
		System.out.println("エネルギーの限り、料理を作り続けます！\n");
		while (true) {
			System.out.print("肉を何個くれますか？>");
			String meatnum = reader.readLine();
			meats = Integer.parseInt(meatnum);
			System.out.print("野菜を何個くれますか？>");
			String vegetablesnum = reader.readLine();
			vegetables = Integer.parseInt(vegetablesnum);
			System.out.print("スパイスを何グラムくれますか？>");
			String spicenum = reader.readLine();
			spices = Integer.parseInt(spicenum);
			robot.makeLuxuryDish(meats, vegetables, spices);

			if (robot.getenergy() <= 0) {
				System.out.println("エナジーがもうありません。\n充電を開始します．．．");
				break;
			}
		}
	}
}
