
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.Border;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author RHS_ICT
 */
public class calculator extends javax.swing.JFrame {

    /**
     * Creates new form calculator
     */
    public calculator() {
        initComponents();
        this.setResizable(false);
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
        btnFour = new javax.swing.JButton();
        btnFive = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnPlus = new javax.swing.JButton();
        btnMinus = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btnSeven = new javax.swing.JButton();
        btnSix = new javax.swing.JButton();
        btnTimes = new javax.swing.JButton();
        btnDivide = new javax.swing.JButton();
        btnThree = new javax.swing.JButton();
        btnTwo = new javax.swing.JButton();
        btnOne = new javax.swing.JButton();
        btnZero = new javax.swing.JButton();
        btnDot = new javax.swing.JButton();
        btnEnter = new javax.swing.JButton();
        textField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(17, 18, 19));

        jPanel1.setBackground(new java.awt.Color(17, 18, 19));
        jPanel1.setForeground(new java.awt.Color(17, 18, 19));
        jPanel1.setToolTipText("");

        btnFour.setBackground(new java.awt.Color(17, 18, 19));
        btnFour.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        btnFour.setForeground(new java.awt.Color(255, 255, 255));
        btnFour.setText("4");
        btnFour.setBorderPainted(false);
        btnFour.setOpaque(true);
        btnFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFourActionPerformed(evt);
            }
        });

        btnFive.setBackground(new java.awt.Color(17, 18, 19));
        btnFive.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        btnFive.setForeground(new java.awt.Color(255, 255, 255));
        btnFive.setText("5");
        btnFive.setBorderPainted(false);
        btnFive.setOpaque(true);
        btnFive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiveActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(187, 187, 187));
        btnClear.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnClear.setForeground(new java.awt.Color(17, 18, 19));
        btnClear.setText("CLEAR");
        btnClear.setBorderPainted(false);
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnPlus.setBackground(new java.awt.Color(59, 89, 152));
        btnPlus.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        btnPlus.setForeground(new java.awt.Color(255, 255, 255));
        btnPlus.setText("+");
        btnPlus.setBorderPainted(false);
        btnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusActionPerformed(evt);
            }
        });

        btnMinus.setBackground(new java.awt.Color(59, 89, 152));
        btnMinus.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        btnMinus.setForeground(new java.awt.Color(255, 255, 255));
        btnMinus.setText("-");
        btnMinus.setBorderPainted(false);
        btnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinusActionPerformed(evt);
            }
        });

        btn9.setBackground(new java.awt.Color(17, 18, 19));
        btn9.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        btn9.setForeground(new java.awt.Color(255, 255, 255));
        btn9.setText("9");
        btn9.setBorderPainted(false);
        btn9.setOpaque(true);
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn8.setBackground(new java.awt.Color(17, 18, 19));
        btn8.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        btn8.setForeground(new java.awt.Color(255, 255, 255));
        btn8.setText("8");
        btn8.setBorderPainted(false);
        btn8.setOpaque(true);
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btnSeven.setBackground(new java.awt.Color(17, 18, 19));
        btnSeven.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        btnSeven.setForeground(new java.awt.Color(255, 255, 255));
        btnSeven.setText("7");
        btnSeven.setBorderPainted(false);
        btnSeven.setOpaque(true);
        btnSeven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSevenActionPerformed(evt);
            }
        });

        btnSix.setBackground(new java.awt.Color(17, 18, 19));
        btnSix.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        btnSix.setForeground(new java.awt.Color(255, 255, 255));
        btnSix.setText("6");
        btnSix.setBorderPainted(false);
        btnSix.setOpaque(true);
        btnSix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSixActionPerformed(evt);
            }
        });

        btnTimes.setBackground(new java.awt.Color(59, 89, 152));
        btnTimes.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        btnTimes.setForeground(new java.awt.Color(255, 255, 255));
        btnTimes.setText("*");
        btnTimes.setBorderPainted(false);
        btnTimes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimesActionPerformed(evt);
            }
        });

        btnDivide.setBackground(new java.awt.Color(59, 89, 152));
        btnDivide.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        btnDivide.setForeground(new java.awt.Color(255, 255, 255));
        btnDivide.setText("/");
        btnDivide.setBorderPainted(false);
        btnDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivideActionPerformed(evt);
            }
        });

        btnThree.setBackground(new java.awt.Color(17, 18, 19));
        btnThree.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        btnThree.setForeground(new java.awt.Color(255, 255, 255));
        btnThree.setText("3");
        btnThree.setBorderPainted(false);
        btnThree.setOpaque(true);
        btnThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThreeActionPerformed(evt);
            }
        });

        btnTwo.setBackground(new java.awt.Color(17, 18, 19));
        btnTwo.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        btnTwo.setForeground(new java.awt.Color(255, 255, 255));
        btnTwo.setText("2");
        btnTwo.setBorderPainted(false);
        btnTwo.setOpaque(true);
        btnTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTwoActionPerformed(evt);
            }
        });

        btnOne.setBackground(new java.awt.Color(17, 18, 19));
        btnOne.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        btnOne.setForeground(new java.awt.Color(255, 255, 255));
        btnOne.setText("1");
        btnOne.setBorderPainted(false);
        btnOne.setOpaque(true);
        btnOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOneActionPerformed(evt);
            }
        });

        btnZero.setBackground(new java.awt.Color(17, 18, 19));
        btnZero.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        btnZero.setForeground(new java.awt.Color(255, 255, 255));
        btnZero.setText("0");
        btnZero.setBorderPainted(false);
        btnZero.setOpaque(true);
        btnZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZeroActionPerformed(evt);
            }
        });

        btnDot.setBackground(new java.awt.Color(17, 18, 19));
        btnDot.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        btnDot.setForeground(new java.awt.Color(255, 255, 255));
        btnDot.setText(".");
        btnDot.setBorderPainted(false);
        btnDot.setOpaque(true);
        btnDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDotActionPerformed(evt);
            }
        });

        btnEnter.setBackground(new java.awt.Color(59, 89, 152));
        btnEnter.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnEnter.setForeground(new java.awt.Color(255, 255, 255));
        btnEnter.setText("ENTER");
        btnEnter.setBorderPainted(false);
        btnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterActionPerformed(evt);
            }
        });

        textField.setEditable(false);
        textField.setBackground(new java.awt.Color(17, 18, 19));
        textField.setFont(new java.awt.Font("Arial", 0, 44)); // NOI18N
        textField.setForeground(new java.awt.Color(255, 255, 255));
        textField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textField.setAlignmentX(15.0F);
        textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(textField, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnOne, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnThree, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnFour, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFive, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSix, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTimes, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnZero, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDot, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textField, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFour, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimes, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFive, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSix, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOne, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThree, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnZero, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDot, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

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

    private int numbersCounter = 0;
    private double[] numbers = new double[100];
    private String numberRightNow = "";
    private int operationCounter = 0;
    private String[] operations = new String[99];
    private String operationRightNow = "";
    private boolean isUndefined = false;

    private void addNumbersToArray() {
        if (!numberRightNow.isBlank()) {
            numbers[numbersCounter] = Double.parseDouble(numberRightNow);
            numbersCounter++;
            numberRightNow = "";
            for (int i = 0; i < numbersCounter; i++) {
                System.out.println(numbers[i]);
            }
        }
    }

    private void addOperationToArray() {
        if (!operationRightNow.isBlank()) {
            operations[operationCounter] = operationRightNow;
            operationCounter++;
            operationRightNow = "";

            for (int i = 0; i < operationCounter; i++) {
                System.out.println(operations[i]);
            }
        }
    }

    private void clearAll() {
        textField.setText("");
        numbersCounter = 0;
        numberRightNow = "";
        operationCounter = 0;
        operationRightNow = "";
        isUndefined = false;
    }

    private void calculate() {
        double result = numbers[0];
        for (int i = 0; i < operationCounter; i++) {
            switch (operations[i]) {
                case "+":
                    result += numbers[i + 1];
                    break;
                case "-":
                    result -= numbers[i + 1];
                    break;
                case "*":
                    result *= numbers[i + 1];
                    break;
                case "/":
                    if (numbers[i + 1] != 0) {
                        result /= numbers[i + 1];
                    } else {
                        isUndefined = true;
                        textField.setText("UNDEFINED");
                        return;
                    }
                    break;
            }
        }

        if (result % 1 == 0) {
            textField.setText(String.valueOf((int) result));
        } else {
            textField.setText(String.valueOf(result));
        }
    }
    
    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        if (isUndefined)
            clearAll();
        textField.setText(textField.getText().concat("8"));
        numberRightNow += "8";
        addOperationToArray();
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        if (isUndefined)
            clearAll();
        textField.setText(textField.getText().concat("9"));
        numberRightNow += "9";
        addOperationToArray();
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnSixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSixActionPerformed
        if (isUndefined)
            clearAll();
        textField.setText(textField.getText().concat("6"));
        numberRightNow += "6";
        addOperationToArray();
    }//GEN-LAST:event_btnSixActionPerformed

    private void btnFiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiveActionPerformed
        if (isUndefined)
            clearAll();
        textField.setText(textField.getText().concat("5"));
        addOperationToArray();
        numberRightNow += "5";
    }//GEN-LAST:event_btnFiveActionPerformed

    private void btnTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTwoActionPerformed
        if (isUndefined)
            clearAll();
        textField.setText(textField.getText().concat("2"));
        numberRightNow += "2";
        addOperationToArray();
    }//GEN-LAST:event_btnTwoActionPerformed

    private void btnThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThreeActionPerformed
        if (isUndefined)
            clearAll();
        textField.setText(textField.getText().concat("3"));
        numberRightNow += "3";
        addOperationToArray();
    }//GEN-LAST:event_btnThreeActionPerformed

    private void btnDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDotActionPerformed
        if (!numberRightNow.contains(".")  && !isUndefined) {
            textField.setText(textField.getText().concat("."));
            numberRightNow += ".";
        }
    }//GEN-LAST:event_btnDotActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearAll();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterActionPerformed
        if (!textField.getText().isBlank()) {
            addNumbersToArray();
            calculate();
        }
    }//GEN-LAST:event_btnEnterActionPerformed

    private void btnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusActionPerformed
        if (!textField.getText().isBlank() && !isUndefined) {
            if (operationRightNow.isBlank()) {
                textField.setText(textField.getText().concat("+"));
                operationRightNow = "+";
                addNumbersToArray();
            }
        }
    }//GEN-LAST:event_btnPlusActionPerformed

    private void btnSevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSevenActionPerformed
        if (isUndefined)
            clearAll();
        textField.setText(textField.getText().concat("7"));
        numberRightNow += "7";
        addOperationToArray();
    }//GEN-LAST:event_btnSevenActionPerformed

    private void btnOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOneActionPerformed
        if (isUndefined)
            clearAll();
        textField.setText(textField.getText().concat("1"));
        numberRightNow += "1";
        addOperationToArray();
    }//GEN-LAST:event_btnOneActionPerformed

    private void btnFourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFourActionPerformed
        if (isUndefined)
            clearAll();
        textField.setText(textField.getText().concat("4"));
        numberRightNow += "4";
        addOperationToArray();
    }//GEN-LAST:event_btnFourActionPerformed

    private void btnZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZeroActionPerformed
        if (isUndefined)
            clearAll();
        textField.setText(textField.getText().concat("0"));
        numberRightNow += "0";
        addOperationToArray();
    }//GEN-LAST:event_btnZeroActionPerformed

    private void btnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinusActionPerformed
        if (!textField.getText().isBlank() && !isUndefined) {
            if (operationRightNow.isBlank()) {
                textField.setText(textField.getText().concat("-"));
                operationRightNow = "-";
                addNumbersToArray();
            }
        }
    }//GEN-LAST:event_btnMinusActionPerformed

    private void btnTimesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimesActionPerformed
        if (!textField.getText().isBlank() && !isUndefined) {
            if (operationRightNow.isBlank()) {
                textField.setText(textField.getText().concat("*"));
                operationRightNow = "*";
                addNumbersToArray();
            }
        }
    }//GEN-LAST:event_btnTimesActionPerformed

    private void btnDivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivideActionPerformed
        if (!textField.getText().isBlank() && !isUndefined) {
            if (operationRightNow.isBlank()) {
                textField.setText(textField.getText().concat("/"));
                operationRightNow = "/";
                addNumbersToArray();
            }
        }
    }//GEN-LAST:event_btnDivideActionPerformed

    private void textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDivide;
    private javax.swing.JButton btnDot;
    private javax.swing.JButton btnEnter;
    private javax.swing.JButton btnFive;
    private javax.swing.JButton btnFour;
    private javax.swing.JButton btnMinus;
    private javax.swing.JButton btnOne;
    private javax.swing.JButton btnPlus;
    private javax.swing.JButton btnSeven;
    private javax.swing.JButton btnSix;
    private javax.swing.JButton btnThree;
    private javax.swing.JButton btnTimes;
    private javax.swing.JButton btnTwo;
    private javax.swing.JButton btnZero;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField textField;
    // End of variables declaration//GEN-END:variables
}
