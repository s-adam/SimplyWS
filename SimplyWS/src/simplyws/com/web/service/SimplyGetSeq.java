package simplyws.com.web.service;

/**
 * \brief Class SimplyGetSeq 
 * \details Class SimplyGetSeq is a class that holds
 * one function count sequences
 **/

public class SimplyGetSeq {
	/**
	 * \brief Function finding sequence in string of chars.
	 * \details Searches the repeats of String ciag in String zbior, counts it and 
	 * overwrite it to variable counts
	 * \param zbior main base string which in where is searched
	 * \param ciag is the search string in zbior
	 * \return counts of ciag in zbior
	 **/
	public static int countSequences(String zbior, String ciag) {
		// String zbior = "abcabcaabca";
		// String ciag = "ab";
		int count = 0, c = 0, i = 0;
		while (i < zbior.length()) {

			for (int j = 0; j < ciag.length(); j++) {
				// System.out.println(i + ": " + j + ": " + c + ": " + count +
				// ": ");

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
