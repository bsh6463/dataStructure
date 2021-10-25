package hashMap;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class MemberHashMapTest {

    MemberHashMap memberHashMap;

    @BeforeEach
    void beforeTest(){

        memberHashMap = new MemberHashMap();

        Member member1 = new Member(1001, "A");
        Member member2 = new Member(1002, "B");
        Member member3 = new Member(1003, "C");
        Member member4 = new Member(1004, "D");

        memberHashMap.addMember(member1);
        memberHashMap.addMember(member3);
        memberHashMap.addMember(member4);
        memberHashMap.addMember(member2);

    }



    @Test
    void MemberOverlapTest(){
        //given
        Member member = new Member(1001, "A");

        //when
        memberHashMap.addMember(member);

        //then
        memberHashMap.showAllMember();
        assertEquals(memberHashMap.getKeys().size(), 4);
    }


    @Test
    void addMemberTest(){
        //given
        Member member = new Member(1005, "F");

        //when
        memberHashMap.addMember(member);

        //then
        assertEquals(memberHashMap.getKeys().size(), 5);
        assertEquals(memberHashMap.getMember(member.getMemberId()), member);

        memberHashMap.showAllMember();

    }

    @Test
    void removeMemberTest(){
        //given
        int removeMemberID = 1004;

        //when
        memberHashMap.removeMember(removeMemberID);

        //then
         assertEquals(memberHashMap.getKeys().size(), 3);
         assertThrows(NoSuchElementException.class, ()-> memberHashMap.getMember(removeMemberID));

         memberHashMap.showAllMember();
    }
}
