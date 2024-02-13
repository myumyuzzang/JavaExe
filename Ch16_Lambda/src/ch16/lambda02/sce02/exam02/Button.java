package ch16.lambda02.sce02.exam02;

public class Button {
	//정적 멤버 인터페이스
	@FunctionalInterface
	public static interface ClickLstener {
		//추상 메소드
		void onClick();
	}
	
	//필드
	private ClickLstener clickListener;
	
	//메소드
	public void setClickListener(ClickLstener clickLstener) {
		this.clickListener = clickLstener;
	}
	
	public void click() {
		this.clickListener.onClick();
	}
}
