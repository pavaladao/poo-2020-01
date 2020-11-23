public class Pessoa {
    
    private String nome;
    private int anoNascimento;

    public Pessoa(String nome, int anoNascimento) {

        setNome(nome);
        setAnoNascimento(anoNascimento);

    }

    public String getNome() {

        return nome;

    }

    public void setNome(String nome) {

        this.nome = nome;

    }

    public int getAnoNascimento() {

        return anoNascimento;

    }

    public void setAnoNascimento(int anoNascimento) {

        this.anoNascimento = anoNascimento;

    }

}