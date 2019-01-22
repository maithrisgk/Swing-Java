import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.tree.*;
import java.util.*;

public class ObjectTree extends JFrame {

  JTree tree;
  String[][] sampleData = {
    {"Mobiles"}, {"Apple", "Nokia", "Samsung", "BlackBerry", "Sony Ericsson"},
    {"Color"}, {"Black", "white", "Red", "Blue"},
    {"Car"}, {"Honda", "BMW", "Audi", "Mercedenz Benz", "Jaquar"}, 
    {"OS"}, {"Android", "Windows 7", "MAC (IOS)", "Linux", "Ubuntu"}
  };

  public ObjectTree( ) {
    super("Hashtable Test");
    setSize(400, 300);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public void init( ) {
    Hashtable h = new Hashtable( );
    for (int i = 0; i < sampleData.length; i+=2) {
    h.put(sampleData[i][0], sampleData[i + 1]);
    }

    tree = new JTree(h);
    getContentPane( ).add(tree, BorderLayout.CENTER);
  }

  public static void main(String args[]) {
    ObjectTree tt = new ObjectTree( );
    tt.init( );
    tt.setVisible(true);
  }
}