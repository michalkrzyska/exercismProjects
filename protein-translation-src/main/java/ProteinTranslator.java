import javax.print.DocFlavor;
import java.util.*;

class ProteinTranslator {

    List<String> translate(String rnaSequence) {
        List<String> list = new ArrayList<>();
        List<String> listProtein = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rnaSequence.length(); i += 3) {
            System.out.println(rnaSequence.substring(i, i + 3));
            list.add(rnaSequence.substring(i, i + 3));
        }
        for (String s : list) {
            System.out.println(s + " ------");
            switch (s) {
                case "AUG":
                    listProtein.add("Methionine");
                    break;
                case "UUU":
                case "UUC":
                    listProtein.add("Phenylalanine");
                    break;
                case "UUA":
                case "UUG":
                    listProtein.add("Leucine");
                    break;
                case "UCU":
                case "UCC":
                case "UCA":
                case "UCG":
                    listProtein.add("Serine");
                    break;
                case "UAU":
                case "UAC":
                    listProtein.add("Tyrosine");
                    break;
                case "UGU":
                case "UGC":
                    listProtein.add("Cysteine");
                    break;
                case "UGG":
                    listProtein.add("Tryptophan");
                    break;
                case "UGA":
                case "UAG":
                case "UAA":
                    return listProtein;

            }


        }

        return listProtein;
    }

}
