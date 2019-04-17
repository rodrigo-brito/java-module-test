package br.ufmg.bitcoin;

import br.ufmg.internal.BitcoinTrade;
import br.ufmg.model.Tick;
import br.ufmg.model.Coin;

public class Market {
    BitcoinTrade bitcoinTradeAPI;

    public Market() {
        bitcoinTradeAPI = new BitcoinTrade();
    }

    public double fetchBitcoinPrice() {
        Coin coin = this.bitcoinTradeAPI.getPriceByTick(Tick.BTC);
        return coin.getPrice();
    }
}
