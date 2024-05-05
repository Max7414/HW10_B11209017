package HW10_B11209017;

public class AgeTooBigException extends Exception {
	AgeTooBigException() {
		System.out.println("[系統訊息] 您輸入的年齡判斷年齡太大");
	}
}
