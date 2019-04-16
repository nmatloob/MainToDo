import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.TableColumn;

public class ToDo {

	protected Shell shlToDoList;
	private Table table;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			ToDo window = new ToDo();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlToDoList.open();
		shlToDoList.layout();
		while (!shlToDoList.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlToDoList = new Shell();
		shlToDoList.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		shlToDoList.setSize(714, 509);
		shlToDoList.setText("To Do List");
		shlToDoList.setLayout(null);
		
		Button btnNewButton = new Button(shlToDoList, SWT.NONE);
		btnNewButton.setBounds(344, 10, 46, 34);
		btnNewButton.setText("Edit");
		
		Button btnDelete = new Button(shlToDoList, SWT.NONE);
		btnDelete.setText("Delete");
		btnDelete.setBounds(396, 10, 64, 34);
		
		Button btnRestore = new Button(shlToDoList, SWT.NONE);
		btnRestore.setText("Restore");
		btnRestore.setBounds(466, 10, 81, 34);
		
		Button button_2 = new Button(shlToDoList, SWT.NONE);
		button_2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		button_2.setText("Edit");
		button_2.setBounds(585, 10, 46, 34);
		
		Button btnAdd = new Button(shlToDoList, SWT.NONE);
//		btnAdd.addSelectionListener(new SelectionAdapter() {
//			@Override
//			public void widgetSelected(SelectionEvent e) {
//				
//			}
//		});
		btnAdd.setText("Add");
		btnAdd.setBounds(292, 10, 46, 34);
		
		
		
		
		Button button_4 = new Button(shlToDoList, SWT.NONE);
		button_4.setText("Edit");
		button_4.setBounds(637, 10, 46, 34);
		
		table = new Table(shlToDoList, SWT.BORDER | SWT.FULL_SELECTION);
		table.setBounds(10, 54, 673, 438);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
		TableColumn tblclmnNewColumn_1 = new TableColumn(table, SWT.NONE);
		tblclmnNewColumn_1.setWidth(77);
		tblclmnNewColumn_1.setText("Status");
		
		TableColumn tblclmnNewColumn_3 = new TableColumn(table, SWT.NONE);
		tblclmnNewColumn_3.setWidth(73);
		tblclmnNewColumn_3.setText("Priority");
		
		TableColumn tblclmnNewColumn_4 = new TableColumn(table, SWT.NONE);
		tblclmnNewColumn_4.setWidth(341);
		tblclmnNewColumn_4.setText("Description");
		
		TableColumn tblclmnNewColumn_2 = new TableColumn(table, SWT.NONE);
		tblclmnNewColumn_2.setWidth(90);
		tblclmnNewColumn_2.setText("Due");
		
		TableColumn tblclmnNewColumn = new TableColumn(table, SWT.NONE);
		tblclmnNewColumn.setWidth(100);
		tblclmnNewColumn.setText("Start / End");
		
		TableItem tableItem = new TableItem(table, SWT.NONE);
		tableItem.setText(new String[]{"o","1","Do Laundry","4/20","-"});

	}
}
