package hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

public class MemberHashMap {

    private HashMap<Integer, Member> hashMap;

    public MemberHashMap() {
        hashMap = new HashMap<>();
    }

    public void addMember(Member member){
        hashMap.put(member.getMemberId(), member);
    }

    public void removeMember(int memberId){
        if (hashMap.containsKey(memberId)){
            hashMap.remove(memberId);
            return;
        }
        throw new NoSuchElementException("해당 memberId에 해당하는 Member가 없습니다.");
    }

    public Member getMember(int memberId){
        if (hashMap.containsKey(memberId)){
            return hashMap.get(memberId);
        }
        throw new NoSuchElementException();
    }

    public Set<Integer> getKeys(){
        return hashMap.keySet();
    }

    public void showAllMember(){
        Iterator<Integer> iterator = hashMap.keySet().iterator();

        while (iterator.hasNext()){

            int key = iterator.next();
            Member member = hashMap.get(key);
            System.out.println("member = " + member);
        }

        System.out.println("=========================");
        hashMap.keySet().forEach(k -> System.out.println(hashMap.get(k)));
    }
}
