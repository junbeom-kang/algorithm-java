package TemplateMethod;

public abstract class Awards {
    public void printAward() {
        System.out.println("상장을 수여합니다");
        System.out.println("~~~~에서 뛰어났기 때문에");
        //원하는 부분을 Override해서 사용하게 함
        name();
        System.out.println("학교장 OOO");
        Month();
    }
    //추상 메서드를 구현해야 함
    abstract void name();
    //Hook 메서드
    void Month() {
        System.out.println("2021-03");
    }
}
