package br.com.aplcurso.utils;

import java.util.regex.Pattern;

public class EmailValidador {
	
	private static final Pattern Formato_Email = Pattern.compile(
			"^[A-Za-z0-9._%+-]+@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*\\.[A-Za-z]{2,}$"
			);
	
	public static boolean isEmailValido(String email) {
		if (email == null) return false;
		email = email.trim();
		if (email.length() > 100) return false;
		return Formato_Email.matcher(email).matches();
	}
}
