package treeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {

    private TreeSet<Member> treeSet;

    public MemberTreeSet() {
        treeSet = new TreeSet<Member>(new Member());
    }

    public void addMember(Member member){
        treeSet.add(member);
    }

    public Member getMember(int memberId){

        Iterator<Member> iterator = treeSet.iterator();

        while (iterator.hasNext()){
            Member member = iterator.next();

            if (member.getMemberId() == memberId){
                return member;
            }
        }

        return null;
    }

    public boolean removeMember(int memberId){

        Iterator<Member> iterator = treeSet.iterator();

        while (iterator.hasNext()){
            Member member = iterator.next();

            if (member.getMemberId() == memberId){
                treeSet.remove(member);
                return true;
            }
        }
        System.out.println("memberId :" + memberId + "존재하지 않습니다.");
        return false;
    }

    public void showAllMember(){
        for (Member member : treeSet) {
            System.out.println("member = " + member);
        }
        System.out.println();
    }

    public int getSize(){
        return treeSet.size();
    }
}
