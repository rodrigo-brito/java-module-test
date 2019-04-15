package br.ufmg.bitcoin;

import br.ufmg.utils.Log;

public class BuyServiceImpl implements br.ufmg.service.BuyService {
    @Override
    public boolean buyCriptoCoin(String tick, float amount) {
        Log.info(String.format("%.2f %s brought with success!", amount, tick));
        return true;
    }

    @Override
    public boolean sellCriptoCoin(String tick, float amount) {
        Log.info(String.format("%.2f %s sold with success!", amount, tick));
        return true;
    }
}
