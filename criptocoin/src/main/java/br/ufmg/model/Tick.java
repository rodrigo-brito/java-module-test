package br.ufmg.model;

public enum Tick {
    BTC, ETH, XRP;

    public String toString() {
        switch (this) {
            case ETH:
                return "BRLETH";
            case XRP:
                return "BRLXRP";
            default:
                return "BRLBTC";
        }
    }
}