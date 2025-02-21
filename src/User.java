class User {
    private String email;
    private String pwd_hash;
    private Schedule schedule;

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPwd(String pwd) {
        this.pwd_hash = pwd; // Hash password properly in implementation
    }
}