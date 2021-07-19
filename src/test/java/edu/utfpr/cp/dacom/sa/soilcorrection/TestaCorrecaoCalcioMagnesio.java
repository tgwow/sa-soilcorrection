package edu.utfpr.cp.dacom.sa.soilcorrection;

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
    public void testaNutrientesAdicionais() {
        var correcaoCalcioMagnesio = new CorrecaoCalcioMagnesio();
        var qtdeCalcioMagnesioAplicar = 3.51;

        assertEquals(1, correcaoCalcioMagnesio.getNutrientesAdicionais(
                qtdeCalcioMagnesioAplicar,
                FonteCalcioMagnesio.GESSO_AGRICOLA).size());

        // Testa se a correcao foi aplicada corretamente
        assertEquals(526.5, correcaoCalcioMagnesio.getNutrientesAdicionais(
                qtdeCalcioMagnesioAplicar,
                FonteCalcioMagnesio.GESSO_AGRICOLA)
                        .iterator().next().getCorrecaoAdicional());
    }

}
