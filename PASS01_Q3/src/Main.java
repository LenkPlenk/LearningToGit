import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.geom.Arc2D;

import com.engine.core.*;
import com.engine.core.gfx.*;

public class Main extends AbstractGame
{
	//Required Basic Game Functional Data
	private static GraphicsDevice device = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
	private static int screenWidth = device.getDisplayMode().getWidth();
	private static int screenHeight = device.getDisplayMode().getHeight();
	
	//Required Basic Game Visual data used in main below
	private static String gameName = "My Game";
	private static int windowWidth = 1024;	//For fullscreen mode set these next two to screenWidth and screenHeight
	private static int windowHeight = 768;
	private static int fps = 60;
	private double gameTime; 
	private int gameTimePrevious;
	
	public static void main(String[] args) 
	{
		GameContainer gameContainer = new GameContainer(new Main(), gameName, windowWidth, windowHeight, fps);
		gameContainer.Start();
	}

	@Override
	public void LoadContent(GameContainer gc)
	{
		//TODO: This subprogram automatically happens only once, just before the actual game loop starts.
		//It should never be manually called, the Engine will call it for you.
		//Load images, sounds and set up any data
	}
	
	@Override
	public void Update(GameContainer gc, float deltaTime) 
	{
		//TODO: Add your update logic here, including user input, movement, physics, collision, ai, sound, etc.
		
		gameTime = deltaTime + gameTime;
		
		if(gameTimePrevious != (int) (gameTime/1000))
		{
			System.out.println(Math.round(gameTime / 1000));
			gameTimePrevious = (int) (gameTime/1000);
		}
		
		
	}

	@Override
	public void Draw(GameContainer gc, Graphics2D gfx) 
	{
		//Frame for entire scene
		Draw.Rect(gfx, 5, 5, 1015, 755, 3, Helper.BLUE, 1);
	
		//Borders for Ghost Spawn
		Draw.Line(gfx, 400, 450, 600, 450, 3, Helper.BLUE, 1);
			Draw.Line(gfx, 390, 425, 610, 425, 3, Helper.BLUE, 1);
		Draw.Line(gfx, 400, 575, 600, 575, 3, Helper.BLUE, 1);
			Draw.Line(gfx, 390, 600, 610, 600, 3, Helper.BLUE, 1);
		Draw.Line(gfx, 400, 450, 400, 575, 3, Helper.BLUE, 1);
			Draw.Line(gfx, 375, 425, 375, 575, 3, Helper.BLUE, 1);
		Draw.Line(gfx, 600, 450, 600, 575, 3, Helper.BLUE, 1);
		
		Draw.Line(gfx, 200, 200, 200, 575, 4, Helper.BLUE, 1);
		Draw.Line(gfx, 250, 200, 250, 575, 4, Helper.BLUE, 1);
		Draw.Arc(gfx, 225, 200, 25, 25,0,180,Arc2D.OPEN,4,Helper.BLUE,1);
		Draw.Arc(gfx, 225, 575, 25, 25,180,180,Arc2D.OPEN,4,Helper.BLUE,1);
		
		Draw.Line(gfx, 750, 200, 750, 575, 4, Helper.BLUE, 1);
		Draw.Line(gfx, 800, 200, 800, 575, 4, Helper.BLUE, 1);
		Draw.Arc(gfx, 775, 200, 25, 25,0,180,Arc2D.OPEN,4,Helper.BLUE,1);
		Draw.Arc(gfx, 775, 575, 25, 25,180,180,Arc2D.OPEN,4,Helper.BLUE,1);


	
		
		

	}

}
