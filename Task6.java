// 6. Design and implement a Java program that simulates the undo feature of a text editor using a stack. 
//The program should support adding text to the editor and undoing changes. The stack should store strings, each representing a version of the text. Implement methods for:
// adding text to the editor: addText(String text)
// undoing changes : undo()
// -
// getting the current text: getCurrentText()

import java.util.Stack;

public class Task6{
    public static void main(String[] args) {
        TextEditorWithUndo editor = new TextEditorWithUndo();

        editor.addText("Hello, ");
        System.out.println("Current Text: " + editor.getCurrentText());

        editor.addText("world!");
        System.out.println("Current Text: " + editor.getCurrentText());

        editor.addText(" How are you?");
        System.out.println("Current Text: " + editor.getCurrentText());

        editor.undo();
        System.out.println("After Undo: " + editor.getCurrentText());

    }
}

class TextEditorWithUndo {
    private StringBuilder currentText;
    private Stack<StringBuilder> textStack;

    public TextEditorWithUndo() {
        currentText = new StringBuilder();
        textStack = new Stack<>();
        textStack.push(new StringBuilder()); // Initial empty text
    }

    // Method to add text to the editor
    public void addText(String text) {
        textStack.push(new StringBuilder(currentText)); // Save current text to stack
        currentText.append(text);
    }

    // Method to undo changes
    public void undo() {
        if (!textStack.isEmpty()) {
            textStack.pop(); // Remove the current version
            if (!textStack.isEmpty()) {
                currentText = new StringBuilder(textStack.peek()); // Restore previous version
            } else {
                currentText = new StringBuilder(); // If stack is empty, revert to empty text
            }
        }
    }

    // Method to get the current text
    public String getCurrentText() {
        return currentText.toString();
    }

    
}
