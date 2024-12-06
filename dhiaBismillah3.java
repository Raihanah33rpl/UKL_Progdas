public class dhiaBismillah3 {

    public static void main(String[] args) {
        
        for (int i = 50; i >= 1; i--) {
           if (i == 1) {  //jika nilai i sm dngan 1 
            System.out.println(i + " saya senang");
           }else if (i % 3 == 0) {  //jika i hbs dibgi 3 dn hsilny 0 
                System.out.println(i + " saya angkatan 33");
           }else if (i % 2 == 0) {   //jika nilai i hbs dibgi 2 dn hsilny 0
                System.out.println(i + " saya anak moklet");
           }else {
            System.out.println(i + " saya anak wikusama"); //jika tdk memenuhi kndisi sblmny 
           }
        }
    }
}