package guiswing.fridayapr26.comprehensive;


public class App {
	public static void main(String[] args) throws Exception {
		Story story = new Story();
        TextAndMenuFrame txtFrame = new TextAndMenuFrame(story);
        txtFrame.setVisible(true);
    }
}
