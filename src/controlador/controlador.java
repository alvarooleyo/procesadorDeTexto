    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */
    package controlador;

import java.awt.Font;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;
    import java.awt.event.MouseEvent;
    import java.awt.event.MouseListener;
    import vista.vista;

    /**
     *
     * @author Usuario
     */
        public class controlador implements ActionListener, MouseListener{


            vista vista;

            public controlador (vista vista){
            this.vista=vista;
            this.vista.setLocationRelativeTo(null);

            System.out.println("Construyendo controlador");
            
            
            


        }   

        //declaramos los enum que utilizaremos en el switch case

        public enum AccionMVC{
            
            menuArial,
            menuTimes,
            menuVerdana,
            btnCursiva,
            btnNegrita,
            btnNormal

        }
    
    
    
    
        public void iniciar (){
            
            System.out.println("Iniciando");
            
            this.vista.setVisible(true);
            this.vista.setLocationRelativeTo(null);
            
            this.vista.menuArial.setActionCommand("menuArial");
            this.vista.menuArial.addActionListener(this);
            
            this.vista.menuTimes.setActionCommand("menuTimes");
            this.vista.menuTimes.addActionListener(this);
            
            this.vista.menuVerdana.setActionCommand("menuVerdana");
            this.vista.menuVerdana.addActionListener(this);
            
            this.vista.menuCursiva.setActionCommand("menuCursiva");
            this.vista.menuCursiva.addActionListener(this);
            
            this.vista.menuNegrita.setActionCommand("menuNegrita");
            this.vista.menuNegrita.addActionListener(this);
            
            this.vista.menuNormal.setActionCommand("menuNormal");
            this.vista.menuNormal.addActionListener(this);
        }
    


    @Override
    public void actionPerformed(ActionEvent e) {
        
                
              
        while(true){  
            
            String nombreFuente;
            String formato;
            int tamaño;
            
            
            
        switch ( AccionMVC.valueOf(e.getActionCommand()) ){
            
            case menuArial:
                    
                   nombreFuente = "Arial";
                   Font fuente = new Font(nombreFuente, 4 , tamaño);
                   this.vista.area.setFont(fuente);
                    
                    break;
            
            case menuTimes:
                
                nombreFuente = "TimesRoman";
                
                break;
               
            case menuVerdana:
                
                nombreFuente = "Verdana";
                
                break;
            
            case btnCursiva:
               
                
                
                break;
                
            case btnNegrita:
                
                
                
                break;
                
            case btnNormal:
                
                
                
                break;
                    
                    
        }
        }
        
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
}
