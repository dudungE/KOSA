package quiz.abstarct;

public class Plain extends Trans {

	@Override
	public String start(String x) {
		go = x;
		return go;
	}

	@Override
	public void show(String wow) {
		start("슝!!!");
		stop("끽!!!");

		System.out.println(wow + "의 출발은 " + go + "정지는 " + no);

	}

	@Override
	public String stop(String y) {
		no = y;
		return no;
	}

}
