class First {

    // método que encuentra el máximo en la lista
    public Integer maximum(Integer[] numList) {

        // Guardamos el primer valor del array dentro de result
        // esto sirve para asegurarnos que dentro de la lista
        // vamos a encontrar el valor más grande
        int result = numList[0];

            // Iteramos (miramos cada posición de la lista/array)
            for(int i = 0; i < numList.length; i++) {

                // Compara el valor guardado de result con el de la
                // posición i del array, si resulta que es mayor
                // se guardará ese valor de la posición i en result
                if(result < numList[i]) {
                    result = numList[i];
                }

            }
            
            // devuelve el mayor resultado encontrado que coincide
            // con el mayor del array
            return result;

    }

}