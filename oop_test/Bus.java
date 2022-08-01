package hanghae99java;

public class Bus extends PublicTransport{
    int busNum; // 번호
    //int fuelVolume = 100; // 주유량
    //int speed = 0; // 속도
    int maxPassenger = 30; // 최대 승객
    int currentPassenger; // 현재 승객
    //String state; // 상태
    int defaultMoney = 1000; // 기본 요금

    @Override
    public void changeSpeed() {
        super.startOperation("운행");
        this.busNum = busNum;
    }

    // 생성자
    public Bus(int busNum) {
        super.startOperation("운행");
        this.busNum = busNum;
    }

    // Getter & Setter
    public int getBusNum() {
        return busNum;
    }

    public void setBusNum(int busNum) {
        this.busNum = busNum;
    }

    @Override
    public int getFuelVolume() {
        return fuelVolume;
    }

    @Override
    public void setFuelVolume(int fuelVolume) {
        this.fuelVolume = fuelVolume;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public int getMaxPassenger() {
        return maxPassenger;
    }

    @Override
    public void setMaxPassenger(int maxPassenger) {
        this.maxPassenger = maxPassenger;
    }

    public int getCurrentPassenger() {
        return currentPassenger;
    }

    public void setCurrentPassenger(int currentPassenger) {
        this.currentPassenger = currentPassenger;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getDefaultMoney() {
        return defaultMoney;
    }

    public void setDefaultMoney(int defaultMoney) {
        this.defaultMoney = defaultMoney;
    }
}
