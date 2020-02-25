package String;

public class contentBetweenTags {

	public static void main(String[] args) {

		String s  = "<div>hello world</div>";
		String innerText = s.replaceAll("\\<.*?\\>", "");
		System.out.println(innerText);

	}

}
