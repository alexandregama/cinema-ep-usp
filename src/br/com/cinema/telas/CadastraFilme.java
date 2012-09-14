package br.com.cinema.telas;

import br.com.cinema.demo.Filme;
import br.com.cinema.enumaration.TipoHistorico;
import br.com.cinema.historico.HistoricoDeFilme;
import br.com.cinema.padroes.CinemaSingleton;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class CadastraFilme extends javax.swing.JFrame {

    private int codigo = 1;
    private DefaultTableModel model = new DefaultTableModel();
    
    public CadastraFilme() {
        initComponents();
        lblValidacao.setVisible(false);
        criaOsTitulosDasColunasDaTabela();        
    }

    private void criaOsTitulosDasColunasDaTabela() {
        model.addColumn("Código");
        model.addColumn("Nome");
        model.addColumn("Genero");
        model.addColumn("Duração");
        model.addColumn("Censura"); 
        jTable1.setModel(model);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        txtGenero = new javax.swing.JTextField();
        txtDuracao = new javax.swing.JTextField();
        txtCensura = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        lblValidacao = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Gênero", "Duração", "Censura"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Inserir Filme");
        jButton1.setName("btnInserir"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtNome.setName("txtNome"); // NOI18N

        txtGenero.setName("txtGenero"); // NOI18N

        txtDuracao.setName("txtDuracao"); // NOI18N

        txtCensura.setName("txtCensura"); // NOI18N

        jLabel1.setText("Nome");

        jLabel2.setText("Gênero");

        jLabel3.setText("Duração");

        jLabel4.setText("Censura");

        jButton2.setText("Finalizar");
        jButton2.setName("btnFinalizar"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Cancelar");
        jButton3.setName("btnCancelar"); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        lblValidacao.setForeground(new java.awt.Color(204, 0, 51));
        lblValidacao.setText("Todos os campos são obrigatórios para o cadastro de filmes");

        jButton4.setText("Remover");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1))
                                        .addGap(33, 33, 33)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(40, 40, 40)
                                                .addComponent(jButton1))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jButton3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton2)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(txtDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(lblValidacao))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtCensura, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(10, 10, 10))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCensura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)))
                .addGap(8, 8, 8)
                .addComponent(lblValidacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	if(cadastroValido()) {
            String nome = txtNome.getText();
            String genero = txtGenero.getText();
            int censura = Integer.parseInt(txtCensura.getText());
            int duracao = Integer.parseInt(txtDuracao.getText());

            Filme filme = new Filme();
            filme.setNome(nome);
            filme.setGenero(genero);
            filme.setCensura(censura);
            filme.setDuracaoEmMinutos(duracao);
                       
            CinemaSingleton.getInstancia().getCinema().cadastraFilmes(filme);
            codigo = CinemaSingleton.getInstancia().getCinema().getCodigoFilme();
            model.addRow(new Object[]{codigo, filme.getNome(), filme.getGenero(), filme.getDuracaoEmMinutos(), filme.getCensura()});
            jTable1.setModel(model);      
            
            criaHistorico(filme, TipoHistorico.CADASTRO);
        }      
    }                                        

    private void criaHistorico(Filme filme, TipoHistorico tipo) {
        HistoricoDeFilme historicoDeFilme = new HistoricoDeFilme(filme, tipo);
        try {
             historicoDeFilme.gravarHistorico();                 
        } catch (IOException ex) {
            Logger.getLogger(CadastraFilme.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private boolean cadastroValido() {
        if(txtNome.getText().isEmpty() || txtGenero.getText().isEmpty() || txtDuracao.getText().isEmpty() || txtCensura.getText().isEmpty()) {
            System.out.println("Campos inválidos");
            lblValidacao.setVisible(true);
            lblValidacao.setText("Todos os campos são obrigatórios para o cadastro de filmes");
            return false;            
        }
        else {
            String nomeDoNovoFilme = txtNome.getText();
            for (int i = 0; i < jTable1.getRowCount(); i++) {
                String nomeDoFilme = (String) jTable1.getModel().getValueAt(i, 1);               
                if(nomeDoNovoFilme.equals(nomeDoFilme)) {
                    lblValidacao.setVisible(true);
                    lblValidacao.setText("O filme - " + nomeDoNovoFilme + " - já está cadastrado.");
                    return false;
                }
            }
        }
        lblValidacao.setVisible(false);
        return true;
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        this.dispose();
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        this.dispose();
    }                                        

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        Object object = jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 0);
        int codigoDoFilme = Integer.parseInt(object.toString());
        Filme filme = CinemaSingleton.getInstancia().getCinema().getFilme(codigoDoFilme);
        model.removeRow(jTable1.getSelectedRow());        
        CinemaSingleton.getInstancia().getCinema().removerFilme(codigoDoFilme);
        
        criaHistorico(filme, TipoHistorico.REMOCAO);       
              
    }                                        

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new CadastraFilme().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblValidacao;
    private javax.swing.JTextField txtCensura;
    private javax.swing.JTextField txtDuracao;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtNome;
    // End of variables declaration                   
}
