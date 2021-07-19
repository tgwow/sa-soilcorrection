package edu.utfpr.cp.dacom.sa.soilcorrection;

public class CorrecaoCalcioMagnesio implements ICorrecaoNutriente<FonteCalcioMagnesio>{

    /**
     * Os paramêtros referem-se a participação no CTC de cada nutriente após a correção
     */
    public double calculaVPercentualAposCorrecao(
            double calcio,
            double magnesio,
            double potassio
    ) {
        return calcio + magnesio + potassio;
    }
}
