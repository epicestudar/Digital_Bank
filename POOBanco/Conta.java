package POOBanco;

import javax.swing.JOptionPane;

/**
 * Conta
 */
public class Conta extends Pessoa {
    public double saldo;
    public int codigo = 0;
    public String contaTipo;
    public int senha;
    public double emprestimo = 0;

    // Método Criar conta.
    public void criarConta() {
        JOptionPane.showMessageDialog(null, "Criação de Contas (Somente pessoas maiores de 18 podem criar uma conta).");
        setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade: ")));

        if (getIdade() >= 18 && getIdade() <= 120) {
            int receber = Integer.parseInt(JOptionPane
                    .showInputDialog("Escolha o tipo de conta \n1 - Conta Pessoa Física; \n2 - Conta Pessoa Jurídica"));

            switch (receber) {
                case 1: {
                    JOptionPane.showMessageDialog(null, "Criação de Conta: Pessoa Física");
                    setNome(JOptionPane.showInputDialog("Informe o nome da conta:"));
                    setSenha(Integer
                            .parseInt(JOptionPane.showInputDialog("Informe a senha da conta (Apenas 6 digitos):")));
                    setCpf(JOptionPane.showInputDialog("Informe o seu CPF:"));
                    setContaTipo("Conta PF");
                    break;
                }
                case 2: {
                    JOptionPane.showMessageDialog(null, "Criação de Conta: Pessoa Jurídica");
                    setNome(JOptionPane.showInputDialog("Informe o nome da conta:"));
                    setSenha(Integer
                            .parseInt(JOptionPane.showInputDialog("Informe a senha da conta (Apenas 6 digitos):")));
                    setCnpj(JOptionPane.showInputDialog("Informe o seu CNPJ:"));
                    setContaTipo("Conta PJ");
                    break;
                }

                default:
                    JOptionPane.showMessageDialog(null, "Selecione um desses valores!");
                    break;
            }
        } else
            JOptionPane.showMessageDialog(null, "Idade inválida!");
    }

    // Método de Acessar conta:
    public void entrarConta() {
        JOptionPane.showMessageDialog(null, "Entrar na Conta.");
        String nome = JOptionPane.showInputDialog(null, "Escreva o nome da conta:");
        int senha = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a senha da conta:"));
        if (nome.equals(getNome()) && senha == getSenha()) {
            int receber = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "O que deseja fazer? \n1 - Saque; \n2 - Depósitar; \n3 - Empréstimo; \n4 - Sair da Conta."));
            switch (receber) {
                case 1: {
                    saque();
                    break;
                }
                case 2: {
                    deposito();
                    break;
                }
                case 3: {
                    emprestimo();
                    break;
                }
                default:
                    JOptionPane.showMessageDialog(null, "Você saiu da conta.");
                    break;
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Nome ou senha inválidos!");
        }
    }

    // Método Saque:
    public double saque() {
        JOptionPane.showMessageDialog(null, "Método de Saque");
        double saquear = Double.parseDouble(
                JOptionPane.showInputDialog("informe a quantidade de valores para saquear (Limite: 3000):"));
        if (saquear > 0 && saquear < 3000) {
            if (!(saldo < saquear)) {
                saldo = saldo - saquear;
            } else {
                JOptionPane.showInputDialog("não é possível fazer o saque (saldo insuficiente).");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não foi possível efetuar o saque (Valor fora do limite).");
        }
        return saldo;
    }

    // Método de Depósito
    public double deposito() {
        JOptionPane.showMessageDialog(null, "Método de Depósito");
        double deposito = Double.parseDouble(
                JOptionPane.showInputDialog("Informe o valor para depositar:"));
        saldo = saldo + deposito;
        return saldo;
    }

    // Método de empréstimo
    public double emprestimo() {
        JOptionPane.showMessageDialog(null, "Método de emprestimo");
        double emprestimo = Double.parseDouble(
                JOptionPane.showInputDialog("Informe o valor para o emprestimo:"));
        saldo = saldo + emprestimo;
        JOptionPane.showMessageDialog(null, "Dívida a pagar: " + emprestimo);
        return saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getContaTipo() {
        return contaTipo;
    }

    public void setContaTipo(String contaTipo) {
        this.contaTipo = contaTipo;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public double getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(double emprestimo) {
        this.emprestimo = emprestimo;
    }

}