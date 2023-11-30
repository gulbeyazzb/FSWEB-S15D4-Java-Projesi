import java.util.*;

public class Binary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println("girilen değer: " + number);

        int div = number / 2;
        int mod = number % 2;


//TO DECİMAL AGAİN------------------------------------------
//        List<Integer> modS = new ArrayList<>();
//        modS.add(mod);
//
//        while (div >= 2) {
//            modS.add(div % 2);
//            div = (div / 2);
//        }
//        modS.add(div);
//        System.out.println(modS);
//        int sum=0;
//        for(int i=0;i<modS.size();i++){
//           sum += modS.get(i) * Math.pow(2,i);
//        }
//        System.out.println(sum);

//BİNARY FORMAT------------------------------------------
        Stack<Integer> modS = new Stack<>();
        modS.push(mod);

        while (div >= 2) {
            modS.push(div % 2);
            div = (div / 2);
        }
        modS.add(div);
        System.out.println(modS);

        String nums="";
        while(!modS.isEmpty()){
           nums+=modS.pop();
        }
        System.out.println(nums);

    }
}
