package org.howardbates.droidwwad.droidwwad;

import java.util.Random;

/**
 * Created by bates.he.z on 5/2/2014.
 */

public class ProcessWwad {

	private String resultText;

	public ProcessWwad() {
		resultText = "";
		setResultText();
	}

	public void setResultText() {
		String[] actions = new String[]{"Headbutt","Arm bar","Cobra strike","Side kick to throat","Side kick to heart","Knee drop to heart","Stomp to head","The claw","Sweep the leg","Roundhouse kick","Elbow strike","Spear hand"};
		Random result = new Random();
		int idx = result.nextInt(actions.length);
		resultText = actions[idx];
	}

	public String getResultText() {
		return resultText;
	}
}
