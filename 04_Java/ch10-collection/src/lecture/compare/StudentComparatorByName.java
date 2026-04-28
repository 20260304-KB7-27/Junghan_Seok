package lecture.compare;

import java.util.Comparator;

public class StudentComparatorByName implements Comparator<Student> {

    // compare 구현
    @Override
    public int compare(Student o1, Student o2) {

        // 문자열의 compareTo : 사전순 비교
        return o1.getName().compareTo(o2.getName());
    }
}