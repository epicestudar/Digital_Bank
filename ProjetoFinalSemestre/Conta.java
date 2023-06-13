import javax.swing.JOptionPane;

/**
 * Conta
 */
public class Conta extends Pessoa {
    public double saldo; //  akjskjak
    public int codigo = 0;
    public String contaTipo;
    public int senha;
    public double emprestimo = 0;

    public void criarConta() {
        int cont=0;
        JOptionPane.showMessageDialog(null, "Seja bem-vindo ao banco! Aqui, iremos criar a sua conta");
        setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade: ")));

        if (getIdade() >= 18) {
            int receber = Integer.parseInt(JOptionPane
                    .showInputDialog("Escolha o tipo de conta (1 - Conta Pessoa Física; 2 - Conta Pessoa Jurídica)"));

            switch (receber) {
                case 1: {
                    JOptionPane.showMessageDialog(null, "Criação de Conta: Pessoa Física");
                    setNome(JOptionPane.showInputDialog("Informe o nome da conta: "));
                    setSenha(Integer
                            .parseInt(JOptionPane.showInputDialog("Informe a senha da conta (Apenas 6 digitos): ")));
                   setCpf(JOptionPane.showInputDialog("Informe o seu CPF: "));
                    setContaTipo("Conta PF");
                    break;
                }
                case 2: {
                    JOptionPane.showMessageDialog(null, "Criação de Conta: Pessoa Jurídica");
                    setNome(JOptionPane.showInputDialog("Informe o nome da conta: "));
                    setSenha(Integer
                            .parseInt(JOptionPane.showInputDialog("Informe a senha da conta (Apenas 6 digitos): ")));
                    setCnpj(JOptionPane.showInputDialog("Informe o seu CNPJ: "));
                    setContaTipo("Conta PJ");
                    break;
                }
                default:
                    JOptionPane.showMessageDialog(null, "Selecione um desses valores!");
                    break;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Somente adultos maiores de 18 anos podem criar conta!");
        }
         
         }
    
         public void entrarConta() {
            JOptionPane.showMessageDialog(null, "Entrar na conta.");
            String nome = JOptionPane.showInputDialog(null, "Escreva o nome da conta: ");
            
            if(nome.equals(getNome())) {
                int receber = Integer.parseInt(JOptionPane.showInputDialog(null, "Escreva o que deseja fazer: " + "\n 1 - Verificar saldo" + "\n 2- Saque" + "\n 3 - Depósito" + "\n 4 - Empréstimo " + "\n 5 - Sair"));

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

         }

    //Método Incompleto
    public double saque(){ 
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

    public double emprestimo() {
        JOptionPane.showMessageDialog(null,"Método de Empréstimos");
        double emprestar = Integer.parseInt(JOptionPane.showInputDialog("Selecione a quantidade de valores que quer pro empréstimo (Limite: 80.000):"));
         if(emprestar > 1000 && emprestar < 80.000)
        {
            emprestimo += emprestar;
        }
        else{
            JOptionPane.showMessageDialog(null,"Valor inválido!");
        }
        return emprestimo;
    }
   

   // Método de Depósito
    public double deposito() {
        JOptionPane.showMessageDialog(null, "Método de Depósito");
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
