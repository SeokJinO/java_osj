package day10;

import java.util.Scanner;

public class Assignment1 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      Student st = new Student("오석진", 1, 1, 1);
      
      while(true) {
         System.out.print("메뉴\n"
               + "1. 학생 정보 입력\n"
               + "2. 학생 정보 출력\n"
               + "3. 프로그램 종료\n"
               + "메뉴를 선택하세요 : ");
         int choice = sc.nextInt();
         if(choice == 1) {
            System.out.print("이름 : ");
            st.StudentName = sc.next();
            System.out.print("학년 : ");
            st.Grade = sc.nextInt();
            System.out.print("반 : ");
            st.Class = sc.nextInt();
            System.out.print("번호 : ");
            st.Number = sc.nextInt();
            st = new Student(st.StudentName,st.Grade, st.Class, st.Number);
         }else if(choice == 2) {
            st.print();
         }else if(choice == 3) {
            System.out.println("프로그램을 종료합니다.");
            break;
         }
      }

   }

}

class Student{
   String StudentName;
   int Grade;
   int Class;
   int Number;
   
   public Student(String studentName, int grade, int class1, int number) {

      StudentName = studentName;
      Grade = grade;
      Class = class1;
      Number = number;
   }
   public void print() {
      System.out.println(Grade + "학년 " + Class +"반 " + Number +"번 " + StudentName);
   }
   
}