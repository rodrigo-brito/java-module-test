import br.ufmg.bitcoin.BuyServiceImpl;

module domain {
    requires java.sql;
    requires gson;
    requires utils;
    requires service;

    opens br.ufmg.model to gson;
    exports br.ufmg.bitcoin to main;

    provides br.ufmg.service.BuyService with BuyServiceImpl;
}