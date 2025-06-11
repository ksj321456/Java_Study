package Enum;

// enum 매핑 클래스
enum Season {
    SPRING("봄"),
    SUMMER("여름"),
    FALL("가을"),
    WINTER("겨울");

    // 문자열을 저장할 필드
    private String season;

    // 생성자 (싱글톤)
    private Season(String season) {
        this.season = season;
    }

    // Getter
    public String getSeason() {
        return season;
    }
}
