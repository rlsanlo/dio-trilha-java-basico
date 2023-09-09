import java.util.*;
import java.util.stream.Collectors;

public class DesafioStreamApiJava {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //Mostre a lista na ordem numérica
        List<Integer> numerosOrdenados = numeros.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(numerosOrdenados);

        //Imprima a soma dos números pares da lista
        int somaDosPares = numeros.stream()
                .filter(n->n%2==0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("A soma dos numeros pares é: "+ somaDosPares );

        //Verifique se todos os números da lista são positivos
        boolean todosPositivos = numeros.stream()
                .allMatch(n -> n > 0);

        if(todosPositivos){
            System.out.println("Todos os numeros são positivos");
        } else {
            System.out.println("Alguns numeros não são positivos");
        }

        //Remova todos os valores ímpares
        List<Integer> numerosSemImpares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        System.out.println("Lista original: "+ numeros);
        System.out.println("Lista sem impares: "+ numerosSemImpares);

        //Calcule a média dos números maiores que 5
        OptionalDouble mediaDosMaioresQue5 = numeros.stream()
                .filter(n -> n>5)
                .mapToDouble(Integer::doubleValue)
                .average();

        if(mediaDosMaioresQue5.isPresent()){
            System.out.println("Média dos números maiores que 5: "+ mediaDosMaioresQue5);
        } else {
            System.out.println("Não há números maiores que 5 na lista.");
        }

        //Verificar se a lista contém algum número maior que 10
        numeros.stream()
                .filter(n -> n > 10)
                .forEach(n -> System.out.println("Os valores maiores que 10 são: "+ n));

        //Encontrar o segundo número maior da lista
        Optional<Integer> segundoMaior = numeros.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();

        if(segundoMaior.isPresent()){
            System.out.println("O segundo maior numero da lista é: "+ segundoMaior);
        } else {
            System.out.println("Não há um segundo maior número na lista.");
        }

        //Somar os dígitos de todos os números da lista
        int resultado = numeros.stream()
                .reduce(0, Integer::sum);

        System.out.println("A soma dos numeros é: "+ resultado);

        //Verificar se todos os números da lista são distintos (não se repetem)
        boolean todosDistintos = numeros.stream()
                .distinct()
                .count() == numeros.size();

        if(todosDistintos){
            System.out.println("Todos os números na lista são distintos");
        } else {
            System.out.println("A lista contém números repetidos.");
        }

        //Agrupe os valores ímpares múltiplos de 3 ou de 5
        List<Integer> numerosAgrupados = numeros.stream()
                .filter(n -> n % 2 != 0 && (n % 3 == 0 || n % 5 == 0))
                .toList();
        System.out.println("Números impares múltiplos de 3 ou 5: "+ numerosAgrupados);

        //Encontre a soma dos quadrados de todos os números da lista
        int somaDosQuadrados = numeros.stream()
                .map(n -> n * n)
                .reduce(0, Integer::sum);
        System.out.println("A soma dos quadrados dos números é: "+somaDosQuadrados);


        // Encontre o produto de todos os números da lista
        Optional<Integer> produto = numeros.stream()
                .reduce((a, b) -> a*b);
        System.out.println("O produto dos numeros é: " + produto.get());

        //Filtrar os números que estão dentro de um intervalo
        int limiteInferior = 1;
        int limiteSuperior = 10;

        List<Integer> numerosNoIntervalo = numeros.stream()
                .filter(n -> n >= limiteInferior && n <= limiteSuperior)
                .toList();
        System.out.println("Numeros no intervalo [" + limiteInferior + ", "+ limiteSuperior + "]: " + numerosNoIntervalo);

        // Encontre o maior número primo da lista
        Optional<Integer> maiorPrimo = numeros.stream()
                .filter(n -> {
                    if(n <= 1){
                        return false;
                    }
                    for(int i = 2; i * i <= n; i++){
                        if(n % i == 0){
                            return false;
                        }
                    }
                    return true;
                })
                .max(Integer::compare);
        if(maiorPrimo.isPresent()){
            System.out.println("O maior número primo na lista é: "+ maiorPrimo);
        } else {
            System.out.println("Não há números primos na lista.");
        }

        //Verifique se a lista contém pelo menos um número negativo
        boolean contemNumeroNegativo = numeros.stream()
                .anyMatch(n -> n < 0);
        if(contemNumeroNegativo){
            System.out.println("A lista contém pelo menos um número negativo");
        } else {
            System.out.println("A lista não contém números negativos");
        }

        //Agrupe os números em pares e ímpares
        Map<Boolean, List<Integer>> numerosAgrup = numeros.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        List<Integer> pares = numerosAgrup.get(true);
        List<Integer> impares = numerosAgrup.get(false);

        System.out.println("Números pares: "+ pares);
        System.out.println("Números impares: "+ impares);

        //Filtrar os números primos da lista
        List<Integer> primos = numeros.stream()
                .filter(n -> {
                    if (n <= 1){
                        return false;
                    }
                    for(int i = 2; i * i <= n; i++){
                        if(n % i == 0){
                            return false;
                        }
                    }
                    return true;
                })
                .toList();
        System.out.println("Números primos na lista: "+ primos);

        //Verifique se todos os números da lista são iguais
        boolean todosIguais = numeros.stream()
                .distinct()
                .count() == 1;
        if(todosIguais){
            System.out.println("Todos os números na lista são iguais");
        } else {
            System.out.println("A lista contém números diferentes");
        }

        //Encontre a soma dos números divisíveis por 3 e 5
        int somaDivisiveisPor3e5 = numeros.stream()
                .filter(n -> n % 3 == 0 && n % 5 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("A soma dos números divisiveis por 3 e 5 é: "+ somaDivisiveisPor3e5);


    }

}
