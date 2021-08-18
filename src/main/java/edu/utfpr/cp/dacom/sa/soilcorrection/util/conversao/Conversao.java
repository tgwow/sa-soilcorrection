package edu.utfpr.cp.dacom.sa.soilcorrection.util.conversao;

public interface Conversao<T, R> {

    R converte(T valor);
}
