package ch09.abstract10;

import java.util.Scanner;

public class EmployeeManager {
		private final int EMP_NUM = 100; 		// 100명 사원이 최대
		//Employee의 자식 객체들을 저장
		private Employee[] empArr = new Employee[EMP_NUM];
		private int numOfEmp = 0; 		// 저장된 사원객체 수
		private Scanner sc = new Scanner(System.in);
		
		private int viewMenu() {
			System.out.println("[ 사원 선택 ]");
			System.out.println("1. 정규직");
			System.out.println("2. 임시직");
			System.out.println("3. 일용직");
			System.out.println("4. 전체 정보 보기");
			System.out.println("5. 종료");
			System.out.println("번호 입력 >> ");
			int sel = sc.nextInt();			
			return sel;
			
		}
		private RegularEmployee createRegularEmployee() {
			return null;
		}
		private TempEmployee createTempEmployee() {
			return null;
		}
		private PartTimeEmployee createPartTimeEmployee() {
			return null;
		}
		private boolean saveEmployee(Employee emp) {
			return true;
		}
		private void viewAllEmployeeInfo() {
			
		}
		public void run() {
			boolean isRun = true;
			while(isRun) {
				int selNum = viewMenu();
				switch(selNum) {
				case 1:
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					isRun = false;
					break;
				default:
					break;
				}
			}		
			System.out.println("Program Exit");
		}
	}