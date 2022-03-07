package clase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public abstract class Readable {
    protected Scanner scanner;

    public Readable(String file) throws FileNotFoundException {
        scanner = new Scanner(new File(file));
    }

    public abstract List<Aplicant> readAplicanti() throws FileNotFoundException;

    public void readAplicant(Scanner input, Aplicant aplicant) {
        aplicant.setNume(input.next());
        aplicant.setPrenume(input.next());
        aplicant.setVarsta(input.nextInt());
        aplicant.setPunctaj(input.nextInt());

        int nrProiecte = input.nextInt();
        String[] proiecte = new String[nrProiecte];
        for (int i = 0; i < nrProiecte; i++)
            proiecte[i] = input.next();
        aplicant.setNr_proiecte(nrProiecte, proiecte);
    }
}
