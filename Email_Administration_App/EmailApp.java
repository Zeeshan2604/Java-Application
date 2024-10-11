public class EmailApp{
    public static void main(String[] args) {
        Email em1 = new Email("Zeeshan","Shaikh");
        em1.setAlternateEmail("shaikh.zeeshan@gmail.com");
        em1.changePassword("TXS@12345");
        em1.setMailboxCapacity(300);
        System.out.println(em1.showInfo());
    }
}