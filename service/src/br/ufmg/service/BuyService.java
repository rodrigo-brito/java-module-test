package br.ufmg.service;

public interface BuyService {
    boolean buyCriptoCoin(String tick, float amount);
    boolean sellCriptoCoin(String tick, float amount);
}
