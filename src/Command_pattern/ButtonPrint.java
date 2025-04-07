package Command_pattern;

public class ButtonPrint extends Command {
    public ButtonPrint(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        System.out.println("Print: " + editor.getText());
        return true;
    }
}
