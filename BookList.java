import java.util.*;
class BookStore{
    String name;
    int price;
    String author_name;
    int ISBN_number;


    public void setname(String name){
        this.name = name;
    }

    public String getname(){
        return name;
    }

    public void setprice(int price){
        this.price = price;
    }

    public int getprice(){
        return price;
    }

    public void setauthor_name(String author_name){
        this.author_name = author_name;
    }

    public String getauthor_name(){
        return author_name;
    }

    public void setISBN_number(int ISBN_number){
        this.ISBN_number = ISBN_number;
    }

    public int getISBN_number(){
        return ISBN_number;
  }
}


public class BookList {
    static  ArrayList<BookStore> b= new ArrayList<BookStore>();
    static Scanner sc = new Scanner(System.in);
    public static void main (String[] args)
    {
        Boolean f=true;
        while(f){
            System.out.println("Choose any option");
            System.out.println("1. Insert\t2. Update\t3. Search\t4. Delete\t5. Dispaly\tExit");
            String c= sc.nextLine();
            switch(c)
            {
                case "1":
                    insert();
                break;

                case "2":
                System.out.println("Enter the ISBN number of the book for which you want to update the record. ");
                int isbn = Integer.parseInt(sc.nextLine());
                update(isbn);
                break;

                case "3":
                System.out.println("Enter the name of the book: ");
                String name = sc.nextLine();
                search(name);
                break;

                case "4":
                System.out.println("enter ISBN number of the book");
                int isbn2 = Integer.parseInt(sc.nextLine());
                delete(isbn2);
                break;

                case "5":
                System.out.println("Book\tAuthor\tPrice\tISBN");
                for(BookStore j:b){
                        System.out.println(j.getname()+"\t"+j.getauthor_name()+"\t"+j.getprice()+"\t"+j.getISBN_number());
                }
                break;

                case "exit":
                f=false;
                break;
            }
        }
        sc.close();
    } 
    static void insert(){
        BookStore c1= new BookStore();
                System.out.print("Enter the name : ");
                c1.setname(sc.nextLine());
                System.out.print("Enter the Author name : ");
                c1.setauthor_name(sc.nextLine());
                System.out.print("Enter the price : ");
                c1.setprice(Integer.parseInt(sc.nextLine()));
                System.out.print("Enter the ISBN Number : ");
                c1.setISBN_number(Integer.parseInt(sc.nextLine()));
                b.add(c1);
    }  
    static void update(int isbn){
        boolean r=false;
        for(BookStore s: b)
        {
            if(s.ISBN_number==isbn)
            {
                System.out.print("Enter the name : ");
                String name1 = sc.nextLine();
                if(!name1.isEmpty())
                    s.setname(name1);
                System.out.print("Enter the Author name : ");
                String author_name1 = sc.nextLine();
                if(!author_name1.isEmpty())
                    s.setauthor_name(author_name1);
                System.out.print("Enter the price : ");
                String price1 = sc.nextLine();
                if(!price1.isEmpty())
                    s.setprice(Integer.parseInt(price1));
                System.out.print("Enter the ISBN Number : ");
                String ISBN1 = sc.nextLine();
                if(!ISBN1.isEmpty())
                    s.setISBN_number(Integer.parseInt(ISBN1));
                r=true;
                }
        }
        if(!r)
                    System.out.print("Book not found");
    } 
    static void search(String name){
        boolean e=false;
        for (BookStore s : b) {
            if(s.name.contains(name))
            {
                System.out.println("Book Name : " +s.getname());
                System.out.println("Author Name : " +s.getauthor_name());
                System.out.println("Price : " +s.getprice());
                System.out.println("ISBN Number : " +s.getISBN_number());
                System.out.println();
                e=true;
            }
            
        }
        if(!e)
            System.out.print("Book not found");
    }
    static void delete(int isbn2){
        for (int i=0;i<b.size();i++)
        {
            if((b.get(i)).ISBN_number==isbn2)
            {
                b.remove(i);
            }
        }
    }
}
