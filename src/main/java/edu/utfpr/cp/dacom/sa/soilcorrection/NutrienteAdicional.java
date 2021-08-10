package edu.utfpr.cp.dacom.sa.soilcorrection;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@RequiredArgsConstructor
public class NutrienteAdicional {

    private final NomeNutrienteAdicional nome;
    private final double teorNutriente;
    @Setter private double correcaoAdicional;

}
