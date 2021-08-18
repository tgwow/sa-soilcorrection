package edu.utfpr.cp.dacom.sa.soilcorrection;

import edu.utfpr.cp.dacom.sa.soilcorrection.negocio.nutriente.CorrecaoCalcioMagnesio;
import edu.utfpr.cp.dacom.sa.soilcorrection.negocio.ctc.TexturaSolo;
import edu.utfpr.cp.dacom.sa.soilcorrection.modelo.fonte.FonteCalcioMagnesio;
import edu.utfpr.cp.dacom.sa.soilcorrection.modelo.nutriente.NomeNutriente;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestaCorrecaoCalcioMagnesio {

    @Test
    public void testaParticipacaoIdealCTCCalcio() {

        assertEquals("35 a 40",
                TexturaSolo.TEXTURA_MEDIA.getParticipacaoIdealCTC(NomeNutriente.CALCIO));

        assertEquals("45 a 55",
                TexturaSolo.ARGILOSO.getParticipacaoIdealCTC(NomeNutriente.CALCIO));

    }

    @Test
    public void testaParticipacaoIdealCTCMagnesio() {

        assertEquals("8 a 12",
                TexturaSolo.TEXTURA_MEDIA.getParticipacaoIdealCTC(NomeNutriente.MAGNESIO));

        assertEquals("10 a 15",
                TexturaSolo.ARGILOSO.getParticipacaoIdealCTC(NomeNutriente.MAGNESIO));

    }

    @Test
    public void testaVPercentualAposCorrecao() {
        assertEquals(80.5,
                new CorrecaoCalcioMagnesio()
                        .calculaVPercentualAposCorrecao(
                                55.0,
                                22.5,
                                3.0));

    }

    @Test
    public void testaCustoReaisHa() {

        var correcaoCalcioMagnesio = new CorrecaoCalcioMagnesio();

        var qtdeCalcioMagnesioAplicarKgHa = 1844.76;

        assertEquals(
            922.68, 
            correcaoCalcioMagnesio.calculaCusto(
                500.0, 
                qtdeCalcioMagnesioAplicarKgHa),
            0.5);
    }

    @Test
    public void testaNutrientesAdicionais() {

        var correcaoCalcioMagnesio = new CorrecaoCalcioMagnesio();
        
        var qtdeCalcioMagnesioAplicarKgHa = 1844.76;

        assertEquals(
            1, 
            correcaoCalcioMagnesio.getNutrientesAdicionais(
                    qtdeCalcioMagnesioAplicarKgHa, 
                    FonteCalcioMagnesio.GESSO_AGRICOLA)
                        .size());

        qtdeCalcioMagnesioAplicarKgHa = 3.51 * 1000;

        assertEquals(
            526.16, 
            correcaoCalcioMagnesio.getNutrientesAdicionais(
                qtdeCalcioMagnesioAplicarKgHa, 
                    FonteCalcioMagnesio.GESSO_AGRICOLA)
                        .stream()
                        .findFirst()
                        .get()
                        .getCorrecaoAdicional(),
            0.5);
    }

    @Test
    public void testaQtdeAplicar() {

        double qtdeFonteAdicionar = 1.291755;
        double prntPercent = 0.7;

        assertEquals(1.85, 
            new CorrecaoCalcioMagnesio()
                .calculaQuantidadeAplicar(
                    qtdeFonteAdicionar, 
                    prntPercent),
            0.05);

    }

}
