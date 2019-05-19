package utf.com.br.quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Matrizes {
    String[][] animais = new String[9][15];

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

        animais[0][10] = "Cada felino tem seus costumes habitats e outras coisas, mas o leão tem um inimigo muito grande, mas que ele não ataca, qual é?";
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

        Collections.shuffle(Arrays.asList(respostas));

        return respostas;
    }


}
