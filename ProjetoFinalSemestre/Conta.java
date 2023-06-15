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

    public void criarConta() {
        int cont=0;
        JOptionPane.showMessageDialog(null, "Seja bem-vindo ao banco! Aqui, iremos criar a sua conta");
        setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade: ")));

        if (getIdade() >= 18) {
            int escolha = Integer.parseInt(JOptionPane
                    .showInputDialog("Escolha o tipo de conta que quer (1 - Pessoa Física; 2 - Pessoa Jurídica)"));

            switch (escolha) {
                case 1: {
                    JOptionPane.showMessageDialog(null, "Você escolheu a conta de tipo Pessoa Física!");
                    setNome(JOptionPane.showInputDialog("Informe o nome da conta: "));
                    setSenha(Integer
                            .parseInt(JOptionPane.showInputDialog("Informe a senha da conta: ")));
                   setCpf(JOptionPane.showInputDialog("Informe o seu CPF: "));
                    setContaTipo("Conta PF");
                    break;
                }
                case 2: {
                    JOptionPane.showMessageDialog(null, "Você escolheu a conta de tipo Pessoa Jurídica!");
                    setNome(JOptionPane.showInputDialog("Informe o nome da conta: "));
                    setSenha(Integer
                            .parseInt(JOptionPane.showInputDialog("Informe a senha da conta: ")));
                    setCnpj(JOptionPane.showInputDialog("Informe o seu CNPJ: "));
                    setContaTipo("Conta PJ");
                    break;
                }
                default:
                    JOptionPane.showMessageDialog(null, "Selecione um desses valores!");
                    break;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Somente pessoas com 18 anos ou mais podem criar a conta!");
        }
         
         }
    
         public void entrarConta() {
            JOptionPane.showMessageDialog(null, "Entrar na conta.");
            String nome = JOptionPane.showInputDialog(null, "Escreva o nome da conta que quer entrar: ");
            
            if(nome.equals(getNome())) {
                int escolha = Integer.parseInt(JOptionPane.showInputDialog(null, "Escreva o que deseja fazer: " + "\n 1 - Sacar" + "\n 2- Fazer depósito" + "\n 3 - Empréstimo do banco" + "\n 4 - Sair"));

                switch (escolha) {
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

         }

    public double saque(){ 
         JOptionPane.showMessageDialog(null, "Página de Saque");
        double saquear = Double.parseDouble(
                JOptionPane.showInputDialog("informe a quantidade de valores para saquear (Limite: 4973):"));
        if (saquear > 0 && saquear < 4973) {
            if (!(saldo < saquear)) {
                saldo = saldo - saquear;
                JOptionPane.showMessageDialog(null, "Saque feito");
            } else if{
                JOptionPane.showInputDialog("não é possível fazer o saque (saldo insuficiente).");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não foi possível efetuar o saque (Valor fora do limite).");
        }
        return saldo;
    }

    public double emprestimo() {
        JOptionPane.showMessageDialog(null,"Página de Empréstimos");
        double emprestar = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor que quer para o empréstimo: (Valor mínimo: 1500 e Limite: 110.500):"));
         if(emprestar > 1500 && emprestar < 110.500)
        {
             JOptionPane.showMessageDialog(null, "Empréstimo feito!");
            emprestimo += emprestar;
        }
        else{
            JOptionPane.showMessageDialog(null,"Valor inválido!");
        }
        return emprestimo;
    }
   

   // Método de Depósito
    public double deposito() {
        JOptionPane.showMessageDialog(null, "Página de Depósito");
        double deposito = Double.parseDouble(
                JOptionPane.showInputDialog("Informe o valor para depositar:"));
        saldo = saldo + deposito;
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
