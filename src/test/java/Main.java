import datos.ClienteDaoJDBC;
import dominio.Cliente;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // mostrar los clientes
        System.out.printf("mostrando los clientes%n");
        List<Cliente> clientes = new ClienteDaoJDBC().listar();
        for (Cliente cliente : clientes) {
            System.out.println("cliente = " + cliente);
        }

        // insertar un nuevo cliente
        System.out.printf("insertar un nuevo cliente%n");
        Cliente cliente = new Cliente("Carlos", "Gonzalez", "gon@gmail.com", "123456789", 1000);
        int registros = new ClienteDaoJDBC().insertar(cliente);
        System.out.println("registros = " + registros);


    }
}
