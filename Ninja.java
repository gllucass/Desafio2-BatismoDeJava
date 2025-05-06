public class Ninja {
    String nome;
    int idade;
    String missao;
    String nivelDificuldade;
    String statusDaMissao;

    public Ninja(String nome, int idade, String missao, String nivelDificuldade, String statusDaMissao, String habilidadeEspecial) {
        this.nome = nome;
        this.idade = idade;
        this.missao = missao;
        this.nivelDificuldade = nivelDificuldade;
        this.statusDaMissao = statusDaMissao;
    }

    public String mostrarInformacoes() {
        return "Nome: " +  nome + "\n" +
                "Idade: " + idade + "\n"+
                "Missao: " + missao + "\n"+
                "Nivel de Dificuldade: " + nivelDificuldade +  "\n"+
                "Status Da Missao: " + statusDaMissao +  "\n";
    }
}
