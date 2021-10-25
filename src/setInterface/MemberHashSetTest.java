package setInterface;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class MemberHashSetTest {

    MemberHashSet memberHashSet;

    @BeforeEach
    void beforeTest(){

        memberHashSet = new MemberHashSet();

        Member member1 = new Member(1001, "A");
        Member member2 = new Member(1002, "B");
        Member member3 = new Member(1003, "C");
        Member member4 = new Member(1004, "D");

        memberHashSet.addMember(member1);
        memberHashSet.addMember(member2);
        memberHashSet.addMember(member3);
        memberHashSet.addMember(member4);

    }



    @Test
    void MemberOverlapTest(){
        //given
        Member member = new Member(1001, "A");

        //when
        memberHashSet.addMember(member);

        //then
        assertEquals(memberHashSet.getSize(), 4);

        memberHashSet.showAllMember();

    }


    @Test
    void addMemberTest(){
        //given
        Member member = new Member(10100, "F");

        //when
        memberHashSet.addMember(member);
        Member findMember = memberHashSet.getMember(member.getMemberId());

        //then
        assertEquals(memberHashSet.getSize(), 5);
        assertEquals(findMember.getMemberId(), member.getMemberId());

        memberHashSet.showAllMember();

    }

    @Test
    void removeMemberTest(){
        //given
        int removeMemberID = 1004;

        //when
        memberHashSet.removeMember(removeMemberID);

        //then
        assertEquals(memberHashSet.getSize(), 3);
        assertNull(memberHashSet.getMember(removeMemberID));

        memberHashSet.showAllMember();
    }
}
