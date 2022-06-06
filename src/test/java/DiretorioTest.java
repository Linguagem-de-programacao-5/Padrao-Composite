import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class DiretorioTest {

    @Test
    void deveRetornarItensDiretorio(){

        Pasta pastaCriacao = new Pasta("Padrões de Criacao");
        Pasta pastaSingleton = new Pasta("Padrão-Singleton");
        pastaCriacao.addConteudo(pastaSingleton);
        Arquivo classeConfing = new Arquivo("ConfiguracaoVencimento","java");
        pastaSingleton.addConteudo(classeConfing);

        Pasta pastaBuilder = new Pasta("Padrão-Builder");
        pastaCriacao.addConteudo(pastaBuilder);
        Arquivo classeAluno = new Arquivo("Aluno","java");
        Arquivo classeAlunoBuilder = new Arquivo("AlunoBuilder","java");
        pastaBuilder.addConteudo(classeAluno);
        pastaBuilder.addConteudo(classeAlunoBuilder);

        Pasta pastaEstruturais = new Pasta("Padrões Estruturais");
        Pasta padraoComposite = new Pasta("Padrão-Composite");
        pastaEstruturais.addConteudo(padraoComposite);
        Arquivo classeConteudo = new Arquivo("Conteudo","java");
        Arquivo classeUnidade = new Arquivo("Unidade","java");
        padraoComposite.addConteudo(classeConteudo);
        padraoComposite.addConteudo(classeUnidade);

        Pasta padroesProjeto = new Pasta("Padrões de projeto");
        padroesProjeto.addConteudo(pastaCriacao);
        padroesProjeto.addConteudo(pastaEstruturais);

        Pasta pastaLp5 = new Pasta("Linguagem de Programação 5");
        pastaLp5.addConteudo(padroesProjeto);

        Diretorio diretorio = new Diretorio();
        diretorio.setItem(pastaLp5);

        assertEquals("Pasta: Linguagem de Programação 5\n" +
                "Pasta: Padrões de projeto\n" +
                "Pasta: Padrões de Criacao\n" +
                "Pasta: Padrão-Singleton\n" +
                "Arquivo: ConfiguracaoVencimento.java\n" +
                "Pasta: Padrão-Builder\n" +
                "Arquivo: Aluno.java\n" +
                "Arquivo: AlunoBuilder.java\n" +
                "Pasta: Padrões Estruturais\n" +
                "Pasta: Padrão-Composite\n" +
                "Arquivo: Conteudo.java\n" +
                "Arquivo: Unidade.java\n", diretorio.getItem());
    }

    @Test
    void deveRetornarExecacaoDiretorioSemItens() {
        try {
            Diretorio disciplina = new Diretorio();
            disciplina.getItem();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Diretório vazio", e.getMessage());
        }
    }
}