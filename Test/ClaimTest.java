package Test;
import backend.Customer;
import backend.Claim;

import java.awt.*;
import java.util.Scanner;

public class ClaimTest {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Create a claim test:");



        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

                boolean containsLetter = false;
                for (int i = 0; i < input.length(); i++) {
                    if (Character.isLetter(input.charAt(i))) {
                        containsLetter = true;
                        break;
                    }
                }

                System.out.println("Contains letter: " + containsLetter);
            }
        }

    }
}
