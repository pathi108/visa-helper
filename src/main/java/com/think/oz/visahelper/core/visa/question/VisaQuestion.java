package com.think.oz.visahelper.core.visa.question;

import com.think.oz.visahelper.core.visa.cat.VisaCat;

import javax.persistence.*;

public class VisaQuestion {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    @Basic
    @Column(name = "QUESTION_NO")
    private int questionNo;

    @Basic
    @Column(name = "QUESTION_LABEL")
    private int questionLabel;

    @Basic
    @Column(name = "QUESTION_DESC")
    private int questionDesc;

    @ManyToOne
    @JoinColumn(name="PAGE_ID", nullable=false)
    VisaCat visaCat;
}
