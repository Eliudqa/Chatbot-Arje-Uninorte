/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package chatbot;


import javax.swing.ImageIcon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import org.json.JSONException;
import org.json.JSONObject;
/**
 *
 * @author HOLA
 */
public class ChatbotFrame extends javax.swing.JFrame {

    String []imput;
    String []history;
    String []historial;
    String indice;
    public static String palabra="";
    boolean palabraset = false;//Booleano palabra establecida
    boolean praentrada = true; // Booleano primera entrada
    public static int cont=0;
    public String projectPath = System.getProperty("user.dir")+"\\";



    
    public ChatbotFrame() {
    setIconImage(new ImageIcon(getClass().getResource("/Images/logo.png")).getImage());
         imput = new String[1000];
         history = new String [1000];
         historial = new String [1000];
        initComponents();
        cargarHistorial();     




    

    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ARJE");
        setResizable(false);

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Flecha (1)_1.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jButton1KeyTyped(evt);
            }
        });

        jTextField1.setBackground(new java.awt.Color(153, 153, 153));
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("Ingrese su pregunta");
        jTextField1.setToolTipText("");
        jTextField1.setBorder(null);
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        jList1.setBackground(new java.awt.Color(51, 51, 51));
        jList1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51)));
        jList1.setForeground(new java.awt.Color(255, 255, 255));
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jList2.setBackground(new java.awt.Color(102, 102, 102));
        jList2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));
        jList2.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(jList2);

        jLabel1.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 24)); // NOI18N
        jLabel1.setText("ARJE");

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setText("Nueva Conversacion");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(153, 153, 153));
        jButton3.setText("Borrar historial");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(20, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(173, 173, 173)
                .addComponent(jButton3)
                .addGap(39, 39, 39)
                .addComponent(jButton2)
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2)
                        .addComponent(jButton3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

     }//GEN-LAST:event_jButton1ActionPerformed

   
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        String chat = jTextField1.getText();
        String chat1 = chat.replaceAll("[^a-zA-Z0-9\\s]", "");
        String[] words = chat1.split("\\s"); // Divide el texto en palabras

// Solo toma las primeras 3 palabras, sin importar cuántas se ingresen
if (!palabraset && words.length > 0) {
    for (int j = 0; j < words.length && j < 5; j++) {
        if (!palabra.isEmpty()) {
            palabra += " "; // Agregar un espacio entre las palabras
        }
        palabra += words[j]; // Agregar la palabra actual a 'palabra'
    }
    palabraset = true; // Marcar 'palabra' como establecida
}

for (int i = 0; i < imput.length; i++) {
    if (imput[i] == null && !chat1.isEmpty()) {
        if (palabraset && imput[0] == null) {
            // Mueve los mensajes existentes en history hacia abajo para crear espacio en la posición [0]
            for (int k = history.length - 1; k > 0; k--) {
                history[k] = history[k - 1]; // Desplaza cada mensaje una posición hacia abajo
            }

            history[0] = palabra; // Inserta el nuevo mensaje en la parte superior (posición 0)
            guardarHistorial();
            jList1.setListData(history); // Actualiza el JList del historial
        }

        imput[i] = "Usuario: " + chat; // Almacena el mensaje completo en imput
        jTextField1.setText(""); // Limpia el campo de texto
        break; // Sale del ciclo una vez que se actualiza el JList
    }
}

// Actualiza el JList con el nuevo contenido de 'imput'
jList2.setListData(imput);

      

    //Debe colocar el modelo correspondiente al que tiene instalado en su computadora local
    String modelName = "llama3.1";
    String promptText = chat;
try {
            // Configurar la URL y la conexión
            URL url = new URL("http://localhost:11434/api/generate");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json; utf-8");
            conn.setRequestProperty("Accept", "application/json");
            conn.setDoOutput(true);
            conn.setConnectTimeout(60000); // Tiempo de espera para conectar (1min)
            conn.setReadTimeout(60000); // Tiempo de espera para leer la respuesta(1min)
    

            // Crear el cuerpo de la solicitud JSON
            String jsonInputString = String.format(
        "{ \"model\": \"%s\", \"prompt\": \"%s\", \"stream\": false }",
        modelName, promptText);




            try (OutputStream os = conn.getOutputStream()) {
    byte[] input = jsonInputString.getBytes(StandardCharsets.UTF_8);
    os.write(input, 0, input.length);
}

// Obtiene el codigo de respuesta
int code = conn.getResponseCode();

// Lee el cuerpo de respuesta
BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream(), StandardCharsets.UTF_8));
StringBuilder response = new StringBuilder();
String line;
while ((line = in.readLine()) != null) {
    response.append(line);
}
in.close();

boolean esPrimeraLinea = true;

// Analiza la respuesta JSON e imprime el campo response"
JSONObject jsonResponse = new JSONObject(response.toString());
String responseText = jsonResponse.getString("response");
//Fragmenta la respuesta a 120 caracteres
String[] respuestaFragmentada = fragmentarTexto(responseText, 110);
if(code==HttpURLConnection.HTTP_OK){

// Asigna cada línea fragmentada al vector del JList
for (String linea : respuestaFragmentada) {
    // Encuentra la primera posición vacía en el vector 'imput'
    for (int i = 0; i < imput.length; i++) {
        if (imput[i] == null) {
            if (esPrimeraLinea) {
                imput[i] = "Ollama: " + linea;
                esPrimeraLinea = false; // Cambia el indicador para evitar que se agregue de nuevo
            } else {
                imput[i] = linea;
    }
            
            break;
}
    }
}

}

    jList2.setListData(imput);
    
    esPrimeraLinea = true;
    String file = projectPath+palabra;        

    try (BufferedWriter writer = new BufferedWriter(new FileWriter(file,true))) {
            if (chat!=null){
          writer.write("\nUsuario: " + chat+"\n");
            }
        for (String linea : respuestaFragmentada) {
    // Encuentra la primera posición vacía en el vector 'imput'
            if (esPrimeraLinea) {
                writer.write("Ollama: " + linea+"\n");
                esPrimeraLinea = false; // Cambia el indicador para evitar que se agregue de nuevo
            } else {
                writer.write(linea);
    }
            
}
    
        

    

    
} catch (IOException e) {
 String [] errore = new String [10];
          errore[1]= "Error: Mensaje vacio ";
          jList2.setListData(errore);    
          e.printStackTrace(); // Manejo de excepciones
}
        
    
    


