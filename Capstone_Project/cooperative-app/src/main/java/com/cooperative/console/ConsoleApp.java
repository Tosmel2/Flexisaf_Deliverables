package com.cooperative.console;

import com.cooperative.model.Member;
import com.cooperative.service.MemberService;
import com.cooperative.service.ContributionService;
import com.cooperative.service.WithdrawalService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.Scanner;

@Component
public class ConsoleApp implements CommandLineRunner {
    private final MemberService memberService;
    private final ContributionService contributionService;
    private final WithdrawalService withdrawalService;

    public ConsoleApp(MemberService memberService, ContributionService contributionService, WithdrawalService withdrawalService) {
        this.memberService = memberService;
        this.contributionService = contributionService;
        this.withdrawalService = withdrawalService;
    }

    @Override
    public void run(String... args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Add Member\n2. View Members\n3. Contribute\n4. Withdraw\n5. Exit\n");
            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.print("Name: ");
                String name = scanner.next();
                System.out.print("Email: ");
                String email = scanner.next();
                Member member = new Member();
                member.setName(name);
                member.setEmail(email);
                memberService.addMember(member);
                System.out.println("\n==========Member added.==========\n");
            } else if (choice == 2) {
                memberService.getAllMembers().forEach(m -> System.out.println(m.getId() + ": " + m.getName() + " - " + m.getBalance()));
            } else if (choice == 3) {
                System.out.print("Member ID: ");
                Long id = scanner.nextLong();
                System.out.print("Amount: ");
                double amt = scanner.nextDouble();
                contributionService.addContribution(id, amt);
                System.out.println("\n==========Contribution added.==========\n");
            } else if (choice == 4) {
                System.out.print("Member ID: ");
                Long id = scanner.nextLong();
                System.out.print("Amount: ");
                double amt = scanner.nextDouble();
                if (withdrawalService.processWithdrawal(id, amt) != null)
                    System.out.println("\n==========Withdrawal successful.==========\n");
                else
                    System.out.println("\n==========Withdrawal failed.==========\n");
            } else if (choice == 5) {
                break;
            }
        }
    }
}