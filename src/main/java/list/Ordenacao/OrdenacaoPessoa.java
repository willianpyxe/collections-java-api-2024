package main.java.list.Ordenacao;

import java.util.*;

public class OrdenacaoPessoa {
    //atributo
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenadoPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }
    public List<Pessoa> ordenadoPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new CompraratorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenarPessoa = new OrdenacaoPessoa();
        ordenarPessoa.adicionarPessoa("Nome 1", 20, 1.56);
        ordenarPessoa.adicionarPessoa("Nome 2", 30, 1.80);
        ordenarPessoa.adicionarPessoa("Nome 3", 25, 1.70);
        ordenarPessoa.adicionarPessoa("Nome 4", 17, 1.56);

        System.out.println(ordenarPessoa.pessoaList.toString());

        System.out.println(ordenarPessoa.ordenadoPorIdade());
        System.out.println(ordenarPessoa.ordenadoPorAltura());

    }
}
