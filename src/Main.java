public class Main {


    public static void main(String[] args) {
    Klal k = new Klal();
    k.age = 40-(54-79);
    k.fly();

    int pulia = (int) (Math.random() * 11);

    kamapyla ka = new kamapyla();
        ka.pisa(pulia);

        Baby bab = new Baby();
        var x = (int) (Math.random() * (60 - 5 + 1)) + 5;
        bab.babiyoda(x);
        zhivotnoe Coi = new zhivotnoe();
        var z = (int) (Math.random() * 11);
        Coi.zhiv(z);
        Coi.ElseDoSmt();

        int rer = (int) (Math.random() * 20) + 1;

        OldPeople fresc = new OldPeople();
        if (rer < 6){
            fresc.hz();
        }else{
            System.out.print("");
        }
        fresc.lol(rer);
        frek fig = new frek();
        fig.agge = 44;
        fig.frik();
    }
}