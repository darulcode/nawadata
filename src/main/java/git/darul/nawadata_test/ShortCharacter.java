package git.darul.nawadata_test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShortCharacter {
    public static void main(String[] args) {
        System.out.println(procVowel("Sample Case"));
        System.out.println(procConsonant("Sample Case"));
    }

    public static String procVowel(String param){
        List<String> vocalList = Arrays.stream("aiueo".split("")).toList();
        String[] input = param.toLowerCase().split("");
        List<String> vocal = new ArrayList<>();
        for (String s : input) {
            if (vocalList.contains(s)) {
                vocal.add(s);
            }
        }
        List<String> vocalResult = new ArrayList<>(vocal);
        StringBuilder exampleVocal = new StringBuilder();
        for (String character : vocal) {
            while (vocalResult.contains(character)) {
                vocalResult.remove(character);
                exampleVocal.append(character);
            }
        }
        return exampleVocal.toString();
    }

    public static String procConsonant(String param){
        List<String> consonList = Arrays.stream("bcdfghjklmnpqrstvwxyz".split("")).toList();
        String[] input = param.toLowerCase().split("");
        List<String> consonan = new ArrayList<>();
        for (String s : input) {
            if (consonList.contains(s)) {
                consonan.add(s);
            }
        }
        List<String> consonanResult = new ArrayList<>(consonan);
        StringBuilder exampleConsonan = new StringBuilder();

        for (String character : consonan) {
            while (consonanResult.contains(character)) {
                consonanResult.remove(character);
                exampleConsonan.append(character);
            }
        }
        return exampleConsonan.toString();
    }
}
