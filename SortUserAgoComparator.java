
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortUserAgoComparator {

    public static void main(String[] args) {
        List<User> list = Arrays.asList(
                new User("Kamil", 2012),
                new User("Alsu", 2019),
                new User("Damir", 2018),
                new User("Nias", 2019),
                new User("Roma", 2300));

        Collections.sort(list, new AgoComparator());
        System.out.println(list);
    }

    static class User {
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
    }

    static class AgoComparator implements Comparator<User> {

        @Override
        public int compare(User user, User userOther) {
            Integer agoUser = new Integer(user.getAgo());
            Integer agoUserOther = new Integer(userOther.getAgo());
            return agoUser.compareTo(agoUserOther);
        }
    }
}
