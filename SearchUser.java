import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class SearchUser {

    public static void main(String[] args) {
        List<User> list = new ArrayList<User>();
        list.add(new User("Kamil", 1290));
        list.add(new User("Ramil", 1290));
        list.add(new User("Ramil3", 1290));
        list.add(new User("Ramil", 1290));
        list.add(new User("Bob", 1290));
        list.add(new User("Sam", 1290));
		// Перемешиваем для теста
        Collections.shuffle(list);
        System.out.println(list);
		Comparator<User> comp = new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                if (o1.name != o2.name) {
                    if (o1.name != null)
                        return o2.name != null ? o1.name.compareTo(o2.name) : 1;
                    else
                        return o2.name != null ? -1 : 0;
                } else {
                    return 0;
                }
            }
        };
		 // Сортируем элементы
        Collections.sort(list, comp);
        System.out.println(list);
		// Ищем элемент идентичный искомому
        int pos = Collections.binarySearch(list, new User("Ramil", 1290), comp);
        if (pos >= 0) {
            System.out.println("finded: " + pos);
        } else {
            System.out.println("no such element");
        }
//        boolean result = list.contains(new User("Ramil", 1290));
        //возвращает список
        List<User> result = list.stream()
                .filter(user -> user.contains(new User("Ramil", 1290)))
                .collect(Collectors.toList());
        for (User user : result) {
            System.out.println(user);
        }
        List<User> users = new ArrayList<>();
        for (User user : list) {
            if (user.getName().equals("Ramil")) {
                users.add(user);
            }
        }
        System.out.println(users.toString());
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

        // Описываем "натуральный порядок" для объектов данного класса
        @Override
        public int compareTo(User user) {
            if (user == null)
                throw new NullPointerException();
            if (name != user.name) {
                if (name != null)
                    return user.name != null ? name.compareTo(user.name) : 1;
                else
                    return user.name != null ? -1 : 0;
            } else {
                return ago > user.ago ? 1 : ago == user.ago ? 0 : -1;
            }
        }

        @Override
        public String toString() {
            return name + ";" + ago;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            User user = (User) o;
            return ago == user.ago &&
                    Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, ago);
        }

        public boolean contains(User o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            User user = (User) o;
            return ago == user.ago &&
                    Objects.equals(name, user.name);
        }
    }
}
