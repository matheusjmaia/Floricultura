/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pi2.principal;

import br.com.pi2.views.ui.cliente.CadastroCliente;
import br.com.pi2.views.ui.cliente.EditarCliente;
import br.com.pi2.views.ui.cliente.PesquisarCliente;
import br.com.pi2.views.ui.produto.CadastroProdutos;
import br.com.pi2.views.ui.produto.EditarProduto;
import br.com.pi2.views.ui.produto.PesquisarProduto;
import br.com.pi2.views.ui.venda.TelaRelatorio;
import br.com.pi2.views.ui.venda.TelaVendasUI;
import br.com.pi2.views.ui.venda.VizualizarVenda;
import java.awt.Dimension;
import javax.swing.JInternalFrame;

/**
 *
 * @author matheus.jmaia
 */
public class Principal2 extends javax.swing.JFrame {

    /**
     * Creates new form Principal2
     */
    
    private CadastroCliente cadastroCliente = null;
    private EditarCliente editarCliente = null;
    private PesquisarCliente pesquisarCliente = null;
    
    private CadastroProdutos cadastroProdutos = null;
    private EditarProduto editarProduto = null;
    private PesquisarProduto pesquisarProduto = null;
    
    private TelaVendasUI telasVendas = null;
    private TelaRelatorio telaRelatorio = null;
    private VizualizarVenda telaVizualizarVenda = null;
    
    
    public Principal2() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public CadastroCliente getCadastroCliente() {
        return cadastroCliente;
    }

    public void setCadastroCliente(CadastroCliente cadastroCliente) {
        this.cadastroCliente = cadastroCliente;
    }

    public EditarCliente getEditarCliente() {
        return editarCliente;
    }

    public void setEditarCliente(EditarCliente editarCliente) {
        this.editarCliente = editarCliente;
    }

    public PesquisarCliente getPesquisarCliente() {
        return pesquisarCliente;
    }

    public void setPesquisarCliente(PesquisarCliente pesquisarCliente) {
        this.pesquisarCliente = pesquisarCliente;
    }

    public CadastroProdutos getCadastroProdutos() {
        return cadastroProdutos;
    }

    public void setCadastroProdutos(CadastroProdutos cadastroProdutos) {
        this.cadastroProdutos = cadastroProdutos;
    }

    public EditarProduto getEditarProduto() {
        return editarProduto;
    }

    public void setEditarProduto(EditarProduto editarProduto) {
        this.editarProduto = editarProduto;
    }

    public PesquisarProduto getPesquisarProduto() {
        return pesquisarProduto;
    }

    public void setPesquisarProduto(PesquisarProduto pesquisarProduto) {
        this.pesquisarProduto = pesquisarProduto;
    }

    public TelaVendasUI getTelasVendas() {
        return telasVendas;
    }

    public void setTelasVendas(TelaVendasUI telasVendas) {
        this.telasVendas = telasVendas;
    }

    public TelaRelatorio getTelaRelatorio() {
        return telaRelatorio;
    }

    public void setTelaRelatorio(TelaRelatorio telaRelatorio) {
        this.telaRelatorio = telaRelatorio;
    }

    public VizualizarVenda getTelaVizualizarVenda() {
        return telaVizualizarVenda;
    }

