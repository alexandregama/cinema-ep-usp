/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CadastrarSessao.java
 *
 * Created on 16/06/2011, 21:23:47
 */
package br.com.cinema.telas;

import br.com.cinema.demo.Filme;
import br.com.cinema.demo.Sala;
import br.com.cinema.enumaration.TipoHistorico;
import br.com.cinema.historico.HistoricoDeSessao;
import br.com.cinema.padroes.CinemaSingleton;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class CadastraSessao extends javax.swing.JFrame {

    private DefaultTableModel model = new DefaultTableModel();
    List<Sala> salas;
    List<Filme> filmes;
    
    public CadastraSessao() {
        initComponents();
        criaOsTitulosDasColunasDaTabela();  
        preencheSalas();
        preencheFilmes();
        jLabel3.setVisible(false);
    }

    private void criaOsTitulosDasColunasDaTabela() {
    	model.addColumn("Sala");
    	model.addColumn("Filme");
        model.addColumn("Sessões");
        jTable1.setModel(model);        
    }
    
    private void preencheFilmes() {
        filmes = CinemaSingleton.getInstancia().getCinema().getFilmes();
        
        for (Filme filme : filmes) {
            cbFilmes.addItem(filme.getNome());
        }
    }
    
    private void preencheSalas() {
        salas = CinemaSingleton.getInstancia().getCinema().getSalas();
        
        for (Sala sala : salas) {
            cbSalas.addItem(sala.getNumeroDaSala());
        }
    }    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbSalas = new javax.swing.JComboBox();
        cbFilmes = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Sala");

        jLabel2.setText("Filme");

        cbSalas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSalasActionPerformed(evt);
            }
        });

        cbFilmes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFilmesActionPerformed(evt);
            }
        });

        jButton1.setText("Programar sessão");
        jButton1.setName("btnProgramar"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Sala", "Filme", "Sessões"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.getColumnModel().getColumn(1).setResizable(false);

        jButton3.setText("Finalizar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Remover sessão");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel3.setText("Texto para a sala");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(373, 373, 373)
                        .addComponent(jButton2)
                        .addGap(14, 14, 14)
                        .addComponent(jButton3))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(cbSalas, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(cbFilmes, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(36, 36, 36)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbSalas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbFilmes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(5, 5, 5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(31, 31, 31)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton4))
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void cbSalasActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void cbFilmesActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        this.dispose();
    }                                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        Object object = cbSalas.getSelectedItem();
        int numeroDaSala = Integer.parseInt(object.toString());
        if(salaNaoPossuiSessao()) {   
            jLabel3.setVisible(false);
            String nomeDoFilme = (String)cbFilmes.getSelectedItem();
            Sala salaSelecionada = null;
            Filme filmeSelecionado = null;
            for (Sala sala : salas) {
                if(sala.getNumeroDaSala() == numeroDaSala) {
                    salaSelecionada = sala;
                }
            }        
            for (Filme filme : filmes) {
                if(filme.getNome().equals(nomeDoFilme)) {
                    filmeSelecionado = filme;
                }
            }        

            Map<Filme, Map<Sala, List>> sessoesCriadas = CinemaSingleton.getInstancia().getCinema().criaSessoes(salaSelecionada, filmeSelecionado);
            List<String> horarios = CinemaSingleton.getInstancia().getCinema().getSessao().getHorarios();
            System.out.println(horarios);
            model.addRow(new Object[]{numeroDaSala, nomeDoFilme, horarios}); 
            
            criaHistorico(sessoesCriadas, TipoHistorico.CADASTRO);
        }    
        else {
            jLabel3.setVisible(true);
            jLabel3.setText("A sala " + numeroDaSala + " já está exibindo um filme");
        }
    }                                        

    private void criaHistorico(Map<Filme, Map<Sala, List>> sessoes, TipoHistorico tipo) {
        HistoricoDeSessao historicoDeFilme = new HistoricoDeSessao(sessoes, tipo);
        try {
             historicoDeFilme.gravarHistorico();                 
        } catch (IOException ex) {
            Logger.getLogger(CadastraFilme.class.getName()).log(Level.SEVERE, null, ex);
        }                  
    }    
    
    private boolean salaNaoPossuiSessao() {
        Object object = cbSalas.getSelectedItem();
        int numeroDaSalaSelecionada = Integer.parseInt(object.toString());
        
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            Object objectSala = jTable1.getModel().getValueAt(i, 0);
            int numeroDaSala = Integer.parseInt(objectSala.toString());               
            if(numeroDaSalaSelecionada == numeroDaSala) {
                return false;
            }
        }
        
        return true;
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        this.dispose();
    }                                        

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        Object object = jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 0);
        int codigoDaSala = Integer.parseInt(object.toString());
        int codigoDoFilme = 0;
        String nomeDoFilme = (String) jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 1);
        List<Filme> todosOsFilmes = CinemaSingleton.getInstancia().getCinema().getFilmes();
        
        for (Filme filme : todosOsFilmes) {
            if(filme.getNome().equals(nomeDoFilme)) {
                codigoDoFilme = filme.getCodigo();
                break;
            }
        }        
        
        model.removeRow(jTable1.getSelectedRow());
        CinemaSingleton.getInstancia().getCinema().removerSessao(codigoDaSala, codigoDoFilme);
        
        List<String> horarios = CinemaSingleton.getInstancia().getCinema().getSessao().getHorarios();
        System.out.println(horarios);
    }                                        

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new CadastraSessao().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify                     
    private javax.swing.JComboBox cbFilmes;
    private javax.swing.JComboBox cbSalas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration                   
}
