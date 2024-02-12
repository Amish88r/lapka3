public class Frek extends OldPeople {
    int agge = 55;
    public void frik(){
    System.out.print(" она не\n в свои \u001B[33m" +agge+ " года \u001B[0m не знает, кто такой это ваш Юлиус");
    }

    @Override
    public void hz() {
        System.out.println("HZ from " + this.getClass());
    }

}
