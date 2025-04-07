package Command_pattern;

public class ButtonCopy extends Command {

    public ButtonCopy(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        System.out.println("Copy: " + editor.getText());
        return true;
    }
}
