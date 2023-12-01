//

import java.util.HashMap;
import java.util.Map;

// Entidade Usuario
class Usuario {
    private int id;
    private String nome;
    private String email;

    // Construtor e getters/setters omitidos para simplificar o exemplo

    @Override
    public String toString() {
        return "Usuario{id=" + id + ", nome='" + nome + "', email='" + email + "'}";
    }
}

// Interface DAO
interface UsuarioDAO {
    // Método para salvar um usuário no banco de dados
    void salvarUsuario(Usuario usuario);

    // Método para obter um usuário pelo ID
    Usuario obterUsuarioPorId(int id);

    // Método para atualizar as informações de um usuário
    void atualizarUsuario(Usuario usuario);

    // Método para excluir um usuário pelo ID
    void excluirUsuario(int id);
}

// Implementação DAO
class UsuarioDAOImpl implements UsuarioDAO {
    private Map<Integer, Usuario> bancoDeDados = new HashMap<>();

    // Implementação do método para salvar um usuário no banco de dados
    @Override
    public void salvarUsuario(Usuario usuario) {
        bancoDeDados.put(usuario.getId(), usuario);
        System.out.println("Usuário salvo no banco de dados: " + usuario);
    }

    // Implementação do método para obter um usuário pelo ID
    @Override
    public Usuario obterUsuarioPorId(int id) {
        return bancoDeDados.get(id);
    }

    // Implementação do método para atualizar as informações de um usuário
    @Override
    public void atualizarUsuario(Usuario usuario) {
        if (bancoDeDados.containsKey(usuario.getId())) {
            bancoDeDados.put(usuario.getId(), usuario);
            System.out.println("Usuário atualizado no banco de dados: " + usuario);
        } else {
            System.out.println("Usuário não encontrado para atualização.");
        }
    }

    // Implementação do método para excluir um usuário pelo ID
    @Override
    public void excluirUsuario(int id) {
        if (bancoDeDados.containsKey(id)) {
            Usuario usuarioExcluido = bancoDeDados.remove(id);
            System.out.println("Usuário excluído do banco de dados: " + usuarioExcluido);
        } else {
            System.out.println("Usuário não encontrado para exclusão.");
        }
    }
}

// Testando o Padrão DAO
public class ExemploPadraoDAO {
    public static void main(String[] args) {
        // Criando uma instância da implementação do DAO
        UsuarioDAO usuarioDAO = new UsuarioDAOImpl();

        // Criando um novo usuário
        Usuario novoUsuario = new Usuario();
        novoUsuario.setId(1);
        novoUsuario.setNome("John Doe");
        novoUsuario.setEmail("john.doe@example.com");

        // Salvando o novo usuário no banco de dados
        usuarioDAO.salvarUsuario(novoUsuario);

        // Obtendo o usuário recém-salvo pelo ID
        Usuario usuarioRecuperado = usuarioDAO.obterUsuarioPorId(1);
        System.out.println("Usuário recuperado do banco de dados: " + usuarioRecuperado);

        // Atualizando as informações do usuário recuperado
        usuarioRecuperado.setNome("John Updated");
        usuarioRecuperado.setEmail("john.updated@example.com");
        usuarioDAO.atualizarUsuario(usuarioRecuperado);

        // Excluindo o usuário pelo ID
        usuarioDAO.excluirUsuario(1);
    }
}
