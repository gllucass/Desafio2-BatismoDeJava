public class Uchiha extends Ninja {
    String habilidadeEspecial ;

    public Uchiha(String nome, int idade, String missao, String nivelDificuldade, String statusDaMissao, String habilidadeEspecial ) {
        super(nome, idade, missao, nivelDificuldade, statusDaMissao,habilidadeEspecial );
    }

    public void mudarHabilidade(String novaHabilidadeEspecial) {
        habilidadeEspecial  = novaHabilidadeEspecial;
    }

    @Override
    public String mostrarInformacoes() {
        String info = super.mostrarInformacoes();
        info += "\nEu sou um Uchiha e posso usar o Sharingan";
        if (habilidadeEspecial  != null && !habilidadeEspecial .trim().isEmpty()) {
            info += "\nMinha habilidade é o: " + habilidadeEspecial ;
        }
        return info;
    }
}