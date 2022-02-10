package reply;

public class ReplyEx {
	public static void main(String[] args) {
		ReplyService service = new ReplyService();
		service.list();
		service.score();
		
		service.register();
		service.list();
		service.score();
	}
}
