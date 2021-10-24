package listInterface;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {

    private ArrayList<Member> arrayList;

    public MemberArrayList() {
        arrayList = new ArrayList<>();
    }

    public MemberArrayList(int size) {
        arrayList = new ArrayList<>(size);
    }

    public void addMember(Member member){
        arrayList.add(member);
    }

    public Member getMember(int memberId){

        Iterator<Member> iterator = arrayList.iterator();

        while (iterator.hasNext()){
            Member member = iterator.next();

            if (member.getMemberId() == memberId){
                return member;
            }
        }

        return null;
    }

    public boolean removeMember(int memberId){

        Iterator<Member> iterator = arrayList.iterator();

        while (iterator.hasNext()){
            Member member = iterator.next();

            if (member.getMemberId() == memberId){
                arrayList.remove(member);
                return true;
            }
        }
        System.out.println("memberId :" + memberId + "존재하지 않습니다.");
        return false;
    }

    public void showAllMember(){
        for (Member member : arrayList) {
            System.out.println("member = " + member);
        }
        System.out.println();
    }

    public int getSize(){
        return arrayList.size();
    }
}
