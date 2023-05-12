package view;

import java.io.IOException;
import java.sql.SQLException;

import controller.GogakController;

public class MainEntry {
	public static void main(String[] args) throws SQLException, IOException {
		
		GogakController.connect();
		GogakController.menu();
		
		
	}
}
