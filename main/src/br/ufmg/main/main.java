package br.ufmg.main;

import br.ufmg.bitcoin.Market;
import br.ufmg.service.BuyService;
import br.ufmg.utils.Log;

import java.util.ServiceLoader;

public class main {
    public static void main(String[] args) {
        Market market = new Market();
        double price = market.fetchBitcoinPrice();

        Log.info(String.format("Price = R$%.2f", price));

        ServiceLoader<BuyService> services = ServiceLoader.load(BuyService.class);
        services.forEach(buyService -> {
            buyService.buyCriptoCoin("BTC", 1.5f);
            buyService.sellCriptoCoin("BTC", 2);
        });
    }
}
