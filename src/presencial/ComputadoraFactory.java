package presencial;

import java.util.HashMap;
import java.util.Map;

public class ComputadoraFactory {
    private Map<String, Computadora> computadorasCreadas = new HashMap<>();

    public Computadora getComputadora(int ram, int disco) {
        String clave = "clave: " + ram + ": " + disco;      // creamos una clave para el Map
        if (computadorasCreadas.containsKey(clave)) {      // corroboramos si la clave ya existe en el Map
            return computadorasCreadas.get(clave);       // si existe, devolvemos el objeto creado con anterioridad
        } else {
            computadorasCreadas.put(clave, new Computadora(ram, disco)); // si no existe, lo agregamos al Map
            return computadorasCreadas.get(clave);        // y retornamos el nuevo objeto creado
        }

    }
}
