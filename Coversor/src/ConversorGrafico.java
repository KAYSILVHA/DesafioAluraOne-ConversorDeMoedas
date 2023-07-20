import javax.swing.*;

public class ConversorGrafico extends JFrame {
        private JMenuBar menuBar;
        private JMenu menu;
        private JMenuItem opcao1;
        private JMenuItem opcao2;
        private JMenuItem opcao3;
        private JMenuItem opcao4;
        private JMenuItem opcao5;
        private JMenuItem opcao6;
        private JMenuItem opcao7;
        private JMenuItem opcao8;
        private JMenuItem opcao9;
        private JMenuItem opcao10;
        private JMenuItem opcao11;

        public ConversorGrafico() {
            setSize(400, 300);
            setTitle("Coversor One =)");
            setDefaultCloseOperation(EXIT_ON_CLOSE);

            JPanel painel = new JPanel();

            exibirMenu();
            painel.add(menuBar);
            add(painel);
        }


        public void exibirMenu(){
            menuBar = new JMenuBar();
            menu = new JMenu("Escolha uma opção: ");
            opcao1 = new JMenuItem("Reais para Dólar");
            opcao2 = new JMenuItem("Reais para Euro");
            opcao3 = new JMenuItem("Reais para Libras Esterlina");
            opcao4 = new JMenuItem("Reais para Peso argentino");
            opcao5 = new JMenuItem("Reais para Peso Chileno");
            opcao6 = new JMenuItem("Dólar para Reais");
            opcao7 = new JMenuItem("Euro para Reais");
            opcao8 = new JMenuItem("Libras Esterlinas para Reais");
            opcao9 = new JMenuItem("Peso Argentino para Reais");
            opcao10 = new JMenuItem("Peso Chileno para Reais");
            opcao11 = new JMenuItem("Sair");

            menu.add(opcao1);
            menu.add(opcao2);
            menu.add(opcao3);
            menu.add(opcao4);
            menu.add(opcao5);
            menu.add(opcao6);
            menu.add(opcao7);
            menu.add(opcao8);
            menu.add(opcao9);
            menu.add(opcao10);
            menu.add(opcao11);

            menuBar.add(menu);
        }


    public static void main(String[] args) {
        ConversorGrafico janela = new ConversorGrafico();
        janela.setVisible(true);
    }

}

