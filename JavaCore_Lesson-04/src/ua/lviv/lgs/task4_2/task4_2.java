package ua.lviv.lgs.task4_2;

public class task4_2 {

	public static void main(String[] args) {
		SteeringWheel sw = new SteeringWheel(40.5, "резина");
		Wheel wheel = new Wheel(175, "слик");
		Body body = new Body("черный");
		Car car = new Car(500, 5, sw, wheel, body);
				
		System.out.println(car);
				
		car.setEnginePower(1200);
		car.setNumberOfDoors(3);
		sw.setDiameter(sw.halfSteeringWheelDiameter());
		sw.setMaterial("кожа");
		wheel.setWheelSize(wheel.wheelSizeEnlarge(10));
		wheel.setTyreType("протектор");
		body.setColor("белый");
				
		System.out.println(car);
	}

}
