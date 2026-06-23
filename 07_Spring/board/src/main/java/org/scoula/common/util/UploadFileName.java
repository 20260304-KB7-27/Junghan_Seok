package org.scoula.common.util;

// 고유한 파일명을 만드는 메서드 생성용

public class UploadFileName {
    public static String
    getUniqueName(String filename) {
        int ix = filename.lastIndexOf(".");
        String name = filename.substring(0, ix);// 파일명 추출
        String ext = filename.substring(ix + 1);// 확장명 추출

        return String.format("%s-d.%s", name, System.currentTimeMillis(), ext);
    }
}
