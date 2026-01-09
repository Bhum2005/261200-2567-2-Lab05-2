public static void main(String[] args) {
//    User john = new User();
    User john = new User("John",1954,1,9);
    john.displayInfo();
    Admin nicolas = new Admin("Nicolas",1964,1,9);
//    nicolas.displayInfo();
    nicolas.displayInfo(true);
    nicolas.displayInfo(false);
    john.displayHappyBirthday();
    nicolas.displayHappyBirthday();
}