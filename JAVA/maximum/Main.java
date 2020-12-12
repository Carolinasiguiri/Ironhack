class Main {
    public static void (string[] args) {

        // Creación de un array de enteros(solo para pruebas).
        Integer[] numberList = {3, 5, 7, 916, 9, 20, 417};

        // Creación de una instancia de la clase First.
        First first = new First();
        
        // Muestra por pantalla el resultado del método
        // maximum de la clase First al pasarle el numberList.
        System.out.println(first.maximum(numberList));

    }
}