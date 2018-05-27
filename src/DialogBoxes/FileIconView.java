package DialogBoxes;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileView;
import java.io.File;

public class FileIconView extends FileView {
    private FileNameExtensionFilter filter;
    private Icon icon;
    public  FileIconView(FileNameExtensionFilter aFilter, Icon anIcon){
        filter=aFilter;
        icon=anIcon;
    }
    public Icon getIcon(File F){
        if(!F.isDirectory() && filter.accept(F))return icon;
        else return null;
    }
}
