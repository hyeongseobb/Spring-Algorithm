//
//public class JavaArraySort {
//	public static void main(String[] args) {
//		
//	 //가장 대표적으로 사용하는 오름차순으로 정렬하는 코드
//		
//		int[] temp = new int[]{2,4,1,3};
//		Arrays.sort(temp);
//		
//			for(int k : temp)
//				System.out.print(k+" ");  // 1 2 3 4 출력
//		}
//	
//	//코드는 내림차순으로 정렬하는 코드
//		Integer[] temp = new Integer[]{2,4,1,3};
//		Arrays.sort(temp,Collections.reverseOrder());

//			for(int k : temp)
//				System.out.print(k+" "); //4 3 2 1 출력
//			} 
//
//	일단 바뀐 부분은 int[] -> Integer[]로 바뀌게 되었습니다. 그 이유는 Arrays.sort()의 매개변수로
//	Colletions.reverseOrder()를 사용해주기 위해서입니다.
//	Arrays.sort() 내부를 보시면 public static <T> void sort(T[] a, Comparator<? super T> c) {~~~~}
//	위와 같이 정의되어 있습니다. 단순히 기본형 변수인 int[]로 선언하게 된다면 sort에 접근하지 못하여
//		내림차순으로 정렬할 수 없습니다. 반드시 내림차순으로 할 땐 참조형 변수를 사용
//
//	3.Arrays.sort - 길이 순
//	 (3)	
//			String[] temp = new String[]{"a","b","c","d","e","ab","aaaaaa"};
//			Arrays.sort(temp);
//			for(String k : temp)
//				System.out.print(k+" "); //출력 a aaaaa ab b c d e
//		}
//	(3) 번부터가 정말 중요하다고 개인적으론 생각합니다. 위처럼 String 배열이 있는데, 오름차순, 내림차순이 아닌 길이순에 따라서 정렬하고 싶다면 어떻게 할까요?
//	
//			class nameLength implements Comparator<String>{
//				@Override
//				public int compare(String arg0, String arg1) {
//						if(arg0.length() > arg1.length())
//							return 1;
//						else if(arg0.length() < arg1.length())
//							return -1;
//						else
//							return 0;
//				}
//			}
//			
//			String[] temp = new String[]{"a","b","c","d","e","ab","aaaaaa"};
//			Arrays.sort(temp, new nameLength());
//			for(String k : temp)
//				System.out.print(k+" "); // a b c d e ab aaaaaa 
//		}
//	(4) 코드는 길이 순서에 따라 오름차순으로 정렬한 것입니다. 위에 저희가 내림차순으로 정렬하기 위하여
//		Collections.reverseOrder()라는 Comparator를 사용한 예제가 있었습니다.
//		예제처럼 우리가 커스터마이징한 Comparator를 지정해주면 우리가 원하는 대로 정렬할 수 있는 것이죠.
//		Comparator는 대개 어떻게 비교할지 변경하는 것이고, Comparable은 비교할 대상을 변경하는 것이라고 합니다.
//
//
//	4.Arrays.sort - 내 맘대로!
//	마지막으로 내 맘대로 해보죠! 저는 이렇게 정렬하고 싶네요. 1. 길이 순으로 정렬 2. 길이가 같다면 사전 순으로 정렬
//	
//			class nameLength implements Comparator<String>{
//				@Override
//				public int compare(String arg0, String arg1) {
//						if(arg0.length() > arg1.length())
//							return 1;
//						else if(arg0.length() < arg1.length())
//							return -1;
//						else {
//							if(arg0.compareTo(arg1)>0)
//								return 1;
//							else if(arg0.compareTo(arg1) <0)
//								return -1;
//							else
//								return 0;
//						}
//				}
//			}
//			
//			String[] temp = new String[]{"a","b","ab","c","aaaaab","aaaaaa","aaaaac","aa","abc","aaaaa"};
//			Arrays.sort(temp, new nameLength());
//			for(String k : temp)
//				System.out.print(k+" ");
//		} //출력 "a b c aa ab abc aaaaa aaaaaa aaaaab aaaaac 
//
//}
