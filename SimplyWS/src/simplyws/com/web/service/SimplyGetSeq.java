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
		/// var count is for store amount of sequences
		/// c is for checking amount of chars which are the same like in String ciag.
		/// i - iterator for loop with main string
		int count = 0, c = 0, i = 0;
		while (i < zbior.length()) {

			for (int j = 0; j < ciag.length(); j++) {
				// System.out.println(i + ": " + j + ": " + c + ": " + count +
				// ": ");

				///if char from zbior is the same like char from ciag, we increase var c by 1
				if (zbior.charAt(i) == ciag.charAt(j)) {
					c++;
					i++;
				} 
				/// if chars werent same in previous ifcase, we clear var c and overwrite j to the end
				/// its for exit the loop(for)
				else if (c != 0) {
					j = ciag.length();
					c = 0;
					// i++;
				} 
				///moving to the next iteration
				else if (ciag.charAt(0) != zbior.charAt(i)) {
					i++;
				}
				/// when whole string "ciag' is found, we clear necessary vars to begin searching
				// for new sequence
				if (c == ciag.length()) {
					count++;
					c = 0;
					j = ciag.length();// exithh
				}
				if (i == zbior.length())
					break;

			}

		}
		/// result, amount of sequences
		return count;
	}

}
