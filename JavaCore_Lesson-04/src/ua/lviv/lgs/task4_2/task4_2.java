package ua.lviv.lgs.task4_2;

public class task4_2 {

	public static void main(String[] args) {
		SteeringWheel sw = new SteeringWheel(40.5, "������");
		Wheel wheel = new Wheel(175, "����");
		Body body = new Body("������");
		Car car = new Car(500, 5, sw, wheel, body);
				
		System.out.println(car);
				
		car.setEnginePower(1200);
		car.setNumberOfDoors(3);
		sw.setDiameter(sw.halfSteeringWheelDiameter());
		sw.setMaterial("����");
		wheel.setWheelSize(wheel.wheelSizeEnlarge(10));
		wheel.setTyreType("���������");
		body.setColor("�����");
				
		System.out.println(car);
	}

}
