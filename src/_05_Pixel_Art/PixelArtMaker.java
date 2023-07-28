package _05_Pixel_Art;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import javax.swing.JButton;
import javax.swing.JFrame;

public class PixelArtMaker implements MouseListener{
    private JFrame window;
    private GridInputPanel gip;
    private GridPanel gp;
    ColorSelectionPanel csp;
    private JButton button;
    
    private static final String DATA_FILE = "src/_05_Pixel_Art/art";

    public void start() {
        gip = new GridInputPanel(this);	
        window = new JFrame("Pixel Art");
        window.setLayout(new FlowLayout());
        window.setResizable(false);
        button = new JButton("Save");
      
        
        window.add(gip);
        window.pack();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }

    public void submitGridData(int w, int h, int r, int c) {
        gp = new GridPanel(w, h, r, c);
        csp = new ColorSelectionPanel();
        
        window.remove(gip);
        window.add(button);
        window.add(gp);
        window.add(csp);
        gp.repaint();
        gp.addMouseListener(this);
        window.pack();
        button.addActionListener((a)->{
        	System.out.println("Saved");
        	save(new GridPanel(w,h,r,c));

        });
    }

    public static void main(String[] args) {
    	GridPanel grid = load();
    	System.out.println("starting");
        new PixelArtMaker().start();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        gp.setColor(csp.getSelectedColor());
        System.out.println(csp.getSelectedColor());
        gp.clickPixel(e.getX(), e.getY());
        gp.repaint();
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
    
  //additions v
    
    private static void save(GridPanel data) {
		try (FileOutputStream fos = new FileOutputStream(new File(DATA_FILE)); ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
    
    private static GridPanel load() {
		try (FileInputStream fis = new FileInputStream(new File(DATA_FILE)); ObjectInputStream ois = new ObjectInputStream(fis)) {
			return (GridPanel) ois.readObject();
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		} catch (ClassNotFoundException e) {
			// This can occur if the object we read from the file is not
			// an instance of any recognized class
			e.printStackTrace();
			return null;
		}
	}
    
    
    
}
