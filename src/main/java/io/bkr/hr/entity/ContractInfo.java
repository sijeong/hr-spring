package io.bkr.hr.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Cleanup;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class ContractInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    @Column(name = "startDate", nullable = false)
    private LocalDateTime startDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    @Column(name = "endDate", nullable = false)
    private LocalDateTime endDate;

    @Column(name = "duration", nullable = false)
    private int duration;

    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    @Column(name = "workStartDate", nullable = false)
    private LocalDateTime workStartDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    @Column(name = "workEndDate", nullable = false)
    private LocalDateTime workEndDate;

    @Column(name = "workDay", nullable = false)
    private String workDay;

    @Column(name = "legalHoliday", nullable = false)
    private WeekDay legalHoliday;

    @Column(name = "hourlyPay", nullable = false)
    private int hourlyPay;

    @Column(name = "riderPay", nullable = false)
    private int riderPay;

    @Column(name = "healthCertificateNum", nullable = false)
    private String healthCertificateNum;

    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    @Column(name = "healthCertificateIssueDate", nullable = false)
    private LocalDateTime healthCertificateIssueDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    @Column(name = "healthCertificateUpdateDate", nullable = false)
    private LocalDateTime healthCertificateUpdateDate;

    @Column(name = "licenseNumber", nullable = true)
    private String licenseNumber;

    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    @Column(name = "licenseIssueDate", nullable = true)
    private LocalDateTime licenseIssueDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    @Column(name = "licenseUpdateDate", nullable = true)
    private LocalDateTime licenseUpdateDate;

    @Column(name = "accountHolder", nullable = false)
    private String accountHolder;

    @Column(name = "bank", nullable = false)
    private String bank;

    @Column(name = "accountNumber", nullable = false)
    private String accountNumber;

}
