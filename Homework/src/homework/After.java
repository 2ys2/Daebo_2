package homework;

public class After {
    static class Person {
        private String name;
        private int age;

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

        private String areaCode;
        private String telNumber;

        public String getAreaCode() {
            return areaCode;
        }

        public void setAreaCode(String areaCode) {
            this.areaCode = areaCode;
        }

        public String getTelNumber() {
            return telNumber;
        }

        public void setTelNumber(String telNumber) {
            this.telNumber = telNumber;
        }

        public String getTelephoneNumber() {
            return String.format("%s-%s", areaCode, telNumber);
        }
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("aaa");
        p1.setAge(20);
        p1.setAreaCode("02");
        p1.setTelNumber("123-4567");
        p1.getAreaCode();
        p1.getTelephoneNumber();

        Before.Person p2 = new Before.Person();
        p2.setName("bbb");
        p2.setAge(30);
        p1.getAreaCode();
        p1.getTelephoneNumber();

    }
}
