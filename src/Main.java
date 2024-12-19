public class Main {
    public static void main(String[] args) {
        Profile user1 = new Profile("Aidyn", "Loves coding and football.", 18);
        Profile user2 = new Profile("Aibek", "Avid traveler.", 18);

        Post post1 = new Post("Hello, world!", "Aidyn", "2024-12-19 10:00:00");
        Post post2 = new Post("Exploring the mountains!", "Aibek", "2024-12-19 12:30:00");

        SocialNetwork network = new SocialNetwork("ConnectWorld", 100000);

        network.displayNetwork();
        System.out.println();

        user1.displayProfile();
        user2.displayProfile();
        System.out.println();

        post1.displayPost();
        post2.displayPost();

        if (user1.getUsername().equals(user2.getUsername())) {
            System.out.println("Profiles have the same username.");
        } else {
            System.out.println("Profiles have different usernames.");
        }
    }
}
