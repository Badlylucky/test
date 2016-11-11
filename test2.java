import java.awt.*;

public class test2
{
	public static void main(String args[])
	{
		Frame frame;
		frame = new Frame("Test");
		frame.setSize(240,240);
		frame.setVisible(true);

		Label label;
		label = new Label("Hello, world!");
		frame.add(label);
	}
}