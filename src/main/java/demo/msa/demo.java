package demo.msa;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class demo {
     
	@RequestMapping(method=RequestMethod.GET, path = "/123")
	private String boot() {

		
		return "/WEB-INF/views/cookies.jsp";
	}
	/*
	 * BS 设备识别号； EPC：RFID编码；time:读取时间
	 */
	
	@RequestMapping(value = "/rfid", method = RequestMethod.POST)
    @ResponseBody
    public String getProcess(HttpServletRequest request){
        String bs = request.getParameter("BS");
        System.out.println("bs : " + bs);
        String epc = request.getParameter("EPC");
        System.out.println("eps : " + epc);
        String time = request.getParameter("TIME");
        System.out.println("time : " + time);
        return null;
    }
	
	@RequestMapping(value = "/sso", method = RequestMethod.GET)
    @ResponseBody
    public String  getUser(HttpServletRequest request){
        String bs = request.getParameter("userCode");
        System.out.println("userCode : " + bs);
        
        
        System.out.println("-------------------------");
        
        String userDetail = request.getParameter("userDetail");
        System.out.println("userDetail:"+  userDetail);
 
        return null;
    }

	
	public static void main(String[] args) {

		SpringApplication.run(demo.class, args);
	
		
	}
}
