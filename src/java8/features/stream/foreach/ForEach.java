package java8.features.stream.foreach;

import java.util.stream.Stream;

public class ForEach {
    public static void main(String[] args) {
        //Sequential stream
    	System.out.println("----");
        Stream.of("A","B","C","D")
                .forEach(elt -> System.out.print(elt));
        
        System.out.println("----");
        Stream.of("A","B","C","D")
                .forEachOrdered(elt -> System.out.print(elt));

        System.out.println("----");
        
        //Parallal stream
        Stream.of("A","B","C","D")
                .parallel() //it uses multi core
                .forEach(elt -> System.out.print(elt));
        System.out.println("----");

        Stream.of("A","B","C","D")
                .parallel()
                .forEachOrdered(elt -> System.out.print(elt));
    }
}
