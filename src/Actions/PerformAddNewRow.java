package Actions;
import Frames.AddNewRowDialog;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// this class responsible for redirecting to dialog window (adding new rows to db)

public class PerformAddNewRow implements ActionListener{
    String dbName;

    public PerformAddNewRow(String dbName){
        this.dbName = dbName;
    }

    public void actionPerformed(ActionEvent actionEvent) {
        AddNewRowDialog myDialog = new AddNewRowDialog(this.dbName);
    }
}
