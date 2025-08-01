package gui.util;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.stage.Stage;

public class Utils {

	//para acessar o Stage onde está o controle que recebeu o evento está
	public static Stage currentStage(ActionEvent event) {
		return (Stage) ((Node) event.getSource()).getScene().getWindow();
	}
	
	
	//para ler o dado e , caso de um erro no parse, retornar nulo
	public static Integer tryParseToInt(String str) {
		try {
			return Integer.parseInt(str);	
		}
		catch (NumberFormatException e) {
			return null;
		}
		
	}
	
}
