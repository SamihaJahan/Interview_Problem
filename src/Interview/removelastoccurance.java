package Interview;

public class removelastoccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "I am a good boy, now I am going to school";
		String str2 = "am";
		lastOccurrenceRemove(str1, str2);

	}
	
	

	private static void lastOccurrenceRemove(String str1, String str2) {
		int lastposition = -1;
		String strArray[] = str1.split(" ");
		for (int i = strArray.length - 1; i >= 0; i--) {
			if (strArray[i].equals(str2)) {
				strArray[i] = "";
				lastposition = i;
				break;
			}
		}
		String newString = "";
		for (int i = 0; i < strArray.length; i++) {
			if (i == lastposition) {
				continue;
			}
			newString = newString + " " + strArray[i];
		}
		System.out.println(newString);
		
	}

	}