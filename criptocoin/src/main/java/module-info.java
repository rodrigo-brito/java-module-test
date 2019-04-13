module criptocoin {
    requires java.sql;
    requires gson;
    requires utils;

    opens br.ufmg.model to gson;
    exports br.ufmg.bitcoin to main;
}