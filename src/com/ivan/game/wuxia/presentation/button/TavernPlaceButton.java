package com.ivan.game.wuxia.presentation.button;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class TavernPlaceButton extends PlaceButton{

	
	
	
	public TavernPlaceButton(){
		super();
		backIcon=new ImageIcon("image/place/tavern.png");
		this.setIcon(backIcon);
		
		this.addMouseListener(new MouseAdapter(){
			   //鼠标点击事件
			   public void mouseClicked(MouseEvent e){	


			   }	
			 //鼠标点击事件
			   public void mousePressed(MouseEvent e){


			   }	
			    //鼠标释放事件
			    public void mouseReleased(MouseEvent e){


			    }
			    //鼠标进入事件
			    public void mouseEntered(MouseEvent e){


			    }
			    //鼠标离开事件
			    public void mouseExited(MouseEvent e){


			    }
			
			
			
			
			
			
			
			
		});
	 
	}
	
	
 
}
