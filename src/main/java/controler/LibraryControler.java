package controler;

import DAO.Repository;
import model.Book;
//import model.Member;

import java.util.HashSet;
import java.util.Scanner;

public class LibraryControler {

    public boolean start() {
        Scanner scanner = new Scanner(System.in);
        Boolean flag = false;
        Repository repository = new Repository();
        System.out.println("please enter one of following cammands" + "\n" + "addBook " + "deleteBook " + "bookSearch " + "booklist " + "exit ");
        String command = scanner.nextLine();

        switch (command.toLowerCase()) {


            case "addbook": {
                System.out.println("please enter name of book");
                String book_name;
                book_name = scanner.nextLine();
                System.out.println("please enter name of auther");
                String auther_name = scanner.nextLine();
                if (repository.addBook(new Book(book_name, auther_name)))
                    System.out.println("successfully added");
                else
                    System.out.println("the library id full. cant add");
                return false;

            }


            case "deletebook": {
                System.out.println("please enter books'name");
                String book_name = scanner.nextLine();
                int book_serial;
                System.out.println("plese enter the books serial number");
                try {
                    book_serial = Integer.parseInt(scanner.nextLine());
                    if (repository.deleteBook(book_name, book_serial))
                        System.out.println("successfully deledted");
                    else
                        System.out.println("Book name and serial number do not match ");
                } catch (NumberFormatException e) {
                    System.out.println("you have entered wrong format as serial number");
                } finally {
                    return false;

                }
            }
            case "booksearch": {
                boolean flag2 = true;
                String input_bookname, input_authername, input;
                do {
                    System.out.println("wich one do you prefer? search by book's name:press 1 \nsearch by outher's name:press 2");
                    input = scanner.nextLine();

                    if (input.equals("1")) {
                        System.out.println("enter the book's name");
                        input_bookname = scanner.nextLine();
                        if (!repository.searchByName(input_bookname))
                            System.out.println("there is no book by this name");
                    } else if (input.equals("2")) {
                        System.out.println("enter the auther's name");
                        input_authername = scanner.nextLine();
                        if (!repository.searchByAuthor(input_authername))
                            System.out.println("there is no book by this name");
                    } else {
                        System.out.println("invalid enterance.try again");
                        flag2 = false;
                    }
                } while (!flag2);
                return false;
            }


            case "booklist": {
                 repository.getBooks();
                return false;
            }


            default: {
                if (!command.equals("exit")) {
                    System.out.println("invalid enterance. try again");
                    return false;
                } else {
                    return true;
                }
          /*  case "memberlist": {
                repository.showMembers();
                return false;
            }*/
            }

        }

    }
}












   /* public static void showMembers() {
        for (Member m : member_list) {
            System.out.println(m.getName() + " " + m.getId());

        }
    }

        public void memberSearchByName(String name) {
        boolean flag = false;
        for (Member m : member_list) {
            if (m.getName().equals(name)) {
                System.out.println("user " + name + " with " + m.getId() + " id number");
                flag = true;
                System.out.println("ajab khari");
                break;
            }
        }
            if (!flag)
                System.out.println("There is no account with this name");
        }


       public void memberSearchById(int id) {
        boolean flag = false;
        for (Member m : member_list) {
            if (m.getId() == id) {
                System.out.println("user " + id + " with name " + m.getName());
                flag = true;

            }
        }
            if (!flag)
                System.out.println("There is no account with this Id");
        }
*/

     /*  public void addMember(String name) {
        int id;
        Member member = new Member(name);
        member_list.add(new Member(name));
        id = member.hashCode();
        member.setId(id);
        System.out.println("successfully added");

    }*/

   /* public void deleteMember(int id) {
        for (Member l : member_list) {
            if (l.getId() == id) {
                member_list.remove(l);
                System.out.println("member removed successfully");
            }
        }

    }*/
   /* public void editMembersName(String name, int id) {
        for (Member l : member_list) {
            if (l.getId() == id) {
                l.setName(name);
                System.out.println("members name edited successfully");
            }

        }

    }*/

  /*  public void editMembersId(String name, int id) {
        for (Member l : member_list) {
            if (l.getName().equals(name)) {
                l.setId(id);
                System.out.println("members id edited successfully");
            }

        }

    }*/
     /*           case "membersearch": {
                boolean flag2 = false;
                int input, input_id;
                String input_name;
                do {
                    System.out.println("wich one do you prefer? search by id:press 1 \nsearch by name:press 2");
                    input = scanner.nextInt();
                    scanner.nextLine();

                    if (input == 1) {
                        System.out.println("enter the id");
                        input_id = scanner.nextInt();
                        scanner.nextLine();
                        repository.memberSearchById(input_id);
                        flag = true;
                    } else if (input == 2) {
                        System.out.println("enter the name");
                        input_name = scanner.nextLine();
                        System.out.println(input_name);
                        repository.memberSearchByName(input_name);

                        flag2 = true;
                    } else {
                        System.out.println("invalid enterance.try again");
                    }
                } while (!flag);
                return false;
            }*/
 /*           case "deletemember": {
                System.out.println("please enter the books'id");
                repository.deleteMember(scanner.nextInt());
                return false;
            }*/
    /*            case "addmember": {
                System.out.println("please enter member's name");
                repository.addMember(scanner.nextLine());
                return false;
            }*/

