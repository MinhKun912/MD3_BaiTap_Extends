package bai4;

import java.util.Scanner;

public class Main {
    private static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        Triagle triagle = getTriagle();
        System.out.print("nhập màu: ");
        triagle.setColor(sc.nextLine());
        System.out.print("có muốn fill không Y/N: ");
        String option = sc.nextLine();
        switch (option) {
            case "y":
            case "Y":
                break;
            default:
                triagle.setFilled(false);
                break;
        }
        System.out.println("\n \n" + triagle.toString());

    }

    private static Triagle getTriagle() {
        System.out.print("nhập 3 cạnh a,b,c: ");
        String input = sc.nextLine();
        if (!input.matches("^(?:[0-9],){2}[0-9]")) {
            System.out.println("không hợp lệ");
            System.out.print("nhập 3 cạnh a,b,c: ");
            input = sc.nextLine();
        }
        String[] triagle = input.split(",");
        Triagle outTriagle = new Triagle(
                Double.parseDouble(triagle[0]),
                Double.parseDouble(triagle[1]),
                Double.parseDouble(triagle[2])
        );
        if (!outTriagle.isValid()) {
            System.out.println("tam giác không hợp lệ!");
            outTriagle = getTriagle();
        }
        return outTriagle;
    }
}
