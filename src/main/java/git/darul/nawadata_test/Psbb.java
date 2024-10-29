package git.darul.nawadata_test;

import java.util.Scanner;

public class Psbb {
    public static void psbb() {
        Scanner scanner = new Scanner(System.in);
        int countFamily = scanner.nextInt();
        scanner.nextLine();

        String[] familyMembers = scanner.nextLine().split(" ");
        if (familyMembers.length != countFamily) {
            System.out.println("Input must be equal with count of family");
            return;
        }

        int buses = 0;
        for (int i = 0; i < familyMembers.length; i++) {
            int familySize = Integer.parseInt(familyMembers[i]);

            if (familySize >= 4) {
                buses += familySize / 4;
                familyMembers[i] = String.valueOf(familySize % 4);
            }
        }
        for (int i = 0; i < familyMembers.length; i++) { // Perubahan di sini
            if (!familyMembers[i].equals("0")) {
                int familySize = Integer.parseInt(familyMembers[i]);
                if (i == familyMembers.length - 1) {
                    buses++;
                } else {
                    int familySize2 = Integer.parseInt(familyMembers[i + 1]);
                    int result = familySize + familySize2;
                    if (result >= 4) {
                        familyMembers[i] = String.valueOf(0);
                        familyMembers[i + 1] = String.valueOf(result - 4);
                    } else {
                        familyMembers[i] = String.valueOf(0);
                        familyMembers[i + 1] = String.valueOf(0);
                    }
                    buses++;
                }

            }
        }

        System.out.println("Minimum number of buses required: " + buses);
    }
}
