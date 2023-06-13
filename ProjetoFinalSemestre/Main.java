import javax.swing.JOptionPane;

/**
 * Main
 */
public class Main {

     public static void main(String[] args) {
        Conta[] Conta = new Conta[1];
        int banco, x, contaAtual = 0;
        do {
            JOptionPane.showMessageDialog(null, "Bem-vindo ao nosso banco!");
            banco = Integer
                    .parseInt(JOptionPane.showInputDialog("Escolha uma opção: \n1 - Criar conta. \n2 - Buscar conta."));
            switch (banco) {
                case 1: {
                    for (int i = 0; i < Conta.length; i++) {
                        Conta[i] = new Conta();
                        Conta[i].criarConta();
                        Conta[i].setCodigo(i+1);
                    }
                    break;
                }
                case 2: {
                    int cont = 0;
                    boolean achar = true;
                    JOptionPane.showMessageDialog(null, "Buscar Contas");
                    String buscarNome = JOptionPane.showInputDialog("Informe o nome da conta para ser buscado:");
                    int acessarConta = Integer.parseInt(JOptionPane.showInputDialog(
                            "O que deseja fazer? \n1 - Ver informações da conta \n2 - Acessar conta"));

                    switch (acessarConta) {
                        case 1: {
                            while (achar) {
                                if (buscarNome.equals(Conta[cont].getNome())) {
                                    contaAtual = cont;
                                    if (Conta[cont].getContaTipo().equals("Conta PF")) {
                                        JOptionPane.showMessageDialog(null,
                                                "Nome: " + Conta[cont].getNome() + "\nIdade: " + Conta[cont].getIdade()
                                                        + "\nCPF: " + Conta[cont].getCpf()
                                                        + "\nCódigo: " + Conta[cont].getCodigo() + "\nTipo da Conta: "
                                                        + Conta[cont].getContaTipo() + "\nSaldo: "
                                                        + Conta[cont].getSaldo());
                                    } else if (Conta[cont].getContaTipo().equals("Conta PJ")) {
                                        JOptionPane.showMessageDialog(null,
                                                "Nome: " + Conta[cont].getNome() + "\nIdade: " + Conta[cont].getIdade()
                                                        + "\nTipo da conta: " + Conta[cont].getCnpj()
                                                        + "\nCNPJ: " + Conta[cont].getCnpj()
                                                        + "\nCódigo: " + Conta[cont].getCodigo() + "\nTipo de Conta: "
                                                        + Conta[cont].getContaTipo() + "\nSaldo: "
                                                        + Conta[cont].getSaldo());

                                    }
                                    achar = false;
                                } else {
                                    cont++;
                                }
                            }
                            break;
                        }
                        case 2: {
                            Conta[contaAtual].entrarConta();
                            break;
                        }
                        default:
                        JOptionPane.showMessageDialog(null,"Selecionado uma das opções.");
                        break;
                    }
                    break;
                }

                default: {
                    JOptionPane.showMessageDialog(null, "Selecione uma dessas opções.");
                    break;
                }
            }
            x = Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar? \n0 - Sim; \n1 - Não."));
        } while (x == 0);
    }
}