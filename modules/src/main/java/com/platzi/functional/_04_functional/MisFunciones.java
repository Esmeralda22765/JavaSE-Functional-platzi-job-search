package com.platzi.functional._04_functional;
import java.util.function.Function;
import java.util.function.*;
import java.util.function.Supplier;
import java.util.*;
import sun.jvm.hotspot.debugger.cdbg.FunctionType;

public class MisFunciones {

    public static void main(String[] args){

       /* Function<Integer,Integer> miF = par -> par*2;
        Integer restult = miF.apply(5);
        System.out.println(restult);*/

       /* Function<Integer,Integer> miFT = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer*3;
            }
        };

        Function<Integer,Integer> miFDoble
                = par -> par*2;
        Integer restult = miFDoble.apply(3);
        System.out.println("Doble "+restult);
        System.out.println("Triple "+ miFT.apply(6));

        //par e impar
        Function<Integer,Boolean> miFpar = par -> ((par%2)==0);
        System.out.println(miFpar.apply(3));*/

        //TAREA

        /* PREDICATE lambda ejemplo*/
        Predicate<Integer> lambdaPredicate = (Integer x) -> (x % 2 == 0);

        System.out.printf("Par : %s", lambdaPredicate.test(68));
        System.out.printf("\nEs impar : %s ", lambdaPredicate.test(31));


        /* CONSUMER lambda ejemplo*/
        System.out.println("\n");
        Consumer<Long> lambdaConsumer = (Long t) -> System.out.println("Doble "+t*t);
        lambdaConsumer.accept(5L);


        /* SUPPLIER lambda ejemplo*/
        System.out.println("\n");

            //RandomDigitSupplier rds = new RandomDigitSupplier();
            Supplier<Integer> rds = () -> new Random().nextInt(10);
            int randomDigit = rds.get();
            System.out.print("Número al azar "+randomDigit);
        System.out.println("\n");


    }
}
