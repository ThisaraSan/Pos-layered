/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pos.layered.view;

/**
 *
 * @author Dell
 */
public class LayoutView extends javax.swing.JFrame {

    /**
     * Creates new form CustomerView
     */
    public LayoutView() {
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

        headerPanel = new javax.swing.JPanel();
        headerLabel = new javax.swing.JLabel();
        saideNavPanel = new javax.swing.JPanel();
        manageCustomerButton = new javax.swing.JButton();
        manageItemButton = new javax.swing.JButton();
        orderButton = new javax.swing.JButton();
        bodyPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        headerPanel.setBackground(new java.awt.Color(0, 0, 255));

        headerLabel.setBackground(new java.awt.Color(0, 0, 102));
        headerLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        headerLabel.setForeground(new java.awt.Color(0, 0, 0));
        headerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerLabel.setText("Supermarket");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        saideNavPanel.setBackground(new java.awt.Color(153, 153, 255));

        manageCustomerButton.setBackground(new java.awt.Color(204, 204, 255));
        manageCustomerButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        manageCustomerButton.setText("Manage Customer");
        manageCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageCustomerButtonActionPerformed(evt);
            }
        });

        manageItemButton.setBackground(new java.awt.Color(204, 204, 255));
        manageItemButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        manageItemButton.setText("Manage Item");
        manageItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageItemButtonActionPerformed(evt);
            }
        });

        orderButton.setBackground(new java.awt.Color(204, 204, 255));
        orderButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        orderButton.setText("Order");
        orderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout saideNavPanelLayout = new javax.swing.GroupLayout(saideNavPanel);
        saideNavPanel.setLayout(saideNavPanelLayout);
        saideNavPanelLayout.setHorizontalGroup(
            saideNavPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(saideNavPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(saideNavPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(saideNavPanelLayout.createSequentialGroup()
                        .addGroup(saideNavPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(manageCustomerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(manageItemButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(orderButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        saideNavPanelLayout.setVerticalGroup(
            saideNavPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(saideNavPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(manageCustomerButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageItemButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(orderButton)
                .addContainerGap(360, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
        bodyPanel.setLayout(bodyPanelLayout);
        bodyPanelLayout.setHorizontalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(saideNavPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saideNavPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void manageCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageCustomerButtonActionPerformed
        loadCustomerPanel();
    }//GEN-LAST:event_manageCustomerButtonActionPerformed

    private void manageItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageItemButtonActionPerformed
        loadItemPanel();
    }//GEN-LAST:event_manageItemButtonActionPerformed

    private void orderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderButtonActionPerformed
        loadOrderPanel();
    }//GEN-LAST:event_orderButtonActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JButton manageCustomerButton;
    private javax.swing.JButton manageItemButton;
    private javax.swing.JButton orderButton;
    private javax.swing.JPanel saideNavPanel;
    // End of variables declaration//GEN-END:variables

    private void loadCustomerPanel() {
        CustomerPanel customerPanel = new CustomerPanel();
        bodyPanel.removeAll();
        customerPanel.setSize(bodyPanel.getWidth(), bodyPanel.getHeight());
        bodyPanel.add(customerPanel);
        bodyPanel.repaint();
        bodyPanel.validate();
    }

    private void loadItemPanel() {
        ItemPanel itemPanel = new ItemPanel();
        bodyPanel.removeAll();
        itemPanel.setSize(bodyPanel.getWidth(), bodyPanel.getHeight());
        bodyPanel.add(itemPanel);
        bodyPanel.repaint();
        bodyPanel.validate();
    }

    private void loadOrderPanel() {
        OrderPanel orderPanel = new OrderPanel();
        bodyPanel.removeAll();
        orderPanel.setSize(bodyPanel.getWidth(), bodyPanel.getHeight());
        bodyPanel.add(orderPanel);
        bodyPanel.repaint();
        bodyPanel.validate();        
    }
}
