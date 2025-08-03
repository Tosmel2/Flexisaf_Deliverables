package com.cooperative.service;

import com.cooperative.model.Withdrawal;
import com.cooperative.model.Member;
import com.cooperative.repository.WithdrawalRepository;
import com.cooperative.repository.MemberRepository;
import org.springframework.stereotype.Service;

@Service
public class WithdrawalService {
    private final WithdrawalRepository withdrawalRepository;
    private final MemberRepository memberRepository;

    public WithdrawalService(WithdrawalRepository withdrawalRepository, MemberRepository memberRepository) {
        this.withdrawalRepository = withdrawalRepository;
        this.memberRepository = memberRepository;
    }

    public Withdrawal processWithdrawal(Long memberId, double amount) {
        Member member = memberRepository.findById(memberId).orElse(null);
        if (member == null || amount <= 0 || member.getBalance() < amount) return null;
        member.setBalance(member.getBalance() - amount);
        memberRepository.save(member);

        Withdrawal withdrawal = new Withdrawal();
        withdrawal.setAmount(amount);
        withdrawal.setDate(java.time.LocalDate.now());
        withdrawal.setMember(member);
        return withdrawalRepository.save(withdrawal);
    }
}