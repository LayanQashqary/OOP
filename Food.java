/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conferencemanagement;

import java.util.Scanner;

/**
 *
 * @author Rawan
 */
public abstract class Food {

    String[] mainCourse;
    String[] dessertCourse;
    String[] appetizersCourse;
    String[] order = new String[100];
    int orderNum;
    Scanner input = new Scanner(System.in);
    int choice;

    public abstract double foodPrice(int gustesNum);

    public void DisplayMainCourse() {
        for (int i = 0; i < mainCourse.length; i++) {
            System.out.println(i + 1 + "-" + mainCourse[i]);
        }
    }

    public void DisplayDessertCourse() {
        for (int i = 0; i < dessertCourse.length; i++) {
            System.out.println(i + 1 + "-" + dessertCourse[i]);
        }
    }

    public void DisplayAppetizersCourse() {
        for (int i = 0; i < appetizersCourse.length; i++) {
            System.out.println(i + 1 + "-" + appetizersCourse[i]);
        }
    }

    public String DisplayOrder() {
        String f = "Food service will contain:\n";
        for (int i = 0, j = 0; i < orderNum; i++) {
            if (order[i].equalsIgnoreCase("")) {
                continue;
            } else {
                f = f + (" " + ++j + "- " + order[i]);

            }
        }
        return f;
    }

    public void addcourse() {
        while (choice != 4) {
            int orderCh = 0;
            System.out.println("▶Choose course to add to your order\n"
                    + "1-Main\n"
                    + "2-Appetizers\n"
                    + "3-Dessert\n"
                    + "4-Stop adding"
            );

            choice = input.nextInt();
            switch (choice) {

                case 1: {

                    this.DisplayMainCourse();
                    System.out.println("▶How many types of the main courses above you want?");
                    int r = input.nextInt();
                    int i = 0;

                    for (i = 0; i < r; i++, orderNum++) {
                        System.out.print("☛your choice is:");
                        orderCh = input.nextInt();
                        try {
                            if (orderCh != 0) {
                                order[orderNum] = mainCourse[orderCh - 1];
                            } else {
                                order[orderNum] = "";
                            }
                        } catch (ArrayIndexOutOfBoundsException e) {
                            System.err.println("WRONG INPUT");
                            i--;
                        }

                    }

                    break;
                }
                //end case 1 ArrayIndexOutOfBoundsException e
                case 2: {
                    try {
                        this.DisplayAppetizersCourse();
                        System.out.println("▶How many types of the appetizer courses above you want?");
                        int r = input.nextInt();
                        for (int i = 0; i < r; i++, orderNum++) {
                            System.out.print("☛your choice is:");
                            orderCh = input.nextInt();
                            try {
                                if (orderCh != 0) {
                                    order[orderNum] = appetizersCourse[orderCh - 1];
                                } else {
                                    order[orderNum] = "";
                                }
                            } catch (ArrayIndexOutOfBoundsException e) {
                                System.err.println("WRONG INPUT");
                                i--;
                            }

                        }
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.err.println("WRONG INPUT");
                        input.nextLine();
                    }

                    break;
                }
                case 3: {

                    this.DisplayDessertCourse();
                    System.out.println("▶How many types of the dessert courses above you want?");
                    int r = input.nextInt();
                    for (int i = 0; i < r; i++, orderNum++) {
                        System.out.print("☛your choice is:");
                        orderCh = input.nextInt();
                        try {
                            if (orderCh != 0) {
                                order[orderNum] = dessertCourse[orderCh - 1];
                            } else {
                                order[orderNum] = "";
                            }
                        } catch (ArrayIndexOutOfBoundsException e) {
                            System.err.println("WRONG INPUT");
                            i--;
                        }
                    }

                    break;
                }
                case 4:
                    break;
                default:
                    System.err.println("WRONG INPUT");
            }

        }

    }

}
