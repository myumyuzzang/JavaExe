package ch10.collection01.ch15.sec03.exam01;

import java.util.*;

/* Set은 집합이다.
 * 집합은 데이터의 모음일 뿐 '순서가 보장되지 않는다'
 * 그러므로 중복을 허용하지 않는다.
 * A = { 1, 2, 3}
 * B = { 3, 4, 5}
 * C = A∪B = { 1, 2, 3, 4, 5} 
 * 데이터가 입력될 때 기존 데이터가 있는지 확인한다.
 * 이때 사용하는 알고리즘이 Hash알고리즘이다.
 * 
 * '검색속도는 빠르다'
 * '중복 허용 않는다'
 * '순서 보장되지 않는다'
 * */

public class HashSetExample {
	
	public static void main(String[] args) {
		//HashSet 컬렉션 생성
		Set<String> set = new HashSet<String>();
		
		//객체 저장
		set.add("Java");
		set.add("JDBC");
		set.add("JSP");
		set.add("Java");		// 중복 객체이므로 저장하지 않음
		set.add("Spring");
		set.add("Algorithm");
		set.add("python");
		set.add("Python");
		set.add("java");
		
		/* 다른 컬렉션들도 Iterator인터페이스 상속을 받아 구현하였다.
		 * Iterator는 데이터의 처음부터 계속 끝까지 가져오는데 사용한다.
		 * 알고리즘이 다른 컬렉션을 Iterator라는 1가지 방식으로 가져 올 수
		 * 있게 하였으므로 효율성을 가져옴
		 * */
		
		//저장된 객체 수 출력
		int size = set.size();
		System.out.println("총 객체 수: " + size);
		System.out.println();
				
		for (String element : set) {
			System.out.println(element);
		}
	}

}
