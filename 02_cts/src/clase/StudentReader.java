package clase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentReader extends Readable {
    public StudentReader(String file) throws FileNotFoundException {
        super(file);
    }

    @Override
    public List<Aplicant> readAplicanti() throws FileNotFoundException {
        super.scanner.useDelimiter(",|\n");
        List<Aplicant> studenti = new ArrayList<>();

        while (super.scanner.hasNext()) {
            Student student = new Student();
            readAplicant(super.scanner, student);
            student.setAn_studii(super.scanner.nextInt());
            student.setFacultate(super.scanner.next());
            studenti.add(student);
        }
        super.scanner.close();
        return studenti;
    }
}
