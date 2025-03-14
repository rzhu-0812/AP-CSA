import java.util.ArrayList;

public class ClubMembers {
    private ArrayList<MemberInfo> memberList;

    public ClubMembers(ArrayList<MemberInfo> memberList) {
        this.memberList = memberList;
    }

    public void addMembers(String[] names, int gradYear) {
        for (String name : names) {
            memberList.add(new MemberInfo(name, gradYear, true));
        }
    }

    public ArrayList<MemberInfo> removeMembers(int year) {
        ArrayList<MemberInfo> graduated = new ArrayList<MemberInfo>();
        int i = 0;

        while (i < memberList.size()) {
            if (memberList.get(i).getGradYear() <= year) {
                MemberInfo grad = memberList.get(i);
                if (grad.inGoodStanding())
                    graduated.add(grad);
            } else 
                i++;
        }

        return graduated;
    }
}
