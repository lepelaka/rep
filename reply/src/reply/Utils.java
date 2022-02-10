package reply;

import java.text.SimpleDateFormat;
import java.util.Scanner;


/**
 * @author 박종민
 * 
 */
public class Utils {
	private static Scanner scanner = new Scanner(System.in);
	/**
	 * 글자 하나당 2byte로 계산할지 1byte로 계산할지를 알려주는 메서드, 파라미터가 한글일 경우 2byte를 그렇지 않을 경우는
	 * 1byte로 반환한다.
	 * 
	 * @param c
	 *            입력할 글자
	 * @return 반환될 숫자
	 */
	private static int getCharCount(char c) {
		int cnt = 0;
		if (c >= '가' && c <= '힣') {
			cnt++;
		}
		cnt++;
		return cnt;
	}

	/**
	 * 문자열을 입력받아 바이트 갯수를 리턴해주는 메서드, 한글이 포함된경우 2를 그렇지 않은 경우는 1을 가산한다.
	 * 
	 * @param str
	 *            세야할 글자
	 * @return int 타입의 리턴
	 */
	private static int getStringByteCount(String str) {
		char[] words = str.toCharArray();
		int cnt = 0;
		for (char c : words) {
			cnt += getCharCount(c);
		}
		return cnt;
	}

	/**
	 * 콘솔에 출력할 문자열의 길이가 부적절하게 길 경우 지정된 크기만큼을 자른다.
	 * 
	 * @param strs
	 *            잘라야할 원문
	 * @param lastIdx
	 *            잘라야할 길이
	 * @return 잘라서 완성된 문자열을 반환
	 */
	private static String subContent(String str, int len) {
		StringBuilder ret = new StringBuilder();
		char[] ori = str.toCharArray();
		int cnt = 0;
		for (char c : ori) {
			cnt += getCharCount(c);
			ret.append(c);
			if (len / 2 * 2 - 3 < cnt) {
				ret = new StringBuilder(ret.substring(0, ret.length() - 2) + "..");
				break;
			}
		}
		return ret.toString();
	}

	/**
	 * 출력시 필요한 문자열 배열과 각 배열의 한계길이값을 지정한 정수 배열을 받아와 하나의 스트링을 반환
	 * 
	 * @param strs
	 *            출력할 텍스트 배열
	 * @param len
	 *            출력될 텍스트 포맷의 한계 길이
	 * @return 조합후 완성된 문자열을 반환한다.
	 */
	public static String format(String strs, int len) {
		len += 2;
		String ret = "";
		int cnt = len;
		strs = subContent(strs, cnt);
		cnt = cnt - getStringByteCount(strs) + strs.length();
		ret += "%-" + cnt + "s";
		return String.format(ret, strs);
	}
	
	
	public static String nextLine(String input) {
		System.out.print(input);
		return scanner.nextLine();
	}
	
	public static int nextInt(String input) {
		return Integer.parseInt(nextLine(input));
	}
	
	public static String getToday() {
		return new SimpleDateFormat("yyyy-MM-dd").format(System.currentTimeMillis());
	}
}
