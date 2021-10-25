package treeSet;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class MemberTreeSetTest {

    MemberTreeSet memberTreeSet;

    @BeforeEach
    void beforeTest(){

        memberTreeSet = new MemberTreeSet();

        Member member1 = new Member(1001, "A");
        Member member2 = new Member(1002, "B");
        Member member3 = new Member(1003, "C");
        Member member4 = new Member(1004, "D");

        memberTreeSet.addMember(member1);
        memberTreeSet.addMember(member3);
        memberTreeSet.addMember(member4);
        memberTreeSet.addMember(member2);

    }



    @Test
    void MemberOverlapTest(){
        //given
        Member member = new Member(1001, "A");

        //when
        memberTreeSet.addMember(member);

        //then
        assertEquals(memberTreeSet.getSize(), 4);

        memberTreeSet.showAllMember();

    }


    @Test
    void addMemberTest(){
        //given
        Member member = new Member(10100, "F");

        //when
        memberTreeSet.addMember(member);
        Member findMember = memberTreeSet.getMember(member.getMemberId());

        //then
        assertEquals(memberTreeSet.getSize(), 5);
        assertEquals(findMember.getMemberId(), member.getMemberId());

        memberTreeSet.showAllMember();

    }

    @Test
    void removeMemberTest(){
        //given
        int removeMemberID = 1004;

        //when
        memberTreeSet.removeMember(removeMemberID);

        //then
        assertEquals(memberTreeSet.getSize(), 3);
        assertNull(memberTreeSet.getMember(removeMemberID));

        memberTreeSet.showAllMember();
    }
}
