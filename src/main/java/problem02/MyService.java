package problem02;

public class MyService extends BaseService {

	public String afternoon() {
		return "오후";
	}
	
	@Override
	public void service(String state) {
		String result = "";
		switch(state) {
		case "낮":
			result = super.day();
			break;
		case "오후":
			result = afternoon();
			break;
		case "밤":
			result = super.night();
			break;
		}
		result += "서비스 시작";
		System.out.println(result);
	}
}
