package com.cooperative.service;

import com.cooperative.model.Contribution;
import com.cooperative.model.Member;
import com.cooperative.repository.ContributionRepository;
import com.cooperative.repository.MemberRepository;
import org.springframework.stereotype.Service;

@Service
public class ContributionService {
    private final ContributionRepository contributionRepository;
    private final MemberRepository memberRepository;

    public ContributionService(ContributionRepository contributionRepository, MemberRepository memberRepository) {
        this.contributionRepository = contributionRepository;
        this.memberRepository = memberRepository;
    }

    public Contribution addContribution(Long memberId, double amount) {
        Member member = memberRepository.findById(memberId).orElse(null);
        if (member == null || amount <= 0) return null;
        member.setBalance(member.getBalance() + amount);
        memberRepository.save(member);

        Contribution contribution = new Contribution();
        contribution.setAmount(amount);
        contribution.setDate(java.time.LocalDate.now());
        contribution.setMember(member);
        return contributionRepository.save(contribution);
    }
}