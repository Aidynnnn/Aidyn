class SocialNetwork {
    private String name;
    private int totalUsers;

    public SocialNetwork(String name, int totalUsers) {
        this.name = name;
        this.totalUsers = totalUsers;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalUsers() {
        return totalUsers;
    }

    public void setTotalUsers(int totalUsers) {
        this.totalUsers = totalUsers;
    }

    // Method to display network details
    public void displayNetwork() {
        System.out.println("Social Network: " + name);
        System.out.println("Total Users: " + totalUsers);
    }
}