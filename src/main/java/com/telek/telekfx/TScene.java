package com.telek.telekfx;

import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.paint.*;

public abstract class TScene<T extends Application, R extends Parent> extends Scene {

    protected final T app;
    protected final R root;

    public TScene(T app, R root, Paint fill) {
        super(root, fill);
        this.root = root;
        this.app = app;
    }

    public TScene(T app, R root) {
        this(app, root, Color.WHITE);
    }

}
