import com.sourceLearn.servlet.IndexServlet;
import java.util.Enumeration;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
public class App {
	public static void main(String[] args) throws ServletException, LifecycleException {

		Tomcat tomcat = new Tomcat();
		tomcat.setPort(9090);

		IndexServlet testServlet = new IndexServlet();
		tomcat.start();
		Context context = tomcat.addWebapp("/boot", "D:\\doc");
		tomcat.addServlet("/boot", "index", testServlet);
		context.addServletMappingDecoded("/index.do", "index");
		tomcat.getServer().await();
	}
}
