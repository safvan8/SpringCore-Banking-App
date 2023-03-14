package in.ineuron.main;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import in.ineuron.controller.CustomerDepositController;
import in.ineuron.vo.CustomerDepositVO;

public class ClientApp
{
	private static DefaultListableBeanFactory beanFactory = null;
	private static XmlBeanDefinitionReader reader = null;

	private static CustomerDepositController controller = null;

	static
	{
		try
		{
			DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
			XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
			int numberOFBeanDefinitionsLoaded = reader.loadBeanDefinitions("/in/ineuron/resources/applicationContext.xml");
			controller = beanFactory.getBean("controller", CustomerDepositController.class);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
			throw new ExceptionInInitializerError();
			
		}
		finally {
			System.out.println("__________________________________________________________"
					+ "____________________________________________________________"
					+ "____________________________________________________________"
					+ "____________________________________________");
		}

	}

	public static void main(String[] args)
	{

		// Conatins methods for all type of user inputs
		CustomerInputHandler inputHandler = CustomerInputHandler.getCustomerInputHandler();

		// to Display welcome message to user along with current time
		inputHandler.displayWelcomeMessage();

		// to get all customer details from the user in the form of Value object
		CustomerDepositVO customerDepositVO = inputHandler.acceptDepositInfoFromCustomer();
		
	// passing customerDepositVo object to controller;
	controller.peformDepsoit(customerDepositVO);

	}
}