// Cerrar la conexion
conn.disconnect();
} catch (SocketTimeoutException e) {
    String [] timeout = new String [10];
    timeout[1]  = "El tiempo de espera para la conexión fue superado.";
    jList2.setListData(timeout);

    
    // Agregar timeoutMessage a tu JList
        } catch (IOException e) {
          String [] error = new String [10];
          error[1]= "Error de conexion: " + e.getMessage();
          jList2.setListData(error);
        }
catch (JSONException e) {
    String [] errorin = new String [10];
          errorin[1]="Se produjo un error inesperado";
           jList2.setListData(errorin);

}
    
    
        
    }//GEN-LAST:event_jButton1MouseClicked

public void guardarHistorial() {
    try (FileWriter writer = new FileWriter("historial.txt")) {
        for (String message : history) {
            if (message != null) {
                writer.write(message + "\n");
            }
                    }
    } catch (IOException e) {
String [] errorin = new String [10];
          errorin[1]="Se produjo al guardar el Historial";
           jList2.setListData(errorin);    }
}

public void cargarHistorial() {
    try (BufferedReader reader = new BufferedReader(new FileReader("historial.txt"))) {
        String line;
        int index = 0;
        while ((line = reader.readLine()) != null && index < history.length) {
            history[index] = line;
            index++;
            System.out.println(line);
        }
        jList1.setListData(history); // Actualizar el JList con el historial cargado
        
    } catch (IOException e) {
        e.printStackTrace();
    }
}
   private String[] fragmentarTexto(String texto, int maxCaracteres) {
    // Calcula cuántas líneas se necesitan
    int numLineas = (int) Math.ceil((double) texto.length() / maxCaracteres);
    String[] lineas = new String[numLineas];
    
    for (int i = 0; i < numLineas; i++) {
        int inicio = i * maxCaracteres;
        int fin = Math.min(inicio + maxCaracteres, texto.length());
        lineas[i] = texto.substring(inicio, fin);
    }
    return lineas;
    
}
   private void borrarHistorial() 
           throws IOException{
           try (FileWriter writer = new FileWriter("historial.txt")) {
       try (BufferedReader reader = new BufferedReader(new FileReader("historial.txt"))) {
        String line;
        int index = 0;
        while ((line = reader.readLine()) != null && index < history.length) {
          writer.write("");
          history[index]="";
            index++;
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    }       
   }
   

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
                jTextField1.setText("");

    }//GEN-LAST:event_jTextField1MouseClicked

    private void jButton1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyTyped

    }//GEN-LAST:event_jButton1KeyTyped

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed

    }//GEN-LAST:event_jButton1KeyPressed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
    
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        String selected=jList1.getSelectedValue();
        String ruta = projectPath+selected;
        int contlin=0;          
       try (BufferedReader reader = new BufferedReader(new FileReader(ruta))) {
    while (reader.readLine() != null) {
        contlin++;
    }
} catch (IOException e) {
    e.printStackTrace();
    String[] errorin = new String[10];
    errorin[1] = "Error al leer el archivo para contar líneas";
    jList2.setListData(errorin);
}
       
// Inicializa el array "texto" con el tamaño contlin

    String []texto = new String[contlin];

if (contlin < 0) {
    String[] errorin = new String[10];
    errorin[1] = "El archivo está vacío";
    jList2.setListData(errorin);
    return; // Salir del método si el archivo está vacío
}
// Segundo bloque: Leer el contenido del archivo y almacenarlo en "texto"
try (BufferedReader reader2 = new BufferedReader(new FileReader(ruta))) {
    String linea;
    int i = 0;
    while ((linea = reader2.readLine()) != null && i < contlin) {
        texto[i] = linea;
        i++;
    }

    // Establecer el contenido del array "texto" en el JList
    jList2.setListData(texto);
} catch (IOException e) {
    e.printStackTrace();
    String[] errorin = new String[10];
    errorin[1] = "Error al leer el archivo";
    jList2.setListData(errorin);
}        

    }//GEN-LAST:event_jList1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
            jList2.setListData(new String[0]);
            palabraset = false;
            praentrada = true;
            imput = new String[1000];  //Reinicia el imput para una nueva conversacion
            historial = new String[1000];  // Reinicia el historial de la conversación actual (Documento totalmente nuevo)
            palabra="";
           
            

                   }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        try {
            borrarHistorial();
        } 
        catch (IOException ex) {
            String[] errorin = new String[10];
    errorin[1] = "Error al borrar el historial";
    jList2.setListData(errorin);
        }
        
      jList1.setListData(new String[0]); // Actualizar el JList a vacio
      jList2.setListData(new String[0]);


       
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(ChatbotFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChatbotFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChatbotFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChatbotFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChatbotFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
