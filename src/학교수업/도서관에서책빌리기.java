package 학교수업;

import java.util.ArrayList;

//학생이 도서관에서 책을 빌리는 기능을 구현한다고 생각하고
//관련 클래스와 메소드를 정의 후에 사용
class 학생{
    private 책 학생책;
    public void 학생이도서관에서책빌리기(String name){
        책 책꺼내오기기 = 도서관.책꺼내오기기(name);
        this.학생책 = 책꺼내오기기;

    }

    @Override
    public String toString() {
        return "학생{" +
                "학생책=" + 학생책 +
                '}';
    }
}
class 도서관{
    static 도서관 도서관 = new 도서관();
    static ArrayList<책> books = new ArrayList<>();

    private 도서관() {

    }

    public void 도서관책추가(책 book){
        books.add(book);
    }
    public static 책 책꺼내오기기(String name){
        for (책 book : books) {
            if(book.getName() == name){
                return book;
            }
        }
        return null;
    }



}

class 책{
    String name;
    String author;
    int year;

    public 책(String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getName() {
        return name;
    }
}


public class 도서관에서책빌리기 {
    public static void main(String[] args) {
        학생 s = new 학생();
        책 book1 = new 책("HTML","이찬우",2001);
        책 book2 = new 책("Jpa","김영한",2001);
        책 book3 = new 책("Spring","김영한",2001);

        도서관.도서관.도서관책추가(book1);
        도서관.도서관.도서관책추가(book2);
        도서관.도서관.도서관책추가(book3);

        s.학생이도서관에서책빌리기("HTML");

        System.out.println(s);





    }
}
