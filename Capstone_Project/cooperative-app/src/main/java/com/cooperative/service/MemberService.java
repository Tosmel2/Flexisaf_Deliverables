package com.cooperative.service;

import com.cooperative.model.Member;
import com.cooperative.repository.MemberRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MemberService {
    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public Member addMember(Member member) {
        if (member.getEmail() == null || !member.getEmail().matches("^[\\w-.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) return null;
        if (memberRepository.findByEmail(member.getEmail()).isPresent()) return null;
        return memberRepository.save(member);
    }

    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }

    public Member updateMember(Member member) {
        return memberRepository.save(member);
    }

    public Member getMember(Long id) {
        return memberRepository.findById(id).orElse(null);
    }
}