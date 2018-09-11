import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterUser {

    public static void main(String[] args) {
        //api 24
        List<String> lines = Arrays.asList("spring", "node", "mkyong");
        List<String> result = lines.stream()                // convert list to stream
                .filter(line -> !"mkyong".equals(line))     // we dont like mkyong
                .collect(Collectors.toList());              // collect the output and convert streams to a List
        result.forEach(System.out::println);

        //цикл
        System.out.println("\n Цикл");
        List<User> persons = Arrays.asList(new User("mkyong", 30),
                new User("jack", 20),
                new User("tom", 20),
                new User("lawrence", 40));
        for (User person : persons) {
            if (person.ago == 20) {
                System.out.println(person);
            }
        }
        //Patterns 11: Filter
        System.out.println("\n Patterns 11: Filter");
        persons = new UserNameFilter("tom").filter(persons);
        for (User person : persons) {
            System.out.println(person);
        }
    }

    interface UserFilter {
        List<User> filter(List<User> users);
    }

    static class UserNameFilter implements UserFilter {

        private String name;

        public UserNameFilter(String name) {
            this.name = name;
        }

        @Override
        public List<User> filter(List<User> users) {
            List<User> list = new ArrayList<>();
            for (User user : users) {
                if (name.equals(user.name)) {
                    list.add(user);
                }
            }
            return list;
        }
    }

    private static class User {

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
                    '}';
        }
    }
}
