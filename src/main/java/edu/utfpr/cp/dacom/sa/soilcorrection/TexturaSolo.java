package edu.utfpr.cp.dacom.sa.soilcorrection;

public enum TexturaSolo {
    
    ARGILOSO {
        public NutrientesCTC calculaValorIdeal() {
            return new NutrientesCTC(9.0, 0.35, 6.0, 1.5, 9.0, 0.0, 0.0);
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
            return new NutrientesCTC(12.0, 0.25, 3.0, 1.0, 6.0, 0.0, 0.0);
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
