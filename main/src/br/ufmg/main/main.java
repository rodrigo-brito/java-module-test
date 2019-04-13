package br.ufmg.main;

import br.ufmg.bitcoin.Market;
import br.ufmg.utils.Log;

public class main {
    public static void main(String[] args) {
        Market market = new Market();
        double price = market.fetchBitcoinPrice();

        Log.info(String.format("Price = R$%.2f", price));
    }
}
