
import android.support.annotation.NonNull;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortUserNameCompare {

//    сортировка Compare
    public static void main(String[] args) {
        List<User> movies = Arrays.asList(
                new User("AA 1", 18),
                new User("Ser 1", 18),
                new User("-1", 18),
                new User("User 1", 18),
                new User("Lord of the rings", 18),
                new User("Back to the future", 28),
                new User("Carlito's way", 7),
                new User("Pulp fiction", 8),
                new User("User 10", 8),
                new User("Pulp fiction", 80));
        Collections.sort(movies);
        System.out.println(movies);
    }

    static class User implements Comparable<User> {
        private String name;
        private int ago;

        public User(String name, int ago) {
            this.name = name;
            this.ago = ago;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAgo() {
            return ago;
        }

        public void setAgo(int ago) {
            this.ago = ago;
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", ago=" + ago +
                    '}' + "\n";
        }

        @Override
        public int compareTo(@NonNull User user) {
            return this.name.compareTo(user.name);
        }
    }
}
