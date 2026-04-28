package lesson09.challenge04.Nurserry.logic;

import lesson09.challenge04.Nurserry.Exception.CriticalConditionException;

public class Nurse {
	private String name;

	public Nurse(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//ここに適切な処理を記述
	public void takeTemperature(NurserySchoolChild child) {
		try {
			if (child.getTemperature() >= 38) {
				throw new CriticalConditionException("\n" + child.getName() + "は重体です。すぐに病院に行ってください。\n");
			} else {
				System.out.println("\n" + child.getName() + "の体温は" + child.getTemperature() + "度です。");
			}
		} catch (CriticalConditionException e) {
			System.out.println(e.getMessage());
		}
	}
}