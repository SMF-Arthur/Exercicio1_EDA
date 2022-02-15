
import java.util.Scanner;




/*


Bruninho adora o natal! Ele gosta da comida, das músicas clássicas, e, especialmente, dos presentes que o Papai Noel 
lhe dá todos os anos!

Assim como nos anos anteriores, Bruninho irá ganhar exatamente K presentes dentre os N presentes que 
Papai Noel tem disponível. Agora, ele deve decidir quais presentes ele irá pedir para o bom velhinho.

Como toda criança pensa, quanto maior é o pacote do presente, mais legal o presente é! Logo, 
ele decidiu pedir os presentes com os K maiores volumes. Dada a descrição de todos os N presentes que o 
Papai Noel tem, determine os K presentes que Bruninho deve pedir.

Entrada
A primeira linha contém um inteiro T (≤20), o número de casos de teste.

A primeira linha de cada caso de teste contém dois inteiros N e K (1 ≤ N ≤ 103 * ou 1 ≤ N ≤ 105 **, 1 ≤ K ≤ N), 
o número de presentes que o Papai Noel tem e o número de presentes que Bruninho irá ganhar.

Cada uma das próximas N linhas descrevem um presente. Cada linha contém quatro inteiros 
I, H, W e L (0 ≤ I ≤ 109, 1 ≤ H, W, L ≤ 100), o número de identificação (id) do presente e a altura, 
largura e comprimento do seu pacote, em centímetros. Todos os presentes tem ids diferentes.

* Em aproximadamente 40% dos casos de teste
** Nos demais casos de teste

Saída
Para cada caso de teste, imprima uma linha contendo K inteiros, separados por espaços, 
descrevendo os ids dos presentes que Bruninho deve pedir. Imprima os ids em ordem crescente. 
Não imprima um espaço após o último id.

Se existir mais de uma solução possível, imprima a lexicograficamente menor, isto é, 
o menor id na saída deve ser minimizado; no caso de empate, o segundo menor id na saída 
deve ser minimizado, e assim por diante.

Exemplo de Entrada	
2 -> casos de teste

3 2 ---- 1º teste(Maximo 20)
1 1 2 3
2 2 1 1
3 2 2 1
--------------------
2 1
32 4 5 1
25 10 1 2

Exemplo de Saída
1 3
25
--------------------

*/


public class Exer_Nivel_7 {   
    
    public static void main(String[] args){      
       
        //Scanner ler = new Scanner(System.in);
        //int quantidadeDeTeste ;
        
        Menu_Geral mg = new Menu_Geral();
        
                
    }
}
    
class Menu_Geral{     
      
    private int opcao = 0;
    private boolean continuar = true;
    private Scanner ler = new Scanner(System.in);
    
    public  Menu_Geral(){ 
        
        while (this.continuar == true){
            
            System.out.println("\n\n\n****************************************************");
            System.out.println("**                                                **");
            System.out.println("**                                                **");
            System.out.println("******************** Menu Geral ********************");
            System.out.println("**                                                **");
            System.out.println("**                                                **");
            System.out.println("****************************************************\n");
            System.out.println("--------Escolha UMA Opção Abaixo--------\n");
            System.out.println("-------- 1 = Começar Os Teste --------");
            System.out.println("-------- 2 = SAIR --------------------\n");
            System.out.println("Digite Uma opcao : ");
            this.opcao = ler.nextInt();            
            
            if(this.opcao <= 0 || this.opcao > 2){
                System.out.println("\n\nDigite Um Número Válido....");
                this.continuar = true;
            }
            else{
                
                if(this.opcao == 1){
                    System.out.println("\n\nComeçar Os Testes....\n\n");
                    CasosDeTeste ct = new CasosDeTeste();
                    this.continuar = true;
                }
                else{
                    System.out.println("\n\nSaindo.....");
                    this.continuar = false;
                }
            }
        }        
    }

}

class CasosDeTeste{
    private int quanidadeDeTeste;
    private int presenteTotalDoPapaiNoel_N, presenteTotalDeBruninho_K;    
    private int [][] matrizPresentes;    
    private boolean continuar = true;    
    private Scanner ler = new Scanner(System.in);
        
    public CasosDeTeste(){
        
        while(this.continuar == true){
           
            System.out.println("\n\n\n****************************************************");
            System.out.println("**                                                **");
            System.out.println("***************** Qauntidade Teste *****************");
            System.out.println("**                                                **");
            System.out.println("****************************************************\n");
            
            System.out.println("Digite um valor entre 0 e 21 (1 - 20) Quantidade de Tesstes ");
            System.out.println("Digite 0 para sair");
            System.out.println("\n\nDigite :");
            this.quanidadeDeTeste = ler.nextInt();
            
            if(this.quanidadeDeTeste == 0){
                System.out.println("\nSAINDOoo.... \n");
                this.continuar = false;
            }
            else if(this.quanidadeDeTeste >= 1 && this.quanidadeDeTeste <= 20){
                this.recebe();
                this.continuar = true;
            }
            else{
                System.out.println("\nDigite uma Numero Valido.... \n");
                this.continuar = true;
            }
        }        
    }   

