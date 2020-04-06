package a.b.c;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Handles requests for the application home page.
 */
//@Controller
public class HomeController {
	
	//private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	 public static void main(String[] args) {
	        
	        //bean을 설정한 xml파일이 있는 위치를 지정하여 설정파일을 얻어옴
	        AbstractApplicationContext ctx = 
	                new GenericXmlApplicationContext("file:src/main/webapp/WEB-INF/spring/root-context.xml");
	        
	        //설정파일에서 bean을 가져옴
	        Test myCat = ctx.getBean("tete",Test.class);
	        myCat.ToString();
	        
	    }


	/**
	 * Simply selects the home view to render by returning its name.
	 *//*
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}*/
	
}
