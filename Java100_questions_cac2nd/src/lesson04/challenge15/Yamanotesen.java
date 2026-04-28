package lesson04.challenge15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Yamanotesen {

	public static void main(String[] args) throws IOException {

		String[] stationName = {
				"東京", "新宿", "新橋", "御徒町", "五反田", "浜松町", "渋谷", "田町",
				"恵比寿", "有楽町", "目黒", "大崎", "原宿", "品川", "目白", "大塚",
				"上野", "池袋", "日暮里", "西日暮里", "駒込", "田端", "高田馬場",
				"神田", "鴬谷", "代々木", "新大久保", "巣鴨", "高輪ゲートウェイ"
		};

		System.out.println("※※※ 山手線ゲーム ※※※");
		System.out.println("      ゲームスタート！    ");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		while (true) {

			String input = reader.readLine();

			boolean found = false;

			for (int i = 0; i < stationName.length; i++) {
				if (stationName[i] != null && stationName[i].equals(input)) {
					stationName[i] = null;
					found = true;
					break;
				}
			}

			if (!found) {
				System.out.println("あなたの負けです！");
				break;
			}

			boolean allUsed = true;
			for (int i = 0; i < stationName.length; i++) {
				if (stationName[i] != null) {
					allUsed = false;
					break;
				}
			}

			if (allUsed) {
				System.out.println("あなたの勝ちです！");
				break;
			}

			while (true) {
				int cpuIndex = (int) (Math.random() * stationName.length);

				if (stationName[cpuIndex] != null) {
					System.out.println(stationName[cpuIndex]);
					stationName[cpuIndex] = null;
					break;
				}
			}
		}
	}
}
