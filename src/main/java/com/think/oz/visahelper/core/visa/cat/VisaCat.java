package com.think.oz.visahelper.core.visa.cat;

import com.think.oz.visahelper.core.visa.page.VisaPage;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class VisaCat {
    @Id
    @Column(name = "VISA_ID")
    private String visaId;

    @OneToMany(mappedBy="visacat")
    private List<VisaPage> pages;

    @Basic
    @Column(name = "Name")
    private String name;


}
