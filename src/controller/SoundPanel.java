package controller;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class SoundPanel extends JPanel
{
	private SpringLayout appLayout;
	private JButton take;
	private JButton alex;
	private JButton show;
	
	public SoundPanel()
	{
		super();
		
		appLayout = new SpringLayout();
		take = new JButton("Take on Me");
		
		alex = new JButton("Alex");
		appLayout.putConstraint(SpringLayout.NORTH, alex, 10, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, alex, 22, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, alex, 0, SpringLayout.SOUTH, take);
		appLayout.putConstraint(SpringLayout.EAST, alex, 66, SpringLayout.WEST, this);
		show = new JButton("Show Me your Moves");
		appLayout.putConstraint(SpringLayout.SOUTH, show, 210, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, show, 10, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.EAST, show, -10, SpringLayout.EAST, this);
		
		setupPanel();
		setupLayout();
		setupListeners();
	}

	private void setupPanel()
	{
		this.setLayout(appLayout);
		this.add(take);
		this.add(alex);
		this.add(show);
	}
	
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.NORTH, take, 82, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, take, 126, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, take, 238, SpringLayout.NORTH, this);
	}
	
	private void setupListeners()
	{

		take.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent mouseClick)
			{
				playTake();
			}
		});
		
		alex.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent mouseClick)
			{
				playAlex();
			}
		});
		
		show.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent mouseClick)
			{
				playMoves();
			}
		});
	}
	
	public void playTake()
	{
		try
		{
			// Open an audio input stream.
			File soundFile = new File("/Users/Ry/Documents/Java/SoundProject/take.wav");
			AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
			// Get a sound clip resource.
			Clip clip = AudioSystem.getClip();
			// Open audio clip and load samples from the audio input stream.
			clip.open(audioIn);
			clip.start();
		} 
		catch (UnsupportedAudioFileException e)
		{
			e.printStackTrace();
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		} 
		catch (LineUnavailableException e)
		{
			e.printStackTrace();
		}
	}
	
	public void playAlex()
	{
		try
		{
			// Open an audio input stream.
			File soundFile = new File("/Users/Ry/Documents/Java/SoundProject/Alex.wav");
			AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
			// Get a sound clip resource.
			Clip clip = AudioSystem.getClip();
			// Open audio clip and load samples from the audio input stream.
			clip.open(audioIn);
			clip.start();
		} 
		catch (UnsupportedAudioFileException e)
		{
			e.printStackTrace();
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		} 
		catch (LineUnavailableException e)
		{
			e.printStackTrace();
		}
	}
	
	public void playMoves()
	{
		try
		{
			// Open an audio input stream.
			File soundFile = new File("/Users/Ry/Documents/Java/SoundProject/moves.wav");
			AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
			// Get a sound clip resource.
			Clip clip = AudioSystem.getClip();
			// Open audio clip and load samples from the audio input stream.
			clip.open(audioIn);
			clip.start();
		} 
		catch (UnsupportedAudioFileException e)
		{
			e.printStackTrace();
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		} 
		catch (LineUnavailableException e)
		{
			e.printStackTrace();
		}
	}
	
}
