/**
 * 웹 사이트에서 개발해야 하는 기능의 최소 단위를 규격화한 인터페이스
 */
// 쓰기와 삭제 기능에 대한 정의를 명시하고 있는 interface
public interface MySite {
	// 저장기능
	public void write();
	// 삭제기능
	public void delete();

}
