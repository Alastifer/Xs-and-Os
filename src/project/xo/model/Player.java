// Copyright 2016 Alexandr
// Licensed under the Apache License, Version 2.0

package project.xo.model;

public class Player {

    private final String name;

    private final Figure playerFigure;

    public Player(final String name, final Figure playerFigure) {
        this.name = name;
        this.playerFigure = playerFigure;
    }

    public String getName() {

        return name;
    }

    public Figure getPlayerFigure() {

        return playerFigure;
    }
}
