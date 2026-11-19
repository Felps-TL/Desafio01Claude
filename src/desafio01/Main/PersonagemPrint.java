package desafio01.Main;

public class PersonagemPrint {
    public void print(Personagem personagem) {
        System.out.println("-------------------------------------------");

        System.out.println("Nome:" + personagem.nome + " || Vida:" + personagem.vida + " || Atk:" + personagem.atk + " || Def:" + personagem.def);
    }
}
///