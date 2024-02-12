public class сover {
    String stil = "\u001B[34m" + " грязном" + "\u001B[0m";
    String stil1 = "\u001B[34m" + " чистом" + "\u001B[0m";
    String stil2 = "\u001B[34m" + " выдуманном" + "\u001B[0m";
    String qwerty;

    public void sos() {
        int covric = (int) (Math.random() * 3) + 1;
        if (covric == 1) {
            qwerty = stil;
        } else if (covric == 2) {
            qwerty = stil1;
        } else {
            qwerty = stil2;
        }
    }
}
