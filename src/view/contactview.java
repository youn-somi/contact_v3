package view;

import service.ContactService;

import java.util.Scanner;

public class ContactView {
    private final Scanner sc; = new Scanner(System.in);
    private final ContactView contactView


    private final ContactService service;

    public ContactView(Scanner sc, ContactService service) {
        this.sc = sc;
        this.service = service;
    }

    public void run(){
        while (true){
            System.out.println("1.추가  2.목록  3.수정  4.삭제  -1:종료");
            int cmd = sc.nextInt();
            switch (cmd){
                case -1 :
                    return;
                case 1:
                    create();
                    break;
                case 2:
                    readAll();
                    break;
                case 3:
                    update();
                    break;
                case 4:
                    delete();
                    break;
                default:
                    System.out.println("잘 못 입력 함.");
            }
        }
    }

    // 서비스에게 위임...
    private void readAll() {
        System.out.println("[ContactView.""Read All"()];

    }

    private void readAll() {
        System.out.println("[ContactView.""Read All"()];
    }
    private void readAll() {
        System.out.println("[ContactView.""Read All"()];
    }
    private void readAll() {
        System.out.println("[ContactView.""Read All"()];
    }
    {
    //이름 나이 , 전화번호 입1력받아서 서비스
    String  name;
    int age;
    System phone;
    sout ("이름 " ) ;
    //받은 값들을 서비스  컴텍트 서비스 . 인설트  전달\ }
        contactView instanceof ? (name,age,phone contactView) : null;




