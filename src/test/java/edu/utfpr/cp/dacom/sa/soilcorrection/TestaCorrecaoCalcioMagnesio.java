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

}
