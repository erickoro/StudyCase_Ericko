public class StudyCase {
    public static void main(String[] args) {
        if (args.length == 3) {
            int bil1 = Integer.parseInt(args[0]);
            int bil2 = Integer.parseInt(args[1]);
            int bil3 = Integer.parseInt(args[2]);
            
            int multiplier = 1;
            int result;
            
            for (int i = 0; i < 1; i++) {
                result = bil1 * bil2 * bil3 * multiplier;
                System.out.println("Hasil perkalian: " + result);
                
                if (result % 2 == 0) {
                    System.out.println("Hasil ini adalah bilangan genap.");
                } else {
                    System.out.println("Hasil ini adalah bilangan ganjil.");
                }
                
                multiplier++;
            }
        }
        
        else if (args.length == 2) {
            int bil1 = Integer.parseInt(args[0]);
            int bil2 = Integer.parseInt(args[1]);
            
            int multiplier = 1;
            int result;
            
            for (int i = 0; i < 1; i++) {
                result = bil1 * bil2 * multiplier;
                System.out.println("Hasil perkalian: " + result);
                
                if (result % 2 == 0) {
                    System.out.println("Hasil ini adalah bilangan genap.");
                } else {
                    System.out.println("Hasil ini adalah bilangan ganjil.");
                }
                
                multiplier++;
            }
        }

        else {
            System.out.println("Error gan. Coba lagi yakk!!!");
            return;
        }
    }
}