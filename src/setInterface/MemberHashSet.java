package setInterface;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {

    private HashSet<Member> hashSet;

    public MemberHashSet() {
        hashSet = new HashSet<>();
    }

    public MemberHashSet(int size) {
        hashSet = new HashSet<>(size);
    }

    public void addMember(Member member){
        hashSet.add(member);
    }

    public Member getMember(int memberId){

        Iterator<Member> iterator = hashSet.iterator();

        while (iterator.hasNext()){
            Member member = iterator.next();

            if (member.getMemberId() == memberId){
                return member;
            }
        }

        return null;
    }

    public boolean removeMember(int memberId){

        Iterator<Member> iterator = hashSet.iterator();

        while (iterator.hasNext()){
            Member member = iterator.next();

            if (member.getMemberId() == memberId){
                hashSet.remove(member);
                return true;
            }
        }
        System.out.println("memberId :" + memberId + "존재하지 않습니다.");
        return false;
    }

    public void showAllMember(){
        for (Member member : hashSet) {
            System.out.println("member = " + member);
        }
        System.out.println();
    }

    public int getSize(){
        return hashSet.size();
    }
}
