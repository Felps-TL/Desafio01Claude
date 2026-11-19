package desafio01.Test;

import desafio01.Main.Personagem;
import desafio01.Main.PersonagemPrint;

public class Arena {
    public static void main(String[] args) {
        Personagem goku = new Personagem();
        Personagem naruto = new Personagem();
        PersonagemPrint personagemPrint = new PersonagemPrint();

        goku.nome = "Goku";
        goku.vida = 100;
        goku.atk = 25;
        goku.def = 5;

        naruto.nome = "Naruto";
        naruto.vida = 90;
        naruto.atk = 15;
        naruto.def = 8;

        personagemPrint.print(goku);
        personagemPrint.print(naruto);

        System.out.println("---------- DEULO ----------");
        int turno = 1;
        while (goku.vida > 0 && naruto.vida >0) {
            System.out.println("\n---- Round " + turno + " ---");
            goku.atacar(naruto);

            if (naruto.vida > 0) {
                naruto.atacar(goku);
            }

            turno++;
        }
        System.out.println("\n---------- FIM DO DUELO ----------");
        if (goku.vida > 0) {
            System.out.println("Naruto foi derrotado! Goku venceu em " + (turno - 1) + " Rounds.");
        } else if (naruto.vida > 0) {
            System.out.println("Goku foi derrotado! Naruto venceu em " + (turno - 1) + " Rounds.");
        }
    }
}
//