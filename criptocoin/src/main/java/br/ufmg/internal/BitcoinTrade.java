package br.ufmg.internal;

import br.ufmg.model.Coin;
import br.ufmg.model.Response;
import br.ufmg.model.Tick;
import br.ufmg.utils.Log;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;

public class BitcoinTrade {
    private final String API_BASE_URL = "https://api.bitcointrade.com.br/v2/public";

    public Coin getPriceByTick(Tick tick) {
        Gson gson = new Gson();
        Coin coin = new Coin();
        Response response;

        try {
            URL url = new URL(this.getBaseURL(tick));
            HttpURLConnection con = (HttpURLConnection) url.openConnection();

            con.setRequestMethod("GET");
            int responseCode = con.getResponseCode();

            Log.info("API RESPONSE = "+responseCode);

            if (responseCode == 200) {
                BufferedReader in = new BufferedReader(
                        new InputStreamReader(con.getInputStream()));

                response = gson.fromJson(in, Response.class);

                coin.setPrice(response.getData().getLast());
                coin.setTick(tick.toString());
                coin.setTime(new Date());
            }
        } catch (java.io.IOException e) {
            Log.error(e.getMessage());
            e.printStackTrace();
        }

        return coin;
    }

    private String getBaseURL(Tick tick) {
        return String.format("%s/%s/ticker", API_BASE_URL, tick.toString());
    }
}
