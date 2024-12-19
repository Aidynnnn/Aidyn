class Profile {
    private String username;
    private String bio;
    private int age;

    public Profile(String username, String bio, int age) {
        this.username = username;
        this.bio = bio;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void displayProfile() {
        System.out.println("Profile:");
        System.out.println("Username: " + username);
        System.out.println("Bio: " + bio);
        System.out.println("Age: " + age);
    }
}
