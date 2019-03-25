package controller;

import java.io.*;
import javax.sound.sampled.*;
import javax.swing.*;

// To play sound using Clip, the process need to be alive.
// Hence, we use a Swing application.
public class SoundFrame extends JFrame
{
	private SoundPanel appPanel;

	// Constructor
	public SoundFrame()
	{
		super();
		this.appPanel = new SoundPanel();

		setupFrame();
	}

	public void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Take on Me");
		this.setSize(600, 600);
		this.setResizable(true);
		this.setVisible(true);
	}
}