package br.com.alvesmateus;

public class LavagemPesada extends ProcessoLavanderia {
    @Override
    protected String lavar() {
        return "2. Lavando em modo intensivo com água quente e tira-manchas.";
    }

    @Override
    protected String secar() {
        return "3. Secando na secadora industrial em alta temperatura.";
    }
}
