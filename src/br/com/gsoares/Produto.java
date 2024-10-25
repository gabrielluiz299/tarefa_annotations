package br.com.gsoares;

import java.lang.annotation.Annotation;
@Tabela(nome = "preco")
public class Produto implements Tabela {
	@Tabela(nome = "preco")
    public Produto() {
    }

    @Override
    public String toString() {
        return "Produto";
    }
    @Override
    public Class<? extends Annotation> annotationType() {
        return Tabela.class;
    }

    @Override
    public String nome() {
        return "preco";
    }
}
