package Lesson1;

public class Task3 {
    public static void main(String[] args) {
        // Netflix login


                boolean isLoggedIn = true;
                boolean hasSubscription = false;

                boolean canWatchContent = isLoggedIn && hasSubscription;

                boolean isAccountActive = isLoggedIn || hasSubscription;

                System.out.println("Kontent görə bilər? " + canWatchContent);
                System.out.println("Hesab aktivdir? " + isAccountActive);
            }
        }


