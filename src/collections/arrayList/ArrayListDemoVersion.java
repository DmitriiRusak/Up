package collections.arrayList;

import java.util.ArrayList;

public class ArrayListDemoVersion {
    public static void main(String[] args) {
        ArrayList<String> equipment=new ArrayList<String>();
        equipment.add("Buldozer");
        equipment.add("Cran");
        equipment.add("Mixer");

        ArrayList<String> materials=new ArrayList<String>();
        materials.add("cement");
        materials.add("plaater");
        materials.add("sand");

        ArrayList<String> tools=new ArrayList<String>();
        tools.add("scrooDriver");
        tools.add("hammer");
        tools.add("saw");


            //mozzno sozdavat 2D ArrayList. tozze primerno kak i dvymernie massivi

        ArrayList<ArrayList<String>> construction= new ArrayList();
        construction.add(equipment);
        construction.add(materials);
        construction.add(tools);

        System.out.println(construction);// vivedet vse chto est v 2d ArrayList
        System.out.println(construction.get(0).get(0));// vivedet concretnii index iz ArrayList. Pervii get eto otschet po ArrayListam




    }
}
