package service.alunos;

/**
 *
 * @author LucasDias
 */
public class Alunos {
    private String nome;
    private String cursoSelecionado;
    private String situacaoMatricula;
    private int telefone;
    
    public Alunos(
            String nome,
            String cursoSelecionado,
            String situacaoMatricula,
            int telefone) {
        this.nome = nome;
        this.cursoSelecionado = cursoSelecionado;
        this.situacaoMatricula = situacaoMatricula;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getCursoSelecionado() {
        return cursoSelecionado;
    }

    public String getSituacaoMatricula() {
        return situacaoMatricula;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCursoSelecionado(String cursoSelecionado) {
        this.cursoSelecionado = cursoSelecionado;
    }

    public void setSituacaoMatricula(String situacaoMatricula) {
        this.situacaoMatricula = situacaoMatricula;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    } 
}
