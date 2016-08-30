package br.com.system.StockLibrary.util;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

public class SessionUtils {

	private static FacesContext context;
	private static HttpSession session = null;

	private static void criarSessao() {
		context = FacesContext.getCurrentInstance();
		session = (HttpSession) context.getExternalContext().getSession(true);
	}

	public static void criarSessao(String nomeSessao, Object usuario) {
		criarSessao();
		session.setAttribute(nomeSessao, usuario);
	}

	public static void fecharSessao() {
		session.invalidate();
	}

	public static boolean existeSessao(String nomeSessao) {
		if (session.getAttribute(nomeSessao) != null) {
			return true;
		}
		return false;
	}
}
