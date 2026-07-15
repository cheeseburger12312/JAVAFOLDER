public class typewritter {
    public static void main(String[] args) {
        String text = "hello world";
        int i;
        for(i = 0; i < text.length(); i++){
            System.out.printf("%c", text.charAt(i));
            try{
                Thread.sleep(100);
            }catch(InterruptedException ex){
                Thread.currentThread().interrupt();
            }
        }
    }
}
