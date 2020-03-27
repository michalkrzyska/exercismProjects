//import jdk.swing.interop.SwingInterOpUtils;
//
//import java.util.*;
//
//public class Main {
//
//    public static void main(String[] args) {
//        String rnaSequence = "AUGUUUUUAUAAAUGUUUUUA";
//        List<String> list = new ArrayList<>();
//        List<String> listProtein = new ArrayList<>();
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < rnaSequence.length(); i += 3) {
//            System.out.println(rnaSequence.substring(i, i + 3));
//            list.add(rnaSequence.substring(i, i + 3));
//        }
//        for (String s : list) {
//            System.out.println(s + " ------");
//            switch (s) {
//                case "AUG":
//                    listProtein.add("Methionine");
//                    break;
//                case "UUU":
//                case "UUC":
//                    listProtein.add("Phenylalanine");
//                    break;
//                case "UUA":
//                case "UUG":
//                    listProtein.add("Leucine");
//                    break;
//                case "UCU":
//                case "UCC":
//                case "UCA":
//                case "UCG":
//                    listProtein.add("Serine");
//                    break;
//                case "UAU":
//                case "UAC":
//                    listProtein.add("Tyrosine");
//                    break;
//                case "UGU":
//                case "UGC":
//                    listProtein.add("Cysteine");
//                    break;
//                case "UGG":
//                    listProtein.add("Tryptophan");
//                    break;
//                case "UGA":
//                case "UAG":
//                case "UAA":
//                    listProtein.add("STOP");
//                    break;
//
//            }
//
//            System.out.println(listProtein.toString());
//        }
//
//        ListIterator<String> proteinIterator = listProtein.listIterator();
//        while (proteinIterator.hasNext()){
//            String s = proteinIterator.next();
//            System.out.println(s);
//            proteinIterator.remove();
//        }
//        System.out.println(listProtein.toString());
////        int removeRest = 0;
////        for (int j = 0; j <  listProtein.size(); j++){
////            if (listProtein.get(j).equals("STOP")){
////                    removeRest = listProtein.indexOf(listProtein.get(j));
////                System.out.println(removeRest);
////            }
////        }
////        for (int k = removeRest; k < listProtein.size(); k++ ){
////            proteinsToDelete.add(listProtein.get(k));
////        }
//
//
//    }
//}