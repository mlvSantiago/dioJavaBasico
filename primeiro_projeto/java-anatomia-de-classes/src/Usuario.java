public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smarTv = new SmartTv();
        System.out.println("A TV esta ligada?" + smarTv.ligada);//concatenando a frase com o estado atrvez do ''+''
        System.out.println("Qual o canal ?" + smarTv.canal);
        System.out.println("Qual o volume ?" + smarTv.volume);

        smarTv.ligar();
        System.out.println("Novo status -- A TV esta ligada?" + smarTv.ligada);
        
        

        smarTv.diminuir();
        smarTv.diminuir();
        smarTv.diminuir();
        smarTv.aumentarvolume();
        System.out.println("Novo status -- Qual o volume ?" + smarTv.volume);

        smarTv.aumentarmudarcanal();
        System.out.println("Novo status canal -- Qual o canal ?" + smarTv.canal);
        smarTv.mudarcanal(13);
        System.out.println("Novo status -- Qual o canal ?" + smarTv.canal);
        

    }
}

