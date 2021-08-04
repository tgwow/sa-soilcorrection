package edu.utfpr.cp.dacom.sa.soilcorrection;

import lombok.Getter;
import lombok.Setter;

@Getter
public class NutrienteAdicional {

    private final NomeNutrienteAdicional nome;
    private final double teorNutriente;
    @Setter private double correcaoAdicional;

    public NutrienteAdicional(
        final NomeNutrienteAdicional nome, 
        double teorNutriente) {

        this.nome = nome;
        this.teorNutriente = teorNutriente;
    }
    
}
