package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.utils.Align;


public class MyGdxGame extends ApplicationAdapter {

	Stage stage;
	Label label;

	float width = 340;
	
	@Override
	public void create () {

		FreeTypeFontGenerator generator = new FreeTypeFontGenerator(Gdx.files.internal("Signika-Bold.ttf"));

		FreeTypeFontGenerator.FreeTypeFontParameter parameter = new FreeTypeFontGenerator.FreeTypeFontParameter();
		parameter.size = 76;

		BitmapFont bitmapFont = generator.generateFont(parameter);
		bitmapFont.getData().setScale(1 / 2.23f);


		Label.LabelStyle style = new Label.LabelStyle();
		style.font = bitmapFont;

		label = new Label("", style);
		label.setAlignment(Align.center);
		label.setWrap(true);
		label.setDebug(true);
		label.setY(200);

		label.setWidth(width);
		label.setText("Automatisch aufgegeben");
		label.layout();
		label.setHeight(label.getPrefHeight());

		stage = new Stage();
		stage.addActor(label);
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);


		stage.getViewport().apply();
		stage.draw();

	}

}
