package main.service.login;

import javafx.scene.Parent;

public interface LoginService {
	public void loginProc(Parent root);
	public Parent joinProc(Parent root);
	public Parent idSearchProc(Parent root);
	public Parent pwSearchProc(Parent root);
}
