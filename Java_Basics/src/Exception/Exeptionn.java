package Exception;

public class Exeptionn {
	public static void main(String[] args) throws ArithmeticException, NotNiceException {

		Exeptionn e = new Exeptionn();
		try {
			e.aadesh();
		} catch (RuntimeException r) {
			System.out.println(r);
		} finally {

			System.out.println("bhendi he tr run hoilch");
		}

	}

	public void aadesh() throws ArithmeticException, NotNiceException {
		System.out.println("hi");
		aadesh1();
		throw new RuntimeException("this si thow by me");

	}

	public void aadesh1() throws ArithmeticException, NotNiceException {
		System.out.println("hi1");
		try {
			aadesh2();
		} catch (ArithmeticException j) {
			System.out.println(j);
		}
	}

	public void aadesh2() throws ArithmeticException, NotNiceException {
		System.out.println("hi2");
		try {
			aadesh3();
		} catch (NotNiceException n) {
			System.out.println(n);
		}
	}

	public void aadesh3() throws ArithmeticException, NotNiceException {
		System.out.println("hi3");
		aadesh4();
	}

	public void aadesh4() throws ArithmeticException, NotNiceException {
		System.out.println("hi4");
		throw new NotNiceException("this is custom exception");

	}

	public void aadesh5() throws ArithmeticException {
		System.out.println("hi5");
		int a = 10;
		for (int i = 0; i <= 10; i++) {

			int div = a / i;

			System.out.println(div);
		}

	}

}
