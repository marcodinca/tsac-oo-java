public class Homework {
    
    public static void contaMonete(int n) {
        int nCinqueCento = 0;
        int nDueCento = 0;
        int nCento = 0;
        int nCinquanta = 0;
        int nVenti = 0;
        int nDieci = 0;
        int nCinque = 0;
        int nDue = 0;
        int nUno = 0;
        
        while(n>=500) {
            nCinqueCento++;
            n -= 500;
        }
        while(n>=200) {
            nDueCento++;
            n -= 200;
        }
        while(n>=100) {
            nCento++;
            n -= 100;
        }
        while(n>=50) {
            nCinquanta++;
            n -= 50;
        }
        while(n>=20) {
            nVenti++;
            n -= 20;
        }
        while(n>=10) {
            nDieci++;
            n -= 10;
        }
        while(n>=5) {
            nCinque++;
            n -= 5;
        }
        while(n>=2) {
            nDue++;
            n -= 2;
        }
        System.out.println( "500] " + nCinqueCento + "\n" +
                            "200] " + nDueCento + "\n" +
                            "100] " + nCento + "\n" +
                            " 50] " + nCinquanta + "\n" +
                            " 20] " + nVenti + "\n" +
                            " 10] " + nDieci + "\n" +
                            "  5] " + nCinque + "\n" +
                            "  2] " + nDue + "\n" +
                            "  1] " + n);
    }

    public static void main(String[] args) {
        contaMonete(1742);
    }
}
