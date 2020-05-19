package com.sourceLearn.servlet;

import java.io.Serializable;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class IndexServlet  extends HttpServlet implements Serializable {

	private static final long serialVersionUID = 8939428770146992495L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
		log.debug("---------------servlet---------------");
	}
}
