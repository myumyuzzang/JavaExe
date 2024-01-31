package ch08.class09;

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
public class Resolve3_SongMain {
	public static void main(String[] args) {
		Resolve3_Song song = new Resolve3_Song();
		song.setSongInfo("Dancing Queen", "ABBA", "Arrival", 
				"Benny Andersson, Bjorn Ulvaeus", 1976, 1);
		song.show();
	}

}
