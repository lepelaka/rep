package reply;

import java.util.ArrayList;
import java.util.List;

public class ReplyService {
	List<Reply> replies = new ArrayList<Reply>();
	
	{
		/*
		 * 코드 입력 구간 
		 */
	}
	
	public void list() {
		System.out.print(Utils.format("리뷰내용", 60));
		System.out.print(Utils.format("날짜", 12));
		System.out.print(Utils.format("작성자", 20));
		System.out.println(Utils.format("별점", 6));
		System.out.println("========================================================================================================");
		for(Reply r : replies) {
			/*
			 * 코드 입력 구간
			 */
		}
		System.out.println("========================================================================================================");
	}
	
	public void register() {
		/*
		 * 코드 입력 구간
		 */
	}
	
	public void score() {
		double d = 0;
		/*
		 * 코드 입력 구간
		 */
		
		d /= replies.size();
		System.out.println("이 매장의 별점은 " + d + "점 입니다");
	}
	
	
	
}