    private void recebe(){
        this.continuar = true;
        
        while(this.continuar == true){
            
            System.out.println("\nPara a quantidade de presente de papai noel, digite um valor de 1 à 105\n");
            System.out.println("Digite a quantidade :");
            this.presenteTotalDoPapaiNoel_N = ler.nextInt();
            
            if(this.presenteTotalDoPapaiNoel_N >= 1 && this.presenteTotalDoPapaiNoel_N <= 105){
                
                System.out.println("\nPara a quantidade de presente de Bruninho");
                System.out.println("A quantidade tem que ser Igual a 1 até a quantidade igual do papai noel...\n");
                System.out.println("Digite a quantidade : ");
                this.presenteTotalDeBruninho_K = ler.nextInt();
                System.out.println("\n\n");
                
                if(this.presenteTotalDeBruninho_K >= 1 || this.presenteTotalDeBruninho_K <= this.presenteTotalDoPapaiNoel_N){
                    this.matrizPresentes = new int[this.presenteTotalDoPapaiNoel_N][4];
                    this.preencheMatriz(this.matrizPresentes);
                    this.continuar = false;
                }
                else if(this.presenteTotalDeBruninho_K < 1){
                    System.out.println("\nDigite Um Valor Positivo..\n\n\n");
                    this.continuar = true;
                }
                else{
                    System.out.println("\nA quantidade de presentes de Bruninho tem que ser igual ou menos a quantidade de presentes do papai noel...\n\n\n");
                    this.continuar = true;
                }
                
            }
            
            else{
               System.out.println("\nDigite uma Numero Valido.... \n");
               this.continuar = true;
            }
        }
    }
    
    private void preencheMatriz(int matriz[][]){
        int altura, largura, comprimento;
        
        
        System.out.println("Digite valores em CM, maior ou igual a 1 e menor que 100, para altura, largura e comprimento..");
        
        for(int i = 0; i < this.presenteTotalDoPapaiNoel_N; i++){           
            int j = i+1;
            System.out.println("Digite a Altura do "+j+"º presente : ");
            altura = ler.nextInt();
            
            System.out.println("Digite a Largura do "+j+"º presente : ");
            largura = ler.nextInt();
                
            System.out.println("Digite a Comprimento do "+j+"º presente : ");
            comprimento = ler.nextInt(); 
                
            if((altura < 1 || altura >100) || (largura < 1 || largura > 100) || (comprimento < 1 || comprimento > 100)){
                System.out.println("Digite um numero valido....");
                i = i - 1;
                j = j - 1;
            } 
            
            else{               
                matriz[i][0] = i+1;
                matriz[i][1] = altura;
                matriz[i][2] = largura;
                matriz[i][3] = comprimento;
                
            }
                   
        } 
        
        for(int i = 0; i < this.presenteTotalDoPapaiNoel_N; i++){
            for(int j = 0; j < 4; j++){
                System.out.print(""+this.matrizPresentes[i][j]+" ");
            }
            System.out.println("\n");
        }
        //return matriz;
    }
       
    private int[][] selectionSorte(int [][] matriz){
        
        int valorMaior, valorMenor;
        
        for(int fixo = 0; fixo < matriz.length -1; fixo++){
            int menor = fixo;
            
            for(int i = menor+1; i < matriz.length; i++){
                valorMaior = retornaVolume(matriz[i][1], matriz[i][2], matriz[i][3]);
                valorMenor =  retornaVolume(matriz[menor][1], matriz[menor][2], matriz[menor][3]);
                
                if(valorMaior < valorMenor){
                    menor = i;
                }
                else if (valorMaior == valorMenor) {
                    
                    if(matriz[i][0] < matriz[menor][0]){
                        menor = i;
                    }                    
                }                
            }
            if(menor != fixo){
                
                int id, alt, larg,comp;
                id = matriz[fixo][0];
                alt = matriz[fixo][1];
                larg = matriz[fixo][2];
                comp = matriz[fixo][3];
                
                matriz[fixo][0] = matriz[menor][0];
                matriz[fixo][1] = matriz[menor][1];
                matriz[fixo][2] = matriz[menor][2];
                matriz[fixo][3] = matriz[menor][3];
                
                matriz[menor][0] = id;
                matriz[menor][1] = alt;
                matriz[menor][2] = larg;
                matriz[menor][3] = comp;        
            }
        }
        
        return matriz;
    }
    
    private int retornaVolume(int altura, int largura, int comprimento){
        
        int volume = altura * largura * comprimento;
        
        return volume;
    }
}
    
    



