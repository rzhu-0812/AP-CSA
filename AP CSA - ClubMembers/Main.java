import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ClubMembers cm1 = new ClubMembers(new ArrayList<MemberInfo>());
        String[] names = {"Bob", "Ashley", "Timmy", "George"};
        cm1.addMembers(names, 2030);

        
    }
}
