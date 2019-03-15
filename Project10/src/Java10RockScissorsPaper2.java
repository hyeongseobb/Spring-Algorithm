import java.util.Scanner; 
public class Java10RockScissorsPaper2 { 
  public static void main(String[] args) { 
    String[] array = {"가위", "바위", "보"}; 
    int you = 0; 
    int com = 0; 
    String ab = new String(); 
    Scanner sc = new Scanner(System.in); 
    while (true) { 
      com = (int) (Math.random() * 3); 
      System.out.print("원하는 값을 선택하세요 (1:가위, 2:바위, 3:보) : "); 
      you = sc.nextInt()-1; 
      System.out.println("컴퓨터 : " + array[com]); 
      switch (you) { 
        case 0: // 내가 가위일 때 
        if(com == 0){ //컴도 가위면 
          System.out.println("비겼습니다."); 
          }else if(com == 1){ 
          System.out.println("졌습니다."); 
          }else if(com == 2){ 
          System.out.println("이겼습니다"); 
       } 
       break; 
       case 1: // 내가 바위일 때 
       if(com == 0){ //컴이 가위면 
         System.out.println("이겼습니다"); 
         }else if(com == 1){ 
         System.out.println("비겼습니다."); 
         }else if(com == 2){ 
         System.out.println("졌습니다."); 
      } 
      break; 
      case 2: // 내가 보일 때 
      if(com == 0){ //컴이 가위면 
        System.out.println("졌습니다."); 
        }else if(com == 1){ 
        System.out.println("이겼습니다"); 
        }else if(com == 2){ 
        System.out.println("비겼습니다."); 
     } 
     break; 
  } 
  System.out.println("-------------------------------"); 
} 
} 
} 
