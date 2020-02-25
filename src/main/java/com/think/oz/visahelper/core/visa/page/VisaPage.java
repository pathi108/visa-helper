package com.think.oz.visahelper.core.visa.page;

import com.think.oz.visahelper.core.visa.cat.VisaCat;
import com.think.oz.visahelper.core.visa.question.VisaQuestion;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class VisaPage {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    @Basic
    @Column(name = "PAGE_ID")
    private int pageId;

    @ManyToOne
    @JoinColumn(name="VISA_ID", nullable=false)
    VisaCat visaCat;

    @OneToMany(mappedBy="visapage")
    private List<VisaQuestion> pages;
}
