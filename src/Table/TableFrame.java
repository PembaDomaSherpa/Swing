package Table;

import javax.swing.*;
import java.awt.*;

public class TableFrame extends JFrame {
    JProgressBar pb;
    JList list;
    public TableFrame(){
        super("Testing Table");
        setLayout(new BorderLayout());
        final String[] colHeads= {" Name", "Phone","Fax"};
        final Object[][] data= {
                {"Gail","4567","8766"},
                {"Gail","4567","8766"},
                {"Gail","4567","8766"},
                {"Gail","4567","8766"},
                {"Gail","4567","8766"},
                {"Gail","4567","8766"},
                {"Gail","4567","8766"},
                {"Gail","4567","8766"},
                {"Gail","4567","8766"},
                {"Gail","4567","8766"},
                {"Gail","4567","8766"},
                {"Gail","4567","8766"},
                {"Gail","4567","8766"}
        };
        JTable table= new JTable(data, colHeads);
        int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
        int h= ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
        JScrollPane scrollPane = new JScrollPane(table,v,h);
        add(scrollPane, BorderLayout.CENTER);
        pb=new JProgressBar();
        pb.setValue(30);
        add(pb, BorderLayout.EAST);
        String items[]={"Apple","Mango","Banana"};
        list= new JList(items);
        list.setBorder(BorderFactory.createLineBorder(Color.cyan));
        add(list,BorderLayout.WEST);

    }
}
