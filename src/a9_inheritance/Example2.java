package a9_inheritance;

import java.util.Arrays;
import java.util.List;

/* 음악앨범은 관리하는 클래스
요구사항:
 앨범제목 (title) - 문자열
 발매연도 (releaseYear) - 정수
 앨범내 곡들의 제목 배열 (tracks) - 문자열 배열

 다음 메소드들을 구현하세요:
 생성자
 각필드의 getter/setter 메서드
 toString 오버라이딩 메서드
 */
class Album {
    private  String title;
    private  int releaseYear;
    private List<String> tracks;

    public Album() {
    }

    public Album(String title, int releaseYear, List<String> tracks) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.tracks = tracks;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public List<String> getTracks() {
        return tracks;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }

    @Override
    public String toString() {
        return "Album{" +
                "title='" + title + '\'' +
                ", releaseYear=" + releaseYear +
                ", tracks=" + tracks +
                '}';
    }
}


public class Example2 {
}
