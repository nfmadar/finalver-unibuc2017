import java.util.Scanner;

public class splitter {

	public static void main(String[] args) {
		// fetched from
		// http://promise.site.uottawa.ca/SERepository/datasets/cocomonasa_v1.arff
		String myCocomo;
		Scanner sc = new Scanner(System.in);
		myCocomo = sc.nextLine();
		sc.close();
		String[] splitted = myCocomo.split(",");
		for (int i = 0; i < splitted.length; i++) {
			switch (i) {
			case 0:
				if (splitted[i].equalsIgnoreCase("low")) {
					splitted[i] = "0.88";
				} else if (splitted[i].equalsIgnoreCase("nominal")) {
					splitted[i] = "1.00";
				} else if (splitted[i].equalsIgnoreCase("high")) {
					splitted[i] = "1.15";
				} else if (splitted[i].equalsIgnoreCase("very_high")) {
					splitted[i] = "1.40";
				}
				break;
			case 1:
				if (splitted[i].equalsIgnoreCase("low")) {
					splitted[i] = "0.94";
				} else if (splitted[i].equalsIgnoreCase("nominal")) {
					splitted[i] = "1.00";
				} else if (splitted[i].equalsIgnoreCase("high")) {
					splitted[i] = "1.08";
				} else if (splitted[i].equalsIgnoreCase("very_high")) {
					splitted[i] = "1.16";
				}
				break;
			case 2:
				if (splitted[i].equalsIgnoreCase("low")) {
					splitted[i] = "0.85";
				} else if (splitted[i].equalsIgnoreCase("nominal")) {
					splitted[i] = "1.00";
				} else if (splitted[i].equalsIgnoreCase("high")) {
					splitted[i] = "1.15";
				} else if (splitted[i].equalsIgnoreCase("very_high")) {
					splitted[i] = "1.30";
				} else if (splitted[i].equalsIgnoreCase("extra_high")) {
					splitted[i] = "1.65";
				}
				break;
			case 3:
				if (splitted[i].equalsIgnoreCase("extra_high")) {
					splitted[i] = "1.66";
				} else if (splitted[i].equalsIgnoreCase("nominal")) {
					splitted[i] = "1.00";
				} else if (splitted[i].equalsIgnoreCase("high")) {
					splitted[i] = "1.11";
				} else if (splitted[i].equalsIgnoreCase("very_high")) {
					splitted[i] = "1.30";
				}
				break;
			case 4:
				if (splitted[i].equalsIgnoreCase("extra_high")) {
					splitted[i] = "1.56";
				} else if (splitted[i].equalsIgnoreCase("nominal")) {
					splitted[i] = "1.00";
				} else if (splitted[i].equalsIgnoreCase("high")) {
					splitted[i] = "1.06";
				} else if (splitted[i].equalsIgnoreCase("very_high")) {
					splitted[i] = "1.21";
				}
				break;
			case 5:
				if (splitted[i].equalsIgnoreCase("low")) {
					splitted[i] = "0.87";
				} else if (splitted[i].equalsIgnoreCase("nominal")) {
					splitted[i] = "1.00";
				} else if (splitted[i].equalsIgnoreCase("high")) {
					splitted[i] = "1.15";
				}
				break;
			case 6:
				if (splitted[i].equalsIgnoreCase("low")) {
					splitted[i] = "0.87";
				} else if (splitted[i].equalsIgnoreCase("nominal")) {
					splitted[i] = "1.00";
				} else if (splitted[i].equalsIgnoreCase("high")) {
					splitted[i] = "1.07";
				}
				break;
			case 7:
				if (splitted[i].equalsIgnoreCase("nominal")) {
					splitted[i] = "1.00";
				} else if (splitted[i].equalsIgnoreCase("high")) {
					splitted[i] = "0.86";
				} else if (splitted[i].equalsIgnoreCase("very_high")) {
					splitted[i] = "0.71";
				}
				break;
			case 8:
				if (splitted[i].equalsIgnoreCase("nominal")) {
					splitted[i] = "1.00";
				} else if (splitted[i].equalsIgnoreCase("high")) {
					splitted[i] = "0.91";
				} else if (splitted[i].equalsIgnoreCase("very_high")) {
					splitted[i] = "0.82";
				}
				break;
			case 9:
				if (splitted[i].equalsIgnoreCase("nominal")) {
					splitted[i] = "1.00";
				} else if (splitted[i].equalsIgnoreCase("high")) {
					splitted[i] = "0.86";
				} else if (splitted[i].equalsIgnoreCase("very_high")) {
					splitted[i] = "0.70";
				}
				break;
			case 10:
				if (splitted[i].equalsIgnoreCase("nominal")) {
					splitted[i] = "1.00";
				} else if (splitted[i].equalsIgnoreCase("high")) {
					splitted[i] = "0.90";
				} else if (splitted[i].equalsIgnoreCase("low")) {
					splitted[i] = "1.10";
				}
				break;
			case 11:
				if (splitted[i].equalsIgnoreCase("nominal")) {
					splitted[i] = "1.00";
				} else if (splitted[i].equalsIgnoreCase("high")) {
					splitted[i] = "0.95";
				} else if (splitted[i].equalsIgnoreCase("very_low")) {
					splitted[i] = "1.14";
				} else if (splitted[i].equalsIgnoreCase("low")) {
					splitted[i] = "1.07";
				}
				break;
			case 12:
				if (splitted[i].equalsIgnoreCase("nominal")) {
					splitted[i] = "1.00";
				} else if (splitted[i].equalsIgnoreCase("high")) {
					splitted[i] = "0.91";
				} else if (splitted[i].equalsIgnoreCase("very_high")) {
					splitted[i] = "0.82";
				} else if (splitted[i].equalsIgnoreCase("low")) {
					splitted[i] = "1.10";
				}
				break;
			case 13:
				if (splitted[i].equalsIgnoreCase("nominal")) {
					splitted[i] = "1.00";
				} else if (splitted[i].equalsIgnoreCase("high")) {
					splitted[i] = "0.91";
				} else if (splitted[i].equalsIgnoreCase("Low")) {
					splitted[i] = "1.10";
				} else if (splitted[i].equalsIgnoreCase("very_high")) {
					splitted[i] = "0.83";
				} else if (splitted[i].equalsIgnoreCase("very_low")) {
					splitted[i] = "1.24";
				}
				break;
			case 14: 
				if (splitted[i].equalsIgnoreCase("nominal")) {
					splitted[i] = "1.00";
				} else if (splitted[i].equalsIgnoreCase("high")) {
					splitted[i] = "1.04";
				} else if (splitted[i].equalsIgnoreCase("low")) {
					splitted[i] = "1.08";
				}
				break;
			}
		}

		for (int i = 0; i < splitted.length; i++) {
			System.out.print(splitted[i] + ",");
			if (i == splitted.length - 1)
				System.out.println();
		}
	}

}
