package Univ.Lab8.LFC.Project;

import java.util.ArrayList;

class listaTranzitii{
    private ArrayList<Tranzitie> lista;
    listaTranzitii(){
        this.lista = new ArrayList<Tranzitie>();
    }
    void adaugaTranzitie(Tranzitie tr){
        lista.add(tr);
    }
    Tranzitie gasesteTranzitie(String stare, char simbol) throws Exception {
        for(int i = 0 ; i < lista.size();i++){
            Tranzitie tmp = lista.get(i);
            if(tmp.spuneStIncep().equals(stare) && tmp.spuneSimbol() == simbol)
                return tmp;
        }
        throw new Exception("Nu am gasit tranzitia");
    }
}
