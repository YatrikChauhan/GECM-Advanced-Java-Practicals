import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.;
public class HibernateUtil {
	private static final SessionFactory sessionFactory;

	private static ServiceRegistry serviceRegistry;

	static {

		try {

			Configuration configuration = new Configuration();
			configuration.configure();
			serviceRegistry = ( new StandardServiceRegistryBuilder().applySettings(
			configuration.getProperties()).buildServiceRegistry();
			sessionFactory = configuration.buildSessionFactory(serviceRegistry);

		} catch (Throwable th) {

			System.err.println("Enitial SessionFactory creation failed" + th);

			throw new ExceptionInInitializerError(th);

		}

	}

	public static SessionFactory getSessionFactory() {

		return sessionFactory;

	}
}

