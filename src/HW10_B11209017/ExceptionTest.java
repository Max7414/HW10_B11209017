package HW10_B11209017;

import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		System.out.println("========================程式開始========================");
		System.out.printf("請輸入一組年齡數字 Please	input an number of age: ");
		Scanner sc = new Scanner(System.in);
		try {
			int age = sc.nextInt();
			if (age < 20)
				throw new AgeTooSmallException();
			else if (age >= 20 && age <= 50)
				System.out.printf("您輸入的年齡為： %d%n ", age);
			else
				throw new AgeTooBigException();
		} catch (AgeTooSmallException e) {
		} catch (AgeTooBigException e) {
		} catch (Exception e) {
			System.out.println("[系統訊息] 其他例外");
		} finally {
			System.out.println("========================程式結束========================");
		}

	}

}
