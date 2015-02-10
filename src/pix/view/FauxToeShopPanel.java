package pix.view;

import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SpringLayout;

import pix.controller.FauxToeShopController;
import pixLab.classes.Picture;

public class FauxToeShopPanel extends JPanel
{

	private FauxToeShopController baseController;
	
	private JComboBox filterBox;
	
	private JScrollPane imagePane;
	
	private Picture basePicture;
	
	private SpringLayout baseLayout;
	
	public FauxToeShopPanel (FauxToeShopController baseController)
	{
		this.baseController = new baseController;
		
		filterBox = new JComboBox();
		imagePane = new JScrollPane();
		basePicture = new Picture();
		baseLayout = new SpringLayout();
		
		setupPanel();
		setupLayout();
		
	}
	
	private void setupPanel()
	{
		
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
}
