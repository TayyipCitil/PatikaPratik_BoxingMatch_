public class Main {
    public static void main(String[] args) {
        //iki tane boksör oluşturduk
        Boxer boxer1 = new Boxer("Blue", 66, 150, 200);
        Boxer boxer2 = new Boxer("Red", 60, 120, 25);
        // müsabaka ayarladık
        Match matchFinal = new Match(boxer1, boxer2, 70, 60, 12);
        matchFinal.startMatch();

    }
}