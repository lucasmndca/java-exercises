package service.alunos;

import java.util.Objects;

/**
 *
 * @author LucasDias
 */
public class AlunosFormValidation {

    public boolean validarNome(String nome) {
        if(Objects.equals("", nome) || Objects.equals(null, nome)) {
            return false;
        } else {
            return true;
        }
    }

    public boolean validarCurso(String curso) {
        return !Objects.equals("Curso...", curso);
    }

    public boolean validarMatricula(String situacao) {
        return !Objects.equals("Matrícula...", situacao);
    }

    public boolean validarTelefone(int telefone) {
        return !(Objects.equals("", telefone) || Objects.equals(null, telefone));
    }

}
