public class testenum {
    public static void main(String[] args) {
        int a=4;
        System.out.println(a&1<<2);

    }
}
enum Region {
    경기도("1"),강원도("2"),충청도("3"),경상도("4"),전라도("5"),서울("6");

    private String region;
    Region(String region) {
        this.region=region;
    }
    public String getRegion() {
        return region;
    }
}

