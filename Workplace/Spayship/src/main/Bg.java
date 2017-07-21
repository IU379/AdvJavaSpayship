package main;

import javax.swing.ImageIcon;

	public class Bg extends Sprite implements Pins {
		
		private final int BG_Y = 0;
		private final int BG_X = 0;
		private final String bg = "images/8bg.png";
	
		public Bg() {
			initBg();
		}

		private void initBg() {
			ImageIcon ii = new ImageIcon(bg);

	        setImage(ii.getImage());
	        setX(BG_X);
	        setY(BG_Y);
			
		}
	}

	
