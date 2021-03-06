package net.vectorgaming.mediarealm.ui.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;


/*Loads in all of the elements in the FXML file that is needed and assigns action listeners
 to the element. the action listners are instances of the classes that are named accordingly
 */
public class ComponentController implements Initializable
{

    private double xOffset;
    private double yOffset;

    @FXML
    private Button myMusic;
    @FXML
    private Button myVideos;
    @FXML
    private Button Netflix;
    @FXML
    private Button Vimeo;
    @FXML
    private Button SoundCloud;
    @FXML
    private Button Youtube;
    @FXML
    private Button Pandora;
    @FXML
    private Button ExitButton;
    @FXML
    public static FlowPane ContentPanel;

    @Override
    public void initialize(URL fxmlFileLocation, ResourceBundle resources)
    {
        myVideos.setOnAction(new MyVideoHandler());
        myMusic.setOnAction(new MyMusicController());
        Youtube.setOnAction(new YoutubeHandler());
        Vimeo.setOnAction(new VimeoHandler());
        Netflix.setOnAction(new NetflixHandler());
        Pandora.setOnAction(new PandoraHandler());
        ExitButton.setOnAction(new ExitButtonHandler());
        setContentPanelSettings();
    }

    private void setContentPanelSettings()
    {
        ContentPanel.setHgap(50);
        ContentPanel.setVgap(50);
        ContentPanel.setPadding(new Insets(20, 0, 20, 20));
    }
}
