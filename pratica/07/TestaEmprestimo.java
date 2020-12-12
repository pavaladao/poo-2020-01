package pratica.poo4;

import java.util.Date;

public class TestaEmprestimo {
    public static void main(String[] args) {

        // Cria instância de livro correspondente ao livro
        // a ser emprestado
        Editora editora = new Editora("Moderna", "Rua Málaga");
        Pessoa autor = new Pessoa("Machado de Assis", 1900);
        Livro l = new Livro("Memórias póstumas de Bras Cubas",editora,autor,2001);

        // Cria instância que representa o empréstimo do livro
        Pessoa func = new Pessoa("Pedro", 1960);
        Pessoa usr = new Pessoa("Antônio",1987);
        Emprestimo emp = new Emprestimo(l,func,usr, new Date());

        // Imprime conteúdo de empréstimo representado
        // pela instância criada acima.
        System.out.println(emp);
    }
}
