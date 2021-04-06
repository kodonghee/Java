import java.util.Scanner;

public class MenuProgram {
    public static void LecMenu() {
        System.out.println("코드잇 수업을 소개합니다.");
        System.out.println("(P)ython (J)ava (i)OS (B)ack");
        Scanner scanner = new Scanner(System.in);
        String lec = scanner.next();
        if (lec.equals("P") || lec.equals("p")) {
            System.out.println("Python 언어를 통해 컴퓨터 사이언스의 기초를 배웁니다.");
            System.out.println("강사: 강영훈");
            System.out.println("추천 선수과목: 없음");
            LecMenu();
        } else if (lec.equals("J") || lec.equals("j")) {
            System.out.println("Java의 기본 문법과 객체지향적 프로그래밍을 배웁니다.");
            System.out.println("강사: 김신의");
            System.out.println("추천 선수과목: Python");
            LecMenu();
        } else if (lec.equals("i") || lec.equals("I")){
            System.out.println("최신 Swift 언어를 통해 iOS 개발을 시작할 수 있습니다.");
            System.out.println("강사: 성태호");
            System.out.println("추천 선수과목: Python, Java");
            LecMenu();
        } else{
            MainMenu();
        }
    }


    public static void MainMenu(){
        System.out.println("(I)ntro (C)ourses (E)xit");
        Scanner scanner = new Scanner(System.in);
        String menu = scanner.next();

        if (menu.equals("E") || menu.equals("e")){
            System.out.println("안녕히 가세요.");
        } else if (menu.equals("I") || menu.equals("i")){
            System.out.println("안녕하세요! 우리는 코드잇입니다.");
            System.out.println("함께 공부합시다!");
            MainMenu();
        } else {
            LecMenu();
        }
    }
    public static void main(String[] args) {
        MainMenu();
    }
}