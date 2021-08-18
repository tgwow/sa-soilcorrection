package edu.utfpr.cp.dacom.sa.soilcorrection.negocio.ctc;

import edu.utfpr.cp.dacom.sa.soilcorrection.modelo.nutriente.NomeNutriente;
import edu.utfpr.cp.dacom.sa.soilcorrection.modelo.nutriente.NutrientesCTC;

public enum TexturaSolo {
    
    ARGILOSO {
        public NutrientesCTC calculaValorIdeal() {
            return NutrientesCTC.builder()
                    .fosforo(9.0)
                    .potassio(0.35)
                    .calcio(6.0)
                    .magnesio(1.5)
                    .enxofre(9.0)
                    .aluminio(0.0)
                    .aluminioHidrogenio(0.0)
                    .build();
        }

        public String getParticipacaoIdealCTC(NomeNutriente nutriente) {
            switch (nutriente) {
                case MAGNESIO -> { return "10 a 15"; }

                case CALCIO -> { return "45 a 55"; }

                default -> { throw new IllegalArgumentException(); }
            }
        }

        public String getVPercentualIdeal() {
            return "60 a 70";
        }

    },
    TEXTURA_MEDIA{
        public NutrientesCTC calculaValorIdeal() {
            return NutrientesCTC.builder()
                    .fosforo(12.0)
                    .potassio(0.25)
                    .calcio(3.0)
                    .magnesio(1.0)
                    .enxofre(6.0)
                    .aluminio(0.0)
                    .aluminioHidrogenio(0.0)
                    .build();
        }

        public String getParticipacaoIdealCTC(NomeNutriente nutriente) {
            switch (nutriente) {
                case MAGNESIO -> { return "8 a 12"; }

                case CALCIO -> { return "35 a 40"; }

                default -> { throw new IllegalArgumentException(); }
            }
        }

        public String getVPercentualIdeal() {
            return "50";
        }

    };
    
    public abstract NutrientesCTC calculaValorIdeal();
    public abstract String getParticipacaoIdealCTC(NomeNutriente nutriente);
    public abstract String getVPercentualIdeal();
}
