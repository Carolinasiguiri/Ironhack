class Main {

    public static void main(String[] args) {

        // Creamos una lista(array) de enteros(para prueba).
        Integer[] numList = {1, 2, 3, 4, 3000}

        // Creamos una instancia de la clase Media.
        Media media = new Media();

        // Mostramos por pantalla el resultado del método
        // al pasarle nuestra lista.
        System.out.println(media.average(numList));

    }

}