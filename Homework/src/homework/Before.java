package homework;

public class Before {
    static class TelephoneNumber {
        
        TelephoneNumber(String area, String num) {
            areaCode = area;
            number = num;
        }
        
        private String areaCode;
        private String number;

        public String getAreaCode() {
            return areaCode;
        }

        public void setAreaCode(String areaCode) {
            this.areaCode = areaCode;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        @Override
        public String toString() {
            return String.format("%s-%s",areaCode, number);
        }
    }

    static class Person {
        private String name;
        private int age;
        private TelephoneNumber telNum;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public TelephoneNumber getTelNum() {
            return telNum;
        }

        public void setTelNum(TelephoneNumber telNum) {
            this.telNum = telNum;
        }
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("aaa");
        p1.setAge(20);
        p1.setTelNum(new TelephoneNumber("02", "123-4567"));
        p1.getTelNum().getNumber().toString();
        // p1.getTele
        
        Person p2 = new Person();
        p2.setName("bbb");
        p2.setAge(30);
        p2.getTelNum().getAreaCode();
        
    }

}