    public void setTelaVizualizarVenda(VizualizarVenda telaVizualizarVenda) {
        this.telaVizualizarVenda = telaVizualizarVenda;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DesktopPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuClientes = new javax.swing.JMenu();
        menuCadastrarClientes = new javax.swing.JMenuItem();
        menuPesquisarClientes = new javax.swing.JMenuItem();
        menuProdutos = new javax.swing.JMenu();
        menuCadastrarProdutos = new javax.swing.JMenuItem();
        menuPesquisarProdutos = new javax.swing.JMenuItem();
        menuVendas = new javax.swing.JMenu();
        menuNovaVenda = new javax.swing.JMenuItem();
        menuRelatorio = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout DesktopPrincipalLayout = new javax.swing.GroupLayout(DesktopPrincipal);
        DesktopPrincipal.setLayout(DesktopPrincipalLayout);
        DesktopPrincipalLayout.setHorizontalGroup(
            DesktopPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1546, Short.MAX_VALUE)
        );
        DesktopPrincipalLayout.setVerticalGroup(
            DesktopPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 741, Short.MAX_VALUE)
        );

        menuClientes.setText("Clientes");

        menuCadastrarClientes.setText("Cadastrar clientes");
        menuCadastrarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarClientesActionPerformed(evt);
            }
        });
        menuClientes.add(menuCadastrarClientes);

        menuPesquisarClientes.setText("Pesquisar clientes");
        menuPesquisarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPesquisarClientesActionPerformed(evt);
            }
        });
        menuClientes.add(menuPesquisarClientes);

        jMenuBar1.add(menuClientes);

        menuProdutos.setText("Produtos");

        menuCadastrarProdutos.setText("Cadastrar produtos");
        menuCadastrarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarProdutosActionPerformed(evt);
            }
        });
        menuProdutos.add(menuCadastrarProdutos);

        menuPesquisarProdutos.setText("Pesquisar Produtos");
        menuPesquisarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPesquisarProdutosActionPerformed(evt);
            }
        });
        menuProdutos.add(menuPesquisarProdutos);

        jMenuBar1.add(menuProdutos);

        menuVendas.setText("Vendas");

        menuNovaVenda.setText("Nova venda");
        menuNovaVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNovaVendaActionPerformed(evt);
            }
        });
        menuVendas.add(menuNovaVenda);

        menuRelatorio.setText("Relatório de vendas");
        menuRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRelatorioActionPerformed(evt);
            }
        });
        menuVendas.add(menuRelatorio);

        jMenuBar1.add(menuVendas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DesktopPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DesktopPrincipal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 public void openFrameInCenter(JInternalFrame jif) {
        Dimension desktopSize = DesktopPrincipal.getSize();
        Dimension jInternalFrameSize = jif.getSize();
        int width = (desktopSize.width - jInternalFrameSize.width) / 2;
        int height = (desktopSize.height - jInternalFrameSize.height) / 2;
        jif.setLocation(width, height);
        jif.setVisible(true);
    }
    private void menuCadastrarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarClientesActionPerformed
        if(cadastroCliente == null || !cadastroCliente.isDisplayable()){
            cadastroCliente = new CadastroCliente();
            DesktopPrincipal.add(cadastroCliente);
            this.openFrameInCenter(cadastroCliente);
        }
        cadastroCliente.toFront();       
    }//GEN-LAST:event_menuCadastrarClientesActionPerformed

    private void menuPesquisarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPesquisarClientesActionPerformed
        if(pesquisarCliente == null || !pesquisarCliente.isDisplayable()){
            pesquisarCliente = new PesquisarCliente();
            DesktopPrincipal.add(pesquisarCliente);
            this.openFrameInCenter(pesquisarCliente);
        }
        pesquisarCliente.toFront();
    }//GEN-LAST:event_menuPesquisarClientesActionPerformed

    private void menuCadastrarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarProdutosActionPerformed
       if(cadastroProdutos == null || !cadastroProdutos.isDisplayable()){
           cadastroProdutos = new CadastroProdutos();
           DesktopPrincipal.add(cadastroProdutos);
           this.openFrameInCenter(cadastroProdutos);
       }
       cadastroProdutos.toFront();
    }//GEN-LAST:event_menuCadastrarProdutosActionPerformed

    private void menuPesquisarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPesquisarProdutosActionPerformed
        if(pesquisarProduto == null || !pesquisarProduto.isDisplayable()){
            pesquisarProduto = new PesquisarProduto();
            DesktopPrincipal.add(pesquisarProduto);
            this.openFrameInCenter(pesquisarProduto);
        }
        pesquisarProduto.toFront();
    }//GEN-LAST:event_menuPesquisarProdutosActionPerformed

    private void menuNovaVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNovaVendaActionPerformed
        if(telasVendas == null || !telasVendas.isDisplayable()){
            telasVendas = new TelaVendasUI();
            DesktopPrincipal.add(telasVendas);
            this.openFrameInCenter(telasVendas);
        }
        telasVendas.toFront();
    }//GEN-LAST:event_menuNovaVendaActionPerformed

    private void menuRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRelatorioActionPerformed
        if(telaRelatorio == null || !telaRelatorio.isDisplayable()){
            telaRelatorio = new TelaRelatorio();
            DesktopPrincipal.add(telaRelatorio);
            this.openFrameInCenter(telaRelatorio);
        }
        telaRelatorio.toFront();
                                               
    }//GEN-LAST:event_menuRelatorioActionPerformed

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
            java.util.logging.Logger.getLogger(Principal2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane DesktopPrincipal;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menuCadastrarClientes;
    private javax.swing.JMenuItem menuCadastrarProdutos;
    private javax.swing.JMenu menuClientes;
    private javax.swing.JMenuItem menuNovaVenda;
    private javax.swing.JMenuItem menuPesquisarClientes;
    private javax.swing.JMenuItem menuPesquisarProdutos;
    private javax.swing.JMenu menuProdutos;
    private javax.swing.JMenuItem menuRelatorio;
    private javax.swing.JMenu menuVendas;
    // End of variables declaration//GEN-END:variables
}
