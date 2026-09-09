import model.Contato;
import model.impl.ContatoMemoriaDAO;
import model.impl.ContatoMySqlDAO;
import model.services.ContatoService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Contato contato = new Contato("Enzo", "1234567890", "enzo@me.com");
        ContatoMySqlDAO mySqlDAO = new ContatoMySqlDAO();

        ContatoService service = new ContatoService(mySqlDAO);
        service.salvar(contato);
    }
}