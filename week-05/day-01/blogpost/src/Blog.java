import java.util.ArrayList;
import java.util.List;

public class Blog {
    private List<BlogPost> blogPosts;

    public Blog() {
        this.blogPosts = new ArrayList<>();
    }

    public void addBlogPost(BlogPost blogPost) {
        blogPosts.add(blogPost);
    }

    public void delete(int index) {
        blogPosts.remove(index);
    }

    public void update(int index, BlogPost blogPost) {
        blogPosts.remove(index);
        blogPosts.add(index, blogPost);
    }
}
