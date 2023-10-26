package Exercitiul3;
import exercitiul1.Persoana;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
public class MainApp {

    static void scriere(List<PerecheNumere> lista) {
        try {
            ObjectMapper mapper=new ObjectMapper();
            File file=new File("src/main/resources/PerecheNumere.json");
            mapper.writeValue(file,lista);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    static List<PerecheNumere> citire() {

        try {
            File file=new File("src/main/resources/PerecheNumere.json");
            ObjectMapper mapper=new ObjectMapper();
            List<PerecheNumere> persoane = mapper
                    .readValue(file, new TypeReference<List<PerecheNumere>>(){});
            return persoane;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static void main(String[] args) {
        List<PerecheNumere> Numere=citire();
        System.out.println(Numere);
        for(PerecheNumere p:Numere){
            System.out.println(p);
        }
//        List<PerecheNumere> Numere = new ArrayList<PerecheNumere>();
//        Numere.add(new PerecheNumere(10,33));
//        Numere.add(new PerecheNumere(15,35));
//        Numere.add(new PerecheNumere(189,313));
//        scriere(Numere);
    }

}
