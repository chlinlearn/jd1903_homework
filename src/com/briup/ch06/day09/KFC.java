/**
 * @author xuchunlin
 * @time 2019年6月12日下午2:53:59
 * @version
 * @description TODO
 */
package com.briup.ch06.day09;

public class KFC {
	//套餐系列
	SetMeal setMeal1 = this.new SetMeal(1, 1, 1, 1, 2, 50.0);
	SetMeal setMeal2 = this.new SetMeal(2, 1, 1, 2, 2, 60.0);
	SetMeal setMeal3 = this.new SetMeal(3, 2, 2, 1, 2, 65.0);
	SetMeal setMeal4 = this.new SetMeal(4, 1, 2, 2, 2, 70.0);
	
	//套餐类
	private class SetMeal{
		private int id;
		private int cola;
		private int hamburger;
		private int chicken;
		private int count;//数量
		private double price;//价格
		
		public SetMeal() {
		}		
		public SetMeal(int id,int cola,int hamburger,int chicken,int count,double price) {
			this.id =id;
			this.cola = cola;
			this.hamburger = hamburger;
			this.chicken = chicken;	
			this.count = count;
			this.price = price;
		}
		public int getId() {
			return id;
		}

		public int getCola() {
			return cola;
		}
		public void setCola(int cola) {
			this.cola = cola;
		}
		public int getHamburger() {
			return hamburger;
		}
		public void setHamburger(int hamburger) {
			this.hamburger = hamburger;
		}
		public int getChicken() {
			return chicken;
		}
		public void setChicken(int chicken) {
			this.chicken = chicken;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getCount() {
			return count;
		}
		public void setCount(int count) {
			this.count = count;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		
	}
	
	//点套餐
	public SetMeal getMeal(double money,int num) {	
		SetMeal s = null;
		switch (num) {
		case 1:
			s = setMeal1;
			break;
		case 2:
			s = setMeal2;		
			break;
		case 3:
			s = setMeal3;
			break;
		case 4:
			s = setMeal4;
			break;
		default:
			System.out.println("不存在该套餐");
			break;
		}
		if (money<s.getPrice()) {
			System.out.println("钱不够！");
			return null;
		}
		if (s.getCount()<=0) {
			System.out.println("套餐已售完！");
			return null;
		}	
		s.count = s.getCount()-1;
		return s;
	}
	
	public void display(SetMeal setMeal) {
		if (setMeal==null) {
			return;
		}
		System.out.println("您点了"+setMeal.getId()+
			"号套餐，包含可乐"+setMeal.getCola()+"份，汉堡"
			+setMeal.getHamburger()+"份，鸡翅"+setMeal.getChicken()+
			"份，"+"一共花费"+setMeal.getPrice()+"元");
	}
	
	public static void main(String[] args) {
		KFC kfc = new KFC();
		SetMeal setMeal1 = kfc.getMeal(100.0, 1);
		kfc.display(setMeal1);
		SetMeal setMeal2 = kfc.getMeal(100.0, 2);
		kfc.display(setMeal2);
		SetMeal setMeal3 = kfc.getMeal(100.0, 2);
		kfc.display(setMeal3);
	}

}

