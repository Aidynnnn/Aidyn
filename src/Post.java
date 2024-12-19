class Post {
    private String content;
    private String author;
    private String timestamp;


    public Post(String content, String author, String timestamp) {
        this.content = content;
        this.author = author;
        this.timestamp = timestamp;
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    // Method to display post details
    public void displayPost() {
        System.out.println("Post by " + author + " at " + timestamp);
        System.out.println("Content: " + content);
    }
}
