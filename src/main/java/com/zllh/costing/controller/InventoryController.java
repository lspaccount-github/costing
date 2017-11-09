package com.zllh.costing.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

/**
 * @ClassName: inventoryController 库存管理
 * @Description: Controller
 * @author Wt
 * @date 2017年11月1日上午9:38:19
 */

@Controller
@RequestMapping("/inventoryController")
public class InventoryController extends BaseController{
	
	
	
	/**
	 * 菜品库跳转
	 * @date 2017年11月1日
	 * @author wangteng
	 */
	@RequestMapping("toDishesPage")
	public String toMaterialPage(){
		Map<String,Object> map = new HashMap<String,Object>();
		
		
		
		return "Dishes/DishesIndexPage"; 
	}
	
	
	/**
	 * 菜品库列表展示
	 * @date 2017年11月1日
	 * @author wangteng
	 */
	@RequestMapping("DishesList")
	@ResponseBody
	public String DishesList(){
		Map<String,Object> map = new HashMap<String,Object>();
		
		String cid=request.getParameter("cid");
		String orderId=request.getParameter("orderId");
		map.put("123", orderId);
		String jsonData = JSON.toJSONString(map);
		return jsonData;
	}
}
