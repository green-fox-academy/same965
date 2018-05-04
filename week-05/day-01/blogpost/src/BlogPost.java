public class BlogPost {
    String authorname;
    String title;
    String text;
    String publicationDate;

    public BlogPost() {
    }

    public BlogPost(String authorname, String title, String publicationDate, String text) {
        this.authorname = authorname;
        this.title = title;
        this.text = text;
        this.publicationDate = publicationDate;
    }
}
