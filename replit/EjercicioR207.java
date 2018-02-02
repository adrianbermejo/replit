import java.util.ArrayList;

class EjercicioR207
{
    public String devolverEnOrden(ArrayList<String> palabras)
    {
        String devolver = "";
        while(palabras.size() != 0){

            String comparar = palabras.get(0);
            for(String palabraActual : palabras) {
                if (palabraActual.length() >= comparar.length()){
                    comparar = palabraActual;
                }
            }
            devolver = (devolver + comparar);
            palabras.remove(comparar);
            if(palabras.size() > 0){

                devolver = devolver + ",";
            }
            
        }
        return devolver;
    }
}