import java.util.Scanner;

public class Media{

    public static void main(String[] args) {
        
        System.out.println("Vamos calcular sua média final!");

        Scanner ler = new Scanner(System.in);

        // DECLARACAO DE VARIAVEIS
        int qtd = 4;
        double[] nota = new double[qtd];
        double[] peso = new double[qtd];
        double notaMin, media;
        boolean cond = true;

        System.out.println("Digite o peso das notas!");
        
        // SELECAO DE PESO DAS NOTAS
        for (int j = 0; j < peso.length; j++){
                System.out.println("Peso nota " + (j + 1) + ": ");
                peso[j] = ler.nextDouble();      

                // VALIDACAO PESOS POSITIVOS
                while (peso[j] <= 0) {
                    System.out.println("Peso invalido! Favor inserir um valor (peso) maior que 0.");
                    peso[j] = ler.nextDouble();
                }

            }    
                      
        // LOOP PARA O CALCULO DAS MEDIAS (ENQUANTO BOOLEAN TRUE)
        while (cond){
            notaMin = 0.0;
            media = 0.0;

            // RECEBER NOTAS E CALCULA-LAS DE ACORDO COM O PESO
            for (int i = 0; i < nota.length; i++){
                System.out.println("Digite a nota " + (i + 1) + "!");
                nota[i] = ler.nextDouble();

                // VALIDACAO NOTAS ENTRE 0 A 10
                while (nota[i] < 0 || nota[i] > 10) {
                    System.out.println("Nota invalida! Favor inserir um valor (nota) entre 0 e 10.");
                    nota[i] = ler.nextDouble();
                }

                // CALCULO MEDIA
                media += nota[i] * peso[i];
            }

            System.out.println("Qual a nota minima para aprovacao? ");
            notaMin = ler.nextDouble();
            
            // CONDICIONAL APROVADO OU REPROVADO
            if (media >= notaMin){

                System.out.println("Sua nota: " + media + "\nAprovado!!");
                
            } else {

                System.out.println("Sua nota: " + media + "\nReprovado!!");
            }                   

            // LOOP MENU DE ESCOLHA 
            while (true) {
                System.out.println("Deseja calcular uma nova media?\n1 - Sim\n2 - Nao");
                int escolha = ler.nextInt();

                // LOGICA CONDICIONAL PARA RETORNAR AO LOOP
                if (escolha ==  1){
                    break;
                }
                else if (escolha == 2){
                    cond = false;
                    break;
                }
                else {
                    System.out.println("Valor incorreto, programa fechado!");
                    break;
                }

            }
        }
        ler.close();
    }
}