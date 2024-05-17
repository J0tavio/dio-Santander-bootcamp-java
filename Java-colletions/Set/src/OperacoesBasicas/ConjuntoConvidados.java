package OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
  private Set<Convidado> convidadoSet;

  public ConjuntoConvidados() {
    this.convidadoSet = new HashSet<>();
  }

  public void adicionarConvidado(String nome, int codigoConvite) {
    this.convidadoSet.add(new Convidado(nome, codigoConvite));
  }

  public void removerConvidadoPorCodigoConvite(int codigoConvite) {
    Convidado convidadoParaRemover = null;
    for (Convidado c : convidadoSet) {
      if (c.getCodigoConvite() == codigoConvite) {
        convidadoParaRemover = c;
        break;
      }
      convidadoSet.remove(convidadoParaRemover);
    }
  }

  public int contarConvidados() {
    return convidadoSet.size();
  }

  public void exibirConvidados() {
    System.out.println(convidadoSet);
  }

  public static void main(String[] args) {
    ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
    
    System.out.println("Quantidade de convidados: " + conjuntoConvidados.contarConvidados());
    conjuntoConvidados.adicionarConvidado("Joao", 1);
    conjuntoConvidados.adicionarConvidado("Pedro", 2);
    conjuntoConvidados.adicionarConvidado("Joao", 3);
    conjuntoConvidados.adicionarConvidado("Maria", 4);
    System.out.println("Quantidade de convidados: " + conjuntoConvidados.contarConvidados());

    conjuntoConvidados.exibirConvidados();
  }

}
