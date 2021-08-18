package edu.utfpr.cp.dacom.sa.soilcorrection.modelo.fonte;

import edu.utfpr.cp.dacom.sa.soilcorrection.modelo.nutriente.NutrienteAdicional;

import java.util.Set;

public interface IFonteNutriente {
    
    public double getTeorFonte();
    public Set<NutrienteAdicional> getNutrientesAdicionais();
}
