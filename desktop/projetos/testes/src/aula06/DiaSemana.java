package aula06;
//aula dia 07/11
   public class DiaSemana {
       public static String obterDiaSemana(int numero) {
           switch (numero) {
               case 1: return Constantes.DOMINGO;
               case 2: return Constantes.SEGUNDA;
               case 3: return Constantes.TERCA;
               case 4: return Constantes.QUARTA;
               case 5: return Constantes.QUINTA;
               case 6: return Constantes.SEXTA;
               case 7: return Constantes.SABADO;             
               default: return "Dia inválido";
           }
       }
   }

