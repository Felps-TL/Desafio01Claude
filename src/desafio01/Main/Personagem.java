package desafio01.Main;

public class Personagem {
    public String nome;
    public int vida;
    public int atk;
    public int def;

    public int calcularDano(Personagem alvo) {
        int atacar = atk - alvo.def;
        if (atacar < 1) {
            atacar = 1;
        }
        return atacar;
    }

    public void atacar(Personagem personagem) {
        int dano = calcularDano(personagem);
        personagem.vida -= dano;
        if (personagem.vida < 0) {
            personagem.vida = 0;
        }
        System.out.println(nome + " atacou Naruto e causou " + dano + " de dano! " + "(" + personagem.nome + ": " + personagem.vida + " de vida)");
    }
}
//