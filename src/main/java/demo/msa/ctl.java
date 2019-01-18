package demo.msa;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ctl {

	@RestController
	public class UserController {

		@RequestMapping(value = "/index", method = RequestMethod.GET)
		public ModelAndView toIndex() {
			ModelAndView mv = new ModelAndView("cookies");
			return mv;
		}
	}

}
