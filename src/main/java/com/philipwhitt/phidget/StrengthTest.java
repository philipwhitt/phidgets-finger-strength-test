package com.philipwhitt.phidget;

import com.phidgets.*;
import com.phidgets.event.*;

public class StrengthTest extends Thread {

	@Override
	public void run() {
		System.out.println("Running");
	}

	public static void main(String args[]) throws Exception {
		final InterfaceKitPhidget ik = new InterfaceKitPhidget();

		ik.addSensorChangeListener(new SensorChangeListener() {
			public void sensorChanged(SensorChangeEvent se) {
				try {
					if (se.getIndex() == 0) {
						setOutput(5, false);

						if (se.getValue() > 100 && se.getValue() < 300) {
							setOutput(0, true);

						} else if (se.getValue() >= 300 && se.getValue() < 500) {
							setOutput(1, true);

						} else if (se.getValue() >= 500 && se.getValue() < 650) {
							setOutput(2, true);

						} else if (se.getValue() >= 650 && se.getValue() < 900) {
							setOutput(3, true);

						} else if (se.getValue() >= 900 && se.getValue() < 950) {
							setOutput(4, true);

						} else if (se.getValue() >= 950) {
							setOutput(5, true);
						}
					}
				} catch (Exception e) {
					System.out.println("Whoops");
				}
			}

			private void setOutput(int maxOutputToSet, boolean value) throws Exception {
				for (int i : new int[]{0,1,2,3,4,5}) {
					ik.setOutputState(i, i <= maxOutputToSet ? value : false);
				}
			}

		});

		System.out.println("Opening");
		ik.openAny();

		System.out.println("Wating for attachment...");
		ik.waitForAttachment();

		System.out.println("Main");

		StrengthTest thread = new StrengthTest();
		thread.setDaemon(true);
		thread.start();

		System.out.println("End");
	}

}
