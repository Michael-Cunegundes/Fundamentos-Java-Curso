package colecoes;

import java.util.HashSet;

public class ConjuntoBaguncado {

    public static void main(String[] args) {

        HashSet conjunto = new HashSet();
        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('x');

        System.out.println("Tamanho do set: " + conjunto.size());
        conjunto.add("Teste");

        System.out.println(conjunto.remove("Teste"));

        System.out.println("Tamanho do set: " + conjunto.size());

        System.out.println(conjunto.contains("Teste"));
        System.out.println(conjunto.contains(1));

        HashSet nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

//        conjunto.addAll(nums);
        conjunto.retainAll(nums);
        System.out.println(conjunto);

    }
}
