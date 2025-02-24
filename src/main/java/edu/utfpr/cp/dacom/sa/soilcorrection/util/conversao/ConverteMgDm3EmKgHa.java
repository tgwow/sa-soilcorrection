package edu.utfpr.cp.dacom.sa.soilcorrection.util.conversao;

public class ConverteMgDm3EmKgHa implements Conversao<Double, Double> {

    @Override
    public Double converte(Double valor) {

        if (valor <= 0) {
            throw new IllegalArgumentException();
        }

        return valor * 2;
    }
}