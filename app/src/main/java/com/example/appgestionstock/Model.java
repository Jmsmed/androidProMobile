package com.example.appgestionstock;

public class Model {
    
    String label, qte;

    public Model(String label, String qte) {
        this.label = label;
        this.qte = qte;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getQte() {
        return qte;
    }

    public void setQte(String qte) {
        this.qte = qte;
    }
}
