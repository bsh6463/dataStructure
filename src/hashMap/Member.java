package hashMap;

import java.util.Comparator;

public class Member implements Comparable<Member> {

    private int memberId;
    private String memberName;

    public Member() {
    }

    public Member(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberId=" + memberId +
                ", memberName='" + memberName + '\'' +
                '}';
    }



    @Override
    public boolean equals(Object o) {
        if (o instanceof Member){
            Member member = (Member) o;

            if (this.memberId == member.memberId){
                return true;
            }
            else return false;
        }
        return false;
    }

    @Override //hashcode반환
    public int hashCode() {
        return memberId;
    }


   @Override
    public int compareTo(Member member) {

        return (this.memberId - member.getMemberId());
    }
}
