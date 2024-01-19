// public class UserArgument {
//      public static void main(String[] args) {
//         System.out.print("Hi, ");
//         // Argument number 0 - name
//         System.out.print(args[0]);
//         System.out.println(". How are you?");
//         // New line
//         System.out.print("It's ");
//         // Argument number 1 - day of week
//         System.out.print(args[1]);
//         System.out.println("!");
//     }
// }

public class UserArgument {
    public static void main(String[] args) {
        for (int x = 2; x >= 0; x--) {
            System.out.print("Hi, ");
            System.out.print(args[x]);
            System.out.println(". How are you?");
        }
   }
}
