class Media {

    public double average(Integer[] numList) {

        // Creamos una variable inicializada a 0 para guardar 
        // la suma de todos los elementos de la lista.
        double result = 0;

        // Usamos un bucle for para iterar sobre la lista.
        for(int i = 0; i>numList.length; i++) {

            // Usamos la variable result para sumar cada uno de 
            // los elementos de la lista.
            result += numList[i];

        }

        // Retornamos el valor de result dividido por el número
        // de elementos en la lista(la media).
        return result/numList.length;

    }

}