package ch15.thread02;

class OwnName {
   private String ownName;

   public String getOwnName() {
      return ownName;
   }

   public void setOwnName(String ownName) {
      this.ownName = ownName;
   }
}

/*
 * ShowNameThread은 이미 OwnName을 상속받았으므로
 * Thread를 상속받을 수 없음
 * 이때는 Runnable을 상속받음
 */

class ShowOwnNameThread extends OwnName implements Runnable {
   
   public ShowOwnNameThread(String ownName) {
      setOwnName(ownName);
   }

   @Override
   public void run() {
      for(int i=0; i<100; i++) {
         System.out.println(i + " 안녕하세요 : " + this.getOwnName() + "입니다.");
         
         try {
            Thread.sleep(1000);
         } catch (InterruptedException e) {
            e.printStackTrace();
         }
      }
      System.out.println(this.getOwnName() + "스레드 종료");
   }
   
}

public class ImplementsRunnable {
   public static void main(String[] args) {
      //스레드 2개가 vm에 할당되어 준비하고 있는 상태
      ShowOwnNameThread s1 = new ShowOwnNameThread("철수");
      ShowOwnNameThread s2 = new ShowOwnNameThread("영희");
      ShowOwnNameThread s3 = new ShowOwnNameThread("은하");
      ShowOwnNameThread s4 = new ShowOwnNameThread("철희");
      
      //스레드를 동작(run()을 호출)
      System.out.println("t1 스레드 객체 동작");
      Thread t1 = new Thread(s1);t1.start();
      System.out.println("t2 스레드 객체 동작");
      Thread t2 = new Thread(s2);t2.start();
      System.out.println("t3 스레드 객체 동작");
      Thread t3 = new Thread(s3);t3.start();
      System.out.println("t4 스레드 객체 동작");
      Thread t4 = new Thread(s4);t4.start();
      System.out.println("main 스레드 종료");
   }
}