package sudoku;
import java.awt.*;       
import java.awt.event.*;  
import javax.swing.*;    

public class Sudoku extends JFrame {
   public static final int GRID_SIZE = 9;    
   public static final int SUBGRID_SIZE = 3; 
   public static final int CELL_SIZE = 60;   
   public static final int CANVAS_WIDTH  = CELL_SIZE * GRID_SIZE;
   public static final int CANVAS_HEIGHT = CELL_SIZE * GRID_SIZE;
   public static final Color OPEN_CELL_BGCOLOR = Color.ORANGE;
   public static final Color OPEN_CELL_TEXT_YES = new Color(0, 255, 0);  
   public static final Color OPEN_CELL_TEXT_NO = Color.BLUE;
   public static final Color CLOSED_CELL_BGCOLOR = new Color(240, 240, 240); 
   public static final Color CLOSED_CELL_TEXT = Color.RED;
   public static final Font FONT_NUMBERS = new Font("Monospaced", Font.BOLD, 20);
   private JTextField[][] tfCells = new JTextField[GRID_SIZE][GRID_SIZE];
   private int[][] puzzle =
      {{4, 3, 5, 2, 6, 9, 7, 8, 1},
       {6, 8, 2, 5, 7, 1, 4, 9, 3},
       {1, 9, 7, 8, 3, 4, 5, 6, 2},
       {8, 2, 6, 1, 9, 5, 3, 4, 7},
       {3, 7, 4, 6, 8, 2, 9, 1, 5},
       {9, 5, 1, 7, 4, 3, 6, 2, 8},
       {5, 1, 9, 3, 2, 6, 8, 7, 4},
       {2, 4, 8, 9, 5, 7, 1, 3, 6},
       {7, 6, 3, 4, 1, 8, 2, 5, 9}};
  private int[][] masks =
      {{1, 1, 1, 1, 0, 1, 0, 1, 0},
       {0, 0, 1, 1, 0, 1, 0, 1, 0},
       {0, 0, 1, 1, 1, 0, 0, 1, 1},
       {0, 0, 1, 0, 1, 1, 1, 0, 1},
       {1, 1, 0, 0, 1, 0, 0, 1, 1},
       {1, 0, 1, 1, 1, 0, 1, 0, 0},
       {1, 1, 0, 0, 1, 1, 1, 0, 0},
       {1, 0, 1, 1, 0, 1, 1, 0, 0},
       {0, 1, 0, 1, 0, 0, 1, 1, 1}};
  public Sudoku() {
      Container cp = getContentPane();
      cp.setLayout(new GridLayout(GRID_SIZE, GRID_SIZE)); 
      InputListener listener = new InputListener(); 
      for (int row = 0; row < GRID_SIZE; ++row) {
         for (int col = 0; col < GRID_SIZE; ++col) {
            tfCells[row][col] = new JTextField(); 
            cp.add(tfCells[row][col]);           
            if (masks[row][col]==1) {
               tfCells[row][col].setText("");     
               tfCells[row][col].setEditable(true);
               tfCells[row][col].setBackground(OPEN_CELL_BGCOLOR);
               tfCells[row][col].addActionListener(listener);   
               } else {
               tfCells[row][col].setText(puzzle[row][col] + "");
               tfCells[row][col].setEditable(false);
               tfCells[row][col].setBackground(CLOSED_CELL_BGCOLOR);
               tfCells[row][col].setForeground(CLOSED_CELL_TEXT);
            }
            tfCells[row][col].setHorizontalAlignment(JTextField.CENTER);
            tfCells[row][col].setFont(FONT_NUMBERS);
         }
      }
      cp.setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));
      pack();
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
      setTitle("Sudoku");
      setVisible(true);
   }
   public static void main(String[] args) {
	   Sudoku s = new Sudoku(1);
   }
   private class InputListener implements ActionListener {
   @Override
	      public void actionPerformed(ActionEvent e) {
	    	   boolean b=true;
	         int rowSelected = -1;
	         int colSelected = -1;
	 
	         JTextField source = (JTextField)e.getSource();
	         boolean found = false;
	         for (int row = 0; row < GRID_SIZE && !found; ++row) {
	            for (int col = 0; col < GRID_SIZE && !found; ++col) {
	               if (tfCells[row][col] == source) {
	                  rowSelected = row;
	                  colSelected = col;
	                  found = true; 	               }
	            }
	         }
	         int ss;
	         String s;
	         s=tfCells[rowSelected][colSelected].getText();
	         ss=Integer.parseInt(s);
	         if(ss==puzzle[rowSelected][colSelected]){
	        	 tfCells[rowSelected][colSelected].setBackground(Color.GREEN);
	        	 masks[rowSelected][colSelected]=0;
	         }
	         else tfCells[rowSelected][colSelected].setBackground(Color.RED);
 	         for(int i=0;i<9;i++){
	        	 for(int j=0;j<9;j++){
	        		 if(masks[i][j]!=0)
	        			 b=false;
	        	 }
	        	}
	         if(b==true)
	         {
	        	 JOptionPane.showMessageDialog(null, "Congratulation!");

	         }
	      }
	   }
}