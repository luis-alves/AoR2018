import java.time.LocalDate;
/**
 * Breve descrição do código
 *
 * @sid 2012
 * @aid 8.9
 */
public class Principal {

    public static void main(String[] args) {
        Pessoa luis = new Pessoa("Luis", "masculino", 
                                 LocalDate.of(1975,5,9), 
                                 "Rua sm");
        Pessoa miguel = new Pessoa("Miguel", "masculino", 
                                   LocalDate.of(1985,10,9), 
                                   "Rua sm");
        Pessoa oliveira = new Pessoa("Oliveira", "masculino", 
                                     LocalDate.of(1985,10,3), 
                                     "Rua sm");
        Pessoa alves = new Pessoa("Alves", "masculino", 
                                  LocalDate.of(1968,1,9), 
                                  "Rua sm");
        Pessoa silvia = new Pessoa("Silvia", "feminino", 
                                   LocalDate.of(1955,11,9), 
                                   "Rua sm");
        
        Pessoa[] variasPessoas = {luis, miguel, oliveira, alves, silvia};
        
        Pessoa pessoaMaisNova = new Pessoa("temp", "masculino", 
                                            LocalDate.of(1900, 1, 1), 
                                            "morada");
        for (Pessoa pessoa : variasPessoas) {
            int ano1 = pessoa.getNascimento().getYear();
            int ano2 = pessoaMaisNova.getNascimento().getYear();
            int mes1 = pessoa.getNascimento().getMonthValue();
            int mes2 = pessoaMaisNova.getNascimento().getMonthValue();
            int dia1 = pessoa.getNascimento().getDayOfMonth();
            int dia2 = pessoaMaisNova.getNascimento().getDayOfMonth();
            if (ano1 > ano2) {
                pessoaMaisNova = pessoa;
            } else if (ano1 == ano2) {
                if (mes1 > mes2) {
                    pessoaMaisNova = pessoa;
                } else if (mes1 == mes2) {
                    if (dia1 > dia2) {
                        pessoaMaisNova = pessoa;
                    } else if (dia1 == dia2) {
                        System.out.println("Tem mais de uma ");
                        return;
                    }
                }
            }
        }
        System.out.println(pessoaMaisNova.getNome());
        
    }
    

}
