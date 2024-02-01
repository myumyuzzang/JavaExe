package ch08.class09answer04;

/*3. 노래를 나타내는 Song이라는 클래스를 설계하세요.
   <필드>
    노래제목 title
    가수    artist
    앨범제목 album
    작곡가  composer
    노래가 발표된 연도 year
    노래가 속한 앨범에서의 트랙 번호를 나타내는 track

   <메서드>
    노래의 정보를 저장하는 setSongInfo(...) : 관련된 매개변수를 인자로 넘겨줌
    노래의 정보를 나타내는 show()

   <main 실행>
    ABBA의 "Dancing Queen"
*/
public class Song {
	
	private String title;
	private String artist;
	private String album;
	private String compose;
	private int year;
	private int track;
	
	public void setSongInfo(String title, String artist, String album, 
			String compose,int year, int track) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.compose = compose;
		this.year = year;
		this.track = track;
		}
	
	public void show ( ) {
		System.out.println("노래 제목 : " + title);
		System.out.println("가수 : " + artist);
		System.out.println("앨범 제목 : " + album);
		System.out.println("작곡가 : " + compose);
		System.out.println("발표 연도: " + year);
		System.out.println("트랙 번호: " + track);
		
	}
}
