public class Author {
    String name;
    String email;
    char gender;

    public Author(String name,String email,char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public void printInfo(){
        System.out.println("Author name: "+this.name+" email: "+this.email+" gender: "+this.gender);
    }

    public static void main(String[] args) {
        Author author = new Author("Arman","author@gmail.com",'m');
        author.printInfo();
    }
}
