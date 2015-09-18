/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetolab3gui.src;

import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.HeadlessException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static br.com.projetolab3gui.src.TelaCadastro.listaAnamnese;
import static br.com.projetolab3gui.src.TelaCadastro.listaCadastro;
import static br.com.projetolab3gui.src.TelaCadastro.listaPaciente;

/**
 *
 * @author Raul
 */
public class TelaHome extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public TelaHome() {
        initComponents();
        configurarFormulario();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlDeskTop = new br.com.projetolab3gui.utils.PreenchimentoFundo("/br/com/projetolab3gui/img/Fundo.jpg");
        menuBarra = new javax.swing.JMenuBar();
        menuOpcoes = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        menuExportar = new javax.swing.JMenuItem();
        menuImportar = new javax.swing.JMenuItem();
        menuAgenda = new javax.swing.JMenu();
        menuPacientes = new javax.swing.JMenu();
        menuiCadastro = new javax.swing.JMenuItem();
        menuiConsulta = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout pnlDeskTopLayout = new javax.swing.GroupLayout(pnlDeskTop);
        pnlDeskTop.setLayout(pnlDeskTopLayout);
        pnlDeskTopLayout.setHorizontalGroup(
            pnlDeskTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 705, Short.MAX_VALUE)
        );
        pnlDeskTopLayout.setVerticalGroup(
            pnlDeskTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 423, Short.MAX_VALUE)
        );

        menuOpcoes.setText("Opções");

        jMenu1.setText("Arquivos...");

        menuExportar.setText("Exportar Registros...");
        menuExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExportarActionPerformed(evt);
            }
        });
        jMenu1.add(menuExportar);

        menuImportar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.SHIFT_MASK));
        menuImportar.setText("Importar Registros");
        menuImportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuImportarActionPerformed(evt);
            }
        });
        jMenu1.add(menuImportar);

        menuOpcoes.add(jMenu1);

        menuBarra.add(menuOpcoes);

        menuAgenda.setText("Agenda");
        menuBarra.add(menuAgenda);

        menuPacientes.setText("Pacientes");

        menuiCadastro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        menuiCadastro.setText("Cadastro");
        menuiCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuiCadastroActionPerformed(evt);
            }
        });
        menuPacientes.add(menuiCadastro);

        menuiConsulta.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        menuiConsulta.setText("Consulta");
        menuiConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuiConsultaActionPerformed(evt);
            }
        });
        menuPacientes.add(menuiConsulta);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Testes");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuPacientes.add(jMenuItem1);

        menuBarra.add(menuPacientes);

        setJMenuBar(menuBarra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlDeskTop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlDeskTop)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuiCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuiCadastroActionPerformed
        abreCadastro();

    }//GEN-LAST:event_menuiCadastroActionPerformed

    private void menuiConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuiConsultaActionPerformed
        TelaConsultaPaciente pc = new TelaConsultaPaciente();
        pnlDeskTop.add(pc);
        pc.setVisible(true);
        pc.setPosicao();
    }//GEN-LAST:event_menuiConsultaActionPerformed

    private void menuExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExportarActionPerformed
        exportaTxt();
    }//GEN-LAST:event_menuExportarActionPerformed

    private void menuImportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuImportarActionPerformed
        JFileChooser jfc = new JFileChooser();
        jfc.setMultiSelectionEnabled(false);
        jfc.setDialogTitle("Pacientes");

        //Filtro
        FileNameExtensionFilter filtro
                = new FileNameExtensionFilter("Arquivo texto (*.txt)",
                        "txt");
        jfc.setFileFilter(filtro);
        jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);

        int res = jfc.showOpenDialog(this);
        if (res == JFileChooser.APPROVE_OPTION) {
            String arq = jfc.getSelectedFile().getAbsolutePath();
            importarArquivo(arq);
        }
    }//GEN-LAST:event_menuImportarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        for (int i = 0; i < listaAnamnese.size(); i++) {
            JOptionPane.showMessageDialog(null, listaAnamnese.get(i));
        }

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu menuAgenda;
    private javax.swing.JMenuBar menuBarra;
    private javax.swing.JMenuItem menuExportar;
    private javax.swing.JMenuItem menuImportar;
    private javax.swing.JMenu menuOpcoes;
    private javax.swing.JMenu menuPacientes;
    public javax.swing.JMenuItem menuiCadastro;
    private javax.swing.JMenuItem menuiConsulta;
    public static javax.swing.JDesktopPane pnlDeskTop;
    // End of variables declaration//GEN-END:variables
