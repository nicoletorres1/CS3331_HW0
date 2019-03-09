/*
 * Author: Nicole Torres
 * Date: 02/ 04/ 19
 * HW 0
 * CS 3331
 */

package edu.utep.cs.cs3331.pricewatcher;

public class Main {

	public void run() {
		Item item = new Item();
		ConsoleUi ui = new ConsoleUi(item);
		ui.showWelcome();

		int request;
		ui.showItem();
		do {
			request = ui.promptUser();
			switch (request) {
				case 1:
					ui.showPrice();
					ui.newLine();
					break;
				case 2:
					ui.showURL();
					break;
				case 3:
					ui.showItem();
					break;
				case -1:
					ui.showThanks();
					break;
				default:
					ui.showNotOption();
					break;
			}
		} while (request != -1);

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
