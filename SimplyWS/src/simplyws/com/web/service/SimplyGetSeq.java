package simplyws.com.web.service;

public class SimplyGetSeq {
	
	public static int CountSequences(String zbior, String ciag) {
		// String zbior = "abcabcaabca";
		// String ciag = "ab";
		int count = 0, c = 0, i = 0;
		while (i < zbior.length()) {

			for (int j = 0; j < ciag.length(); j++) {
				//System.out.println(i + ": " + j + ": " + c + ": " + count + ": ");

				if (zbior.charAt(i) == ciag.charAt(j)) {
					c++;
					i++;
				} else if (c != 0) {
					j = ciag.length();
					c = 0;
					// i++;
				} else if (ciag.charAt(0) != zbior.charAt(i)) {
					i++;
				}
				if (c == ciag.length()) {
					count++;
					c = 0;
					j = ciag.length();// exithh
				}
				if (i == zbior.length())
					break;

			}

		}
		return count;
	}

}
