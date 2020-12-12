class PrintNumber {

    public String printNumberInWord(int num) {

        // Creamos una variable de tipo string para 
        // almacenar nuestro resultado.
        String number;

        // Para cada número le asociamos un nº a number.
        switch (num) {
            case 1: number = "UNO";
                break;
            case 2: number = "DOS";
                break;
            case 3: number = "TRES";
                break;
            case 4: number = "CUATRO";
                break;
            case 5: number = "CINCO";
                break;
            case 6: number = "SEIS";
                break;
            case 7: number = "SIETE";
                break;
            case 8: number = "OCHO";
                break;
            case 9: number = "NUEVE";
                break;
            default: number = "OTRO"
                break;
        }

        // Retornamos el resultado de number.
        return number;

    }

}