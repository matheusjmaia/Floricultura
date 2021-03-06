/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pi2.views.ui.produto;

import br.com.pi2.exceptions.ProdutoException;
import br.com.pi2.model.jopos.Cliente;
import br.com.pi2.model.jopos.Produto;
import br.com.pi2.service.ServicoCliente;
import br.com.pi2.service.ServicoProduto;
import java.awt.Dimension;
import java.util.List;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author matheus.jmaia
 */
public class PesquisarProduto extends javax.swing.JInternalFrame {

    String ultimaPesq = null;
    EditarProduto TelaeditProduto = new EditarProduto();

    /**
     * Creates new form PesquisarCliente
     */
    public PesquisarProduto() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        fieldBusca = new javax.swing.JTextField();
        botaoBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaResult = new javax.swing.JTable();
        botaoFechar = new javax.swing.JButton();
        botaoAlterar = new javax.swing.JButton();
        botaoExcluir = new javax.swing.JButton();

        setTitle("Buscar Produto");

        jLabel1.setText("Digite o nome:");

        fieldBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldBuscaActionPerformed(evt);
            }
        });

        botaoBuscar.setText("Pesquisar");
        botaoBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoBuscarActionPerformed(evt);
            }
        });

        tabelaResult.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Desc.", "Valor UN", "Qtd. estoque"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaResult.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Clickduplo(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaResult);

        botaoFechar.setText("Fechar");
        botaoFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFecharActionPerformed(evt);
            }
        });

        botaoAlterar.setText("Alterar");
        botaoAlterar.setToolTipText("Edita o produto selecionado");
        botaoAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAlterarActionPerformed(evt);
            }
        });

        botaoExcluir.setText("Excluir");
        botaoExcluir.setToolTipText("Exclui o produto selecionado");
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoBuscar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botaoAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoFechar)
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(fieldBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoFechar)
                    .addComponent(botaoAlterar)
                    .addComponent(botaoExcluir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void botaoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoBuscarActionPerformed
        boolean resultSearch = false;
        ultimaPesq = fieldBusca.getText();
        try {
            resultSearch = refreshList();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(),
                    "Falha ao obter lista", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!resultSearch) {
            JOptionPane.showMessageDialog(rootPane, "A pesquisa não retornou resultados ",
                    "Sem resultados", JOptionPane.ERROR_MESSAGE);
        }
    }

    public boolean refreshList() throws ProdutoException, Exception {
        List<Produto> resultado = ServicoProduto.buscarProduto(ultimaPesq);
        DefaultTableModel model = (DefaultTableModel) tabelaResult.getModel();
        model.setRowCount(0);
        if (resultado == null || resultado.size() <= 0) {
            return false;
        }
        for (int i = 0; i < resultado.size(); i++) {
            Produto pro = resultado.get(i);
            if (pro != null) {
                Object[] row = new Object[5];
                row[0] = pro.getCodigoProduto();
                row[1] = pro.getDescricao();
                row[2] = pro.getValor();
                row[3] = pro.getTipo();
                row[4] = pro.getEstoque();
                model.addRow(row);
            }
        }
        return true;
    }//GEN-LAST:event_botaoBuscarActionPerformed

    private void fieldBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldBuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldBuscaActionPerformed

    private void botaoAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAlterarActionPerformed
        try {
            final int row = tabelaResult.getSelectedRow();
            if (row >= 0) {
                int cod = (Integer) tabelaResult.getValueAt(row, 0);
                Produto produto = ServicoProduto.obterProduto(cod);
                TelaeditProduto.dispose();
                TelaeditProduto = new EditarProduto();
                TelaeditProduto.setProduto(produto);
                TelaeditProduto.setTitle(produto.getDescricao());
                this.getParent().add(TelaeditProduto);
                this.openFrameInCenter(TelaeditProduto);
                TelaeditProduto.toFront();
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(rootPane, "Não é possível "
                    + "exibir os detalhes deste produto.",
                    "Erro ao abrir detalhe", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botaoAlterarActionPerformed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        if (tabelaResult.getSelectedRow() >= 0) {
            final int row = tabelaResult.getSelectedRow();
            String nome = (String) tabelaResult.getValueAt(row, 1);
            int resposta = JOptionPane.showConfirmDialog(rootPane,
                    "Excluir o produto \"" + nome + "\"?",
                    "Confirmar exclusão", JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.YES_OPTION) {
                try {
                    int cod = (int) tabelaResult.getValueAt(row, 0);
                    ServicoProduto.excluirProduto(cod);
                    this.refreshList();
                } catch (Exception e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(rootPane, e.getMessage(),
                            "Falha na Exclusão", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_botaoExcluirActionPerformed

    public void openFrameInCenter(JInternalFrame jif) {
        Dimension desktopSize = this.getParent().getSize();
        Dimension jInternalFrameSize = jif.getSize();
        int width = (desktopSize.width - jInternalFrameSize.width) / 2;
        int height = (desktopSize.height - jInternalFrameSize.height) / 2;
        jif.setLocation(width, height);
        jif.setVisible(true);
    }
    private void botaoFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_botaoFecharActionPerformed

    private void Clickduplo(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Clickduplo
        if (evt.getClickCount() == 2) {
            try {
                final int row = tabelaResult.getSelectedRow();
                int cod = (int) tabelaResult.getValueAt(row, 0);
                Produto produtoEdit = ServicoProduto.obterProduto(cod);
                TelaeditProduto.dispose();
                TelaeditProduto = new EditarProduto();
                TelaeditProduto.setProduto(produtoEdit);
                TelaeditProduto.setTitle(produtoEdit.getDescricao());
                this.getParent().add(TelaeditProduto);
                this.openFrameInCenter(TelaeditProduto);
                TelaeditProduto.toFront();
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(rootPane, "Não é possível "
                        + "exibir os detalhes deste produto.",
                        "Erro ao abrir detalhe", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    {
    }//GEN-LAST:event_Clickduplo


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAlterar;
    private javax.swing.JButton botaoBuscar;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton botaoFechar;
    private javax.swing.JTextField fieldBusca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaResult;
    // End of variables declaration//GEN-END:variables
}
