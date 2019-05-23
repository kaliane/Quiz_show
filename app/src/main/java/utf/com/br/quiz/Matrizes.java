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
        animais[0][0] = "01 - O animal mais inteligente, depois dos humanos, é o(a):";
        animais[1][0] = "Chimpanzé";
        animais[2][0] = "Golfinho";
        animais[3][0] = "Hamster";
        animais[4][0] = "Baleia";
        animais[5][0] = "Gorila";
        animais[6][0] = "Cachorro";
        animais[7][0] = "Gato";
        animais[8][0] = "Boi";

        animais[0][1] = "02 - Qual é o animal mais dorminhoco do mundo?";
        animais[1][1] = "Coala";
        animais[2][1] = "Preguiça";
        animais[3][1] = "Morcego";
        animais[4][1] = "Cobra";
        animais[5][1] = "Gorila";
        animais[6][1] = "Cachorro";
        animais[7][1] = "Abelha";
        animais[8][1] = "Jacaré";

        animais[0][2] = "03 - Com quantos narizes as formigas são equipadas?";
        animais[1][2] = "5";
        animais[2][2] = "1";
        animais[3][2] = "2";
        animais[4][2] = "3";
        animais[5][2] = "0";
        animais[6][2] = "4";
        animais[7][2] = "Nenhum";
        animais[8][2] = "6";

        animais[0][3] = "04 - Qual desses mamíferos NÃO consegue pular?";
        animais[1][3] = "Elefante";
        animais[2][3] = "Golfinho";
        animais[3][3] = "Foca";
        animais[4][3] = "Preguiça";
        animais[5][3] = "Canguru";
        animais[6][3] = "Vaca";
        animais[7][3] = "Cachorro";
        animais[8][3] = "Tatu";

        animais[0][4] = "05 - Qual dos animais abaixo NÃO é um inseto?";
        animais[1][4] = "Libélula";
        animais[2][4] = "Aranha";
        animais[3][4] = "Gafanhoto";
        animais[4][4] = "Abelha";
        animais[5][4] = "Borboleta";
        animais[6][4] = "Formiga";
        animais[7][4] = "Barata";
        animais[8][4] = "Pulga";

        animais[0][5] = "06 - Qual é o animal mais forte do planeta?";
        animais[1][5] = "Besouro-Rinoceronte";
        animais[2][5] = "Elefante";
        animais[3][5] = "Rinoceronte";
        animais[4][5] = "Girafa";
        animais[5][5] = "Formiga";
        animais[6][5] = "Baleia";
        animais[7][5] = "Chimpanzé";
        animais[8][5] = "Búfalo";

        animais[0][6] = "07 - Quanto tempo vive um crocodilo?";
        animais[1][6] = "80 anos";
        animais[2][6] = "200 anos";
        animais[3][6] = "100 anos";
        animais[4][6] = "90 anos";
        animais[5][6] = "30 anos";
        animais[6][6] = "150 anos";
        animais[7][6] = "70 anos";
        animais[8][6] = "10 anos";

        animais[0][7] = "08 - Cerca de quantas vezes um beija-flor bate as suas asas por segundo?";
        animais[1][7] = "80 vezes por segundo";
        animais[2][7] = "20 vezes por segundo";
        animais[3][7] = "120 vezes por segundo";
        animais[4][7] = "160 vezes por segundo";
        animais[5][7] = "50 vezes por segundo";
        animais[6][7] = "200 vezes por segundo";
        animais[7][7] = "150 vezes por segundo";
        animais[8][7] = "210 vezes por segundo";

        animais[0][8] = "09 - Qual é o beija-flor estampado nas antigas cédulas de um real (R$ 1,00)?";
        animais[1][8] = "Beija-flor-de-peito-azul";
        animais[2][8] = "Beija-flor-rubi";
        animais[3][8] = "Beija-flor-dourado ";
        animais[4][8] = "Beija-flor-estrela";
        animais[5][8] = "Beija-flor-de-bico-curvo";
        animais[6][8] = "Beija-flor-rajado";
        animais[7][8] = "Beija-flor-tesoura";
        animais[8][8] = "Beija-flor-cinza";

        animais[0][9] = "10 - Depois de quanto tempo de vida o leão desenvolve a juba?";
        animais[1][9] = "2 anos de vida";
        animais[2][9] = "6 meses de vida";
        animais[3][9] = "8 anos de vida";
        animais[4][9] = "5 anos de vida";
        animais[5][9] = "Alguns meses de vida";
        animais[6][9] = "1 ano de vida";
        animais[7][9] = "6 anos de vida";
        animais[8][9] = "10 meses de vida";

        animais[0][10] = "11 - O leão tem um inimigo muito grande, mas que ele não ataca, qual é?";
        animais[1][10] = "A hiena";
        animais[2][10] = "O lobo";
        animais[3][10] = "O tamanduá";
        animais[4][10] = "O elefante";
        animais[5][10] = "O jacaré";
        animais[6][10] = "A girafa";
        animais[7][10] = "O Chimpanzé";
        animais[8][10] = "O Búfalo";

        animais[0][11] = "12 - Qual das alternativas a seguir apresenta apenas felinos?";
        animais[1][11] = "Tigre, leão, leopardo, lince e pantera";
        animais[2][11] = "Tigre, coiote, lobo, leão e pantera";
        animais[3][11] = "Lobo, lince, pantera, tigre e leopardo";
        animais[4][11] = "Macaco, leão, coiote, hiena e pantera";
        animais[5][11] = "Tigre, leão, coiote, hiena e pantera";
        animais[6][11] = "Formiga, lince, coiote, hiena e leopardo";
        animais[7][11] = "Leopardo, leão, elefante, hiena e pantera";
        animais[8][11] = "Lince, leão, jacaré, tigre e lobo";

        animais[0][12] = "13 - Quais destes animais são herbívoros?";
        animais[1][12] = "Coala, cavalo e coelho";
        animais[2][12] = "Tigre, macaco e tubarão";
        animais[3][12] = "Vaca, leão e lince";
        animais[4][12] = "Cavalo, pato e onça";
        animais[5][12] = "Tubarão, onça e guepardo";
        animais[6][12] = "Búfalo, tigre e preguiça";
        animais[7][12] = "Preguiça, macaco e guepardo";
        animais[8][12] = "Onça, coelho e pato";

        animais[0][13] = "14 - Qual foi o primeiro mamífero a ser clonado?";
        animais[1][13] = "Ovelha";
        animais[2][13] = "Cachorro";
        animais[3][13] = "Cavalo";
        animais[4][13] = "Carneiro";
        animais[5][13] = "Elefante";
        animais[6][13] = "Girafa";
        animais[7][13] = "Chimpanzé";
        animais[8][13] = "Búfalo";

        animais[0][14] = "15 - Entre os egípcios, qual era a punição por matar um gato?";
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
        cinema[0][0] = "01 - Como chama o maior inimigo do Harry Potter?";
        cinema[1][0] = "Lord Voldemort";
        cinema[2][0] = "Severo Snape";
        cinema[3][0] = "Draco Malfoy";
        cinema[4][0] = "Sirius Black";
        cinema[5][0] = "Valter Dursley";
        cinema[6][0] = "Dolores Umbridge";
        cinema[7][0] = "Dobby";
        cinema[8][0] = "Luna Lovegood";

        cinema[0][1] = "02 - Qual o nome do planeta onde se passa o filme Avatar?";
        cinema[1][1] = "Pandora";
        cinema[2][1] = "Padiola";
        cinema[3][1] = "Marte";
        cinema[4][1] = "Andora";
        cinema[5][1] = "Colora";
        cinema[6][1] = "Terra";
        cinema[7][1] = "Plutão";
        cinema[8][1] = "Saturno";

        cinema[0][2] = "03 - Qual o objetivo dos humanos em explorar o mundo de Avatar?";
        cinema[1][2] = "Explorar um tipo de mineral";
        cinema[2][2] = "Catequizar o povo nativo";
        cinema[3][2] = "Compartilhar conhecimento";
        cinema[4][2] = "Aprender sobre a cultura dos habitantes";
        cinema[5][2] = "Criar raças híbridas de humanos com aliens";
        cinema[6][2] = "Pesquisar sobre os animais e plantas";
        cinema[7][2] = "Encontrar novo lugar para morar";
        cinema[8][2] = "Encontrar água";

        cinema[0][3] = "04 - Qual o nome dos nativos do filme Avatar?";
        cinema[1][3] = "Na'vi";
        cinema[2][3] = "Nari";
        cinema[3][3] = "Narii";
        cinema[4][3] = "Naari";
        cinema[5][3] = "Nuonavi";
        cinema[6][3] = "Nuona";
        cinema[7][3] = "Naarii";
        cinema[8][3] = "Na'ri";

        cinema[0][4] = "05 - No filme os vingadores Bruce Banner tem um segredo para se transformar em Hulk. Que segredo é esse?";
        cinema[1][4] = "Ele está sempre com raiva";
        cinema[2][4] = "Ele se mantem calmo";
        cinema[3][4] = "Ele tem que sentir raiva";
        cinema[4][4] = "Alguém deve provoca-lo";
        cinema[5][4] = "Ele precisa gritar";
        cinema[6][4] = "Alguém deve assustá-lo";
        cinema[7][4] = "Ele deve bater palmas";
        cinema[8][4] = "Ele deve respirar fundo 15 vezes";

        cinema[0][5] = "06 - Thor tem o poder de controlar um elemento da natureza. Que elemento é esse?";
        cinema[1][5] = "Trovão";
        cinema[2][5] = "Fogo";
        cinema[3][5] = "Gelo";
        cinema[4][5] = "Água";
        cinema[5][5] = "Ar";
        cinema[6][5] = "Ferro";
        cinema[7][5] = "Chuva";
        cinema[8][5] = "Terra";

        cinema[0][6] = "07 - Qual a arma de um Jedi do filme Star Wars?";
        cinema[1][6] = "Sabre de luz";
        cinema[2][6] = "Arma laser";
        cinema[3][6] = "Bazuka";
        cinema[4][6] = "Espada";
        cinema[5][6] = "Martelo";
        cinema[6][6] = "Foice";
        cinema[7][6] = "Faca";
        cinema[8][6] = "Revolver";

        cinema[0][7] = "08 - Qual o nome dos dois androides que aparecem em todos os filmes da saga ?";
        cinema[1][7] = "R2-D2 E C3PO";
        cinema[2][7] = "R2-D3 E C3PW";
        cinema[3][7] = "R2-R2 E C3PO";
        cinema[4][7] = "R2-R2 E C3PW";
        cinema[5][7] = "DROIDES DE BATALHA";
        cinema[6][7] = "R3-D3 E CWPO";
        cinema[7][7] = "R3-D3 E C3PW";
        cinema[8][7] = "R2-D2 E CWPO";

        cinema[0][8] = "09 - Que filme de guerra inspirou a animação “Fuga das Galinhas”?";
        cinema[1][8] = "Fugindo do inferno";
        cinema[2][8] = "O Resgate do soldado Ryan";
        cinema[3][8] = "Glória Feita de Sangue";
        cinema[4][8] = "A ponte do rio Kwai";
        cinema[5][8] = "Fuga para a vitória";
        cinema[6][8] = "Tempo de glória";
        cinema[7][8] = "Além da linha vermelha";
        cinema[8][8] = "Platoon";

        cinema[0][9] = "10 - Que objeto Willy Wonka usa para percorrer os lugares mais rápido?";
        cinema[1][9] = "Um elevador de vidro";
        cinema[2][9] = "Um robô gigante";
        cinema[3][9] = "Um teletransporte";
        cinema[4][9] = "Uma pequena nave";
        cinema[5][9] = "Uma lambreta";
        cinema[6][9] = "Um patinete";
        cinema[7][9] = "Um carro";
        cinema[8][9] = "Um elefante";

        cinema[0][10] = "11 - No filme O Rei Leão, qual é o nome do filho do rei ?";
        cinema[1][10] = "Simba";
        cinema[2][10] = "Scar";
        cinema[3][10] = "Covu";
        cinema[4][10] = "Mufasa";
        cinema[5][10] = "Zazu";
        cinema[6][10] = "Nala";
        cinema[7][10] = "Timão";
        cinema[8][10] = "Pumba";

        cinema[0][11] = "12 - Qual era o famoso 'lema' de Timão e Pumba, no sentido de deixar o passado para trás?";
        cinema[1][11] = "Hakuna Matata";
        cinema[2][11] = "Hatuna Batata";
        cinema[3][11] = "Hatunda Makata";
        cinema[4][11] = "Kapuna Makaka";
        cinema[5][11] = "Kashuna Mataka";
        cinema[6][11] = "Ohana";
        cinema[7][11] = "Ohana Mataka";
        cinema[8][11] = "Makaka Hatunda";

        cinema[0][12] = "13 - Que tipo de animal primata é o Velho Rafiki do filme O Rei Leão?";
        cinema[1][12] = "Babuíno";
        cinema[2][12] = "Orangotango";
        cinema[3][12] = "Chipanzé";
        cinema[4][12] = "Gorila";
        cinema[5][12] = "Sagui";
        cinema[6][12] = "Mico-leão";
        cinema[7][12] = "Macaco-prego";
        cinema[8][12] = "Sauás";

        cinema[0][13] = "14 - Aonde Shrek vive?";
        cinema[1][13] = "Pântano";
        cinema[2][13] = "Floresta";
        cinema[3][13] = "Castelo";
        cinema[4][13] = "Barraca";
        cinema[5][13] = "Asilo";
        cinema[6][13] = "Rio";
        cinema[7][13] = "Hotel";
        cinema[8][13] = "Praia";

        cinema[0][14] = "15 - Qual foi o primeiro animal amigo que o Shrek conheceu?";
        cinema[1][14] = "Burro";
        cinema[2][14] = "Cavalo";
        cinema[3][14] = "Gato";
        cinema[4][14] = "Rato";
        cinema[5][14] = "Macaco";
        cinema[6][14] = "Elefante";
        cinema[7][14] = "Sapo";
        cinema[8][14] = "Cachorro";
    }

    public void alimentaJogos(){
        jogos[0][0] = "01 - Quantas cartas tem no baralho sem o coringa?";
        jogos[1][0] = "52";
        jogos[2][0] = "50";
        jogos[3][0] = "51";
        jogos[4][0] = "55";
        jogos[5][0] = "53";
        jogos[6][0] = "54";
        jogos[7][0] = "49";
        jogos[8][0] = "48";

        jogos[0][1] = "02 - Em que ano o Pac Man foi criado?";
        jogos[1][1] = "1980";
        jogos[2][1] = "1975";
        jogos[3][1] = "1987";
        jogos[4][1] = "1944";
        jogos[5][1] = "1998";
        jogos[6][1] = "1984";
        jogos[7][1] = "1972";
        jogos[8][1] = "2000";

        jogos[0][2] = "03 - Quantos são os níveis do Pac Man?";
        jogos[1][2] = "256";
        jogos[2][2] = "54";
        jogos[3][2] = "950";
        jogos[4][2] = "20";
        jogos[5][2] = "255";
        jogos[6][2] = "Infinitos";
        jogos[7][2] = "200";
        jogos[8][2] = "3";

        jogos[0][3] = "04 - No jogo de xadrez, qual é a peça que anda em 'L'?";
        jogos[1][3] = "Cavalo";
        jogos[2][3] = "Rei";
        jogos[3][3] = "Bispo";
        jogos[4][3] = "Peão";
        jogos[5][3] = "Rainha";
        jogos[6][3] = "Torre";
        jogos[7][3] = "Nenhuma das alternativas";
        jogos[8][3] = "Todas as alternativas";

        jogos[0][4] = "05 - O que significa a expressão 'xeque-mate' no xadrez?";
        jogos[1][4] = "Significa que o rei adversário está sob ataque e não tem como escapar";
        jogos[2][4] = "Permissão para jogar outra vez";
        jogos[3][4] = "Quem falou está desistindo da partida";
        jogos[4][4] = "Propõe que o adversário abandone o jogo";
        jogos[5][4] = "A rainha corre perigo";
        jogos[6][4] = "Sua vez de jogar";
        jogos[7][4] = "É uma jogada especial na qual se troca o rei e a torre de posições";
        jogos[8][4] = "Trocar o peão por outra peça";

        jogos[0][5] = "06 - Qual o objetivo do jogo de xadrez?";
        jogos[1][5] = "Deixar o rei do oponente sem movimentos válidos e em xeque";
        jogos[2][5] = "Capturar todos os peões";
        jogos[3][5] = "Converter as peças inimigas usando o bispo";
        jogos[4][5] = "Capturar todas as peças do adversário";
        jogos[5][5] = "Trocar o peão por outra peça";
        jogos[6][5] = "Chegar ao outro lado do tabuleiro";
        jogos[7][5] = "Deixar todas as peças do adverário sem movimentos";
        jogos[8][5] = "Acabar o tempo do adversário";

        jogos[0][6] = "07 - No jogo Super Mario World, qual o nome das tartarugas terrestres que são inimigos de Mario?";
        jogos[1][6] = "Koopa Troopa";
        jogos[2][6] = "Koopa Paratroopa";
        jogos[3][6] = "Flying Koopa";
        jogos[4][6] = "Paratroopa Flying";
        jogos[5][6] = "Walking Koopa";
        jogos[6][6] = "Koopa Flying";
        jogos[7][6] = "Koopa Walking";
        jogos[8][6] = "Koopa Koopa";

        jogos[0][7] = "08 - Quantos mundos existem no Super Mario World?";
        jogos[1][7] = "8 mundos";
        jogos[2][7] = "7 mundos";
        jogos[3][7] = "11 mundos";
        jogos[4][7] = "9 mundos";
        jogos[5][7] = "10 mundos";
        jogos[6][7] = "5 mundos";
        jogos[7][7] = "4 mundos";
        jogos[8][7] = "12 mundos";

        jogos[0][8] = "09 - Em que ano o jogo Sonic foi criado?";
        jogos[1][8] = "1991";
        jogos[2][8] = "1992";
        jogos[3][8] = "1990";
        jogos[4][8] = "1980";
        jogos[5][8] = "1993";
        jogos[6][8] = "1994";
        jogos[7][8] = "1995";
        jogos[8][8] = "1996";

        jogos[0][9] = "10 - E-123 omega é o que no jogo do Sonic?";
        jogos[1][9] = "Robô";
        jogos[2][9] = "Humano";
        jogos[3][9] = "Ouriço";
        jogos[4][9] = "Raposa";
        jogos[5][9] = "Automóvel";
        jogos[6][9] = "Cachorro";
        jogos[7][9] = "Patinete";
        jogos[8][9] = "Nave espacial";

        jogos[0][10] = "11 - O nome da rainha do desenho Sonic Underground é:";
        jogos[1][10] = "Rainha Aleena";
        jogos[2][10] = "Rainha Aienaa";
        jogos[3][10] = "Rainha Aleana";
        jogos[4][10] = "Rainha Alena";
        jogos[5][10] = "Rainha Underground";
        jogos[6][10] = "Rainha Aloonia";
        jogos[7][10] = "Rainha Under";
        jogos[8][10] = "Rainha Ground";

        jogos[0][11] = "12 - Quando o jogo GTA V foi lançado?";
        jogos[1][11] = "17 de Setembro de 2013";
        jogos[2][11] = "23 de Maio de 2011";
        jogos[3][11] = "7 de Setembro de 2013";
        jogos[4][11] = "30 de Abril de 2008";
        jogos[5][11] = "24 de Agosto de 2009";
        jogos[6][11] = "09 de Dezembro de 2010";
        jogos[7][11] = "30 de Dezembro de 2001";
        jogos[8][11] = "22 de Agosto de 2011";

        jogos[0][12] = "13 - Qual é a cidade do jogo GTA V?";
        jogos[1][12] = "Los Santos";
        jogos[2][12] = "Las Venturas";
        jogos[3][12] = "Liberty City";
        jogos[4][12] = "Vice City";
        jogos[5][12] = "San Fierro";
        jogos[6][12] = "Las Vegas";
        jogos[7][12] = "Los Angeles";
        jogos[8][12] = "Las Palmas";

        jogos[0][13] = "14 - Qual a altura da rede de vôlei nos jogos masculino e feminino?";
        jogos[1][13] = "2,43 m e 2,24 m";
        jogos[2][13] = "2,4 m para ambos";
        jogos[3][13] = "2,5 m e 2,0 m";
        jogos[4][13] = "1,8 m e 1,5 m";
        jogos[5][13] = "2,45 m e 2,15 m";
        jogos[6][13] = "1,5 m e 1,8 m";
        jogos[7][13] = "2,24 m e 2,43 m";
        jogos[8][13] = "2 m para ambos";

        jogos[0][14] = "15 - Qual o número mínimo de jogadores numa partida de futebol?";
        jogos[1][14] = "7";
        jogos[2][14] = "8";
        jogos[3][14] = "10";
        jogos[4][14] = "9";
        jogos[5][14] = "5";
        jogos[6][14] = "12";
        jogos[7][14] = "15";
        jogos[8][14] = "6";

    }

    public void alimentaGerais() {
        gerais[0][0] = "01 - Normalmente, quantos litros de sangue uma pessoa tem?";
        gerais[1][0] = "Entre 4 a 6 litros";
        gerais[2][0] = "Entre 2 a 4 litros";
        gerais[3][0] = "10 litros";
        gerais[4][0] = "7 litros";
        gerais[5][0] = "0,5 litros";
        gerais[6][0] = "8 litros";
        gerais[7][0] = "12 litros";
        gerais[8][0] = "15 litros";

        gerais[0][1] = "02 - De onde é a invenção do chuveiro elétrico?";
        gerais[1][1] = "Brasil";
        gerais[2][1] = "França";
        gerais[3][1] = "Inglaterra";
        gerais[4][1] = "Austrália";
        gerais[5][1] = "Itália";
        gerais[6][1] = "EUA";
        gerais[7][1] = "África";
        gerais[8][1] = "China";

        gerais[0][2] = "03 - Quantos elementos químicos a tabela periódica possui?";
        gerais[1][2] = "118";
        gerais[2][2] = "113";
        gerais[3][2] = "109";
        gerais[4][2] = "108";
        gerais[5][2] = "92";
        gerais[6][2] = "90";
        gerais[7][2] = "98";
        gerais[8][2] = "100";

        gerais[0][3] = "04 - Quanto tempo a luz do Sol demora para chegar à Terra?";
        gerais[1][3] = "8 minutos";
        gerais[2][3] = "12 minutos";
        gerais[3][3] = "segundos";
        gerais[4][3] = "30 minutos";
        gerais[5][3] = "12 horas";
        gerais[6][3] = "1 dia";
        gerais[7][3] = "20 horas";
        gerais[8][3] = "30 segundos";

        gerais[0][4] = "05 - Em que ordem surgiram os modelos atômicos?";
        gerais[1][4] = "Dalton, Thomson, Rutherford, Rutherford-Bohr";
        gerais[2][4] = "Thomson, Dalton, Rutherford, Rutherford-Bohr";
        gerais[3][4] = "Rutherford-Bohr, Rutherford, Thomson, Dalton";
        gerais[4][4] = "Dalton, Rutherford-Bohr, Thomson, Rutherford";
        gerais[5][4] = "Dalton, Thomson, Rutherford-Bohr, Rutherford";
        gerais[6][4] = "Rutherford, Thomson, Dalton, Rutherford-Bohr";
        gerais[7][4] = "Rutherford-Bohr, Thomson, Rutherford, Dalton";
        gerais[8][4] = "Thomson, Rutherford, Dalton, Rutherford-Bohr";

        gerais[0][5] = "06 - Qual personagem folclórico costuma ser agradado pelos caçadores com a oferta de fumo?";
        gerais[1][5] = "Caipora";
        gerais[2][5] = "Saci";
        gerais[3][5] = "Lobisomem";
        gerais[4][5] = "Boitatá";
        gerais[5][5] = "Negrinho do Pastoreio";
        gerais[6][5] = "Emília";
        gerais[7][5] = "Iara";
        gerais[8][5] = "Curupira";

        gerais[0][6] = "07 - Qual a montanha mais alta do Brasil?";
        gerais[1][6] = "Pico da Neblina";
        gerais[2][6] = "Pico Paraná";
        gerais[3][6] = "Monte Roraima";
        gerais[4][6] = "Pico Maior de Friburgo";
        gerais[5][6] = "Pico da Bandeira";
        gerais[6][6] = "Monte Everest";
        gerais[7][6] = "Pedra da Mina";
        gerais[8][6] = "Morro do Couto";

        gerais[0][7] = "08 - Em qual local da Ásia o português é língua oficial?";
        gerais[1][7] = "Macau";
        gerais[2][7] = "Índia";
        gerais[3][7] = "Filipinas";
        gerais[4][7] = "Moçambique";
        gerais[5][7] = "Portugal";
        gerais[6][7] = "Afeganistão";
        gerais[7][7] = "Arábia ";
        gerais[8][7] = "Saudita";

        gerais[0][8] = "09 - Qual foi o recurso utilizado inicialmente pelo homem para explicar a origem das coisas?";
        gerais[1][8] = "Mitologia";
        gerais[2][8] = "Filosofia";
        gerais[3][8] = "Biologia";
        gerais[4][8] = "Matemática";
        gerais[5][8] = "Astronomia";
        gerais[6][8] = "História";
        gerais[7][8] = "Sociologia";
        gerais[8][8] = "Português";

        gerais[0][9] = "10 - Júpiter e Plutão são os correlatos romanos de quais deuses gregos?";
        gerais[1][9] = "Zeus e Hades";
        gerais[2][9] = "Ares e Hermes";
        gerais[3][9] = "Cronos e Apolo";
        gerais[4][9] = "Dionísio e Deméter";
        gerais[5][9] = "Zeus e Ares";
        gerais[6][9] = "Zeus e Poseídon";
        gerais[7][9] = "Poseídon e Ares";
        gerais[8][9] = "Dionísio e Atena";

        gerais[0][10] = "11 - Quem foi o primeiro homem a pisar na Lua?";
        gerais[1][10] = "Neils Armstrong";
        gerais[2][10] = "Yuri Gagarin";
        gerais[3][10] = "Buzz Aldrin";
        gerais[4][10] = "Charles Conrad";
        gerais[5][10] = "Charles Duke";
        gerais[6][10] = "David Scott";
        gerais[7][10] = "Eugene Cernan";
        gerais[8][10] = "Michael Collins";

        gerais[0][11] = "12 - As pessoas de qual tipo sanguíneo são consideradas doadores universais?";
        gerais[1][11] = "Tipo O";
        gerais[2][11] = "Tipo A";
        gerais[3][11] = "Tipo AB";
        gerais[4][11] = "Tipo B";
        gerais[5][11] = "Tipo ABO";
        gerais[6][11] = "Tipo A-";
        gerais[7][11] = "Tipo O-";
        gerais[8][11] = "Tipo AB-";

        gerais[0][12] = "13 - Qual a ciência que estuda a atmosfera da Terra e a climatologia?";
        gerais[1][12] = "Meteorologia";
        gerais[2][12] = "Astronomia";
        gerais[3][12] = "Dispersão atmosférica";
        gerais[4][12] = "Meteorologia";
        gerais[5][12] = "Horologia";
        gerais[6][12] = "Metodologia";
        gerais[7][12] = "Mitologia";
        gerais[8][12] = "Astrologia";

        gerais[0][13] = "14 - Quanto tempo garrafas de plástico demoram para se decompor?";
        gerais[1][13] = "450 anos";
        gerais[2][13] = "1000 anos";
        gerais[3][13] = "100 anos";
        gerais[4][13] = "1 milhão de anos";
        gerais[5][13] = "500 anos";
        gerais[6][13] = "300 anos";
        gerais[7][13] = "250 anos";
        gerais[8][13] = "800 anos";

        gerais[0][14] = "15 - De que são constituídos os diamantes?";
        gerais[1][14] = "Carbono";
        gerais[2][14] = "Grafite";
        gerais[3][14] = "Rênio";
        gerais[4][14] = "Ósmio";
        gerais[5][14] = "Bóhrio";
        gerais[6][14] = "Magnésio";
        gerais[7][14] = "Acetanilida";
        gerais[8][14] = "Acetileno";
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
