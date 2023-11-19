package net.artsnoa.com.rmd;

import java.util.Scanner;

class CapTure {
    public static boolean startEngine(int port){
        System.out.println("캡쳐 엔진을 시작합니다.");
        return true;
    }
    private static void ShowServerAddress(int port, String ipg, String ipL){
        System.out.println("LaylaRDP 프로세스가 " + port + "에서 실행 중이에요!");
        System.out.println("LaylaRDP : " + ipL +":" + port);
        System.out.println("LaylaRDP : " + ipg +":" + port);
        System.out.println("!주의! : 외부망의 IP 어댑터 식별에 실패 시, NULL이 표시됩니다!");
    }
}

public class cik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isexit = false;
        boolean isoff = true;
        do {
            System.out.println("SERVER : " + (isoff ? "STOPPED" : "RUNNING"));
            System.out.println("-------- javaRemoteDevice --------");
            System.out.println("1. 서버 시작 ( Start Server )");
            System.out.println("2. 서버 종료 ( Stop Server )");
            System.out.print("옵션을 선택하세요 : ");
            int option = sc.nextInt();
            switch (option){
                case 1 -> {
                    System.out.println("----------- Starting Server ------------");
                    System.out.println("이 시간부터 캡쳐 엔진이 가동됩니다.");
                }
            }
        }while (!isexit);
    }
}
