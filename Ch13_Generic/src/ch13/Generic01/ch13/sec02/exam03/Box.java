package ch13.Generic01.ch13.sec02.exam03;

public class Box<T> {
	public T content;
	
	//Box의 내용물이 같은지 비교
	public boolean compara(Box<T> other) {
		boolean result = content.equals(other.content);
		return result;
	}

}
