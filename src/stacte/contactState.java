package stacte;
//연락처를 저장할 map 저장 공간 과id 자동 증가할 변수

import view.ContactView;

import java.util.HashMap;
import java.util.Map;

public class contactState {
    //컨텍트 연락처를 저장할 맵 선언
    private  Map<Long, Contact> store = new HashMap<>();

    //id 자동증가 시킬 변수
    private  Long nextid= 1L;
    //개터
    public  Map<Long, Character> getStore()  {
        return store ;

    }
    public  Long getNextid ( ) {
        return  store ;

    }
    public  void  increaseid (
    {
        nextid ++;
    }
    )

    //새터
    public  void  setStore (Map<Long, ContactView> stre ) {
        this . store =store;
    }



}
