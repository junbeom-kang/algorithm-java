public class testenum {
    public static void main(String[] args) {
        int a=4;
        System.out.println(a&1<<2);

    }
}
enum Region {
    ��⵵("1"),������("2"),��û��("3"),���("4"),����("5"),����("6");

    private String region;
    Region(String region) {
        this.region=region;
    }
    public String getRegion() {
        return region;
    }
}

