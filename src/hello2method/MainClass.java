package hello2method;

/**
 * TreeClass 의 사용법
 * hello() 메소드는 헬로 메시지 출력
 * play(int tree) 메소드는 나무베기 게임 하기
 * successMsg() 성공 메시지 출력
 * 파라미터 : 나무의 갯수 입력
 * successMsg() 성공 메시지 출력 
 */

public class MainClass {

	public static void main(String[] args) {
		
		TreeClass tc = new TreeClass();
		tc.hello("진구");   // 헬로 월드 메시지
		// 나무베기를 실행 하기	
		tc.play(3); //나무의 갯수를 넣으면 그만큼 반복
		tc.successMsg();  // TreeClass 의 성공 메시지
	}

}