private void configurarFormulario() {
        //this.setTitle("Agendador de Tarefas");
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        //Fechar toda a Aplicação ao clicar no botão Fechar
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Abrir FullScreen e sem tampar a barra de ferramentas Windows
        setLocation(0, 0);
        Rectangle rect = GraphicsEnvironment.getLocalGraphicsEnvironment()
                .getMaximumWindowBounds();
        setSize((int) rect.getWidth(), (int) rect.getHeight());
        //Bloqueia a movimentação do JFRAME
        this.addComponentListener(new ComponentAdapter() {
            public void componentMoved(ComponentEvent e) {

                setEnabled(false);

                setEnabled(true);

            }
        });
//Configurar o fundo

    }

    private void exportaTxt() {

        if (listaCadastro.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não há pacientes a serem exportados!", "ERRO", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                try (FileWriter fw = new FileWriter("Gerado.txt"); BufferedWriter bw = new BufferedWriter(fw)) {

                    for (int i = 0; i < listaPaciente.size(); i++) {

                        if (listaPaciente.get(i).idPaciente == listaAnamnese.get(i).getIdAnamnese()) {

                            gravaPacientes(bw, i);
                            gravaAnamneses(bw, i);
                            bw.newLine();

                        }
                    }
                    bw.close();
                    fw.close();
                }

                JOptionPane.showMessageDialog(null,
                        "A exportação foi realizada com sucesso!",
                        "Exportação",
                        JOptionPane.INFORMATION_MESSAGE);

            } catch (IOException | HeadlessException e) {
                JOptionPane.showMessageDialog(null,
                        "Erro na exportação do arquivo.\n" + e,
                        "Exportação",
                        JOptionPane.ERROR_MESSAGE);
            }

        }
    }

    private void importarArquivo(String arq) {
        try {
            FileReader fr = new FileReader(arq);
            BufferedReader br = new BufferedReader(fr);

            String linha = "";
            while ((linha = br.readLine()) != null) {
                //Separar colunas
                String cols[] = linha.split(";");

                ClassePaciente p = new ClassePaciente();
                ClasseCadastro c = new ClasseCadastro();
                ClasseAnamnese a = new ClasseAnamnese();
                //Inserindo
                //--Cadastro
                c.setId(Integer.parseInt(cols[0]));
                c.setNomeCompleto(cols[1]);
                c.setCpf(cols[13]);

                //--Paciente
                p.setIdPaciente(Integer.parseInt(cols[0]));
                p.setNomeCompleto(cols[1]);
                p.setDataCadastro(cols[2]);
                p.setDiaNasc(cols[3]);
                p.setMesNasc(cols[4]);
                p.setAnoNasc(cols[5]);
                p.setDataNascimento(cols[6]);
                p.setIdade(cols[7]);
                p.setNomePai(cols[8]);
                p.setNomeMae(cols[9]);
                p.setSexo(cols[10]);
                p.setEstadoCivil(cols[11]);
                p.setRg(cols[12]);
                p.setCpf(cols[13]);
                p.setProfissao(cols[14]);
                p.setEmpresa(cols[15]);
                p.setEndereco(cols[16]);
                p.setNumeroCasa(Integer.parseInt(cols[17]));
                p.setCep(cols[18]);
                p.setComplemento(cols[19]);
                p.setBairro(cols[20]);
                p.setCidade(cols[21]);
                p.setEstado(cols[22]);
                p.setTelCelular(cols[23]);
                p.setTelResidencial(cols[24]);
                p.setTelRecado(cols[25]);
                p.setComentario(cols[26]);

                //--Anamnese
                a.setIdAnamnese(Integer.parseInt(cols[27]));
                a.setQueixaPrincipal(cols[28]);
                a.setD1Reumatica(Integer.parseInt(cols[29]));
                a.setD2Renal(Integer.parseInt(cols[30]));
                a.setD3Cardiaco(Integer.parseInt(cols[31]));
                a.setD4Hipertensao(Integer.parseInt(cols[32]));
                a.setD5Respiratorio(Integer.parseInt(cols[33]));
                a.setD6Reumatismo(Integer.parseInt(cols[34]));
                a.setD7Gastrico(Integer.parseInt(cols[35]));
                a.setD8Diabete(Integer.parseInt(cols[36]));
                a.setD9Alergico(Integer.parseInt(cols[37]));
                a.setHabito(cols[38]);
                a.setP1SofreDoenca(Integer.parseInt(cols[39]));
                a.setP1SofreDoencaTxt(cols[40]);
                a.setP2TratamentoAtualmente(Integer.parseInt(cols[41]));
                a.setP2TratamentoAtualmenteTxt(cols[42]);
                a.setP3UsaMedicacao(Integer.parseInt(cols[43]));
                a.setP3UsaMedicacaoTxt(cols[44]);
                a.setP4NomeMedicoTxt(cols[45]);
                a.setP5Gravidez(Integer.parseInt(cols[46]));
                a.setP6Alergia(Integer.parseInt(cols[47]));
                a.setP6AlergiaTxt(cols[48]);
                a.setP7Operado(Integer.parseInt(cols[49]));
                a.setP7OperadoTxt(cols[50]);
                a.setP8Cicatrizacao(Integer.parseInt(cols[51]));
                a.setP9Anestesia(Integer.parseInt(cols[52]));
                a.setP10Hemorragia(Integer.parseInt(cols[53]));
                a.setAntecedentesFamiliares(cols[54]);
                a.setOutrasObs(cols[55]);

                //Add nas listas
                listaPaciente.add(p);
                listaCadastro.add(c);
                listaAnamnese.add(a);

            }

            JOptionPane.showMessageDialog(null,
                    "A importação foi realizada com sucesso!",
                    "Controle de Produtos",
                    JOptionPane.INFORMATION_MESSAGE);

        } catch (IOException | NumberFormatException | HeadlessException e) {
            JOptionPane.showMessageDialog(null,
                    "Erro na importação do arquivo.\n" + e,
                    "Controle de Produtos",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public void abreCadastro() {

        TelaCadastro ci = new TelaCadastro();
        pnlDeskTop.add(ci);
        ci.setVisible(true);
        ci.setPosicao();
    }

    private void gravaAnamneses(BufferedWriter bw, int id) {

        try {
            bw.write(Integer.toString(listaAnamnese.get(id).getIdAnamnese()));

            bw.write(";");
            bw.write(listaAnamnese.get(id).getQueixaPrincipal());
            bw.write(";");
            bw.write(Integer.toString(listaAnamnese.get(id).getD1Reumatica()));
            bw.write(";");
            bw.write(Integer.toString(listaAnamnese.get(id).getD2Renal()));
            bw.write(";");
            bw.write(Integer.toString(listaAnamnese.get(id).getD3Cardiaco()));
            bw.write(";");
            bw.write(Integer.toString(listaAnamnese.get(id).getD4Hipertensao()));
            bw.write(";");
            bw.write(Integer.toString(listaAnamnese.get(id).getD5Respiratorio()));
            bw.write(";");
            bw.write(Integer.toString(listaAnamnese.get(id).getD6Reumatismo()));
            bw.write(";");
            bw.write(Integer.toString(listaAnamnese.get(id).getD7Gastrico()));
            bw.write(";");
            bw.write(Integer.toString(listaAnamnese.get(id).getD8Diabete()));
            bw.write(";");
            bw.write(Integer.toString(listaAnamnese.get(id).getD9Alergico()));
            bw.write(";");
            bw.write(listaAnamnese.get(id).getHabito());
            bw.write(";");
            bw.write(Integer.toString(listaAnamnese.get(id).getP1SofreDoenca()));
            bw.write(";");
            bw.write(listaAnamnese.get(id).getP1SofreDoencaTxt());
            bw.write(";");
            bw.write(Integer.toString(listaAnamnese.get(id).getP2TratamentoAtualmente()));
            bw.write(";");
            bw.write(listaAnamnese.get(id).getP2TratamentoAtualmenteTxt());
            bw.write(";");
            bw.write(Integer.toString(listaAnamnese.get(id).getP3UsaMedicacao()));
            bw.write(";");
            bw.write(listaAnamnese.get(id).getP3UsaMedicacaoTxt());
            bw.write(";");
            bw.write(listaAnamnese.get(id).getP4NomeMedicoTxt());
            bw.write(";");
            bw.write(Integer.toString(listaAnamnese.get(id).getP5Gravidez()));
            bw.write(";");
            bw.write(Integer.toString(listaAnamnese.get(id).getP6Alergia()));
            bw.write(";");
            bw.write(listaAnamnese.get(id).getP6AlergiaTxt());
            bw.write(";");
            bw.write(Integer.toString(listaAnamnese.get(id).getP7Operado()));
            bw.write(";");
            bw.write(listaAnamnese.get(id).getP7OperadoTxt());
            bw.write(";");
            bw.write(Integer.toString(listaAnamnese.get(id).getP8Cicatrizacao()));
            bw.write(";");
            bw.write(Integer.toString(listaAnamnese.get(id).getP9Anestesia()));
            bw.write(";");
            bw.write(Integer.toString(listaAnamnese.get(id).getP10Hemorragia()));
            bw.write(";");
            if (listaAnamnese.get(id).getAntecedentesFamiliares() == null) {
                bw.write("");
            } else {
                bw.write(listaAnamnese.get(id).getAntecedentesFamiliares());
            }
            bw.write(";");
            if (listaAnamnese.get(id).getOutrasObs() == null) {
                bw.write("");
            } else {
                bw.write(listaAnamnese.get(id).getOutrasObs());
            }
            bw.write(";");

        } catch (IOException ex) {
            Logger.getLogger(TelaHome.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Falha ao exportar os pacientes.\n" + ex, "Exportação", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void gravaPacientes(BufferedWriter bw, int id) {

        try {
            bw.write(Integer.toString(listaPaciente.get(id).getIdPaciente()));
            bw.write(";");
            bw.write(listaPaciente.get(id).getNomeCompleto().toUpperCase());
            bw.write(";");
            bw.write(listaPaciente.get(id).getDataCadastro().toUpperCase());
            bw.write(";");
            bw.write(listaPaciente.get(id).getDiaNasc());
            bw.write(";");
            bw.write(listaPaciente.get(id).getMesNasc());
            bw.write(";");
            bw.write(listaPaciente.get(id).getAnoNasc().toUpperCase());
            bw.write(";");
            bw.write(listaPaciente.get(id).getDataNascimento().toUpperCase());
            bw.write(";");
            bw.write(listaPaciente.get(id).getIdade().toUpperCase());
            bw.write(";");
            bw.write(listaPaciente.get(id).getNomePai().toUpperCase());
            bw.write(";");
            bw.write(listaPaciente.get(id).getNomeMae().toUpperCase());
            bw.write(";");
            bw.write(listaPaciente.get(id).getSexo().toUpperCase());
            bw.write(";");
            bw.write(listaPaciente.get(id).getEstadoCivil().toUpperCase());
            bw.write(";");
            bw.write(listaPaciente.get(id).getRg().toUpperCase());
            bw.write(";");
            bw.write(listaPaciente.get(id).getCpf().toUpperCase());
            bw.write(";");
            bw.write(listaPaciente.get(id).getProfissao().toUpperCase());
            bw.write(";");
            bw.write(listaPaciente.get(id).getEmpresa().toUpperCase());
            bw.write(";");
            bw.write(listaPaciente.get(id).getEndereco().toUpperCase());
            bw.write(";");
            bw.write(Integer.toString(listaPaciente.get(id).getNumeroCasa()));
            bw.write(";");
            bw.write(listaPaciente.get(id).getCep());
            bw.write(";");
            bw.write(listaPaciente.get(id).getComplemento().toUpperCase());
            bw.write(";");
            bw.write(listaPaciente.get(id).getBairro().toUpperCase());
            bw.write(";");
            bw.write(listaPaciente.get(id).getCidade().toUpperCase());
            bw.write(";");
            bw.write(listaPaciente.get(id).getEstado().toUpperCase());
            bw.write(";");
            if (listaPaciente.get(id).getTelCelular() == null) {
                bw.write("");
            } else {
                bw.write(listaPaciente.get(id).getTelCelular());
            }
            bw.write(";");
            if (listaPaciente.get(id).getTelResidencial() == null) {
                bw.write("");
            } else {
                bw.write(listaPaciente.get(id).getTelResidencial());
            }
            bw.write(";");
            if (listaPaciente.get(id).getTelRecado() == null) {
                bw.write("");
            } else {
                bw.write(listaPaciente.get(id).getTelRecado());
            }
            bw.write(";");
            bw.write(listaPaciente.get(id).getComentario().toUpperCase());
            bw.write(";");

        } catch (IOException ex) {
            Logger.getLogger(TelaHome.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Falha ao exportar os pacientes.\n" + ex, "Exportação", JOptionPane.ERROR_MESSAGE);
        }

    }

}