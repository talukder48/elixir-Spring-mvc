package elixir.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MenuController {
	@RequestMapping(value = "HRM/addEmployeeRecord.do")
	public String AddEmployeeMenuParser() {
		return "HRM/AddEmployeeRecord";		
	}
	@RequestMapping(value = "HRM/addIncrementRecord.do")
	public String AddIncrementMenuParser() {
		return "HRM/AddIncrementRecord";		
	}
	@RequestMapping(value = "HRM/addLeaveRecord.do")
	public String AddLeaveMenuParser() {
		return "HRM/AddLeaveRecord";		
	}
	@RequestMapping(value = "HRM/addPromotionRecord.do")
	public String AddPromotionMenuParser() {
		return "HRM/AddPromotionRecord";		
	}
	@RequestMapping(value = "HRM/addSuspendRecord.do")
	public String AddSuspendMenuParser() {
		return "HRM/AddSuspendRecord";		
	}
	@RequestMapping(value = "HRM/addTransferRecord.do")
	public String AddTransferMenuParser() {
		return "HRM/AddTransferRecord";		
	}

}
