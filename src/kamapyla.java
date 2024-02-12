public class kamapyla {
    int bulls = 15;
    public void pisa(int strelalki){
        bulls = 7 - strelalki;
        System.out.print("Пистолет сделал Пиу-пиу. ");
        System.out.print("Осталось \u001B[31m" + bulls +"\u001B[0m пулек/пульки.");
    }
}
