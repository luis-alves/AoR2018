/**
 * Programa que permite simular uma prensa perfuradora de folhas de metal de uma linha de 
 * produção de uma fábrica na área da indústria metalomecânica. 
 * Os elementos chave para esta simulação são a velocidade de processamento da prensa perfuradora 
 * e a taxa de chegada das folhas de metal ao alimentador de folhas da prensa.
 *
 * @sid 2012
 * @aid 5.17
 */
public class Ex17 {

  public static void main(String[] args) throws InterruptedException {
    //begin_inputs
    //end_inputs
    
    // Prossupostos
    int tempoPrensaEejecao = 4 * 1000; // milisegundos
    int tempoEsperaChegadaFolha = 3 * 1000; // milisegundos
    int tempoEsperaSaidaFolha = 3 * 1000; // milisegundos
    
    int tempoProducao = 60 * 60 * 1000; // 60 minutos de produção em milisegundos
    int intervaloTempoRelatorio = 5 * 60 * 1000; // em milissegundos
    
    int folhasProcessadas = 0;
    int folhasTotaisPorProcessar = tempoProducao / (tempoPrensaEejecao + tempoEsperaChegadaFolha +
            tempoEsperaSaidaFolha);
    int tempoDecorrido = 0;

    while (folhasTotaisPorProcessar > 0) {
      esperaEntrada(tempoEsperaChegadaFolha);
      folhasProcessadas += perfuraFolha(tempoPrensaEejecao);
      esperaSaida(tempoEsperaSaidaFolha);
      System.out.println(folhasProcessadas);
      folhasTotaisPorProcessar -= 1;
      tempoDecorrido += (tempoPrensaEejecao + tempoEsperaChegadaFolha + tempoEsperaSaidaFolha);
      if (tempoDecorrido == intervaloTempoRelatorio) {
        System.out.println("Folhas Processadas: " + folhasProcessadas + " Folhas por processar: " +
                folhasTotaisPorProcessar);
      }
    }
  }
  
  private static void esperaSaida(int tempoEsperaSaidaFolha) throws InterruptedException {
    Thread.sleep(tempoEsperaSaidaFolha);
  }

  private static int perfuraFolha(int t) throws InterruptedException {
    Thread.sleep(t);
    return 1;
  }

  private static void esperaEntrada(int tempoEsperaChegadaFolha) throws InterruptedException {
    Thread.sleep(tempoEsperaChegadaFolha);
    
  }

}
