package Univ.Lab8.LFC.Project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

class Automat {
    private String st_init = "q0";
    private listaTranzitii lt = new listaTranzitii();
    private ArrayList<String> st_finale = new ArrayList<String>();

    Automat(String nume_fis) throws Exception {
        BufferedReader buf = new BufferedReader(new FileReader(nume_fis));
        this.st_init = buf.readLine();
        String st_finale_str = buf.readLine();
        String[] tbl = st_finale_str.split(" ");
        for (int i = 0; i < tbl.length; i++)
            st_finale.add(tbl[i]);
        while (true) {
            String tmp = buf.readLine();
            if (tmp == null)
                break;
            else {
                String[] tmpt = tmp.split(" ");
                Tranzitie tr = new Tranzitie(tmpt[0], tmpt[1].charAt(0), tmpt[2]);
                lt.adaugaTranzitie(tr);
            }
        }
    }
}
