package hanghae99java;

public class PublicTransport {

    int num; // 번호
    int fuelVolume = 100; // 주유량
    int speed = 0; // 속도
    int maxPassenger; // 최대 승객
    String state; // 상태

    // 생성자
    public PublicTransport() {

    }

    // 운행 시작
    public void startOperation(String state) {
        if (fuelVolume < 10) {
            System.out.println("주유량을 확인해주세요!!");
        } else {
            this.state = state;
        }
    }

    // 속도 변경
    public void changeSpeed() {
        if (fuelVolume < 10) {
            System.out.println("주유량을 확인해주세요!!");
        } else {
            this.speed += speed;
        }
    }

    // 상태 변경
    public String changeState(String state, int fuelVolume) {
        if (state == "운행") state = "차고지행";
        else if (state == "차고지행") state = "운행";
        return state;
    }

    // 승객 탑승(bus)
    public int[] boardingPassenger(int newPassenger, int maxPassenger, int defaultMoney) {
        if(newPassenger > maxPassenger) {
            System.out.println("최대 승객 수 초과!!");
        } else {
            int[] busInfo = new int[3];
            busInfo[0] = newPassenger;
            busInfo[1] = maxPassenger - newPassenger;
            busInfo[2] = defaultMoney * newPassenger;
            return busInfo;
        }
        return null;
    }

    // Getter & Setter
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getFuelVolume() {
        return fuelVolume;
    }

    public void setFuelVolume(int fuelVolume) {
        this.fuelVolume = fuelVolume;
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
}
