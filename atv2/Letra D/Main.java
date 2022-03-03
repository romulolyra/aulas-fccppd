import java.util.Random;

public class Main {

  public static void main(String[] variavel) throws InterruptedException{ 
  

    int myData[] = new int[30];

    myData = randomList(myData.length);

    Thread thread1 = new Thread(new MyRunnable(PartionData(myData, 0, 14)));
    Thread thread2 = new Thread(new MyRunnable(PartionData(myData, 15, 29)));
    

    thread1.start();
    thread2.start();


  }
  public static int[] PartionData(int[] a, int startIdx, int finalIdx) {

    int length = finalIdx - startIdx;
    int j = 0;
    int[] newList = new int[length]; 
    for(int i = startIdx; i < finalIdx; i++){
      newList[j] = a[i];
      j++;
    }    

    return a;
  }
  public static int[] randomList(int length) {
    Random r = new Random();
    int[] newList = new int[length];
    for (int i = 0; i < length; i++) {
      newList[i] = r.nextInt();
   }
   return newList;
  }
}


