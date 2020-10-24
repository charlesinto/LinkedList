package com.mytube;

import java.awt.desktop.SystemEventListener;
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
//        var video = new Video();
//        video.setFileName("birthday.mp4");
//        video.setTitle("Jennifer's birthday");
//        video.setUser(new User("john@domain.com"));
//        var processor = new VideoProcessor();
//        processor.process(video);
//        System.out.println(getNonRepeatedCharacter("a green apple"));
//        printLis();
        System.out.println(findFirstNonRepeatingCharacter("green apple"));
        System.out.println(firstRepeatedCharacter("green word"));
//        System.out.println(Thread.activeCount());
//        System.out.println(Runtime.getRuntime().availableProcessors());
//        CompletableFuture.runAsync(() -> System.out.println("called here"));

    }
    public  void printValues(String item ){
        System.out.println(item);
    }
    public static Character firstRepeatedCharacter(String word){
        Set<Character> uniqueCharacters = new HashSet<>();
        var chars = word.toCharArray();
        for(var character: chars){
            if(uniqueCharacters.contains(character)){
                return character;
            }
            uniqueCharacters.add(character);
        }

        return Character.MIN_VALUE;
    }
    public static Character findFirstNonRepeatingCharacter(String word){

        char[] chars = word.toCharArray();

        Map<Character, Integer> dict = new HashMap<>();

        for(char character: chars){
            var count = dict.containsKey(character) ? dict.get(character) : 0;
            dict.put(character, count + 1);
        }

        for(var character : chars){
            if(dict.get(character) > 1)
                return character;
        }

        return Character.MIN_VALUE;
    }
    public static String getNonRepeatedCharacter(String word){
        // replace every space;

        Character character = '?';
        var s = word.replace(" ", "");
        for(int i = 0; i < s.length(); i++){
            boolean isRepeated = false;
            character = s.charAt(i);
            for(int k = i+ 1; k < s.length(); k++){
                if(character == s.charAt(k)){
                    isRepeated = true;
                }
            }
            if(isRepeated == false){
                break;
            }

        }
        return ""+ character;
    }
    public static void printLis(){
        List<String> list = List.of("a","b", "c");
        Consumer<String> print = item -> System.out.println(item);
//        list.forEach(new Main()::printValues);
        Consumer<String> printUpperCase = item -> System.out.println(item.toUpperCase());
        list.forEach(print.andThen(printUpperCase));
        Predicate<String> hasLeftBrace = str -> str.startsWith("{");
        Predicate<String> hasRightBrace = str -> str.endsWith("}");
        var result = hasLeftBrace.negate().and(hasRightBrace).test("{key=value}");
        System.out.println(result);
    }
}
