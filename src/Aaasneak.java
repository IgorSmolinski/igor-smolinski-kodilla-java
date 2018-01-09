import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

class ListDevide{
    private ArrayList<String> even;
    private ArrayList<String> odd;

    public ListDevide() {
         even = new ArrayList<String>();
         odd = new ArrayList<>();
    }

    public void devide(ArrayDeque<String> templist){
        int temporaryListSize = templist.size();
        for (int i=0; i<temporaryListSize; i++){
            String temporaryString = templist.poll();
            if(temporaryString.length() % 2 == 0 ){
                even.add(temporaryString);
            }
            else if (temporaryString.length() % 2 != 0 ) {
                odd.add(temporaryString);
            }
        }

    }

    public void showmMeOdd(){
        int counter = 1;
        int temporaryListSize = odd.size();
        for (int i=0; i<temporaryListSize; i++){
            System.out.println(counter + " zestaw nieparzystych liter ma ilość: " + odd.get(i).length());
            System.out.println("Te litery to:");
            System.out.println(odd.get(i));
            System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
            counter++;
        }

    }

    public void showMeEven(){
        int counter=1;
        int temporaryListSize = even.size();
        for (int i=0; i<temporaryListSize; i++){
            System.out.println(counter + " zestaw parzystych liter ma ilość: " + even.get(i).length()); //Próbowałem for (String k: odd)
            System.out.println("Te litery to:");
            System.out.println(even.get(i));
            System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
            counter++;
        }
    }
}

class Aaasneak {
    public static void main (String[] args) {
        ArrayDeque<String> list = new ArrayDeque<String>();

        for (int i=0; i<50; i++){
            String temporaryLetter="";
            for (int j=0; j<ThreadLocalRandom.current().nextInt(1, 50);j++){
                temporaryLetter+="a";
            }

            list.offer(temporaryLetter);
        }

        ListDevide q = new ListDevide();
        q.devide(list);
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        q.showMeEven();
        q.showmMeOdd();

    }
}
