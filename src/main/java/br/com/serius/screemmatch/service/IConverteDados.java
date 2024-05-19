package br.com.serius.screemmatch.service;

public interface IConverteDados {
    <T> T converteDados(String json, Class<T> classe);
}
