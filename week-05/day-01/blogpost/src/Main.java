public class Main {
    public static void main(String[] args) {
        BlogPost blogPost1 = new BlogPost();
        blogPost1.authorname = "John Doe";
        blogPost1.title = "Lorem Ipsum";
        blogPost1.publicationDate = "2000.05.04.";
        blogPost1.text = "Lorem ipsum dolor sit amet.";

        BlogPost blogPost2 = new BlogPost();
        blogPost2.authorname = "Tim Urban";
        blogPost2.title = "Wait but why";
        blogPost2.publicationDate = "2010.10.10.";
        blogPost2.title = "A popular long-form, stick-figure-illustrated blog about almost everything.";

        BlogPost blogPost3 = new BlogPost();
        blogPost3.authorname = "William Turton";
        blogPost3.title = "One Engineer Is Trying to Get IBM to Reckon With Trump";
        blogPost3.publicationDate = "2017.03.28."
        blogPost3.title = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. " +
                "When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t " +
                "really into the whole organizer profile thing.";
    }
}
