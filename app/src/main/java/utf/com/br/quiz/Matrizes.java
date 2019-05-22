package utf.com.br.quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Matrizes {
    String[][] animais = new String[9][15];
    String[][] jogos = new String[9][15];
    String[][] gerais = new String[9][15];
    String[][] cinema = new String[9][15];

    public void alimentaAnimais(){
        animais[0][0] = "O animal mais inteligente, depois dos humanos, é o(a):";
        animais[1][0] = "Chimpanzé";
        animais[2][0] = "Golfinho";
        animais[3][0] = "Hamster";
        animais[4][0] = "Baleia";
        animais[5][0] = "Gorila";
        animais[6][0] = "Cachorro";
        animais[7][0] = "Gato";
        animais[8][0] = "Boi";

        animais[0][1] = "Qual é o animal mais dorminhoco do mundo?";
        animais[1][1] = "Coala";
        animais[2][1] = "Preguiça";
        animais[3][1] = "Morcego";
        animais[4][1] = "Cobra";
        animais[5][1] = "Gorila";
        animais[6][1] = "Cachorro";
        animais[7][1] = "Abelha";
        animais[8][1] = "Jacaré";

        animais[0][2] = "Com quantos narizes as formigas são equipadas?";
        animais[1][2] = "5";
        animais[2][2] = "1";
        animais[3][2] = "2";
        animais[4][2] = "3";
        animais[5][2] = "0";
        animais[6][2] = "4";
        animais[7][2] = "Nenhum";
        animais[8][2] = "6";

        animais[0][3] = "Qual desses mamíferos NÃO consegue pular?";
        animais[1][3] = "Elefante";
        animais[2][3] = "Golfinho";
        animais[3][3] = "Foca";
        animais[4][3] = "Preguiça";
        animais[5][3] = "Canguru";
        animais[6][3] = "Vaca";
        animais[7][3] = "Cachorro";
        animais[8][3] = "Tatu";

        animais[0][4] = "Qual dos animais abaixo NÃO é um inseto?";
        animais[1][4] = "Libélula";
        animais[2][4] = "Aranha";
        animais[3][4] = "Gafanhoto";
        animais[4][4] = "Abelha";
        animais[5][4] = "Borboleta";
        animais[6][4] = "Formiga";
        animais[7][4] = "Barata";
        animais[8][4] = "Pulga";

        animais[0][5] = "Qual é o animal mais forte do planeta?";
        animais[1][5] = "Besouro-Rinoceronte";
        animais[2][5] = "Elefante";
        animais[3][5] = "Rinoceronte";
        animais[4][5] = "Girafa";
        animais[5][5] = "Formiga";
        animais[6][5] = "Baleia";
        animais[7][5] = "Chimpanzé";
        animais[8][5] = "Búfalo";

        animais[0][6] = "Quanto tempo vive um crocodilo?";
        animais[1][6] = "80 anos";
        animais[2][6] = "200 anos";
        animais[3][6] = "100 anos";
        animais[4][6] = "90 anos";
        animais[5][6] = "30 anos";
        animais[6][6] = "150 anos";
        animais[7][6] = "70 anos";
        animais[8][6] = "10 anos";

        animais[0][7] = "Cerca de quantas vezes um beija-flor bate as suas asas por segundo?";
        animais[1][7] = "80 vezes por segundo";
        animais[2][7] = "20 vezes por segundo";
        animais[3][7] = "120 vezes por segundo";
        animais[4][7] = "160 vezes por segundo";
        animais[5][7] = "50 vezes por segundo";
        animais[6][7] = "200 vezes por segundo";
        animais[7][7] = "150 vezes por segundo";
        animais[8][7] = "210 vezes por segundo";

        animais[0][8] = "Qual é o beija-flor estampado nas antigas cédulas de um real (R$ 1,00)?";
        animais[1][8] = "Beija-flor-de-peito-azul";
        animais[2][8] = "Beija-flor-rubi";
        animais[3][8] = "Beija-flor-dourado ";
        animais[4][8] = "Beija-flor-estrela";
        animais[5][8] = "Beija-flor-de-bico-curvo";
        animais[6][8] = "Beija-flor-rajado";
        animais[7][8] = "Beija-flor-tesoura";
        animais[8][8] = "Beija-flor-cinza";

        animais[0][9] = "Depois de quanto tempo de vida o leão desenvolve a juba?";
        animais[1][9] = "2 anos de vida";
        animais[2][9] = "6 meses de vida";
        animais[3][9] = "8 anos de vida";
        animais[4][9] = "5 anos de vida";
        animais[5][9] = "Alguns meses de vida";
        animais[6][9] = "1 ano de vida";
        animais[7][9] = "6 anos de vida";
        animais[8][9] = "10 meses de vida";

        animais[0][10] = "O leão tem um inimigo muito grande, mas que ele não ataca, qual é?";
        animais[1][10] = "A hiena";
        animais[2][10] = "O lobo";
        animais[3][10] = "O tamanduá";
        animais[4][10] = "O elefante";
        animais[5][10] = "O jacaré";
        animais[6][10] = "A girafa";
        animais[7][10] = "O Chimpanzé";
        animais[8][10] = "O Búfalo";

        animais[0][11] = "Qual das alternativas a seguir apresenta apenas felinos?";
        animais[1][11] = "Tigre, leão, leopardo, lince e pantera";
        animais[2][11] = "Tigre, coiote, lobo, leão e pantera";
        animais[3][11] = "Lobo, lince, pantera, tigre e leopardo";
        animais[4][11] = "Macaco, leão, coiote, hiena e pantera";
        animais[5][11] = "Tigre, leão, coiote, hiena e pantera";
        animais[6][11] = "Formiga, lince, coiote, hiena e leopardo";
        animais[7][11] = "Leopardo, leão, elefante, hiena e pantera";
        animais[8][11] = "Lince, leão, jacaré, tigre e lobo";

        animais[0][12] = "Quais destes animais são herbívoros?";
        animais[1][12] = "Coala, cavalo e coelho";
        animais[2][12] = "Tigre, macaco e tubarão";
        animais[3][12] = "Vaca, leão e lince";
        animais[4][12] = "Cavalo, pato e onça";
        animais[5][12] = "Tubarão, onça e guepardo";
        animais[6][12] = "Búfalo, tigre e preguiça";
        animais[7][12] = "Preguiça, macaco e guepardo";
        animais[8][12] = "Onça, coelho e pato";

        animais[0][13] = "Qual foi o primeiro mamífero a ser clonado?";
        animais[1][13] = "Ovelha";
        animais[2][13] = "Cachorro";
        animais[3][13] = "Cavalo";
        animais[4][13] = "Carneiro";
        animais[5][13] = "Elefante";
        animais[6][13] = "Girafa";
        animais[7][13] = "Chimpanzé";
        animais[8][13] = "Búfalo";

        animais[0][14] = "Entre os egípcios, qual era a punição por matar um gato?";
        animais[1][14] = "Pena de morte";
        animais[2][14] = "Ter o pé cortado";
        animais[3][14] = "Prisão eterna";
        animais[4][14] = "Ter o pulso cortado";
        animais[5][14] = "Exílio";
        animais[6][14] = "Virar escravo";
        animais[7][14] = "Ter os dedos cortados";
        animais[8][14] = "Castração";

    }

    public void alimentaCinema(){
        cinema[0][0] = "";
        cinema[1][0] = "";
        cinema[2][0] = "";
        cinema[3][0] = "";
        cinema[4][0] = "";
        cinema[5][0] = "";
        cinema[6][0] = "";
        cinema[7][0] = "";
        cinema[8][0] = "";

        cinema[0][1] = "";
        cinema[1][1] = "";
        cinema[2][1] = "";
        cinema[3][1] = "";
        cinema[4][1] = "";
        cinema[5][1] = "";
        cinema[6][1] = "";
        cinema[7][1] = "";
        cinema[8][1] = "";

        cinema[0][2] = "";
        cinema[1][2] = "";
        cinema[2][2] = "";
        cinema[3][2] = "";
        cinema[4][2] = "";
        cinema[5][2] = "";
        cinema[6][2] = "";
        cinema[7][2] = "";
        cinema[8][2] = "";

        cinema[0][3] = "";
        cinema[1][3] = "";
        cinema[2][3] = "";
        cinema[3][3] = "";
        cinema[4][3] = "";
        cinema[5][3] = "";
        cinema[6][3] = "";
        cinema[7][3] = "";
        cinema[8][3] = "";

        cinema[0][4] = "";
        cinema[1][4] = "";
        cinema[2][4] = "";
        cinema[3][4] = "";
        cinema[4][4] = "";
        cinema[5][4] = "";
        cinema[6][4] = "";
        cinema[7][4] = "";
        cinema[8][4] = "";

        cinema[0][5] = "";
        cinema[1][5] = "";
        cinema[2][5] = "";
        cinema[3][5] = "";
        cinema[4][5] = "";
        cinema[5][5] = "";
        cinema[6][5] = "";
        cinema[7][5] = "";
        cinema[8][5] = "";

        cinema[0][6] = "";
        cinema[1][6] = "";
        cinema[2][6] = "";
        cinema[3][6] = "";
        cinema[4][6] = "";
        cinema[5][6] = "";
        cinema[6][6] = "";
        cinema[7][6] = "";
        cinema[8][6] = "";

        cinema[0][7] = "";
        cinema[1][7] = "";
        cinema[2][7] = "";
        cinema[3][7] = "";
        cinema[4][7] = "";
        cinema[5][7] = "";
        cinema[6][7] = "";
        cinema[7][7] = "";
        cinema[8][7] = "";

        cinema[0][8] = "";
        cinema[1][8] = "";
        cinema[2][8] = "";
        cinema[3][8] = "";
        cinema[4][8] = "";
        cinema[5][8] = "";
        cinema[6][8] = "";
        cinema[7][8] = "";
        cinema[8][8] = "";

        cinema[0][9] = "";
        cinema[1][9] = "";
        cinema[2][9] = "";
        cinema[3][9] = "";
        cinema[4][9] = "";
        cinema[5][9] = "";
        cinema[6][9] = "";
        cinema[7][9] = "";
        cinema[8][9] = "";

        cinema[0][10] = "";
        cinema[1][10] = "";
        cinema[2][10] = "";
        cinema[3][10] = "";
        cinema[4][10] = "";
        cinema[5][10] = "";
        cinema[6][10] = "";
        cinema[7][10] = "";
        cinema[8][10] = "";

        cinema[0][11] = "";
        cinema[1][11] = "";
        cinema[2][11] = "";
        cinema[3][11] = "";
        cinema[4][11] = "";
        cinema[5][11] = "";
        cinema[6][11] = "";
        cinema[7][11] = "";
        cinema[8][11] = "";

        cinema[0][12] = "";
        cinema[1][12] = "";
        cinema[2][12] = "";
        cinema[3][12] = "";
        cinema[4][12] = "";
        cinema[5][12] = "";
        cinema[6][12] = "";
        cinema[7][12] = "";
        cinema[8][12] = "";

        cinema[0][13] = "";
        cinema[1][13] = "";
        cinema[2][13] = "";
        cinema[3][13] = "";
        cinema[4][13] = "";
        cinema[5][13] = "";
        cinema[6][13] = "";
        cinema[7][13] = "";
        cinema[8][13] = "";

        cinema[0][14] = "";
        cinema[1][14] = "";
        cinema[2][14] = "";
        cinema[3][14] = "";
        cinema[4][14] = "";
        cinema[5][14] = "";
        cinema[6][14] = "";
        cinema[7][14] = "";
        cinema[8][14] = "";
    }

    public void alimentaJogos(){
        jogos[0][0] = "";
        jogos[1][0] = "";
        jogos[2][0] = "";
        jogos[3][0] = "";
        jogos[4][0] = "";
        jogos[5][0] = "";
        jogos[6][0] = "";
        jogos[7][0] = "";
        jogos[8][0] = "";

        jogos[0][1] = "";
        jogos[1][1] = "";
        jogos[2][1] = "";
        jogos[3][1] = "";
        jogos[4][1] = "";
        jogos[5][1] = "";
        jogos[6][1] = "";
        jogos[7][1] = "";
        jogos[8][1] = "";

        jogos[0][2] = "";
        jogos[1][2] = "";
        jogos[2][2] = "";
        jogos[3][2] = "";
        jogos[4][2] = "";
        jogos[5][2] = "";
        jogos[6][2] = "";
        jogos[7][2] = "";
        jogos[8][2] = "";

        jogos[0][3] = "";
        jogos[1][3] = "";
        jogos[2][3] = "";
        jogos[3][3] = "";
        jogos[4][3] = "";
        jogos[5][3] = "";
        jogos[6][3] = "";
        jogos[7][3] = "";
        jogos[8][3] = "";

        jogos[0][4] = "";
        jogos[1][4] = "";
        jogos[2][4] = "";
        jogos[3][4] = "";
        jogos[4][4] = "";
        jogos[5][4] = "";
        jogos[6][4] = "";
        jogos[7][4] = "";
        jogos[8][4] = "";

        jogos[0][5] = "";
        jogos[1][5] = "";
        jogos[2][5] = "";
        jogos[3][5] = "";
        jogos[4][5] = "";
        jogos[5][5] = "";
        jogos[6][5] = "";
        jogos[7][5] = "";
        jogos[8][5] = "";

        jogos[0][6] = "";
        jogos[1][6] = "";
        jogos[2][6] = "";
        jogos[3][6] = "";
        jogos[4][6] = "";
        jogos[5][6] = "";
        jogos[6][6] = "";
        jogos[7][6] = "";
        jogos[8][6] = "";

        jogos[0][7] = "";
        jogos[1][7] = "";
        jogos[2][7] = "";
        jogos[3][7] = "";
        jogos[4][7] = "";
        jogos[5][7] = "";
        jogos[6][7] = "";
        jogos[7][7] = "";
        jogos[8][7] = "";

        jogos[0][8] = "";
        jogos[1][8] = "";
        jogos[2][8] = "";
        jogos[3][8] = "";
        jogos[4][8] = "";
        jogos[5][8] = "";
        jogos[6][8] = "";
        jogos[7][8] = "";
        jogos[8][8] = "";

        jogos[0][9] = "";
        jogos[1][9] = "";
        jogos[2][9] = "";
        jogos[3][9] = "";
        jogos[4][9] = "";
        jogos[5][9] = "";
        jogos[6][9] = "";
        jogos[7][9] = "";
        jogos[8][9] = "";

        jogos[0][10] = "";
        jogos[1][10] = "";
        jogos[2][10] = "";
        jogos[3][10] = "";
        jogos[4][10] = "";
        jogos[5][10] = "";
        jogos[6][10] = "";
        jogos[7][10] = "";
        jogos[8][10] = "";

        jogos[0][11] = "";
        jogos[1][11] = "";
        jogos[2][11] = "";
        jogos[3][11] = "";
        jogos[4][11] = "";
        jogos[5][11] = "";
        jogos[6][11] = "";
        jogos[7][11] = "";
        jogos[8][11] = "";

        jogos[0][12] = "";
        jogos[1][12] = "";
        jogos[2][12] = "";
        jogos[3][12] = "";
        jogos[4][12] = "";
        jogos[5][12] = "";
        jogos[6][12] = "";
        jogos[7][12] = "";
        jogos[8][12] = "";

        jogos[0][13] = "";
        jogos[1][13] = "";
        jogos[2][13] = "";
        jogos[3][13] = "";
        jogos[4][13] = "";
        jogos[5][13] = "";
        jogos[6][13] = "";
        jogos[7][13] = "";
        jogos[8][13] = "";

        jogos[0][14] = "";
        jogos[1][14] = "";
        jogos[2][14] = "";
        jogos[3][14] = "";
        jogos[4][14] = "";
        jogos[5][14] = "";
        jogos[6][14] = "";
        jogos[7][14] = "";
        jogos[8][14] = "";

    }

    public void alimentaGerais() {
        gerais[0][0] = "";
        gerais[1][0] = "";
        gerais[2][0] = "";
        gerais[3][0] = "";
        gerais[4][0] = "";
        gerais[5][0] = "";
        gerais[6][0] = "";
        gerais[7][0] = "";
        gerais[8][0] = "";

        gerais[0][1] = "";
        gerais[1][1] = "";
        gerais[2][1] = "";
        gerais[3][1] = "";
        gerais[4][1] = "";
        gerais[5][1] = "";
        gerais[6][1] = "";
        gerais[7][1] = "";
        gerais[8][1] = "";

        gerais[0][2] = "";
        gerais[1][2] = "";
        gerais[2][2] = "";
        gerais[3][2] = "";
        gerais[4][2] = "";
        gerais[5][2] = "";
        gerais[6][2] = "";
        gerais[7][2] = "";
        gerais[8][2] = "";

        gerais[0][3] = "";
        gerais[1][3] = "";
        gerais[2][3] = "";
        gerais[3][3] = "";
        gerais[4][3] = "";
        gerais[5][3] = "";
        gerais[6][3] = "";
        gerais[7][3] = "";
        gerais[8][3] = "";

        gerais[0][4] = "";
        gerais[1][4] = "";
        gerais[2][4] = "";
        gerais[3][4] = "";
        gerais[4][4] = "";
        gerais[5][4] = "";
        gerais[6][4] = "";
        gerais[7][4] = "";
        gerais[8][4] = "";

        gerais[0][5] = "";
        gerais[1][5] = "";
        gerais[2][5] = "";
        gerais[3][5] = "";
        gerais[4][5] = "";
        gerais[5][5] = "";
        gerais[6][5] = "";
        gerais[7][5] = "";
        gerais[8][5] = "";

        gerais[0][6] = "";
        gerais[1][6] = "";
        gerais[2][6] = "";
        gerais[3][6] = "";
        gerais[4][6] = "";
        gerais[5][6] = "";
        gerais[6][6] = "";
        gerais[7][6] = "";
        gerais[8][6] = "";

        gerais[0][7] = "";
        gerais[1][7] = "";
        gerais[2][7] = "";
        gerais[3][7] = "";
        gerais[4][7] = "";
        gerais[5][7] = "";
        gerais[6][7] = "";
        gerais[7][7] = "";
        gerais[8][7] = "";

        gerais[0][8] = "";
        gerais[1][8] = "";
        gerais[2][8] = "";
        gerais[3][8] = "";
        gerais[4][8] = "";
        gerais[5][8] = "";
        gerais[6][8] = "";
        gerais[7][8] = "";
        gerais[8][8] = "";

        gerais[0][9] = "";
        gerais[1][9] = "";
        gerais[2][9] = "";
        gerais[3][9] = "";
        gerais[4][9] = "";
        gerais[5][9] = "";
        gerais[6][9] = "";
        gerais[7][9] = "";
        gerais[8][9] = "";

        gerais[0][10] = "";
        gerais[1][10] = "";
        gerais[2][10] = "";
        gerais[3][10] = "";
        gerais[4][10] = "";
        gerais[5][10] = "";
        gerais[6][10] = "";
        gerais[7][10] = "";
        gerais[8][10] = "";

        gerais[0][11] = "";
        gerais[1][11] = "";
        gerais[2][11] = "";
        gerais[3][11] = "";
        gerais[4][11] = "";
        gerais[5][11] = "";
        gerais[6][11] = "";
        gerais[7][11] = "";
        gerais[8][11] = "";

        gerais[0][12] = "";
        gerais[1][12] = "";
        gerais[2][12] = "";
        gerais[3][12] = "";
        gerais[4][12] = "";
        gerais[5][12] = "";
        gerais[6][12] = "";
        gerais[7][12] = "";
        gerais[8][12] = "";

        gerais[0][13] = "";
        gerais[1][13] = "";
        gerais[2][13] = "";
        gerais[3][13] = "";
        gerais[4][13] = "";
        gerais[5][13] = "";
        gerais[6][13] = "";
        gerais[7][13] = "";
        gerais[8][13] = "";

        gerais[0][14] = "";
        gerais[1][14] = "";
        gerais[2][14] = "";
        gerais[3][14] = "";
        gerais[4][14] = "";
        gerais[5][14] = "";
        gerais[6][14] = "";
        gerais[7][14] = "";
        gerais[8][14] = "";
    }

    public ArrayList sortearRespostas(String matriz[][], int coluna){
        Random rand = new Random();
        int numero;
        ArrayList<Integer> respostas = new ArrayList<Integer>();

        respostas.add(0,1);

        while (respostas.size() < 4){

            numero = rand.nextInt(7) + 2;

            if (!respostas.contains(numero)) {
                respostas.add(numero);
            }
        }

        Collections.shuffle(respostas);

        return respostas;
    }


}
