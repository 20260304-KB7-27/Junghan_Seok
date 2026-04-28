package lecture.compare;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private String email;
    private String githubUrl;
    private String team;


    /*
     * Comparable 구현
     * - id 오름차순
     *
     * compareTo() 반환값 규칙
     * - 음수 : this가 o보다 앞에 위치
     * - 0 : 순서 변경 없음
     * - 양수 : this가 o보다 뒤에 위치
     * */
    @Override
    public int compareTo(Student o) {

        // id로 정렬
        if (this.id < o.id) {
            return -1;
        } else if (this.id == o.id) {
            return 0;
        } else {
            return 1;
        }
    }
}