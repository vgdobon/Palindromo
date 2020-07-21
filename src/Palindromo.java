public class Palindromo {
    String palabra;
    String palabraSinEspacios="";
    char [] src ;
    char [] dst;


    public Palindromo(String palabra){
        this.palabra  = palabra ;
        int espacios=0;
        char espacio = ' ';


        for (int i = 0; i < palabra.length(); i++) {
            if(palabra.charAt(i)==espacio){
                espacios++;
            }else{
                palabraSinEspacios=""+palabraSinEspacios+palabra.charAt(i);

            }
        }

        this.src = new char[palabraSinEspacios.length()];
        this.dst = new char[palabraSinEspacios.length()];

        for (int i = 0; i < palabraSinEspacios.length(); i++) {
                this.src[i]=palabraSinEspacios.charAt(i);
                this.dst[i]=palabraSinEspacios.charAt(i);
            }

        }


    public void draw(){
        for (int i = 0; i <src.length; i++) {
            System.out.print(src[i]);

        }

        for (int i = 0; i < dst.length; i++) {
            System.out.print(dst[i]);
        }
        ;
    }

    public boolean comprobar(){
        for (int i = 0; i < src.length; i++) {
            if(src[i]!=dst[dst.length-1-i]){
                return false;
            }
        }
        return true;
    }
}
