package com.mycompany.library.project;

import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Library lib = new Library();

        Scanner sc = new Scanner(System.in);

        Member m1 = new Member("m1", "samer");
        Member m2 = new Member("m2", "eyas");
        Member m3 = new Member("m3", "shahed");
        Member m4 = new Member("m4", "Tahseen");
        Member m5 = new Member("m5", "Abdo");
        Member m6 = new Member("m6", "Mouayad ");

        lib.addMember(m1);
        lib.addMember(m2);
        lib.addMember(m3);
        lib.addMember(m4);
        lib.addMember(m5);
        lib.addMember(m6);

        Book b1 = new Book("b1", "Java", 2012, "Programming", "Dr.Abd Alrahman", "Damscus library", 200);
        Book b2 = new Book("b2", "Data", 2013, "Computer Science", "Ahmed", "Damscus library", 300);
        Book b3 = new Book("b3", "AI", 2014, "AI", "Omar", "Damscus library", 400);
        Book b4 = new Book("b4", "Python", 2015, "Programming", "Mouayad", "Damscus library", 550);
        Book b5 = new Book("b5", "Skils", 2016, "Computer Science", "George", "Damscus library", 350);
        Book b6 = new Book("b6", "Tools", 2017, "AI", "Ammar", "Damscus library", 370);

        lib.addToLibrary(b1);
        lib.addToLibrary(b2);
        lib.addToLibrary(b3);
        lib.addToLibrary(b4);
        lib.addToLibrary(b5);
        lib.addToLibrary(b6);

        Project p1 = new Project("p1", "Smart Home", 2022, "AI", "Team A", "Fourth");
        Project p2 = new Project("p2", "AI Chatbot", 2023, "AI", "Team B", "Fifth");
        Project p3 = new Project("p3", "Solar Car", 2021, "Computer Science", "Team C", "Third");
        Project p4 = new Project("p4", "Robot", 2022, "AI", "Team D", "Fourth");
        Project p5 = new Project("p5", "Project P2", 2023, "Programming", "Team E", "Fifth");
        Project p6 = new Project("p6", "project P3", 2021, "Programming", "Team F", "Third");

        lib.addToLibrary(p1);
        lib.addToLibrary(p2);
        lib.addToLibrary(p3);
        lib.addToLibrary(p4);
        lib.addToLibrary(p5);
        lib.addToLibrary(p6);

        lib.borrowItem("m1", "b1");
        lib.borrowItem("m2", "p1");
        lib.borrowItem("m3", "b2");
        lib.borrowItem("m3", "p2");

        System.out.println("___________________________________________________________");
        System.out.println("");
        System.out.println("");
        System.out.println("                       *     *****   ");
        System.out.println("                       *         *   ");
        System.out.println("                       *         *   ");
        System.out.println("                       *     *****   ");
        System.out.println("                       *     *       ");
        System.out.println("                       *     *       ");
        System.out.println("                       *     *****   ");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("                      YOU'RE THE BEST");
        System.out.println("");
        System.out.println("                       GIVE US A 12");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println("___________________________________________________________");

        System.out.println("                      Hi MR. Mouayad \n                  Welcom to our Library!!");

        while (true) {

            System.out.println("  //Library Menu//");
            System.out.println("1)  Add Book");
            System.out.println("2)  Add Project");
            System.out.println("3)  Add Member");
            System.out.println("4)  Borrow Item");
            System.out.println("5)  Return Item");
            System.out.println("6)  List All Books");
            System.out.println("7)  Show Borrowed Items && Members");
            System.out.println("8)  Show Late Returns");
            System.out.println("9)  List Projects by Level");
            System.out.println("10) List All Borrowed Books");
            System.out.println("11) List Available Projects by specialization");
            System.out.println("12) List Members Who Borrowed by specialization");
            System.out.println("13) List Members Who Borrowed Specific Book in Period");
            System.out.println("14) Search Book/Project by ID or Title or specialaization");
            System.out.println("0)  Exit");
            System.out.println("");

            int Choice;
            while (true) {
                System.out.print("Choose: ");
                if (sc.hasNextInt()) {
                    Choice = sc.nextInt();
                    break;
                } else {
                    System.out.println("");
                    System.out.println("Please enter an int");
                    sc.next();
                    System.out.println("");
                }
            }

            System.out.println("");
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
            System.out.println("");

            switch (Choice) {

                case 1:

                    System.out.println("< Enter book information >");

                    System.out.print("ID: ");
                    String bid = sc.next();
                    System.out.print("Title: ");
                    String btitle = sc.next();
                    
                    int byear;
                    while (true) {
                System.out.print("Year: ");
                if (sc.hasNextInt()) {
                    byear = sc.nextInt();
                    break;
                } else {
                    System.out.println("");
                    System.out.println("Please enter an int");
                    sc.next();
                    System.out.println("");
                }
            }  
//                    System.out.print("Year: ");
//                    int byear = sc.nextInt();
                      sc.nextLine();
                    System.out.print("specialization: ");
                    String bcat = sc.next();
                    System.out.print("Author: ");
                    String auth = sc.next();
                    System.out.print("Publisher: ");
                    String pub = sc.next();
                    
                         int pages;
                    while (true) {
                System.out.print("Pages: ");
                if (sc.hasNextInt()) {
                    pages = sc.nextInt();
                    break;
                } else {
                    System.out.println("");
                    System.out.println("Please enter an int");
                    sc.next();
                    System.out.println("");
                }
            }  
                    
//                    System.out.print("Pages: ");
//                    int pages = sc.nextInt();
                    sc.nextLine();
                    System.out.println("");
                    System.out.println("");
                    lib.addToLibrary(new Book(bid, btitle, byear, bcat, auth, pub, pages));
                    System.out.println("");
                    System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
                    break;

                case 2:

                    System.out.println("< Enter project information >");

                    System.out.print("ID: ");
                    String pid = sc.next();
                    System.out.print("Title: ");
                    String ptitle = sc.next();
                    System.out.print("Year: ");
                    int pyear = sc.nextInt();
                    sc.nextLine();
                    System.out.print("specialization: ");
                    String pcat = sc.next();
                    System.out.print("Team: ");
                    String team = sc.next();
                    System.out.print("Level: ");
                    String level = sc.next();
                    System.out.println("");
                    System.out.println("");
                    lib.addToLibrary(new Project(pid, ptitle, pyear, pcat, team, level));
                    System.out.println("");
                    System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
                    break;

                case 3:

                    System.out.println("< Enter member information >");

                    System.out.print("ID: ");
                    String mid = sc.next();
                    System.out.print("Name: ");
                    String mname = sc.next();
                    System.out.println("");
                    System.out.println("");
                    lib.addMember(new Member(mid, mname));
                    System.out.println("");
                    System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
                    break;

                case 4:

                    System.out.println("< Enter >");
                    System.out.print("Member ID: ");
                    String memId = sc.next();
                    System.out.print("Item ID: ");
                    String itemId = sc.next();
                    System.out.println("");
                    System.out.println("");
                    lib.borrowItem(memId, itemId);
                    System.out.println("");
                    System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
                    break;

                case 5:

                    System.out.println("< Enter >");
                    System.out.print("Member ID: ");
                    String memIdR = sc.next();
                    System.out.print("Item ID: ");
                    String itemIdR = sc.next();
                    System.out.println("");
                    System.out.println("");
                    lib.returnItem(memIdR, itemIdR);
                    System.out.println("");
                    System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");

                    break;

                case 6:

                    System.out.println("the Books: ");
                    System.out.println("");
                    System.out.println("");
                    lib.displayTheBooks();
                    System.out.println("");
                    System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
                    break;

                case 7:

                    System.out.println("");
                    System.out.println("");
                    lib.listBorrowedByMembers();
                    System.out.println("");
                    System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
                    break;

                case 8:

                    System.out.println("Late Returns: ");
                    System.out.println("");
                    System.out.println("");
                    lib.listLateReturns();
                    System.out.println("");
                    System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
                    break;

                case 9:

                    System.out.print("Level: ");
                    String lev = sc.next();
                    System.out.println("");
                    System.out.println("The project by level " + lev);
                    System.out.println("");
                    lib.displayProjectsByLevel(lev);
                    System.out.println("");
                    System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
                    break;

                case 10:

                    System.out.println("all Borrowed Items: ");
                    System.out.println("");
                    System.out.println("");
                    lib.allBorrowedBooks();
                    System.out.println("");
                    System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
                    break;

                case 11:

                    System.out.print("specialization: ");
                    String avb = sc.next();
                    System.out.println("");
                    System.out.println("The Available Projects By specialization " + avb);
                    System.out.println("");
                    lib.listAvailableProjectsByspecialization(avb);
                    System.out.println("");
                    System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
                    break;

                case 12:

                    System.out.print("specialization: ");
                    String c = sc.next();
                    System.out.println("");
                    System.out.println("");
                    lib.showMembersBySpec(c);
                    System.out.println("");
                    System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
                    break;

                case 13:

                    System.out.print("Book ID: ");
                    String bookIdSimple = sc.next();
                    System.out.println("Enter start date:");
                    System.out.print("Day: ");
                    int startDay = sc.nextInt();
                    System.out.print("Month: ");
                    int startMonth = sc.nextInt();
                    System.out.print("Year: ");
                    int startYear = sc.nextInt();
                    System.out.println("");
                    System.out.println("Enter end date:");
                    System.out.print("Day: ");
                    int endDay = sc.nextInt();
                    System.out.print("Month: ");
                    int endMonth = sc.nextInt();
                    System.out.print("Year: ");
                    int endYear = sc.nextInt();
                    Date startDate = new Date(startYear - 1900, startMonth - 1, startDay);
                    Date endDate = new Date(endYear - 1900, endMonth - 1, endDay);
                    System.out.println("   ");
                    System.out.println("The Members Who Borrowed Book In Period  Between " + startDay + "\\" + startMonth + "\\" + startYear + " and " + endDay + "\\" + endMonth + "\\" + endYear + " :");
                    System.out.println("   ");
                    lib.listMembersWhoBorrowedBookInPeriod(bookIdSimple, startDate, endDate);
                    System.out.println("");
                    System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
                    break;

                case 14:

                    System.out.print("Enter ID, Title, or Specialization to search: ");
                    String query = sc.next();
                    System.out.println("");
                    System.out.println("");
                    lib.searchByIdOrTitleOrSpecialization(query);
                    System.out.println("");
                    System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
                    break;

                case 0:

                    System.out.println("------------------------------------       _________________________");
                    System.out.println("|                                  |      |         LIBRARY         |");
                    System.out.println("|   Thanks for using our program   |      |_________________________|");
                    System.out.println("|                                  |      | [] [] [] [] [] [] [] [] |");
                    System.out.println("|             Coded by:            |      | [] [] [] [] [] [] [] [] |");
                    System.out.println("|       SHAHD / SAMER / EYAS       |      | [] [] [] [] [] [] [] [] |");
                    System.out.println("|                                  |      | [] [] [] [] [] [] [] [] |");
                    System.out.println("|              (*^_^*)             |      | [] [] [] [] [] [] [] [] |");
                    System.out.println("------------------------------------      |_________________________|");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");

                    return;

                default:

                    System.out.println("");
                    System.out.println("");
                    System.out.println("Enter a Correct Choice!!");
                    System.out.println("");
                    System.out.println("");

            }
        }

    }

}
//samer/eyas/shahd
