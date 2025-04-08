package List.OperacoesBasicas;

public class Tarefa {

    //atributo
    private String descrição;

    public Tarefa(String descrição) {
        this.descrição = descrição;
    }

    public String getDescrição() {
        return descrição;
    }

    public String toString(){
        return "Tarefa {" + "descrição = '" + descrição +'\'' + '}';
    }
    
}
