package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.scene.image.*;

public class JavaFXCalculator extends Application {
	//Declaration of Variables
	static int num;
	static double numTwo;
	static double numThree;
	static double numFour;
	static String symbol;
	static String operator = "";
	static boolean expression = false;
	static boolean symbolCheck = false;
	
	//Setting Calculator UIs
	static TextField textfield = new TextField();
	static BorderPane border = new BorderPane();
	static Image image = new Image("/application/calculatorImage.jpg");
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		calculatorLayOut();

		Scene scene = new Scene(border, 235, 220);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setTitle("Calculator");
		primaryStage.getIcons().add(image);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void calculatorLayOut() {
		//Setting UI Interactions and Objects
		GridPane grid = new GridPane();
		HBox hbox = new HBox();
		Label label = new Label();
		border.setTop(hbox);
		border.setCenter(grid);
		hbox.getChildren().add(textfield);
		hbox.setAlignment(Pos.CENTER);
		hbox.setStyle("-fx-background-color: gray");
		grid.setStyle("-fx-background-color: gray");
		textfield.setStyle("-fx-background-color: white;");
		textfield.setPrefSize(160, 60);
		textfield.setAlignment(Pos.CENTER);
		textfield.setFont(Font.font("Verdana", 20));
		
		Button b0 = new Button("  0  ");
		Button b1 = new Button("  1  ");
		Button b2 = new Button("  2  ");
		Button b3 = new Button("  3  ");
		Button b4 = new Button("  4  ");
		Button b5 = new Button("  5  ");
		Button b6 = new Button("  6  ");
		Button b7 = new Button("  7  ");
		Button b8 = new Button("  8  ");
		Button b9 = new Button("  9  ");
		Button plus = new Button(" +  ");
		Button minus = new Button("  -  ");
		Button clear = new Button("  C  ");
		Button divide = new Button("  /  ");
		Button equals = new Button("  =  ");
		Button multiply = new Button("  *  ");
		
        // Set the button styles using CSS class
        b0.getStyleClass().add("button");
        b1.getStyleClass().add("button");
        b2.getStyleClass().add("button");
        b3.getStyleClass().add("button");
        b4.getStyleClass().add("button");
        b5.getStyleClass().add("button");
        b6.getStyleClass().add("button");
        b7.getStyleClass().add("button");
        b8.getStyleClass().add("button");
        b9.getStyleClass().add("button");
        clear.getStyleClass().add("button");
        divide.getStyleClass().add("button");
        equals.getStyleClass().add("button");
        minus.getStyleClass().add("button");
        multiply.getStyleClass().add("button");
        plus.getStyleClass().add("button");
		
		//EventHandler of buttons 1-9 and Operation Symbols
		EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				if (event.getSource() == b0) {
					num = 0;
					textfield.setText(textfield.getText() + num);
					symbolCheck = true;
					if (symbolCheck == false) {
						plus.setDisable(true);
						minus.setDisable(true);
						multiply.setDisable(true);
						divide.setDisable(true);
					} else {
						plus.setDisable(false);
						minus.setDisable(false);
						multiply.setDisable(false);
						divide.setDisable(false);
					}
				
				// Button 1
				} else if (event.getSource() == b1) {
					num = 1;
					textfield.setText(textfield.getText() + num);
					symbolCheck = true;
					if (symbolCheck == false) {
						plus.setDisable(true);
						minus.setDisable(true);
						multiply.setDisable(true);
						divide.setDisable(true);
					} else {
						plus.setDisable(false);
						minus.setDisable(false);
						multiply.setDisable(false);
						divide.setDisable(false);
					}
				}
				
				// Button 2
				else if (event.getSource() == b2) {
					num = 2;
					textfield.setText(textfield.getText() + num);
					symbolCheck = true;
					if (symbolCheck == false) {
						plus.setDisable(true);
						minus.setDisable(true);
						multiply.setDisable(true);
						divide.setDisable(true);
					} else {
						plus.setDisable(false);
						minus.setDisable(false);
						multiply.setDisable(false);
						divide.setDisable(false);
					}
				}
				
				// Button 3
				else if (event.getSource() == b3) {
					num = 3;
					textfield.setText(textfield.getText() + num);
					symbolCheck = true;
					if (symbolCheck == false) {
						plus.setDisable(true);
						minus.setDisable(true);
						multiply.setDisable(true);
						divide.setDisable(true);
					} else {
						plus.setDisable(false);
						minus.setDisable(false);
						multiply.setDisable(false);
						divide.setDisable(false);
					}
				}
				
				// Button 4
				else if (event.getSource() == b4) {
					num = 4;
					textfield.setText(textfield.getText() + num);
					symbolCheck = true;
					if (symbolCheck == false) {
						plus.setDisable(true);
						minus.setDisable(true);
						multiply.setDisable(true);
						divide.setDisable(true);
					} else {
						plus.setDisable(false);
						minus.setDisable(false);
						multiply.setDisable(false);
						divide.setDisable(false);
					}
				}
				
				// Button 5
				else if (event.getSource() == b5) {
					num = 5;
					textfield.setText(textfield.getText() + num);
					symbolCheck = true;
					if (symbolCheck == false) {
						plus.setDisable(true);
						minus.setDisable(true);
						multiply.setDisable(true);
						divide.setDisable(true);
					} else {
						plus.setDisable(false);
						minus.setDisable(false);
						multiply.setDisable(false);
						divide.setDisable(false);
					}
				}
				
				// Button 6
				else if (event.getSource() == b6) {
					num = 6;
					textfield.setText(textfield.getText() + num);
					symbolCheck = true;
					if (symbolCheck == false) {
						plus.setDisable(true);
						minus.setDisable(true);
						multiply.setDisable(true);
						divide.setDisable(true);
					} else {
						plus.setDisable(false);
						minus.setDisable(false);
						multiply.setDisable(false);
						divide.setDisable(false);
					}
				}
				
				//// Button 7
				else if (event.getSource() == b7) {
					num = 7;
					textfield.setText(textfield.getText() + num);
					symbolCheck = true;
					if (symbolCheck == false) {
						plus.setDisable(true);
						minus.setDisable(true);
						multiply.setDisable(true);
						divide.setDisable(true);
					} else {
						plus.setDisable(false);
						minus.setDisable(false);
						multiply.setDisable(false);
						divide.setDisable(false);
					}
				}
				
				// Button 8
				else if (event.getSource() == b8) {
					num = 8;
					textfield.setText(textfield.getText() + num);
					symbolCheck = true;
					if (symbolCheck == false) {
						plus.setDisable(true);
						minus.setDisable(true);
						multiply.setDisable(true);
						divide.setDisable(true);
					} else {
						plus.setDisable(false);
						minus.setDisable(false);
						multiply.setDisable(false);
						divide.setDisable(false);
					}
				}
				
				// Button 9
				else if (event.getSource() == b9) {
					num = 9;
					textfield.setText(textfield.getText() + num);
					symbolCheck = true;
					if (symbolCheck == false) {
						plus.setDisable(true);
						minus.setDisable(true);
						multiply.setDisable(true);
						divide.setDisable(true);
					} else {
						plus.setDisable(false);
						minus.setDisable(false);
						multiply.setDisable(false);
						divide.setDisable(false);
					}
				}
				
				//Plus Button
				else if (event.getSource() == plus) {
					
					try {
						symbol = "+";
						numTwo = Double.parseDouble(textfield.getText());
						if (symbolCheck) {
							textfield.clear();
							plus.setDisable(true);
							minus.setDisable(true);
							multiply.setDisable(true);
							divide.setDisable(true);
						}
					} catch(NumberFormatException e) {
						System.out.println("Invalid Input");
					}
				}
				
				//Minus Button
				else if (event.getSource() == minus) {
					symbol = "-";
					try {
						numTwo = Double.parseDouble(textfield.getText());
						if (symbolCheck) {
							textfield.clear();
							minus.setDisable(true);
							multiply.setDisable(true);
							divide.setDisable(true);
							plus.setDisable(true);
						}
					} catch(NumberFormatException e) {
						System.out.println("Invalid Input");
					}
				}
				
				//Multiply Button
				else if (event.getSource() == multiply) {
					try {
						numTwo = Double.parseDouble(textfield.getText());
						textfield.clear();
						if (symbolCheck) {
							symbol = "*";
							multiply.setDisable(true);
							divide.setDisable(true);
							plus.setDisable(true);
							minus.setDisable(true);
	
						}
					} catch(NumberFormatException e) {
						System.out.println("Invalid Input");
					}
				}
				
				//Divide Button
				else if (event.getSource() == divide) {
					try {
						numTwo = Double.parseDouble(textfield.getText());
						textfield.clear();
						if (symbolCheck) {
							symbol = "/";
							divide.setDisable(true);
							plus.setDisable(true);
							minus.setDisable(true);
							multiply.setDisable(true);
						}
					} catch(NumberFormatException e) {
						System.out.println("Invalid Input");
					}
				}
				
				//Equals Button
				else if (event.getSource() == equals) {
					
				    // Checks if the text-field contains values inside it
				    if (textfield.getText() == null || textfield.getText().trim().isEmpty()) {
				        System.out.println("No Expression Inputted");
				    }
				    else {
				        // Solves for the expression
				    	try {
				    		numThree = Long.parseLong(textfield.getText());
					        calculate(numTwo, numThree, symbol);
				    	} catch(NullPointerException e) {
				    		System.out.println("Invalid Input");
				    	}
				    }
				}

				else if (event.getSource() == clear) {
					textfield.clear();
					symbolCheck = false;
					plus.setDisable(false);
					minus.setDisable(false);
					multiply.setDisable(false);
					divide.setDisable(false);
				}
			}
		};
		
		// Setting the Button ID, Events, and Placements
		b0.setId("0");
		b0.setOnAction(event);
		grid.add(b0, 1, 5);

		b1.setId("1");
		grid.add(b1, 0, 4);
		b1.setOnAction(event);

		b2.setId("2");
		grid.add(b2, 1, 4);
		b2.setOnAction(event);

		b3.setId("3");
		grid.add(b3, 2, 4);
		b3.setOnAction(event);

		b4.setId("4");
		grid.add(b4, 0, 3);
		b4.setOnAction(event);

		b5.setId("5");
		grid.add(b5, 1, 3);
		b5.setOnAction(event);

		b6.setId("6");
		grid.add(b6, 2, 3);
		b6.setOnAction(event);

		b7.setId("7");
		grid.add(b7, 0, 2);
		b7.setOnAction(event);

		b8.setId("8");
		grid.add(b8, 1, 2);
		b8.setOnAction(event);

		b9.setId("9");
		grid.add(b9, 2, 2);
		b9.setOnAction(event);

		plus.setId("+");
		grid.add(plus, 3, 5);
		plus.setOnAction(event);

		minus.setId("-");
		grid.add(minus, 3, 4);
		minus.setOnAction(event);

		multiply.setId("*");
		grid.add(multiply, 3, 3);
		multiply.setOnAction(event);

		divide.setId("/");
		grid.add(divide, 3, 2);
		divide.setOnAction(event);
		
		equals.setOnAction(event);
		grid.add(equals, 2, 5);

		clear.setId("C");
		grid.add(clear, 0, 5);
		clear.setOnAction(event);
		
		grid.setHgap(5);
		grid.setVgap(5);
		grid.setAlignment(Pos.CENTER);
	}
	
	//Calculation Method
	public static void calculate(double number1, double number2, String operator) {
		double result = 0;
		switch (operator) {
		case "+":
			result = number1 + number2;
			textfield.setText(String.valueOf(result));
			break;
		case "-":
			result = number1 - number2;
			textfield.setText(String.valueOf(result));
			break;
		case "*":
			result = number1 * number2;
			textfield.setText(String.valueOf(result));
			break;
		case "/":
			if (number2 == 0) {
				System.out.println("Invalid Expression!");
				textfield.clear();
			} else {
				result = number1 / number2;
				numTwo = (long) num;
				textfield.setText(String.format("%.6f",result));
			}
		}
	}
}