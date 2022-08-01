package hanghae99java;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Taxi extends PublicTransport{
    int taxiNum; // 번호
    int fuelVolume = 100; // 주유량
    int speed = 0; // 속도
    int maxPassenger = 4; // 최대 승객
    int distanceDestination; // 목적지까지 거리
    int defaultDistance = 1; // 기본 거리
    int defaultMoney = 3000; // 기본 요금
    int distanceMoney = 1000; // 거리당 요금
    String state = "일반"; // 상태

    int price = 0; //가격

    private final List<Integer> numList = Arrays.asList((int) (Math.random() *1000));

    // 생성자
    public Taxi() {
        taxiNum = numList.get(0) -1;
    }



    // 거리당 요금 추가
    public void distanceMoneyPlus(double n) {
        //10키로 이하
        int temp = 0;
        
        //승객 탑승 확인
        
        if(n < 10.0){
            temp = Math.round((int) n * 1000);
        }
        //10~100키로
        else if(n >= 10.0 || n < 100.0){
            temp = Math.round((int) n * 10000);
        }
        //100키로에서 1천키로
        else if(n >= 100.0 || n < 1000.0){
            temp = Math.round((int) n * 100000);
        }
        boolean firstDrive = true;

        while (temp <= 0){
            System.out.println(temp);
            System.out.println(price);
            System.out.println(fuelVolume);
            if(firstDrive){
                setPrice(+this.defaultMoney);
                temp -= 1200;
                setFuelVolume(-25);
                firstDrive = false;

            }
            if(!firstDrive){
                if(temp > 140){
                    setPrice(+this.distanceMoney);
                    temp -= 140;
                    setFuelVolume(-3);
                }else{
                    setPrice( (this.distanceMoney - (int)(temp * 0.7)));
                    temp = 0;
                    setFuelVolume(-1);
                    setState("일반");
                }
            }

        }

    }



    // 요금 결제
    public void payment() {
        System.out.println("현재 금액은 "+getPrice()+"입니다.");
    }


    @Override
    public String changeState(String state, int fuelVolume) {
        return super.changeState(state, fuelVolume);
    }

    @Override
    public void startOperation(String state) {
        super.startOperation(state);
    }

    @Override
    public void changeSpeed() {
        super.changeSpeed();
    }

    @Override
    public int[] boardingPassenger(int newPassenger, int maxPassenger, int defaultMoney) {
        return super.boardingPassenger(newPassenger, maxPassenger, defaultMoney);
    }

    @Override
    public int getNum() {
        return super.getNum();
    }

    @Override
    public void setNum(int num) {
        super.setNum(num);
    }

    // Getter & Setter
    public int getTaxiNum() {
        return taxiNum;
    }

    public void setTaxiNum(int taxiNum) {
        this.taxiNum = taxiNum;
    }

    public int getFuelVolume() {
        return fuelVolume;
    }

    public void setFuelVolume(int fuelVolume) {
        this.fuelVolume += fuelVolume;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMaxPassenger() {
        return maxPassenger;
    }

    public void setMaxPassenger(int maxPassenger) {
        this.maxPassenger = maxPassenger;
    }

    public int getDistanceDestination() {
        return distanceDestination;
    }

    public void setDistanceDestination(int distanceDestination) {
        this.distanceDestination = distanceDestination;
    }

    public int getDefaultDistance() {
        return defaultDistance;
    }

    public void setDefaultDistance(int defaultDistance) {
        this.defaultDistance = defaultDistance;
    }

    public int getDefaultMoney() {
        return defaultMoney;
    }

    public void setDefaultMoney(int defaultMoney) {
        this.defaultMoney = defaultMoney;
    }

    public int getDistanceMoney() {
        return distanceMoney;
    }

    public void setDistanceMoney(int distanceMoney) {
        this.distanceMoney = distanceMoney;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price += price;
    }
    public void showInfo(){
        System.out.println("택시의 번호는 "+getTaxiNum()+"주유량은 "+getFuelVolume() + "운행상태는 "+getState() +"입니다.");
    }
}
