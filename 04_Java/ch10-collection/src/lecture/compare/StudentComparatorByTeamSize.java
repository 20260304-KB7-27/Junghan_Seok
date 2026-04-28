package lecture.compare;

import java.util.Comparator;
import java.util.Map;

public class StudentComparatorByTeamSize implements Comparator<Student> {

    // 팀별 인원수를 저장할 필드
    // Map<팀명, 인원수>
    /*
     * Map
     * - Key Value 쌍으로 저장하는 방식
     * - Key는 값을 찾기위한 이름의 역할 ( 중복 X, 키가 다를때는 값은 중복 가능 )
     * get(key) : key에 해당하는 value를 반환
     * put(key, value) : Map에 데이터를 추가
     * */
    private Map<String, Integer> teamCount;

    public StudentComparatorByTeamSize(Map<String, Integer> teamCount) {
        this.teamCount = teamCount;
    }

    /*
     * 팀 인원수 (내림차순)
     * 팀 인원수가 같으면 -> 팀명 (오름차순)
     * 같은 팀이면 -> 이름순
     * */
    @Override
    public int compare(Student o1, Student o2) {

        // get() key값을 넣어주면 value를 얻을 수 있음.
        int size1 = teamCount.get(o1.getTeam());
        int size2 = teamCount.get(o2.getTeam());

        // 1. 팀인원수가 많은 순
        if (size1 != size2) {
            // 내림차순 (인원이 큰순서로)
            return Integer.compare(size2, size1);
        }

        // 2. 팀명 오름차순
        // 팀이름 기준으로 compare 결과값 (음수, 0, 양수)
        int teamCompare = o1.getTeam().compareTo(o2.getTeam());
        if (teamCompare != 0) {
            return teamCompare;
        }

        // 3. 이름 오름차순
        return o1.getName().compareTo(o2.getName());
    }
}
