package com.cooperative.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Withdrawal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double amount;
    private LocalDate date;

    @ManyToOne
    private Member member;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }

    public Member getMember() { return member; }
    public void setMember(Member member) { this.member = member; }
}