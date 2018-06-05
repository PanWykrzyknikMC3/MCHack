package mchack.client.gui;

import mchack.client.gui.component.Frame;
import mchack.client.theme.Theme;

public interface GuiManager {
	public void setup();

	public void addFrame(Frame frame);

	public void removeFrame(Frame frame);

	public Frame[] getFrames();

	public void bringForward(Frame frame);

	public Theme getTheme();

	public void setTheme(Theme theme);

	public void render();

	public void renderPinned();

	public void update();
}
