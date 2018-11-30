
package lojatestsdaisy;
import TelasInterface.PainelPrincipal;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    ArrayList<Produto> listaprod = new ArrayList();
    ArrayList<Cliente> listaclient = new ArrayList();
    ArrayList<Funcionario> listafuncionari = new ArrayList();
    new PainelPrincipal(listaprod,listaclient,listafuncionari).setVisible(true);
        
   
    
        
        
        
    }
    
}
