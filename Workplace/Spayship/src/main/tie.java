package main;

import javax.swing.ImageIcon;

	public class tie extends Sprite implements Pins {
		
		private final int P1VICTORY_Y = 230;
		private final int P1VICTORY_X = 100;
		private final String p1victory = "images/tie.png";
	
		public tie() {
			initBg();
		}

		private void initBg() {
			ImageIcon ii = new ImageIcon(p1victory);

	        setImage(ii.getImage());
	        setX(P1VICTORY_X);
	        setY(P1VICTORY_Y);
			
		}
	}

	
