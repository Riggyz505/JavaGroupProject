package com.visual;

import java.awt.*;
import javax.swing.*;
import com.visual.scene.*;
import java.awt.event.*;

//the controll for the actual looks of the GUI
public class VisualController {
    // the visual aspects of the window
    ImageIcon logo;
    Frame frame;
    String name;
    // the parameters
    int width;
    int height;
    // the static scenes
    public LoadingScene loadingScene;
    public MenuScene menuScene;
    // the scenes
    Scene currentScene;

    public VisualController(String name, int width, int height) {
        // set params of the window
        this.name = name;
        this.width = width;
        this.height = height;
        // get the logo
        logo = new ImageIcon(this.getClass().getResource("/images/logo.png"));
        // make the window
        this.frame = new Frame(this.name);
        frame.setSize(this.width, this.height);
        frame.setLayout(null);
        frame.setIconImage(this.logo.getImage());
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        frame.setBackground(Color.darkGray);
        frame.setVisible(true);
    }

    public Frame getFrame() {
        return this.frame;
    }

    public void setDimensions(int w, int h) {
        this.width = w;
        this.height = h;
    }

    public void setScene(Scene s) {
        if (this.currentScene != null) {
            this.currentScene.clearScene(this);
        }
        this.currentScene = s;
        s.generateScene(this);
    }

    public void setLoadingScene(LoadingScene s) {
        this.loadingScene = s;
    }

    public void setMenuScene(MenuScene s) {
        this.menuScene = s;
    }

    public void refresh() {
        // this.frame.setMinimumSize(frame.getSize());
        this.frame.pack();
        // this.frame.setMinimumSize(null);
        this.frame.setSize(this.width, this.height);
    }
}