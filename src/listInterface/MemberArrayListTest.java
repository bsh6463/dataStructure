package listInterface;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MemberArrayListTest {

    MemberArrayList memberArrayList;

    @BeforeEach
    void beforeTest(){

        memberArrayList = new MemberArrayList();

        Member member1 = new Member(1001, "A");
        Member member2 = new Member(1002, "B");
        Member member3 = new Member(1003, "C");
        Member member4 = new Member(1004, "D");

        memberArrayList.addMember(member1);
        memberArrayList.addMember(member2);
        memberArrayList.addMember(member3);
        memberArrayList.addMember(member4);

    }



    @Test
    void addMemberTest(){
        //given
        Member member = new Member(10100, "F");

        //when
        memberArrayList.addMember(member);
        Member findMember = memberArrayList.getMember(member.getMemberId());

        //then
        assertEquals(memberArrayList.getSize(), 5);
        assertEquals(findMember.getMemberId(), member.getMemberId());

        memberArrayList.showAllMember();

    }

    @Test
    void removeMemberTest(){
        //given
        int removeMemberID = 1004;

        //when
        memberArrayList.removeMember(removeMemberID);

        //then
        assertEquals(memberArrayList.getSize(), 3);
        assertNull(memberArrayList.getMember(removeMemberID));

        memberArrayList.showAllMember();
    }
}
