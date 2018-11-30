/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TelasInterface;

import TelasInterface.CadastroProduto;
import java.util.ArrayList;
import java.util.List;
import lojatestsdaisy.Cliente;
import lojatestsdaisy.Funcionario;
import lojatestsdaisy.Produto;

/**
 *
 * @author hazut
 */
public class PainelPrincipal extends javax.swing.JFrame {
    ArrayList<Produto> list_produto;
    ArrayList<Cliente> list_cliente;
    ArrayList<Funcionario> list_funcionario;
    
    public PainelPrincipal(ArrayList<Produto> list_produto,ArrayList<Cliente> list_cliente,ArrayList<Funcionario> list_funcionario) {
        initComponents();
        setLocationRelativeTo(null);
        list_produto= new ArrayList();
        list_cliente= new ArrayList();
        list_funcionario= new ArrayList();
        
        this.list_cliente=list_cliente;
        this.list_funcionario=list_funcionario;
        this.list_produto=list_produto;
    }
    
    
    
    public ArrayList<Produto> retornaLisP(){
        return this.list_produto;
    }
    public ArrayList<Cliente> retornaLisC(){
        return this.list_cliente;
    }         
    public ArrayList<Funcionario> retornaLisF(){
        return this.list_funcionario; 
    }
    
                
    public PainelPrincipal(List<Produto> listaprod, List<Cliente> listaclient, List<Funcionario> listafuncionari) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        cadastro_produto = new javax.swing.JMenu();
        op_cadastrar_produto = new javax.swing.JMenuItem();
        op_cadastrar_cliente = new javax.swing.JMenuItem();
        op_cadastrar_funcionario = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        op_visualizar_produto = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 647, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );

        cadastro_produto.setText("Cadastro");

        op_cadastrar_produto.setText("Produto");
        op_cadastrar_produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op_cadastrar_produtoActionPerformed(evt);
            }
        });
        cadastro_produto.add(op_cadastrar_produto);

        op_cadastrar_cliente.setText("Cliente");
        cadastro_produto.add(op_cadastrar_cliente);

        op_cadastrar_funcionario.setText("Funcionário");
        op_cadastrar_funcionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op_cadastrar_funcionarioActionPerformed(evt);
            }
        });
        cadastro_produto.add(op_cadastrar_funcionario);

        jMenuBar1.add(cadastro_produto);

        jMenu2.setText("Venda");
        jMenuBar1.add(jMenu2);

        jMenu1.setText("Visualizar");

        op_visualizar_produto.setText("Produto");
        op_visualizar_produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op_visualizar_produtoActionPerformed(evt);
            }
        });
        jMenu1.add(op_visualizar_produto);

        jMenuItem2.setText("Cliente");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Funcionario");
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void op_cadastrar_produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op_cadastrar_produtoActionPerformed

        new CadastroProduto(list_produto).setVisible(true);
        list_produto=retornaLisP();
    }//GEN-LAST:event_op_cadastrar_produtoActionPerformed

    private void op_cadastrar_funcionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op_cadastrar_funcionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_op_cadastrar_funcionarioActionPerformed

    private void op_visualizar_produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op_visualizar_produtoActionPerformed
        new VisualizarProduto(list_produto).setVisible(true);
        
    }//GEN-LAST:event_op_visualizar_produtoActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu cadastro_produto;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem op_cadastrar_cliente;
    private javax.swing.JMenuItem op_cadastrar_funcionario;
    private javax.swing.JMenuItem op_cadastrar_produto;
    private javax.swing.JMenuItem op_visualizar_produto;
    // End of variables declaration//GEN-END:variables
}
