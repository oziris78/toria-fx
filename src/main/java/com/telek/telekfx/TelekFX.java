package com.telek.telekfx;


import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.ImagePattern;
import javafx.util.Duration;

public final class TelekFX {

    public static void setResizableBackgroundImage(Region region, Image image){
        region.setBackground(new Background(new BackgroundFill(new ImagePattern(image), CornerRadii.EMPTY, Insets.EMPTY)));
    }


    public static void setAnchorPaneConstraints(Node node, double top, double left, double bottom, double right) {
        if(top > 0) AnchorPane.setTopAnchor(node, top);
        if(left > 0) AnchorPane.setLeftAnchor(node, left);
        if(bottom > 0) AnchorPane.setBottomAnchor(node, bottom);
        if(right > 0) AnchorPane.setRightAnchor(node, right);
    }


    public static void playFromStart(MediaPlayer mediaPlayer){
        mediaPlayer.seek(Duration.ZERO);
        mediaPlayer.play();
    }


    public static Insets insetsAll(double pad){ return new Insets(pad, pad, pad, pad); }

    public static Insets insetsNoTop(double pad){ return new Insets(0, pad, pad, pad); }
    public static Insets insetsNoRight(double pad){ return new Insets(pad, 0, pad, pad); }
    public static Insets insetsNoBottom(double pad){ return new Insets(pad, pad, 0, pad); }
    public static Insets insetsNoLeft(double pad){ return new Insets(pad, pad, pad, 0); }

    public static Insets insetsSpecificTop(double pad, double padTop){ return new Insets(padTop, pad, pad, pad); }
    public static Insets insetsSpecificRight(double pad, double padRight){ return new Insets(pad, padRight, pad, pad); }
    public static Insets insetsSpecificBottom(double pad, double padBottom){ return new Insets(pad, pad, padBottom, pad); }
    public static Insets insetsSpecificLeft(double pad, double padLeft){ return new Insets(pad, pad, pad, padLeft); }

    public static Insets insetsOnlyTop(double pad){ return new Insets(pad, 0, 0, 0); }
    public static Insets insetsOnlyRight(double pad){ return new Insets(0, pad, 0, 0); }
    public static Insets insetsOnlyBottom(double pad){ return new Insets(0, 0, pad, 0); }
    public static Insets insetsOnlyLeft(double pad){ return new Insets(0, 0, 0, pad); }

    public static Insets insetsOnlyVertical(double pad){ return new Insets(pad, 0, pad, 0); }
    public static Insets insetsOnlyHorizontal(double pad){ return new Insets(0, pad, 0, pad); }





}
