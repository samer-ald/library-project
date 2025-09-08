package com.mycompany.library.project;

import java.util.Date;
import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<Item> items = new ArrayList<>();
    private ArrayList<Member> members = new ArrayList<>();
    private static final int MAXBORROWDAYS = 7;

    private Item findItem(String id) {//                                                                 samer
        for (Item i : items) {
            if (i.getId().equals(id)) {
                return i;
            }
        }
        return null;
    }

    private Member findMember(String id) {//                                                             samer
        for (Member m : members) {
            if (m.getId().equals(id)) {
                return m;
            }
        }
        return null;
    }

    public void addMember(Member member) {//                                                             samer
        if (member == null) {
            System.out.println("you can't add null member   ");
            return;
        }
        for (Member m : members) {
            if (m.getId().equals(member.getId())) {
                System.out.println("member id is used   ");
                return;
            }
        }
        members.add(member);
        System.out.println(member.getName() + " has been added to the library \n Welcom!");
    }

    public void displayTheBooks() {//                                                                     eyas
        int c = 0;
        for (Item item : items) {
            if (item instanceof Book) {
                c++;
            }
        }
        if (c > 0) {
            for (Item item : items) {
                if (item instanceof Book) {
                    System.out.println("[" + item.getTitle() + "]" + "  By: " + ((Book) item).getAuthor() + " || ID: " + item.getId());
                }

            }
        } else {
            System.out.println("sorry we have no Books");
        }
    }

    public void listBorrowedByMembers() {//                                                              samer
        for (Member m : members) {
            if (!m.getBorrowedItems().isEmpty()) {
                System.out.println("\nMember: " + m.getName());
                for (Item item : m.getBorrowedItems()) {
                    item.displayInfo();
                }
            }
        }
    }

    public void addToLibrary(Item item) {//                                                             shahd
        if (item == null) {
            System.out.println("you can't add null item   ");
            return;
        }

        for (Item existing : items) {
            if (existing.getId().equals(item.getId())) {
                System.out.println("item id is used   ");
                return;
            }
        }

        items.add(item);

        if (item instanceof Book) {
            System.out.println(item.getTitle() + " book added to library ");
        } else if (item instanceof Project) {
            System.out.println(item.getTitle() + " project added to library  ");
        }
    }

    public void searchByIdOrTitleOrSpecialization(String x) {//                                          samer
        boolean found = false;
        for (Item item : items) {
            if (item.getId().equalsIgnoreCase(x) || item.getTitle().equalsIgnoreCase(x) || item.getspecialization().equalsIgnoreCase(x)) {
                System.out.println("Found:");
                item.displayInfo();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Not found!!");
        }
    }

    public void borrowItem(String memberId, String itemId) {//                                            eyas
        Member member = findMember(memberId);
        Item item = findItem(itemId);

        if (member != null && item != null) {
            if (item.isBorrowed()) {
                System.out.println("This item is already borrowed!");
                return;
            }

            if (member.borrowItem(item)) {
                item.borrow();
                System.out.println(member.getName() + " Borrowed: " + item.getTitle());
            } else {
                System.out.println("Sorry Limit reached or item unavailable");
            }
        } else {
            System.out.println("member or item not found");
        }
    }

    public void returnItem(String memberId, String itemId) {//                                            samer
        Member member = findMember(memberId);
        Item item = findItem(itemId);
        if (member != null && item != null) {
            if (member.returnItem(item)) {
                item.returnItem();
                System.out.println("Returned: " + item.getTitle());
            } else {
                System.out.println(member.getName() + " is not borrowed " + item.getTitle());
            }
        } else {
            System.out.println("member ID or item ID is wrong");
        }

    }

    public void displayProjectsByLevel(String level) {//                                                   shahd
        boolean found = false;

        for (Item item : items) {
            if (item instanceof Project) {
                Project project = (Project) item;
                if (project.getLevel().equalsIgnoreCase(level)) {
                    project.displayInfo();
                    found = true;
                }
            }
        }
    }

    public void showMembersBySpec(String specialization) {//                                               shahd
        boolean found = false;

        for (Member member : members) {
            for (Item item : member.getBorrowedItems()) {
                if (item.getspecialization().equalsIgnoreCase(specialization)) {
                    System.out.println("member: " + member.getName() + " / ID: " + member.getId());
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("no one boeeowed " + specialization + ".");
        }
    }

    public void allBorrowedBooks() {//                                                                       eyas
        boolean found = false;
        int bookCount = 1;
        for (Member m : members) {
            for (Item i : m.getBorrowedItems()) {
                if (i instanceof Book) {
                    System.out.println(bookCount + ")" + "the Book: " + i.getTitle());
                    bookCount++;
                }
                found = true;
            }
        }

        if (!found) {
            System.out.println("There is no Borrowed Items");
        }
    }

    public void listAvailableProjectsByspecialization(String specialization) {//                             shahd
        boolean found = false;

        for (Item item : items) {
            if (item instanceof Project && item.getspecialization().equalsIgnoreCase(specialization)) {
                boolean isBorrowed = false;

                for (Member m : members) {
                    if (m.getBorrowedItems().contains(item)) {
                        isBorrowed = true;
                        break;
                    }
                }

                if (!isBorrowed) {
                    item.displayInfo();
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("not found");
        }
    }

    public void listLateReturns() {//                                                                         samer
        Date now = new Date();
        for (Member m : members) {
            for (Item item : m.getBorrowedItems()) {
                Date borrowDate = m.getBorrowDates().get(item);
                long days = (now.getTime() - borrowDate.getTime()) / 86400000L;//1000*60*60*24
                if (days > MAXBORROWDAYS) {
                    System.out.println("Late: " + m.getName() + " - " + item.getTitle());
                }

            }
        }
    }

    public void listMembersWhoBorrowedBookInPeriod(String bookId, Date start, Date end) {//                    eyas
        Item item = findItem(bookId);
        if (item == null) {
            System.out.println("Item not found!");
            return;
        }

        boolean found = false;

        for (Member m : members) {

            Date borrowDate = m.getBorrowDates().get(item);

            if (borrowDate != null) {
                if (!borrowDate.before(start) && !borrowDate.after(end)) {
                    System.out.println("Member: " + m.getName() + " | ID: " + m.getId());
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("No member borrowed this book in the given period.");
        }
    }

}
//samer/shahd/eyas
