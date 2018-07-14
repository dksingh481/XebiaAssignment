package com.xebia.yakshop.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "herd")
public class Herd {
	List<LabYak> labyaks;
    public List<LabYak> getLabYaks() {
        return labyaks;
    }
    @XmlElement(name = "labyak")
    public void setLabYaks(List<LabYak> labyaks) {
        this.labyaks = labyaks;
    }
    public void add(LabYak labyak) {
        if (this.labyaks == null) {
            this.labyaks = new ArrayList<LabYak>();
        }
        this.labyaks.add(labyak);
    }
}
