package hello2method;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TreeClass {
	// 메소드 하나 만들어 보세요
	public void hello(String b) {
		int st; // 변수명은 숫자로 시작할 수 없다.
		int a; // 변수명에 특수문자를 사용할 수 없다.
		int classa; // 키워드를 변수명으로 사용할 수 없다.

		// 안녕하세요
		// 나는 누구 입니다
		// 잘 부탁드립니다
	//	String b = "퉁퉁이"; // 문자열 변수 선언
		a = 100;
		System.out.println("안녕하세요");
		System.out.println("나는 " + b + " 입니다");
		System.out.println(b + " 잘 부탁드립니다");
		System.out.println(b + " 인사 드립니다");
		System.out.println(b + " 집에 갑니다");
		System.out.println(b + "가 집에 가다가 도라에몽을 만났네");
		System.out.print(b + " 체력은 ");
		System.out.print(a);
		System.out.println(" 이다");
		System.out.println("덤벼 도라에몽~");

	}
	
	// 플레이 메소드
	public void play(int tree) {
		// 나무의 갯수
				
				
				// 나무를 넘길 수 있는 횟수
				// 1번 나무는 2번
				// 2번 나무는 3번
				// 3번 나무는 1번
				// 4번 나무는 5번
				// 5번 나무는 10번
				
				// 리스트로 변경 하고 안에 있는 나무들의 넘어가는 횟수를 10번 이하의 무작위 수 나열
				// tree 변수의 숫자에 따라 나무의 갯수가 정해져야
				ArrayList<Integer> bList = new ArrayList<Integer>();
				Random rnd = new Random();
				Scanner sc = new Scanner(System.in);
				for (int i =0; i < tree; i ++) {
					bList.add(rnd.nextInt(2)+1);;
					//System.out.println(bList.get(i));
				
				}
				
				
				
				//int[] odds = {2, 3, 1, 5, 10};
			
				
				// 나무 번호
				int treeNo = 0;
				// 나무가 5그루
				// 각 나무 번호들을 출력
				// 나무 총 갯수와 나무 끝 번호가 같으면 종료
				

				// 5번 나무찍기를 참고 해서 나머지 나무들도 비슷하게 만들어 보자
				// 여기 부터 반복
				for (int cnt : bList) {
//					treeNo++; // 나무 번호를 증가
					for (int i = 1; i <= cnt; i++) {
						System.out.println((treeNo + 1) + "번 나무를 도끼로 " + i + "회 찍었다");
						// 만약에 나무의 생명만큼 찍혔으면
						if (i == cnt) {
							// 나무가 넘어간다를 출력
							System.out.println("나무가 넘어간다");
							tree = tree - 1; // 나무 갯수 줄임
							// 10번이 아니면
						} else {
							// 나무가 넘어가지 않는다를 출력
							System.out.println("나무가 넘어가지 않는다");
						}
					}
					treeNo++;   // 다음 나무 나오세요~
					System.out.print("남아있는 나무는? ");
					System.out.println(tree);
					System.out.println();   // 한칸 내리기
					
					}
				}
				// 여기까지 반복
	
	// 성공 메시지를 보여주는 메소드 (메소드를 만들때는 첫 글자 소문자로만들기)
	public void successMsg() {
		System.out.println("나무 베기 성공"); 
	}
}