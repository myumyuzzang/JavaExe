package ch10.collection01.ch15.sec02.exam01;

public class Board {
	private String subject;
	private String content;
	private String writer;
	
	public Board(String subject, String content, String writer) {
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}
	
	public String getSubject( ) {return subject;}
	public void getSubject(String getSubject) {this.subject = subject;}
	public String getContent( ) {return content;}
	public void getContent(String getContent) {this.content = content;}
	public String getWriter( ) {return writer;}
	public void getWriter(String getWriter) {this.writer = writer;}
	
}
